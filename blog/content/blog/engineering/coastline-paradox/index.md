---
title: "Coastline paradox"
linkTitle: "Coastline paradox"
date: 2021-05-26
author: Jacek Marchwicki
summary: >
  The coastline paradox was first observed by Lewis Fry Richardson and later expanded upon by Benoit Mandelbrot in Science Magazine in 1967. It shows that measuring the coastline length is not as straightforward as it might seem.
description: >
  The coastline paradox was first observed by Lewis Fry Richardson and later expanded upon by Benoit Mandelbrot in Science Magazine in 1967. It shows that measuring the coastline length is not as straightforward as it might seem.
resources:
- src: "featured-title.jpg"
  params:
    byline: "Photo by [Max Böttinger](https://unsplash.com/@maxboettinger?utm_source=unsplash&utm_medium=referral&utm_content=creditCopyText) on [Unsplash](https://unsplash.com/?utm_source=unsplash&utm_medium=referral&utm_content=creditCopyText)"
  
---
  
The coastline paradox was first observed by Lewis Fry Richardson and later expanded upon by [Benoit Mandelbrot in Science Magazine in 1967](https://science.sciencemag.org/content/156/3775/636.abstract). It shows that measuring the coastline length is not as straightforward as it might seem.

{{< imgproc featured-title Fit "600x300" >}}Image shows coastline around a peninsula{{< /imgproc >}}

If you measure it using a very rough satellite image, you’ll get a much smaller value than in the case of very precise images. This is because the latter will provide you with more details to be taken into account. 
But let’s skip the theoretical considerations regarding this dilemma and focus on practical reasons for measuring the coastline length. These may include a road trip along the coast or sailing from one port to another. What we would find useful and practical in such circumstances are the measurements done by 14th-century cartographers, rather than subatomic-level surveys that would inevitably give much larger values.

You’re probably wondering why I’m deliberating about coastlines at all. This is a software engineering blog, after all. But I have my well-grounded reasons, I assure you. Just keep on reading!

The same principles apply to software development. When you’re working on a problem, you should look at it from the user’s perspective. 
If you look too closely, you might waste time and effort on details that are irrelevant to your users and that might even cause new problems. For instance, you can have a button which is pixel-perfect in design and implementation. But its placement is completely wrong and users won’t notice the button and will miss on some important features. You might ask: “But isn’t it our ultimate goal to create perfect features?” Sure! However, attention to detail without looking at the whole picture entails certain risks. You might spend so much time refining your feature that your competitors will deliver it sooner. Delving into irrelevant details might cost you missing the opportunity to launch the product at the best possible moment.

So if we, software engineers, can learn something from the coastline paradox, it’s this: never lose sight of the bigger picture, as it really helps you make the right decisions. 
