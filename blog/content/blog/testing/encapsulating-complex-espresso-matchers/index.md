---
title: "Making Espresso Tests More Understandable and Reusable"
linkTitle: "Making Espresso Tests More Understandable and Reusable"
date: 2023-10-04
author: Jacek Marchwicki
summary: >
    **Do you write Espresso tests? If so, you need to read this article!**
    
    In this article, we will discuss a simple best practice for making Espresso tests more understandable and reusable: encapsulating complex matchers in functions. This can lead to a number of benefits, including increased developer productivity, reduced bug count, and improved test coverage.
    
    So if you want to write better Espresso tests, be sure to read this article!
description: >
    **Do you write Espresso tests? If so, you need to read this article!**
    
    In this article, we will discuss a simple best practice for making Espresso tests more understandable and reusable: encapsulating complex matchers in functions. This can lead to a number of benefits, including increased developer productivity, reduced bug count, and improved test coverage.
    
    So if you want to write better Espresso tests, be sure to read this article!
resources:
- src: "featured-title.jpg"
  params:
    byline: "Photo by [Kiwihug](https://unsplash.com/@kiwihug?utm_source=unsplash&utm_medium=referral&utm_content=creditCopyText) on [Unsplash](https://unsplash.com/photos/cA4RWlZsXYQ?utm_source=unsplash&utm_medium=referral&utm_content=creditCopyText)"
---

**Introduction**

Espresso is a powerful tool for testing Android applications. However, it can be difficult to write Espresso tests that are both understandable and reusable. In this blog post, we will discuss a best practice for making Espresso tests more understandable and reusable: **encapsulating complex matchers in functions**.

**Problem**

Espresso matchers can be complex, making it difficult to understand what a test is trying to do. For example, the following matcher checks to see if a view with the text "Link preview title" is displayed inside a conversation:

```kotlin
onView(allOf(withText("Link preview title"), isDescendantOfA(withId(R.id.chat_recycler_view))))
    .check(matches(isDisplayed()))
```

This matcher is difficult to understand because it requires the reader to understand two separate concepts:

* The `withText()` matcher checks to see if a view has a specific text.
* The `isDescendantOfA(withId(R.id.chat_recycler_view))` matcher checks to see if a view is a descendant of a specific view.

**Solution**

To make this matcher more understandable, we can encapsulate the `isDescendantOfA(withId(R.id.chat_recycler_view))` matcher in a function:

```kotlin
fun insideConversation(): ViewMatcher<View> = isDescendantOfA(withId(R.id.chat_recycler_view))

onView(allOf(withText("Link preview title"), insideConversation()))
    .check(matches(isDisplayed()))
```

This makes the matcher much easier to understand because it only requires the reader to understand one concept:

* The `withText()` matcher checks to see if a view has a specific text.

**Benefits**

There are two main benefits to encapsulating complex matchers in functions:

* **Understandability:** Encapsulating complex matchers in functions makes it easier for readers to understand what a test is trying to do.
* **Reusability:** Encapsulated matchers can be reused in multiple tests, which can save time and effort.

**Business Perspective**

From a business perspective, making Espresso tests more understandable and reusable can lead to the following benefits:

* **Increased developer productivity:** Easier-to-understand tests can be written and maintained more quickly, which can lead to increased developer productivity.
* **Reduced bug count:** Reusable matchers can help developers write more comprehensive and robust tests, which can lead to a reduced bug count.
* **Improved test coverage:** Easier-to-understand tests are more likely to be run, which can lead to improved test coverage.

**Conclusion**

Encapsulating complex matchers in functions is a simple best practice that can make Espresso tests more understandable and reusable. This can lead to a number of benefits, including increased developer productivity, reduced bug count, and improved test coverage.