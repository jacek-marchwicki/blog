---
title: "Proposing architectural changes"
linkTitle: "Proposing architectural changes"
date: 2022-09-02
author: Jacek Marchwicki
summary: >
 It’s not easy to introduce changes in a team that numbers more than just a few developers. You should ensure that everyone understands what is going to be changed, why and how. I’d like to guide you on how you can make this process as painless as possible.
description: >
 It’s not easy to introduce changes in a team that numbers more than just a few developers. You should ensure that everyone understands what is going to be changed, why and how. I’d like to guide you on how you can make this process as painless as possible.
resources:
- src: "featured-title.jpg"
  params:
    byline: "Photo by [Ivan Aleksic](https://unsplash.com/@ivalex?utm_source=unsplash&utm_medium=referral&utm_content=creditCopyText) on [Unsplash](https://unsplash.com/s/photos/decision?utm_source=unsplash&utm_medium=referral&utm_content=creditCopyText)"
  
--- 

We all know that introducing a change in a team that numbers more than several developers is always challenging. However, if you follow the advice I present below, you can make things much easier for yourself. You should ensure that everyone understands what is going to be changed, why and how. You need to ensure that the change won’t be a burden for others. And, last but not least, you’d like everyone to be excited about the change. I’m going to explain our process for introducing architectural both minor and major changes.

What kind of changes are we talking about? Here are some examples:

* Refactoring the app from MVC to MVVM,
* Finding a better library for displaying maps,
* Changing the database,
* Changing the file structure in git,
* Improving test coverage,
* Finding if a given framework feature is going to be a solution to the problems your team is facing,
* Checking if an innovative idea can be implemented,
* etc.

# Before you start
Before you start researching a subject, you should take around 15 minutes to go over your reasons for the change and the expected result of the research. Creating documentation would be the essential output of your work, but you may also consider creating a Proof of Concept to ensure that the proposed solution is doable.

# Planning
The next stage of preparation is where your team takes over and schedules appropriate research. Your task is to describe the reasons for researching your idea and the expected results of such groundwork.

You should also estimate the amount of time necessary to complete the research.

What we do is this: we create tickets in our task management software that we call “SPIKEs“. We estimate and schedule them during sprint planning - the same way as with every other feature. The difference is that what we get at the end of such a SPIKE is documentation rather than a feature. Bear in mind that we’re talking about ideas, and those can be wrong. The output may be a document that describes why something was a bad idea.

# Where to document
We document our proposals as RFC (Request For Comments) documents in the git repository of the project, but it’s not the only way. You can use Google Docs, Notion, Confluence, Git Repository or a different place, just keep in mind the following:
* **Review** - the tool that you are going to use should allow all team members to review the change. This means commenting, adding suggestions and opinions.
* **Collaboration** - it is common that a SPIKE needs to be carried out by more than one person. It’s great if your tool supports that.
* **Archiving** - even after the change is accepted, it’s good to keep the document as a reference for the current team and for future employees. Such an accepted document is frequently called Architecture Decision Record (ADR).
* **Possibility of creating templates** - it will be easier for the team to propose changes, if they have a template for suggesting them. That way, people can raise and solve any important issues. It’s good if your tool allows for creating such a template. 

# What to document

When creating an RFC document, you should consider documenting the following:
* **Start date** - information when you have started working on the documentation.
* **Motive** - you need to think about the benefit from the product perspective; if there are no such benefits, then the changes are unnecessary.
* **Description of the proposed solution** - even though the main goal of the task is to create documentation, consider developing a PoC (Proof of concept), so the document is not only theoretical, but implementable. If the scope of the RFC is very limited, you can include in it the change itself.
* **Drawbacks** - try to find as many problems with the solution as you can, then list them.
* **Drawbacks of alternative ideas** - try to find alternative solutions, then list them together with their drawbacks, too. Also, consider what will happen if you keep things as they are (without introducing the change).
* **Links to external documentation** - usually, your team is not as familiar with the solution as you are. Consider adding links to useful documentation to help your colleagues understand what you are proposing.
* **Can it be implemented in small steps?** - consider whether you can migrate in steps rather than in one giant leap. Introducing a change should not disrupt product development, that’s counter-productive. Substantial changes can be tricky in terms of resolving conflicts. It is almost always safer to introduce them step by step, unless they are truly minor fixes.
* **Effort necessary to implement the change** - consider how much time you’ll need to introduce the change, to maintain it and to train the team as appropriate.

Needless to say, it’s best if the template is accessible for everyone, so that anyone can take initiative.

# Reviewing
Once we have the document clarifying why and how we’re going to introduce the change, it’s important to share it and collect feedback.

It’s entirely up to you whether you share the document asynchronously or hold a conference to present it. What’s important is to get feedback.
You might not like what others have to say about your idea, but try to be open to suggestions and even people rejecting it. Be humble. Everyone has a different background and expertise - that’s why each of us brings something valuable to the table.

Product/business team should usually be informed about the benefits and be included in the decision-making process.

After you get initial feedback, your team needs to decide whether the change is worth introducing. You might postpone the decision because, for example, now is not the right time to implement the solution. The team doesn't have to be unanimous, but if the majority decides that the approach in question is worthwhile, you ultimately need to get everyone on board. Some people might have to compromise. After all, you are a team, ‘each to their own’ attitude won’t cut it. Once the document is approved, everyone needs to follow the decision.

# Introducing the change
Once everyone is on board, you should plan the implementation. After the documentation is created, people can make use of it and introduce the change following the usual process: split, prioritize, implement.


*This article was originally published at [AppUnite.com](https://appunite.com/blog/proposing-architectural-changes).*