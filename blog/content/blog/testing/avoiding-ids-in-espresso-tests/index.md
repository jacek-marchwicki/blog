---
title: "Avoid using IDs in Espresso tests"
linkTitle: "Avoid using IDs in Espresso tests"
date: 2023-10-04
author: Jacek Marchwicki
summary: >
    **Avoid using IDs in your Espresso tests to make them more readable, flexible, and maintainable. Learn how in this article.**
    
    This description is also short and to the point, but it includes a call to action at the end, which encourages visitors to click on the article and learn more.
description: >
    **Avoid using IDs in your Espresso tests to make them more readable, flexible, and maintainable. Learn how in this article.**
    
    This description is also short and to the point, but it includes a call to action at the end, which encourages visitors to click on the article and learn more.
resources:
- src: "featured-title.jpg"
  params:
    byline: "Photo by [George Prentzas](https://unsplash.com/@georgeprentzas?utm_source=unsplash&utm_medium=referral&utm_content=creditCopyText) on [Unsplash](https://unsplash.com/photos/SRFG7iwktDk?utm_source=unsplash&utm_medium=referral&utm_content=creditCopyText)"
---

**Introduction:**

Espresso is a powerful testing framework for Android apps. It allows you to write tests that interact with your app's UI in a natural way. However, there are some best practices you should follow to write effective Espresso tests.

In this blog post, I'll discuss why you should avoid using IDs in Espresso tests. I'll also provide some positive and negative examples to illustrate my point.

**Why avoid using IDs in Espresso tests?**

There are a few reasons why you should avoid using IDs in Espresso tests:

* **Tests are easier to understand.** When you use IDs in your tests, you're essentially hardcoding the structure of your app's UI. This can make your tests more difficult to understand, especially for non-technical stakeholders.
* **Tests are more flexible.** When you don't use IDs, your tests are more flexible to changes in your app's UI. This is because you're testing the content of your UI elements, not their IDs.
* **Tests are more maintainable.** When you don't use IDs, your tests are easier to maintain as your app's UI changes. This is because you don't have to update your tests every time you change an ID.

**Positive examples:**

Here are some positive examples of avoiding IDs in Espresso tests:

* **Testing the title of a text view:**

```
onView(withText("My title"))
  .check(matches(isDisplayed()))
```

This test will pass if the text view with the text "My title" is displayed on the screen. This test is easy to understand and doesn't require any knowledge of the app's internal structure.

* **Testing the presence of a button:**

```
onView(withText("My button"))
  .check(matches(isDisplayed()))
```

This test will pass if the button with the text "My button" is displayed on the screen. This test is also easy to understand and doesn't require any knowledge of the app's internal structure.

**Negative examples:**

Here are some negative examples of using IDs in Espresso tests:

* **Testing the title of a text view:**

```
onView(withId(R.id.my_title_text_view))
  .check(matches(isDisplayed()))
```

This test will only pass if the text view with the ID R.id.my_title_text_view is displayed on the screen. This test is more difficult to understand because it requires knowledge of the app's internal structure.

* **Testing the presence of a button:**

```
onView(withId(R.id.my_button))
  .check(matches(isDisplayed()))
```

This test is also more difficult to understand because it requires knowledge of the app's internal structure.

**Conclusion:**

Avoiding IDs in Espresso tests is a best practice that can make your tests easier to understand, more flexible, and more maintainable. By following this best practice, you can write tests that are more valuable to your business.