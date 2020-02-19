---
title: "A nice reader/writer pattern"
linkTitle: "A nice reader/writer pattern"
date: 2018-01-15
author: Jacek Marchwicki
summary: >
  During the development of a chat app, I had to implement some kind of lock logic. Usually, locking/unlocking code is hard to follow. If complex business logic uses complicated locking, your code becomes unreadable and unmaintainable. However, there is a pattern that can help you writing readable locking/unlocking code.
description: >
  During the development of a chat app, I had to implement some kind of lock logic. Usually, locking/unlocking code is hard to follow. If complex business logic uses complicated locking, your code becomes unreadable and unmaintainable. However, there is a pattern that can help you writing readable locking/unlocking code.
resources:
- src: "featured-title.jpg"
  params:
    byline: "Photo by [Patrick Lindenberg](https://unsplash.com/@heapdump) on [Unsplash](https://unsplash.com/photos/1iVKwElWrPA)"
--- 

# TL;DR;

An example of good practice:
* [NewDatabaseTest]({{< sourcefile "/examples/nice-reader-writer-pattern/src/test/java/com/jacekmarchwicki/locking/NewDatabaseTest.kt" >}})
* [NewDatabase]({{< sourcefile "/examples/nice-reader-writer-pattern/src/main/java/com/jacekmarchwicki/locking/NewDatabase.kt" >}})

Compared to an example of bad practice::
* [OldDatabaseTest]({{< sourcefile "/examples/nice-reader-writer-pattern/src/test/java/com/jacekmarchwicki/locking/OldDatabaseTest.kt" >}})
* [OldDatabase]({{< sourcefile "/examples/nice-reader-writer-pattern/src/main/java/com/jacekmarchwicki/locking/OldDatabase.kt" >}})

# Example

Let’s start with a database which looks like this:

```kotlin
class OldDatabase {

    val readWriteLock = ReentrantReadWriteLock()

    var internalList: List<String> = listOf()
}
```

If you add logic for adding and removing list elements, your code will look like this:

```kotlin
@Test
fun `if an item is added, it becomes an element of the list`() {
    val lock1 = db.readWriteLock.writeLock()
    try {
        db.internalList = db.internalList.plus("something")
    } finally {
        lock1.unlock()
    }

    val lock2 = db.readWriteLock.readLock()
    val list = try {
        db.internalList
    } finally {
        lock2.unlock()
    }

    assertEquals(listOf("something"), list )
}
```

It’s very, very hard to follow. Thankfully, Kotlin has built-in extension functions for `ReadWriteLock` so you can change your code to:

```kotlin
@Test
fun `if an item is added, it becomes an element of the list - nicer`() {
    db.readWriteLock.write { 
        db.internalList = db.internalList.plus("something")
    }
    
    val list = db.readWriteLock.read {
        db.internalList
    }

    assertEquals(listOf("something"), list )
}
```

But still, the code is vulnerable to potential issues like using read lock instead of write lock, or even forgetting to use locking at all. Also, following the code with something like this: `db.internalList = db.internalList.plus("something")` remains hard.
So let's write a better database with nicer API:


```kotlin
@Test
fun `if an item is added, it becomes an element of the list`() {
    db.write { addItem("something") }

    assertEquals(listOf("something"), db.read { list })
}
```

or even:

```kotlin
@Test
fun `if data is written and read in one transaction, data is filled`() {
    val dataRead = db.write {
        addItem("something")
        addItem("something else")
        list
    }

    assertEquals(listOf("something", "something else"), dataRead)
}
```

and if you try writing buggy code like `db.read {addItem("something)}`, it won’t compile.
Let's do it better:

```kotlin
class NewDatabase {
    /**
     * Interface that only allows reading
     */
    interface Read {
        val list: List<String>
        fun itemExist(item: String): Boolean
    }

    /**
     * Interface that allows reading and writing
     */
    interface Write : Read {
        /*
         * In Kotlin, we can override val with var so writes will be allowed
         */
        override var list: List<String>
        fun addItem(item: String)
    }

    /**
     * Actual implementation of database
     *
     * It should be private so none will accidentally call it without locking
     */
    private val implementation = object : Write {
        private var internalList: List<String> = listOf()
        override fun itemExist(item: String): Boolean = list.contains(item)

        override var list: List<String>
            get() = internalList
            set(value) {internalList = value}

        override fun addItem(item: String) {
            internalList = internalList.plus(item)
        }

    }

    /*
     * Locking mechanism
     * 
     * TIP: we use `inline` function so Kotlin can make this code faster without creation of objects
     */
    internal val readWriteLock = ReentrantReadWriteLock()
    inline internal fun <T> write(func: Write.() -> T): T = readWriteLock.write { func(implementation) }
    inline internal fun <T> read(func: Read.() -> T): T = readWriteLock.read { func(implementation) }
}
```

# Conclusions
1. Good patterns make complicated logic more understandable.
2. If your code is hard to follow, you need to rewrite it.
3. Especially when you write something hard, try to refactor your code to black boxes that implement only part of your logic.