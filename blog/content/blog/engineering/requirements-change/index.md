---
title: "When a requirement is not worth implementing"
linkTitle: "When a requirement is not worth implementing"
date: 2021-08-23
author: Jacek Marchwicki
summary: >
  Life is full of compromises, so is software development - this article will help you make good decisions when an unforeseen problem occurs.
description: >
  Life is full of compromises, so is software development - this article will help you make good decisions when an unforeseen problem occurs.
resources:
- src: "featured-title.jpg"
  params:
    byline: "Photo by [Levi Meir Clancy](https://unsplash.com/@levimeirclancy?utm_source=unsplash&utm_medium=referral&utm_content=creditCopyText) on [Unsplash](https://unsplash.com/@levimeirclancy?utm_source=unsplash&utm_medium=referral&utm_content=creditCopyText)"
  
--- 

Life is full of compromises. So is software development. Decisions about features and the related requirements are based on the amount of time and money necessary to deliver good user experience.
When designing software, a team doesn’t always have full knowledge of what is possible and how much time and effort will be necessary to accomplish the goal.
This sometimes leads to under-estimating certain features. The results can be as insignificant as a one-hour fix of a button text, or as serious as a multi-year delay in the delivery of the entire app to the client. Some delays might be acceptable, but to some, you need to say “STOP!”.

Every team member needs to be able to raise the alarm if something is taking more time than it should, or if they notice that implementing a given requirement becomes too expensive or too time-consuming. But how do we enable everyone to make such decisions or alert others so that the decision can be made jointly by the entire team?
I’d like to point out a few things that should be taken into account. But first, let’s have an example for illustration purposes:
 
*Your team is working on a social app. The new requirement is to allow users to upload their profile images. The implementation of a part of the feature was initially estimated as ~2 work-days. But the developer responsible for this task spent 2 days on it and said that it was too hard to fulfil the requirement of the profile image upload limit of at least 5 MB while having a 512 kB limit set on the whole system.*

# How important is the feature/requirement for the final product?

First of all, the team member needs to establish how valuable the feature is for the product. In our example, the importance of sharing profile pictures would be completely different for an app that allows for choosing the right male or female model for your project, where the image is crucial, and completely different for a forum of coffee-lovers, where it would only provide users with a way of expressing themselves.

# How much effort is necessary to build the feature / meet the requirement?

Another important aspect of the decision-making process is estimating how much effort would be necessary to develop the feature. In the beginning, a rough estimate is enough. I.e. one sprint of one person or 6 sprints of the entire team. This helps to make the right decision.

# Can we achieve this in a simpler way?

Sometimes, there are simpler ways of developing a certain feature using non-standard solutions. In our example, the team could:
* Implement a frontend tool that shrinks any image to the desired size,
* Use some external solution for storing these images.
* Generate random color images for users, so that you don’t see their faces, but you’re able to distinguish them based on colors.
* Use images provided by a third-party login, i.e., Facebook

Sometimes developers, even very experienced ones, are only able to think about the problem in one particular way. It’s good to consult with your colleagues, as they may bring to the table a simpler solution that you would never think of.

# Will solving this problem solve other problems too?

Usually, our problem is more deeply rooted in different areas of our product than the superficial issue we are initially trying to resolve. I.e. in our example, if we accept the limitation of the API, we might also limit uploading of all other data to the server - data that is even more important than that processed by the developed feature. The issue we’re dealing with might be worth fixing, if there’s a chance of it resurfacing later, in the planned features.

# Is it beneficial to do without the full-fledged functionality in the beginning?

Ask yourself: is it not more productive in the project phase to release a version that is limited? Might it be a good idea to release something and ask users for feedback? You can also try to measure how the feature is used to see if your problem is the user’s problem too. Fixing the issue can be planned later.

# How much effort does the change in the plan require?

It’s very important to understand that changing plans/requirements has some implications. You need to be aware that discussing the problem with the rest of the team might prove more time-consuming in the end, than actually fixing the issue, so you should always consider whether it’s worth it. 
Remember that changing the requirements affects also other people involved in the process.
* Designers might need to be informed that they need to provide a UI for a message saying that the image size is limited.
* The message needs to be translated into different languages by translators.
* The documentation needs to be updated to reflect the change.
* Stakeholders need to be taken into account, and their time is the most expensive.
* The problem should be presented to your QA team.
* Some end-user guides might need to be updated so that they describe the limitation.
* Your help desk staff needs to be informed about the limitation.
* All the people that join the team might face the same problem.

# Final decision
Taking into account these factors should help the product team make the right decisions. It is a known fact that any decision-making, if not based on knowledge, is a lottery. If everyone in the team is able to quickly answer the questions listed above, then the decisions will simply be better. 
And if your team is able to react swiftly to problems that they are likely to have, the final product is more likely to be a success.
With that in mind, in the upcoming article, we will focus on how to lower the necessary effort due to changes of plans.

