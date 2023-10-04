---
title: "Why you shouldn't rely only on end-to-end tests"
linkTitle: "Why you shouldn't rely only on end-to-end tests"
date: 2023-10-04
author: Jacek Marchwicki
summary: >
  **Are you relying solely on end-to-end tests for your Android app?** If so, you're missing out on a number of benefits that you can get by using a combination of unit, integration, and end-to-end tests.

  In this article, I'll explain why you shouldn't rely only on end-to-end tests, and I'll provide a specific solution that you can use to combine all three types of tests. This solution will help you to increase the stability of your app, reduce the time it takes to find and fix bugs, and improve the overall quality of your app.
description: >
  **Are you relying solely on end-to-end tests for your Android app?** If so, you're missing out on a number of benefits that you can get by using a combination of unit, integration, and end-to-end tests.

  In this article, I'll explain why you shouldn't rely only on end-to-end tests, and I'll provide a specific solution that you can use to combine all three types of tests. This solution will help you to increase the stability of your app, reduce the time it takes to find and fix bugs, and improve the overall quality of your app.
resources:
- src: "featured-title.jpg"
  params:
    byline: "Photo by [Eugene Tkachenko](https://unsplash.com/@eugene_tkachenko?utm_source=unsplash&utm_medium=referral&utm_content=creditCopyText) on [Unsplash](https://unsplash.com/photos/TF47p5PHW18?utm_source=unsplash&utm_medium=referral&utm_content=creditCopyText)"
--- 


As an experienced Android developer and tech leader, I've seen many teams try to solve stability and testing time problems by relying solely on end-to-end (end-to-end) tests. While end-to-end tests can be a valuable tool, they're not a silver bullet. In fact, they can actually make things worse if they're not used in conjunction with other types of tests.

The testing pyramid is a well-established model that recommends a balanced approach to testing. The pyramid has four layers:

* **Unit tests:** These tests are the most granular and should be written for every unit of code.
* **Integration tests:** These tests combine multiple units of code to test how they interact with each other.
* **End-to-end tests:** These tests simulate the user experience of the entire application.
* **Manual tests:** These tests are performed by humans and can be used to verify the application's functionality in a real-world environment.

## The problem with relying solely on end-to-end tests

End-to-end tests are the slowest and most expensive type of test to run. They can also be difficult to debug, especially if the failure is caused by a problem with the backend or another external service.

If you rely solely on end-to-end tests, you'll likely encounter one of two problems:

* **Your tests will fail for the wrong reason.** This can happen if the backend is down or if there's a problem with another external service. In these cases, it can be difficult to determine the root cause of the failure, which can lead to wasted time and resources.
* **You'll have to wait a long time to get feedback on your changes.** End-to-end tests can take hours or even days to run, which means you'll have to wait a long time to find out if your changes broke anything.

## A better approach

A better approach is to use a combination of tests from all four layers of the testing pyramid. This will help you to:

* **Catch bugs early.** Unit and integration tests can catch bugs early, before they have a chance to cause problems in end-to-end tests.
* **Get faster feedback.** Unit and integration tests can run quickly, which means you'll get feedback on your changes sooner.
* **Determine the root cause of failures.** If a test fails, it's usually easier to determine the root cause if you have a combination of tests from different layers.

## A specific solution

Here's a specific solution that you can use to combine unit, integration, and end-to-end tests:

* **Run unit and integration tests before merging changes to the main branch.** This will help to ensure that your changes don't introduce any new bugs.
* **Run end-to-end tests after merging changes to the main branch.** This will help to verify the functionality of the entire application.
* **Write some tests that can be run in both unit and integration mode.** This will help you to save time and effort by only having to write the test once.

## Positive business perspective

By using a combination of tests from all four layers of the testing pyramid, you can:

* **Increase the stability of your application.**
* **Reduce the time it takes to find and fix bugs.**
* **Improve the quality of your application.**

This can lead to a number of positive business outcomes, such as:

* **Increased customer satisfaction.**
* **Reduced support costs.**
* **Increased sales.**

So if you're looking for a way to improve the quality of your application and reduce the risk of bugs, consider using a combination of tests from all four layers of the testing pyramid.