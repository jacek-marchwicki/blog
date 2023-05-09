---
title: "Improving App Stability: A Proactive Approach to Overcoming External Constraints"
linkTitle: "Improving App Stability: A Proactive Approach to Overcoming External Constraints"
date: 2023-05-04
author: Jacek Marchwicki
summary: >
 This article is about taking a proactive approach to improving app stability by addressing external constraints that can hinder development efforts. The author emphasizes the importance of specificity in identifying problems and using analytical tools to calculate the impact of those problems on business goals. The article provides a real-life example of how a team improved app stability within the constraints of external factors, such as an unstable backend server, by taking a creative and collaborative approach to problem-solving.
description: >
 This article is about taking a proactive approach to improving app stability by addressing external constraints that can hinder development efforts. The author emphasizes the importance of specificity in identifying problems and using analytical tools to calculate the impact of those problems on business goals. The article provides a real-life example of how a team improved app stability within the constraints of external factors, such as an unstable backend server, by taking a creative and collaborative approach to problem-solving.
resources:
- src: "featured-title.jpg"
  params:
    byline: "Photo by [Milton Wiklund](https://unsplash.com/@wiklunden?utm_source=unsplash&utm_medium=referral&utm_content=creditCopyText) on [Unsplash](https://unsplash.com/photos/SnSEVMOFBn0?utm_source=unsplash&utm_medium=referral&utm_content=creditCopyText)"
  
--- 

# Introduction
Many technological companies focus on best practices but don't consider the constraints they face. I've often heard that external factors are hard to overcome, such as backend developers complaining that backend servers are unstable, the team being too small, or the external team being unresponsive.

We read many articles about providing feedback that mentions how important it is to talk about these problems, and we should do that. But after the feedback, not everything will be fixed by others instantly. Some external factors are not as easy to solve, need time to be fixed, or are too expensive to change. For example, a company may have signed a three-year contract for backend servers, and it would be too expensive to change the provider. The product may still need to earn more money to allow the team to be scaled up. The external team we're related to may have other blockers that cause them to work ineffectively. All those things should indeed be improved, but not all at once. The fact that others have something to improve shouldn't stop us from achieving our business goals. I want to present a simple example to help you understand how we can achieve our business goal in a constrained world.

# Example of Proactive Approach
Recently, we were tasked with improving the stability of a mobile application for one of our clients while a separate team was responsible for the backend servers.

Upon taking on this project, it became clear that the previous software house responsible for the mobile app development had struggled to improve the app's stability due to the poor backend stability that an external team was responsible for. While the production backend environments were stable, the development environment had numerous stability issues. Note that the production environment could not be used for most of the development due to reasonable security strategies. As a result, there were many days in a row where backend servers weren't available for mobile developers.

As we got to know, the previous team noticed the client many times that the backend server stabilities caused their delays and problems.

# Clarifying the problem
Firstly, we want to ensure that everyone is aware of how important the problem is. Just saying, "something is bad" or "slows us down" is not enough for businesses to make the right decisions. We want to be specific. We've prepared simple tools that could generate reports on how frequently those backend servers are down and how many hours a day the team is blocked from doing the actual work. Furthermore, we tried to be as precise as possible, so we could calculate how many developer hours were lost and how much money our client lost daily. This analytical approach helped us understand the importance of the problem. Moreover, other teams related to those backend servers were also blocked by those backend servers. Our reports led to a change in priorities for the backend server teams.

# Living in constraints
After clarifying the problem, I could say, "they lived happily ever after," but it's not true in real-life scenarios. We still live in constraints, where some problems aren't resolved in minutes by external factors. The backend team shifted their responsibilities, but tech debt couldn't be fixed right away, and their team was also constrained by external software that couldn't be replaced sooner than in a few years. We understand that improving the development environment would be a complex task, and our business goal is to improve the app's stability within the constraints that we're living in.

# Overcoming constraints
## Stage 1
To ensure app stability and identify the source of any errors, we introduced a test set that could be run in integration or end-to-end mode. If a test failed with the real backend but succeeded with a fake backend implementation, we could be sure that the problem could be reported to the correct team.

## Stage 2
To provide detailed information to the backend team and help them identify problems faster, we created automatic reports that included information on failed scenarios, requests made, and responses given by the backend.

## Stage 3
To ensure that data returned by the backend is always correct, we added additional validation to backend server responses. Any failure response was reported with detailed information for further investigation, which helped identify more problems, including those in the production environment.

## Stage 4
To expedite the resolution of critical backend problems, we agreed to move some of the backend server logic to the mobile app. This helped improve the API stability and enabled faster fixes.

## Stage 5
To minimize the impact of ongoing backend development work on our app development, we set up fake servers on our side. This allowed us to continue working on the app even when the backend was down.

# Outcome
Some may argue that investing more in backend development would have been the better course of action, but the team had trouble employing new developers. Improving the app's stability was our goal, and we achieved it by taking proactive steps to address problems within the constraints that existed in our work. By collaborating with our client and adopting a creative approach, we improved user satisfaction with the product and increased the app's star rating from 2.3 to 4.4.

# Summary
Our approach demonstrated the importance of:

* giving feedback to resolve external constraints
* using analytical data to help stakeholders understand the importance of the problem
* accepting constraints and trying to find workarounds

By following these steps, you'll be able to deliver results that meet your business needs. If you're looking for a team that resolves problems instead of merely complaining, [feel free to contact us](https://appunite.com/briefs). We'll do our best to help!

*This article was originally published at [AppUnite.com](https://appunite.com/blog/improving-app-stability-a-proactive-approach-to-overcoming-external-constraints).*