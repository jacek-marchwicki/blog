---
title: "Optimizing Cooperation"
linkTitle: "Optimizing Cooperation"
date: 2022-10-10
description: >
  For developers, non-coding factors that are not directly related to their work are often a source of frustration. I’d like to show you that you have the power to make your company more efficient.
summary: >
  For developers, non-coding factors that are not directly related to their work are often a source of frustration. I’d like to show you that you have the power to make your company more efficient.
author: Jacek Marchwicki
resources:
- src: "featured-title.jpg"
  params:
    byline: "Photo by [taylor](https://unsplash.com/@taychilla?utm_source=unsplash&utm_medium=referral&utm_content=creditCopyText) on [Unsplash](https://unsplash.com/s/photos/frustration?utm_source=unsplash&utm_medium=referral&utm_content=creditCopyText)"
    anchor: Center
---
As developers, we often get frustrated with non-coding factors such as:

* The fact that we have to wait for others to finish their tasks before we can move on with ours.
* The fact that Business keeps asking questions about what has been done or what is delivered to our clients.
* QAs reporting bugs, but not providing enough information for their successful location and resolution,
* External services being poorly designed and faulty, which causes our app to behave incorrectly.

As developers, we tend to focus on improving our coding skills to finish tasks and deliver our share of the work as quickly as possible. But once we go higher than the intern level, coding becomes only a small part of our job, which is why we should focus on finding solutions to the problems related to cooperation with others.

We ourselves should be able and willing to fix our problems, managers surely have their own. If you feel frustrated by something, it’s a sign that you should take action. I’d like to show you that you have the power to make your company more efficient.

# Let’s take a look at some examples

You don’t need to go through all of the following case studies. They just go to show that there is always a way for you to improve teamwork:

** You’re frustrated that the QA reports bugs, but doesn’t provide enough information for them to be found and resolved.**

What you can do:

1. You can simply ask the QA to provide more information every time they fill a ticket. Explain to them that video recording of the reproduction will save your time and answer the questions you tend to ask them over and over. Suggest a video recording solution that is easy to use. This is a win-win - they won’t be bombarded with questions and you’ll get the information you need right away. But don’t be greedy, don’t overwhelm them.
2. Help QAs learn how to use a proxy that records requests and responses so they can share the log with back-end developers without bothering the front end.
3. Provide a tool within your app that can make reporting bugs by QAs easier while ensuring that all the information needed (logs, request history, information on the logged-in user, current settings, etc.) is there.
4. Improve logging mechanism to enable extracting back-end logs related to a given crash by user ID that is always provided by a QA in a bug ticket.
5. You can also create a bug report template.
6. You might want to consider putting more effort in testing the app in the early stages so that it becomes more stable.
7. Take into account using your analytics events and getting analytics traces for a given bug session.

** Business keeps asking questions about what has been done or what is delivered to our clients.**

What you can do:

1. First of all, you can ask yourself and them what they need such information for.
2. If, for example, JIRA is out of sync and tasks are not well described, Business might not be able to understand what is going on. Maybe it’s time to improve task management.
3. Maybe it’s time for you to prepare release notes for Business.
4. Organize a weekly demo meeting for the client to show them what has been done. If you prefer more async work, you can record videos and post them on Slack.
5. It might be worth automating something. There are great tools out there to help you with this (e.g. [jira-release-notes](https://github.com/marketplace/actions/jira-release-notes), [jira-changelog](https://github.com/marketplace/actions/jira-changelog), [slack-notify](https://github.com/marketplace/actions/slack-notify)).
6. It might be worth walking the Business team through JIRA and teaching them how to get the necessary information by themselves.
7. The Business team may be unfamiliar with the technical stuff. In such a case, you should take time to describe the technical part of the process to them.


**Code review takes a lot of time.**

What you can do:

1. Consider creating smaller PRs so that the reviewers’ work is easier.
2. Try to describe your PR better so that the reviewer needs less time to understand what you’ve done.
3. Ask for teammates’ review directly.
4. Help others create notifications for incoming reviews.
5. Help your teammates understand why it’s important to review the code quickly.
6. Give positive feedback when someone reviews your code.
7. Create a small script that counts reviews during the retro and recognizes people who do review.

**We keep getting requirements that are very hard to meet.**

What you can do:

1. Ask for changing the requirements.
2. Take some of the time assigned to the current tasks and devote it to cooperation with Business/UX/UI teams that work on future projects. This way, you might convince them to adjust the requirements to what's faster and easier to deliver.
3. Ask if you can join the conceptual process of the Business team.
4. Implement a good test suite so that changes are easier to implement.

**The back-end team implemented an API that is hard to use (a.k.a. the front-end team keeps asking for changes in the already implemented API)**

What you can do:

1. Always have front- and back-end developers working together on designing the API. Enforce the rule that API needs to be discussed with all the API consumers at the same time (e.g. front-end, mobile Android, mobile iOS, etc.).
2. Document the new API (or API change) somewhere and get sign-off from the back- and front-end teams before implementing it.
3. Start working on the point of contact (API documentation) before implementing your own code. Fence your garden before planting the trees.
4. Document the API in Swagger, store it on Git, and do cross-platform PRs whenever you change something.
5. If the API was implemented incorrectly, organize a retro to understand what has been done wrong and what can be improved next time.

**The analytics team keeps asking what clicking a certain button triggers.**

What you can do:

1. Create good documentation together with the analytics team, so they won’t need to bother you.
2. Set the rules for who is responsible for creating and updating the analytics document - the person in charge can be either a developer or an analyst.

**Front-end developers keep asking how endpoints work and make incorrect queries.**

What you can do:

1. Create documentation for the API.
2. Validate requests: instead of returning 5xx error, provide descriptive information on what has gone wrong.

**Our teammates constantly forget about the localization.**

What you can do:

1. Create a checklist to be followed before filling a PR.
2. Ensure that the QA verifies the localization.
3. Add a [pull-request github template](https://docs.github.com/en/communities/using-templates-to-encourage-useful-issues-and-pull-requests/creating-a-pull-request-template-for-your-repository) with the checklist mentioned above ([example](https://github.com/flutter/flutter/blob/master/.github/PULL_REQUEST_TEMPLATE.md)).
4. Use a github action that verifies if the checklist points are checked (e.g. [Require Checklist · Actions · GitHub Marketplace](https://github.com/marketplace/actions/require-checklist)).
5. Set up a lint rule that will verify whether everything’s translated.

**The front-end team can’t start their work because the back end hasn’t finished their part.**

What you can do:

1. Start by documenting the API with the back- and front-end teams so that the front end can begin their work. Focus also on example responses. [Swagger](https://swagger.io/) is a good starting point for API documentation.
2. Ask the back-end team for fake responses instead of real-life ones.
3. You yourself can create fakes for the front-end team using a proxy (e.g., mitmproxy) or create mocks in the code.
4. Do TDD (test-driven development) and implement tests using mock API.

# Summary
Those are not invented examples, those are things that I’ve dealt with in the past when I was employed as a developer. We usually assume that we can’t change something. I hope that my case studies made you realize that you can always take initiative and change your project for the better.

*This article was originally published at [AppUnite.com](https://appunite.com/blog/optimizing-cooperation).*