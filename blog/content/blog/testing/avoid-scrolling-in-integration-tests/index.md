---
title: "How to improve integration tests by using mock APIs to avoid scrolling"
linkTitle: "How to improve integration tests by using mock APIs to avoid scrolling"
date: 2023-10-04
author: Jacek Marchwicki
summary: >
    **Do your integration tests involve scrolling? If so, you're making your life harder than it needs to be.**
    
    By using mock APIs to avoid scrolling, you can make your integration tests easier to write, maintain, and debug. This can lead to improved test coverage, reduced development time, and improved quality.
    
    In this article, I'll show you how to use mock APIs to avoid scrolling in your integration tests. I'll also explain the positive business impact that this can have.
    
    **If you want to write better integration tests, then this article is for you.**
description: >
    **Do your integration tests involve scrolling? If so, you're making your life harder than it needs to be.**
    
    By using mock APIs to avoid scrolling, you can make your integration tests easier to write, maintain, and debug. This can lead to improved test coverage, reduced development time, and improved quality.
    
    In this article, I'll show you how to use mock APIs to avoid scrolling in your integration tests. I'll also explain the positive business impact that this can have.
    
    **If you want to write better integration tests, then this article is for you.**
resources:
- src: "featured-title.jpg"
  params:
    byline: "Photo by [Taylor Flowe](https://unsplash.com/@taypaigey?utm_source=unsplash&utm_medium=referral&utm_content=creditCopyText) on [Unsplash](https://unsplash.com/photos/aXeVH4FcS1k?utm_source=unsplash&utm_medium=referral&utm_content=creditCopyText)"
  
---

As an Android developer, I've spent a lot of time writing integration tests. Integration tests are important for ensuring that our code works as expected when it's integrated with other parts of our app, such as the backend API or a third-party library.

One of the challenges of writing integration tests is that they can be difficult to write when they need to scroll through a list of items. For example, let's say we have an app that shows a list of posts. We want to write a test that clicks on the fifth post in the list.

One way to do this is to use the RecyclerView.scrollToPosition() method to scroll to the fifth post. However, this can be a bit tricky, and it can also make our test more flaky.

A better way to do this is to use a mock API to return a list of posts that already has the fifth post at the top of the list. This will make our test much easier to write and maintain, and it will also make it less flaky.

In addition to making our tests easier to write, using mock APIs to avoid scrolling can also have a positive business impact. Here are a few reasons why:

* **Improved test coverage:** By making it easier to write tests, we can improve our test coverage, which can help us to catch bugs earlier.
* **Reduced development time:** By making our tests faster to run, we can reduce the amount of time that developers spend running tests.
* **Improved quality:** By making our tests more reliable, we can improve the quality of our apps.

If you're writing integration tests that need to scroll through a list of items, I encourage you to try using a mock API to avoid scrolling. It's a simple change that can make a big difference in the quality and efficiency of your tests.

### Here are some additional tips for using mock APIs to avoid scrolling:

* Use a mock API that allows you to specify the order of the items in the list. This will make it easier to ensure that your test is clicking on the correct item.
* Use a mock API that allows you to specify the state of the items in the list. This will allow you to test different scenarios, such as a post that is already liked or a post that is collapsed.

* By following these tips, you can make your integration tests more reliable and efficient.