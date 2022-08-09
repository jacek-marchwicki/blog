---
title: "When QA slows down your team"
linkTitle: "When QA slows down your team"
date: 2022-08-09
author: Jacek Marchwicki
summary: >
 In my work, many a time have I witnessed QA offer less value than expected. I've gathered some thoughts to understand why it happened so many times, so that you might find ways to avoid it.
description: >
 In my work, many a time have I witnessed QA offer less value than expected. I've gathered some thoughts to understand why it happened so many times, so that you might find ways to avoid it.
resources:
- src: "featured-title.jpg"
  params:
    byline: "Image Photo by *Artem Ka* from [unsplash](https://unsplash.com/)"
  
--- 

# Abstract
When a team wants a QA specialist to work on their project, it’s worth considering what this process is supposed to bring.
- Improvement of app stability.
- Faster feature delivery.
- Increase of team work efficiency.
- Support in testing the app in different environments.
- Ensuring the app has good quality before release.
- Ensuring the app works with different environments.
- Ensuring the app UI is well implemented.
- Ensuring the app UX is well designed.
Getting to know which of those responsibilities are important for your team is very useful, especially because the first four will speed up your team, whereas the remaining four will slow it down.

# Why may the QA team slow down your team?

Let’s consider two cases: one with the participation of a QA team, the other without it.

| Without a QA team              | With a QA team                                   |
|--------------------------------|--------------------------------------------------|
| Developers implement feature 1 | Developers implement feature 1                   |
| Developers release feature 1   | **Developers send their release to the QA team** |
| Users start using the app      | QAs test the app and find bugs                   |
|                                | **The team decides which bugs need fixing**      |
|                                | **Developers prepare a fix**                     |
|                                | QAs test the app and find no bugs                |
|                                | Developers release feature 1                     |
|                                | Users start using the app                        |

This very simple table shows that:
- Even if you engage a QA member, your developers need to perform additional tasks that weren’t needed before (3 highlighted cells).
- Without a QA member, you gain additional time, which you can use to further improve your app (5 empty cells).
- Without a QA member, you could deliver the app sooner.
- Without a QA member, you might obtain user feedback sooner.
It’s also worth mentioning that employing a QA specialist might fit into your budget better than employing a developer who could deliver the/a feature.

# QA gains and losses

- There might be less bugs in your app, but will your users be happy with less features?
- Your QA might pick up some inefficient UX, but your users might provide you with better feedback sooner, saving/making up for those lost cycles.
- Your QA might find bugs, but the dev team might have no time to fix them.
- Thanks to QA, your devs might be able to ship bug-free code. However, they might be tempted not to test the app, considering testing QA team's responsibility, not theirs.
- The QA team might find some nonspecific bugs that are hard to discern, but such bugs might only hit a fraction of the app users so they don’t require fixing.
- The QA team might efficiently cooperate with devs in finding bugs, but they might also  lower the devs' morale, constantly proving that they are creating crappy software.

# Summary

*Reading what you agree with is easy, the trick is to question your own views.*
This is the end of this provocative article. Personally, I think QA could deliver great value in projects in which quality is key. However, it's good to be aware of the problems I have mentioned and find ways to mitigate them. Hopefully this article will help you re-think the role of QA in your organization and make this process even more indispensable.