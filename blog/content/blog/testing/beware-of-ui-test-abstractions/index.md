---
title: "Beware of UI test abstractions"
linkTitle: "Beware of UI test abstractions"
date: 2023-10-04
author: Jacek Marchwicki
summary: >
    **Are your UI tests complex and difficult to maintain?**
    
    If so, you're not alone. Many developers use abstraction libraries to make UI testing easier, but these libraries can also make tests harder to understand and debug.
    
    In this article, I'll explain why you should use abstractions sparingly in UI testing. I'll also show you how to write simple UI tests that are easy to understand, maintain, and debug.
    
    If you're serious about improving the quality of your UI tests, then you need to read this article.
description: >
    **Are your UI tests complex and difficult to maintain?**
    
    If so, you're not alone. Many developers use abstraction libraries to make UI testing easier, but these libraries can also make tests harder to understand and debug.
    
    In this article, I'll explain why you should use abstractions sparingly in UI testing. I'll also show you how to write simple UI tests that are easy to understand, maintain, and debug.
    
    If you're serious about improving the quality of your UI tests, then you need to read this article.
resources:
- src: "featured-title.jpg"
  params:
    byline: "Photo by [USGS](https://unsplash.com/@usgs?utm_source=unsplash&utm_medium=referral&utm_content=creditCopyText) on [Unsplash](https://unsplash.com/photos/hoS3dzgpHzw?utm_source=unsplash&utm_medium=referral&utm_content=creditCopyText)"
---

As an experienced Android developer and tech leader, I'm often asked about the best way to write UI tests. One of the most common recommendations is to use an abstraction library, such as Kakao. These libraries can make it easier to write tests by providing a higher-level API that hides the details of interacting with the UI.

However, I believe that abstractions can be a double-edged sword. While they can make it easier to write tests, they can also make them harder to understand and maintain. In this blog post, I'll argue that abstractions should be used sparingly in UI testing, and I'll explain why.

## The problem with abstractions

One of the biggest problems with abstractions is that they can make tests harder to understand. When you use an abstraction library, you're essentially hiding the details of how your test interacts with the UI. This can make it difficult to debug tests or to understand why they're failing.

Another problem with abstractions is that they can make tests harder to maintain. As your app changes, you may need to update your abstractions to keep them up-to-date. If you don't do this, your tests may start to fail even though your app is still working correctly.

## The benefits of simplicity

In my experience, simple tests are always better than complex tests. Simple tests are easier to write, understand, and maintain. They're also less likely to be flaky.

When it comes to UI testing, I recommend using the simplest possible approach that will still get the job done. This usually means writing tests that directly interact with the UI elements.

## Examples

Here are some examples of how to write simple UI tests:

```kotlin
onView(withId(R.id.price_item))
  .check(matches(isDisplayed()))
```

```kotlin
onView(withText("Standard Rate"))
  .check(matches(isDisplayed()))
```

These tests are simple and easy to understand. They're also less likely to be flaky than tests that use an abstraction library.

## Business perspective

From a business perspective, there are several benefits to using simple UI tests:

* **Increased confidence:** Simple tests give you more confidence that your app will work correctly.
* **Reduced maintenance costs:** Simple tests are easier to maintain, which can save you time and money.
* **Improved developer productivity:** Simple tests make it easier for developers to write and debug tests, which can improve their productivity.

## Conclusion

I believe that abstractions should be used sparingly in UI testing. Simple tests are always better than complex tests, and they offer several business benefits.

If you're considering using an abstraction library for UI testing, I urge you to carefully weigh the pros and cons. In most cases, you'll be better off sticking with simple tests.