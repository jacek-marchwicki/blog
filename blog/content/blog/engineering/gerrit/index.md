---
title: "Working with gerrit (very old article)"
linkTitle: "Working with gerrit (very old article)"
date: 2012-05-02
author: Jacek Marchwicki
summary: >
  As software engineers we want to improve our selves, we want to learn from mistakes of others, and we would like to improve our coding skills. This is why we'have decided to introduce a code review process, and for this we've chosen Gerrit tool.
description: >
  As software engineers we want to improve our selves, we want to learn from mistakes of others, and we would like to improve our coding skills. This is why we'have decided to introduce a code review process, and for this we've chosen Gerrit tool.
resources:
- src: "featured-title.jpg"
  params:
    byline: "Photo by [Raychan](https://unsplash.com/@wx1993?utm_source=unsplash&utm_medium=referral&utm_content=creditCopyText) on [Unsplash](https://unsplash.com/s/photos/tree?utm_source=unsplash&utm_medium=referral&utm_content=creditCopyText)"
--- 

**Note:** This article is very, very old. I'm publishing it mostly for fun :)

**Before start**: in later of this document I assume that you have a basics of git knowledge.
In our [development team](https://appunite.com) we use git a lot, but git not solve every problem - it's only a source control software. We need more, we employe new people who at an start point often make mistakes - and write ugly code. We decided to make code review, and for this propose we choose gerrit.

Gerrit is nothing more then git repository and tool that can approve and comment commits.
Whole workflow involves of create commit, push it to gist, wait for approval - and boom - everything work. But because we often make mistakes and everyone in company work (or should work) asynchronous - this workflow is a little more complicated. Grate picture I found on Android developers site that present workflow on gerrit:

{{< imgproc workflow Fit "600x300" >}}Workflow on gerrit (from [Android site](http://source.android.com/images/workflow-0.png)){{< /imgproc >}}


You'd better look at this diagram before continue for better understanding of commands bellow.


# Lets starts
When using gerrit your repo usually looks like: `ssh://<username>@review.<your-domain>:29418/<your project>.git`. Part that can create problems is `<username>`, especially when you are using submodules because you will have to put: git submodule add `ssh://<username>@review.<your-domain>:29418/<your project>.git <your directory>`, and everyone who download your repo will have to replace `<username>` with his/her username. Instead I suggest to add two lines to your `~/.ssh/config` file:
```
Host review.assembla.com
  User jacek.marchwicki
  Port 29418
```
and use `clone`, `submodule add`, `remote add` omitting the `<username>` part.
For testing proposes I suggest to use [assembla.com](http://assembla.com/) with gerrit - but if you rather want to use some other tool you are free to go. I assume you already have gerrit repo url, in my case: `ssh://review.assembla.com/gerrit-example.git`
than create project:
```bash
mkdir gerrit-example
git init
touch README.md
git add -A
git commit
git remote add origin ssh://review.assembla.com/gerrit-example.git
git push origin HEAD:refs/heads/master
```
Now your project should be on gerrit repo, now everyone can pull it as usual:
```bash
git clone ssh://rgit.assembla.com/gerrit-example.git
```
**And what is most important you have to install hook for commits after clone and import:**
```bash
scp review.assembla.com:hooks/commit-msg .git/hooks/
```
*To avoid screwing something up is better to remove master on your local repository and use origin/master instead*
```bash
git remote update
git checkout origin/master
git brach -d master
```
# Making changes
Before making some changes, lets do it:
```bash
echo > file1.txt << EOF
some text of file1
and mre text of file1
EOF
echo > file2.txt << EOF
some text of file2
and more text of file2
EOF
git add file1.txt
git commit
```
this time I specially forgot of `file2.txt` in commit and done a typo in `file1.txt` for learning propose.
You can ensure that in your last commit was `"Change-Id: ***"` looking in `git log`. If not you did not installed commit-msg hook, so:
```bash
scp review.assembla.com:hooks/commit-msg .git/hooks/
git add file1.txt
git commit --amend
```
This command append fixes tu current commit.
If `"Change-Id"` now appears in log you can submit your commit for review:
```bash
git push origin HEAD:refs/for/master
```
# Reviewing code
Now you have too look on your gerrit site: i.e.: `https://review.assembla.com/` and in *"All->Open"* section you should see a your commit to approve. Normally you wouldn't do yourself, but for test proposes we you can ;). One code reviewer should checkout this code and test it, and two of code reviewers should only check for changes that you made i.e.:
Two of your friends look in to code on commit site, commenting your code and click one button on "Code review" +1 if is look ok, -1 if its not look ok - i.e. some bug.
Third friend download code and verify it.

## Verifying
Let become third friend. Clone your project to some other directory to simulate third friend:
```bash
git clone ssh://review.assembla.com:/gerrit-example.git gerrit-example2
cd gerrit-example2
scp review.assembla.com:hooks/commit-msg .git/hooks/
```
Ok.. look for some commits to verify on "All->Open" get some and copy url from its page and type it in command line:
git fetch ssh://review.assembla.com:/gerrit-example refs/changes/73/6673/1 && git checkout -b c6673 FETCH_HEAD
Compile it and test it - I know it is hard do compile text files but you can imagine it ;)
Now you should use "Review" button on commit site and type your vote in "Verified" section and fill a comment if needed.
## Code review
Let become one of your first and second friend. They no need to download code, they only need to check your code on the web site. They check code, comment it if they find something to comment, and approve or not (+1, -1 or 0). Suppose that first friend looked at your code and +1 LGTM (Look good to me), but second noticed that you filled a typo in file1.txt. He should give -1 and fill a comment.
## Repairing
No you return and look for reviews and you see that your code was not approved, now you should fix it.
```bash
cd ../gerrit-example
git fetch ssh://review.assembla.com/gerrit-example refs/changes/73/6673/1 && git checkout -b c6673 FETCH_HEAD
sed -i '' "s/mre/more/" file1.txt
git add file1.txt
git commit --amend
git push origin HEAD:refs/for/master
```
Now your code is corrected an sendend second time to code review
## Merging
Now everyone of your friend approved you commit but you have bad luck - some other commit was approved before and there are conflict.
You have to resolve you commit and sand changes back go gerrit.
```bash
git checkout master
git pull
ssh://review.assembla.com/gerrit-example refs/changes/73/6673/1 && git checkout -b c6673 FETCH_HEAD
git remote update
git rebase origin/master
```
resolve conflicts 
```bash
git add -A
git rebase --commit
git push origin HEAD:refs/for/master
```
Now you code with fresh base was sent to review. And this time your friends approved and verified your code - your code will be automatically merged.

## Fixing order
Sometimes you can observer that you commit have OUTDATED dependency. This mean that commit which was parent from your have never version. Now you have to get rid of outdated commit. You will use cherry-pick which inserts you commit at top of another commit. You have to choose a commit which you would like to be the parent of your commit. Usually is a newer version of outdated commit.
You have to check it out:
```bash
ssh://review.assembla.com/gerrit-example refs/changes/73/6673/3 && git checkout FETCH_HEAD
```
and cherry pick your commit to remove outdated dependency:
```bash
ssh://review.assembla.com/gerrit-example refs/changes/74/234/1 && git cherry-pick FETCH_HEAD
```
resolve conflicts
```bash
git add -A
git commit
git push origin HEAD:refs/for/master
```
Now you should observer that on gerrit you do not have OUTDATED reference.
## Abandoned
If your commit is abandoned it means it will never be merged to repository. But if you have dependency from ABANDONED you have to get rid of this dependency. You have to choose some commit as a parent of your commit - usually origin/master and cherry-pick your commit:
```bash
git remote update
git checkout origin/master
ssh://review.assembla.com/gerrit-example refs/changes/74/234/1 && git cherry-pick FETCH_HEAD
```
resolve conflicts
```bash
git add -A
git commit
git push origin HEAD:refs/for/master
```
Now you should observe that in gerrit you do not have dependency from ABANDONED commit.