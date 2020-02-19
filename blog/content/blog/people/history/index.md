---
title: "My Story@Appunite"
linkTitle: "My Story@Appunite"
date: 2018-06-11
description: >
  It was some time ago (2011), a year after I joined AppUnite as the first employee. At the time, I’ve just developed third iOS app (yes, this is no typo — iOS app :) ).
summary: >
  It was some time ago (2011), a year after I joined AppUnite as the first employee. At the time, I’ve just developed third iOS app (yes, this is no typo — iOS app :) ).
author: Jacek Marchwicki
resources:
- src: "featured-title.jpg"
  params:
    byline: "Image from [European Southern Observatory](https://www.eso.org/public/images/eso0932a/)"
  
--- 

{{< imgproc title Resize "600x300" >}}The Milky Way panorama{{< /imgproc >}}


Our client was so content with our iOS development that he asked Karol (CEO and one of AppUnite’s co-founders) to develop the same app for Android. Karol refused because AppUnite hadn’t had experience developing Android apps. Actually, 2 years before I’d worked with Android and by then was completely besotted by it. But experience and love didn’t mean “production-ready”. This didn’t discourage the client, he knew that we are good developers and we have good project management strategies so he insisted. Karol refused, explaining to the client the risk of not delivering good quality product because of developing an app for the new platform. The client knew that in his iOS app, we had implemented features that hadn’t been on the market at the time, so he knew that the risk was smaller than looking for other company. Karol asked me if I want to start developing the same app for Android. I said in Polish “kto nie ryzykuje, ten nie pije szampana” (this Polish proverb means, in free translation: who doesn’t risk, doesn’t drink champagne). Karol talked to the client and ensured that he was willing to take the risk.


The client was sure.


Our friendly designer read Android Design Guidelines and with my help adjusted the designs.. They were approved. The schedule was set and development of app has started.  
Keep in mind that these were ancient times for Android (minimal supported Android version: 1.5, newest Android version was 3.0).


We had to face many problems.


There was no good library for fetching images from the Internet that met our speed standards (yes, there were no Picasso or Glide libraries). I needed a whole week only to present images to users.  
At the time, we had a stunning iOS library (called AUKit) for fetching data from the network, caching them and displaying them to a user. There was no such library for Android. We had to implement our own.  
And the real disaster… The app’s main feature was sharing video content. Sharing videos between Android devices, and iOS devices was no problem — the issue was to share content between iOS and Android. Today, it’s a common practice to use a server as a converter for different video formats between iOS and Android. But our client need was to use serverless solution.  
We needed FFmpeg library to convert video files on the device. The problem was that FFmpeg library wasn’t yet adjusted to compile for Android. We had to do it. Then, we needed to create a wrapper between C language in which FFmpeg is written, and Java in which the app was written. And of course, these weren’t times when you could just type a question into Google and find a solution. These were times when you had to read Android Operating System source code to find tips. This caused delays, but we managed nonetheless..

We did this!

And the best part was that development and tests were overdue only by a week. The customer was satisfied and we were even more.

I think this is a problem of many software houses — they don’t want to risk.

If you want to implement great software, you need to use better and better technology, you need to take a risk. Albert Einstein said, “Insanity is doing the same thing over and over again and expecting different results”.

In these 7 years, light years in computer science, so many new
developers joined AppUnite but I’m convinced that we’re still the same
company, the company that still wants to use new technology, the company
that still wants to ensure that the client’s aware of the risk.