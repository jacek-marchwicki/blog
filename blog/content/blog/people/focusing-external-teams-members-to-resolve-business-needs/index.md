---
title: "Focusing external teams’ members to resolve business needs"
linkTitle: "Focusing external teams’ members to resolve business needs"
date: 2023-06-05
description: >
  The article discusses the importance of focusing on business needs when collaborating with external teams. The author shares an example where an external engineer's focus on perfecting code was hindering progress, and describes the steps taken to align the engineer's focus with the project's business needs. The outcome was improved productivity, better team behavior, and guidelines for more business-aware practices.
summary: >
  The article discusses the importance of focusing on business needs when collaborating with external teams. The author shares an example where an external engineer's focus on perfecting code was hindering progress, and describes the steps taken to align the engineer's focus with the project's business needs. The outcome was improved productivity, better team behavior, and guidelines for more business-aware practices.
author: Jacek Marchwicki
resources:
- src: "featured-title.jpg"
  params:
    byline: "Photo by [Devin Avery](https://unsplash.com/@devintavery?utm_source=unsplash&utm_medium=referral&utm_content=creditCopyText) on [Unsplash](https://unsplash.com/photos/VBBs_SWsdwU?utm_source=unsplash&utm_medium=referral&utm_content=creditCopyText)"
    anchor: Center
---

# Cooperation with external teams is good

As we work with various companies to address their business needs, we often collaborate with their internal engineering teams or other external teams to help their business grow. While such collaborations can provide great opportunities for the final business, we must be aware that they are not always as smooth as we would like. Some teams or individuals may lack experience, which can make achieving business needs more difficult. Rather than complaining, we are committed to taking action.

# Focus on business needs

At AppUnite, we hire new engineers for our company. However, we often encounter situations where these engineers become so focused on engineering and perfecting their code that they forget why they were hired in the first place. Every engineer is employed to meet business needs of our clients. We constantly need to remind, convince and communicate with our engineers that resolving business problems is the most important part of their work. We acknowledge that even though many years have passed, we are still at the beginning of the journey. When we collaborate with external teams, we recognize that many of the external teams are far behind our knowledge.

# Focus misalignment of the external engineer

A while back, I joined a fairly large team of engineers (50+) working on a platform. My objective was to quickly complete a small experimental product for the team's larger software project. Naturally, in such a large team, it's not reasonable to expect everyone to fully understand that their goal is only to resolve business needs. The problem arose primarily with one person who joined the company later and who persistently hindered my work, preventing me from completing the project. Let's call him Tom.

Code review is the process of examining and evaluating code changes made by a developer to ensure they meet quality standards and best practices. During this review process, only Tom constantly requested very small and unimportant improvements in the code that he claimed would lead to "better code." These improvements were mainly subjective and never added any value to the product. Moreover, striving for perfect code in this specific case did not make sense because the product was only an experiment that needed to be validated in the upcoming months. All of these improvements might be for naught if the experiment results are not good enough. What is most problematic is that every such "improvement" caused potential financial losses due to delays.

Of course, I could go to Tom's team leader to ask for help in fixing the problem. However, transferring problems to others is not how we prefer to cooperate. We also want to maintain good relationships between team members.

# How did we focus external team members to resolve business needs?

## Step #1
I started a one-on-one conversation with Tom to ask why he thought a given change should be made and what value the change brought to the product. Mostly, I heard that the code would be "cleaner", which is a very subjective metric. Tom also shared why a given change might be better, giving examples from such books as "Clean Code" by Robert C. Martin, which is, by the way, a great book about coding. However, these books that focus on improving coding skills only talk about tools and not what we should do to deliver business needs. Books about coding skills don’t provide guidance on which solution to choose in specific business situations.

I attempted to distill the benefits of the proposed "better code" in terms of meeting business needs. I asked Tom several clarifying questions, such as:

* Me: "Why do you think it is worth changing this?" Tom: "Because it will improve the code."
* Me: "Why do you think the proposed solution is better for the business?" Tom: "Because it would be easier to maintain."

In some circumstances, the answer "it would be easier to maintain" could be reasonable. However, it does not make sense for a four-month experiment that may be scrapped after validation.

I even asked Tom, "When do you stop improving your code?" and he answered, "When neither I nor my reviewers can see any potential improvements to be made.".

At first, I had a humorous thought: "You don't want me to find potential improvements in your code, because I'll comment on every line and make suggestions that will take weeks to implement. And once you've finished implementing them, I'll find even more potential improvements." Of course, I didn't share this joke. After chatting with Tom for a while, I realized that he was committed to Software Craftsmanship and striving for perfection. I suggested that not all of his suggestions needed to be implemented, and why it was so.

## Step #2

Although explaining things during 1-on-1 sessions helped a little, it wasn't enough. Tom was a skilled coder and could be valuable for the team, but I needed to invest more in helping him understand that coding wasn't the only important aspect of software engineering. Our goal is to have great engineers, not just good coders. At AppUnite, we challenge our engineers to be aware of the business impact of their work. To that end, I prepared a document with advice to help Tom understand the business aspect of code reviews. This approach also helped to some extent.

## Step #3

The next step was to meet as a team and discuss the issue of everyone not being on the same page when it comes to performing a great Code Review. I shared the document that I prepared for Tom with advice for the rest of the team, so we could have a base for discussion. Based on this document, we identified what needed to be fixed and what was excessive in our Code Review process. During the meeting, we prepared a document of Team Agreements on how to approach the Code Review process and what values should be taken into account.

To avoid causing arguments among employees, I refrained everyone from blaming anyone personally. Instead, I focused on identifying the team's problems and finding solutions. Our AppUnite value is "Be a team player. We succeed and fail as a team".

## Step #4

In the end, the actions taken helped the person become a better software engineer. I also spoke with his leader about setting personal goals to help him improve on a daily basis.

# Outcome

* The product was delivered more quickly.
* The whole team improved their behavior by better focusing on business problems.
* The relationship between team members was kept in the best shape.
* The guy developed his skills.
* The guidelines for how engineers should approach code review became an article on our website titled [Code Review - Team Agreements]({{< ref "/blog/people/code-review-team-agreements/index.md" >}}). This allows us to teach engineers how to be more business-aware.

If you are looking for a team that can work well with your team, resolve problems and meet business needs, please feel free to [contact us](https://appunite.com/briefs). We will do our best to help!

*This article was originally published at [AppUnite.com](https://appunite.com/blog/focusing-external-teams-members-to-resolve-business-needs).*