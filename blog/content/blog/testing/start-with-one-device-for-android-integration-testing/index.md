---
title: "Why you should start with one device for Android integration testing"
linkTitle: "Why you should start with one device for Android integration testing"
date: 2023-10-04
author: Jacek Marchwicki
summary: >
  **Are you new to Android integration testing?** If so, you may be wondering how many devices you should test your app on. The answer is: start with one. Testing your app on multiple devices can be time-consuming and frustrating, especially if you're just getting started. In this article, I'll explain why it's a good idea to start with one device for integration testing, and I'll provide some tips for writing tests that are less likely to fail on different devices. If you want to learn more about how to get started with Android integration testing, I encourage you to read the full article.
description: >
  **Are you new to Android integration testing?** If so, you may be wondering how many devices you should test your app on. The answer is: start with one. Testing your app on multiple devices can be time-consuming and frustrating, especially if you're just getting started. In this article, I'll explain why it's a good idea to start with one device for integration testing, and I'll provide some tips for writing tests that are less likely to fail on different devices. If you want to learn more about how to get started with Android integration testing, I encourage you to read the full article.
resources:
- src: "featured-title.jpg"
  params:
    byline: "Photo by [Dim Hou](https://unsplash.com/@dimhou?utm_source=unsplash&utm_medium=referral&utm_content=creditCopyText) on [Unsplash](https://unsplash.com/photos/PfNzKoA5R4E?utm_source=unsplash&utm_medium=referral&utm_content=creditCopyText)"
  
--- 


# Introduction:

As an experienced Android developer and tech leader, I've seen many teams make the same mistake when getting started with integration testing: they try to test their apps on too many devices. This is a mistake because it can be time-consuming and frustrating, and it can lead to teams giving up on automated testing altogether.

The problem with testing on multiple devices:

There are a few reasons why testing on multiple devices can be a problem. First, it can be difficult to ensure that your tests are compatible with all of the different devices and configurations that your app will be running on. Second, it can be hard to debug tests that fail on a specific device, because you may not have access to that device to investigate the issue. Finally, testing on multiple devices can be time-consuming and expensive, especially if you need to purchase or rent devices for testing.

* **In the case of a smaller screen, the text that we are verifying may be outside of the screen.** For example, if we are testing a layout that contains a button, the button may be too small to be seen on a smaller screen. This could cause the test to fail because the button is not clickable.
* **In the case of a tablet, the layout may be slightly different.** For example, a layout that is designed for a phone may not be scaled correctly for a tablet. This could cause the test to fail because the layout is not displayed correctly.
* **In the case of a change in language, some controls may be automatically translated.** For example, a button that is labeled "Submit" in English may be translated to "Submit" in Spanish. This could cause the test to fail because the test is expecting the button to be labeled "Submit" in English.
* **In a different version of Android, something may be displayed differently.** For example, a new feature may be introduced in a newer version of Android. This could cause the test to fail because the test is not expecting the feature to be present.

These are just a few examples, and there are many other ways that tests can fail on different devices.

# The solution:

The solution is to start with one device, and then expand your testing as you gain experience and confidence. This will help you to focus on writing high-quality tests that are more likely to catch regressions.

# The benefits of using one device:

There are several benefits to using one device for integration testing:

* It's easier to ensure that your tests are compatible with the device.
* It's easier to debug tests that fail.
* It's less time-consuming and expensive.

# The business perspective:

From a business perspective, there are several reasons why using one device for integration testing is a good idea:

* It can help you to release more stable and reliable apps.
* It can help you to save time and money.
* It can help you to improve your team's productivity.

# Conclusion:

If you're new to integration testing, I recommend starting with one device. This will help you to get started quickly and easily, and it will help you to build a solid foundation for your testing efforts.

# Additional tips:

* Choose a device that is representative of the devices that your app will be running on.
* Use a simulator or emulator if possible.
* Write tests that are specific to your app's functionality, rather than trying to test everything.
* Use a test automation tool that helps you to debug tests that fail. This will make it easier to find the cause of the failure and fix it.
