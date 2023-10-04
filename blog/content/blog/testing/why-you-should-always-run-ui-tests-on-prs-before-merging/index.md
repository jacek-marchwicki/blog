---
title: "Why you should always run UI tests on PRs before merging"
linkTitle: "Why you should always run UI tests on PRs before merging"
date: 2023-10-04
author: Jacek Marchwicki
summary: >
  Want to improve the quality of your app and your business? Running UI tests on PRs before merging is a simple but effective way to do it. In this article, I'll explain why UI testing is so important and how to get started.
description: >
  Want to improve the quality of your app and your business? Running UI tests on PRs before merging is a simple but effective way to do it. In this article, I'll explain why UI testing is so important and how to get started.
resources:
- src: "featured-title.jpg"
  params:
    byline: "Photo by [Lenny Kuhne](https://unsplash.com/@lennykuhne?utm_source=unsplash&utm_medium=referral&utm_content=creditCopyText) on [Unsplash](https://unsplash.com/photos/jHZ70nRk7Ns?utm_source=unsplash&utm_medium=referral&utm_content=creditCopyText)"
  
--- 


As an experienced Android developer and tech leader, I've seen many teams struggle to adopt integration tests (End-to-End tests with mocked API). There's one key reason for this: tests that break, aren't maintained, become outdated after changes, or only detect bugs at release time. This can be incredibly frustrating for developers, who often feel like they're constantly fighting with their tests.

The simple solution is to require all changes to pass tests before they can be merged. There are a few exceptions, such as End-to-End tests that are difficult to maintain or if a dedicated team is responsible for test maintenance. However, even in these cases, it's important to run tests as early as possible in the development process.

Here are a few reasons why running UI tests on PRs is so important:

* **Tests are free labor.** They can catch bugs that developers would otherwise miss, saving you time and money in the long run.
* **It's easier to fix bugs before they're merged.** Once a change is merged, it can be difficult to isolate and fix a bug without impacting other parts of the codebase.
* **It improves the quality of your app.** By catching bugs early, you can ensure that your app is stable and meets the needs of your users.

From a business perspective, running UI tests on PRs can help you:

* **Reduce the number of bugs in your app.** This can lead to increased customer satisfaction and retention.
* **Save time and money.** You won't have to spend time fixing bugs that could have been caught earlier.
* **Improve the quality of your development process.** By making it easier to catch bugs, you can create a more efficient and productive development environment.

If you're not already running UI tests on PRs, I encourage you to start today. It's a simple change that can have a big impact on the quality of your app and your business.

Here are a few tips for making UI testing on PRs a success:

* **Start small.** Don't try to test your entire app at once. Start with a few key features or flows and gradually add more as you get more comfortable.
* **Automate your tests.** Manual testing can be time-consuming and error-prone. Automating your tests will make it easier to run them regularly and catch bugs early.
* **Use a continuous integration (CI) server.** A CI server will automatically run your tests when you submit a PR. This will help you ensure that your changes are always tested before they're merged.

By following these tips, you can make UI testing on PRs a part of your regular development process. This will help you improve the quality of your app and your business.