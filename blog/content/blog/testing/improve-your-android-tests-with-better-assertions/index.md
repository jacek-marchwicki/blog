---
title: "Improve your Android tests with better assertions"
linkTitle: "Improve your Android tests with better assertions"
date: 2023-10-04
author: Jacek Marchwicki
summary: >
    **Write better Android tests with better assertions**

    Better assertions can help you find bugs earlier in the development process, reduce the time it takes to release new features, and improve customer satisfaction. In this blog post, you'll learn how to use better assertions to improve the quality of your Android tests.
description: >
    **Write better Android tests with better assertions**

    Better assertions can help you find bugs earlier in the development process, reduce the time it takes to release new features, and improve customer satisfaction. In this blog post, you'll learn how to use better assertions to improve the quality of your Android tests.
resources:
- src: "featured-title.jpg"
  params:
    byline: "Photo by [Raquel Martínez](https://unsplash.com/@fiteka?utm_source=unsplash&utm_medium=referral&utm_content=creditCopyText) on [Unsplash](https://unsplash.com/photos/SQM0sS0htzw?utm_source=unsplash&utm_medium=referral&utm_content=creditCopyText)"
---

As an Android developer, you know how important it is to write good tests. Tests help you to ensure that your code works as expected and that it is free of bugs.

One of the most common types of tests are assertions. Assertions check whether a condition is true or false. For example, you might use an assertion to check whether a variable has a certain value.

**The problem with standard assertions**

Standard assertions can be helpful, but they can also be a bit lacking. When an assertion fails, the only information you get is that the assertion failed. This can be frustrating, especially if you don't know why the assertion failed.

For example, let's say you have a test that checks whether a view model is in a loading state. The standard way to write this test is as follows:

```
assert(viewModel.state.isLoading == true);
```

If this assertion fails, you will get the following error message:

```
Assertion failed
```

This error message doesn't tell you much. It doesn't tell you why the assertion failed, or what the current value of `viewModel.state.isLoading` is.

**The solution: Use a better assertion library**

There are many assertion libraries available that provide more helpful error messages. One such library is strikt: https://strikt.io/.

Using strikt, you can write the same test as above as follows:

```
expectThat(viewModel.state)
    .get(FeedbackState::isLoading)
    .isTrue();
```

If this assertion fails, you will get the following error message:

```
▼ Expect that FeedbackState(recommendationAnswer=com.app.silentusApp.presentation.feedback.RecommendationAnswer$Likely@2fd72332, favouriteFeatureAnswer=com.app.silentusApp.presentation.feedback.FavouriteFeatureAnswer$AppBlock@51f18e31, rating=5, prevRating=0, feedback=correct review, isLoading=false, closeScreen=null, dialogInfo=null):
  ▼ value of property isLoading:
    ✗ is true
      found false
```

This error message is much more helpful than the standard error message. It tells you exactly why the assertion failed, and it also shows you the current value of `viewModel.state.isLoading`.

**The business perspective**

Better assertions can help you to improve the quality of your code. They can also help you to save time and money by making it easier to find and fix bugs.

Here are some specific examples of how better assertions can benefit your business:

* **Improved product quality:** Better assertions can help you to ensure that your products are free of bugs. This can lead to a better user experience and increased customer satisfaction.
* **Reduced development time:** Better assertions can help you to find and fix bugs more quickly. This can free up your time to focus on other tasks, such as developing new features.
* **Reduced maintenance costs:** Better assertions can help you to prevent bugs from being introduced into your code. This can save you money on maintenance costs in the long run.

**Conclusion**

If you are an Android developer, I encourage you to use a better assertion library. Better assertions can help you to improve the quality of your code, save time and money, and make your life easier.