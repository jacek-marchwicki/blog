---
title: "Code Review - Team Agreements"
linkTitle: "Code Review - Team Agreements"
date: 2022-10-13
description: >
  Countless words have been written on why code review is good for the code of the app. But if during code review you focus solely on code, you’re doing it wrong.
summary: >
  Countless words have been written on why code review is good for the code of the app. But if during code review you focus solely on code, you’re doing it wrong.
author: Jacek Marchwicki
resources:
- src: "featured-title.jpg"
  params:
    byline: "Photo by [Bernard Hermant](https://unsplash.com/@bernardhermant?utm_source=unsplash&utm_medium=referral&utm_content=creditCopyText) on [Unsplash](https://unsplash.com/s/photos/spy?utm_source=unsplash&utm_medium=referral&utm_content=creditCopyText)"
    anchor: Center
---

I’d like your team to work as efficiently as possible and review can be of great help in this. It allows you to find errors and potential problems at the very early stage of the development. What’s more, it enables developers to share knowledge. On the other hand, it can be a real pain when it slows down the development process. What’s most important, however, is the impact code review has on business, as business is what allows us to do what we do best - create great software.

Therefore, I’d like to take a closer look at the business benefits of correcting code (after review):

* If the code is flawed, we won’t introduce the bug into the system - we eliminate potential business loss.
* If we improve the readability of very bad code, we can be sure that after someone else (or the same person) takes it over, they won’t introduce more bugs and will apply the change quicker - we minimize the costs of labor and eliminate potential business loss.
* We get the chance to look for bugs and fix them sooner, when it is easier than after, let’s say, a month - we minimize labor costs.
* Developers learn new approaches to software development, which may lead to faster delivery - beneficial for the business in the long term.
* Mitigating so-called Bus Factor - minimizes business risks.
* We can avoid making the same mistakes over and over - we eliminate potential business loss.
* 
On the other hand, negative business consequences of correcting code could be as follows:

* The developer that creates new code needs to switch to bug fixing - certain added labor costs.
* The developer that creates the code needs to implement the fix. Applying the change alone takes some time and the fix itself might not necessarily bring any material benefits - added costs of the fix.
* The developer, when implementing a fix, needs to rerun the app and perform regression tests. This can be time-consuming - possible business losses.
* New bugs might be introduced while fixing the existing ones - possible business losses.
* The developer needs to run CI build, wait for the results and, in the case of unstable development environments, it may turn out that they need to wait for the server to respond - added costs of labor and running CI.
* The reviewers must take another look at the fix, even if it’s a minor change - they need to switch the context from the current task to review proofing and back - added labor costs.
* Delay in delivery - risk of delay in implementing the change.
* We might get stuck in a vicious circle of constant fixing - there’s a business risk that the product will never be launched.

These negative consequences are not as trivial as they may seem. A tiny fix, e.g. “changing the name of the method” does not take 5 minutes, as many tend to think, but even hours of work (switching the context, the need for retesting and regression, waiting for CI, waiting for review, reviewer needing to take yet another look at the code etc.).

Our obligation as employees is taking into account what’s most beneficial from the business perspective and optimizing the review process is no exception.

This is why I’d like to share with you a list of things that your team might find worth implementing in the code review process:

* **When you prepare a PR, make sure that the reviewer gets to know the business requirements behind your change. When you do review, make sure that you understand the business requirements behind the changes you're reviewing.**
* Reject a change only if the PR contains a major bug or something else that may cause serious problems in the future.
* Minor inconsistencies within the PR should be tagged as “suggestion” so that the owner knows that they can, but don’t have to apply a given change ([conventional comments](https://conventionalcomments.org/)).
* Own opinions regarding the code should be tagged as “opinion” - this way, you can share your thoughts without forcing their implementation, respecting the right of others to have their own views.
* If we only add suggestions to a given PR, we need to approve it, so that the PR owner can decide whether it’s worth applying the changes from the business perspective.
* Suggestions that do not get implemented are still valuable as learning material - they make us pay more attention to our mistakes going forward.
* It’s important to understand that not implementing a suggestion is not a bad thing. It may make sense from a business standpoint, if it eliminates some of the negative consequences of code review mentioned above.
* Keep in mind that we don’t have to agree with every little note. Bugs should have the highest priority.
* During code review, assume good intentions of the PR author and comment author. However, if there is a major disagreement, remember that ultimately, the code is not owned by the PR author or comment author - it is owned by the team. And that’s precisely why you should discuss such differences of opinion as a team - in order not to waste time on this specific matter in the future.
* Learn from your colleagues’ experience. If a colleague makes a comment about your work, make use of their experience and try to understand their suggestions and opinions, even if they don’t match your own. This is particularly important if you’re still learning, and the colleague already has a lot of experience. If you’re a newbie and you still don’t understand many things, it’s worth getting on board with the suggestions and opinions of the experienced colleague.
* A bug does not have to be a blocker. The product team may understand and accept it as a temporary or permanent limitation. I’d like to add that such limitations should be documented. And if they are supposed to be fixed in the future, it should be scheduled.
* During review, ask questions tagged as “questions”. It’s better to ask “Did you test this or that?” instead of having a bug pop up in production. If you get a basic question like that, do not get offended. It might be obvious to you, but it’s probably better that the asker makes sure that everything is covered. Even the best of us sometimes forget things.
* The quality of the code is important - no doubts about that - but do not strive for perfection. Ultimately, the app user wants the code to work, not look beautiful. What’s crucial is just for the code not to slow down development in the future.
* The fact that the author of the change has approval for merging it does not mean that they have to merge it. They can still make improvements - bear in mind, however, their negative consequences mentioned above.
* If your PR is not completed or needs to be revisited for some reason or another, mark it, so that others know what is ready for review and what is not. You can do it by changing the PR into a draft.
* When you create a pull request, you should have confidence in your change. It should be tested and working. If you’re dealing with a new subject area or you’re not sure how exactly to test something, mark it in the PR to get help.
* If you think that your solution is shaky or you need help, prepare a draft PR as soon as possible and ask someone for an initial review to get assistance right away. You can also treat the PR as an asynchronous version of pair programming.
* Code review can also be used for proposing changes, like I described in Proposing architectural changes.

* I hope that the above tips will help you and your team establish the best possible rules for code review. It’s best to put them down as Team Agreements/Working Agreements. You can also link this article directly in your Team Agreements.

Check out these AppUnite’s articles on review too:

* [Is code review harfmul?](https://appunite.com/blog/is-code-review-harmful),
* [Code review best practices.](https://appunite.com/blog/code-review-best-practices)

*This article was originally published at [AppUnite.com](https://appunite.com/blog/code-review-team-agreements).*