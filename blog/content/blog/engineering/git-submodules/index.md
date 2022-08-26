---
title: "Working with git submodules (very old article)"
linkTitle: "Working with git submodules (very old article)"
date: 2012-06-20
author: Jacek Marchwicki
summary: >
  Working with submodules looks tricki at the beginning but it is an elegant way to share your project code and DRY (Don't Repeat Yourself). We started to use submodules a lot in appunite.com, but there is not much said in WWW about how to use git submodules in real projects.
description: >
  Working with submodules looks tricki at the beginning but it is an elegant way to share your project code and DRY (Don't Repeat Yourself). We started to use submodules a lot in appunite.com, but there is not much said in WWW about how to use git submodules in real projects.
resources:
- src: "featured-title.jpg"
  params:
    byline: "Photo by [Luca Nicoletti](https://unsplash.com/@luca_nicoletti?utm_source=unsplash&utm_medium=referral&utm_content=creditCopyText) on [Unsplash](https://unsplash.com/s/photos/matryoshka?utm_source=unsplash&utm_medium=referral&utm_content=creditCopyText)"
--- 

**Note:** This article is very, very old. I'm publishing it mostly for fun :)

# Introduction
Working with submodules looks tricki at the beginning but it is an elegant way to share your project code and DRY (Don't Repeat Yourself). We started to use submodules a lot in [appunite.com](https://appunite.com), but there is not much said in WWW about how to use git submodules in real projects. To start this tutorial you have to have a basic knowledge about git: (clone, fetch, merge, push, branch)

# Starting
It is important to say what could become a git submodule. Any of git repo can be used as a submodule. Any? Yes - any. This means that you do not have to clone your library from github.com to some directory, and paste it to your project directory - you really shouldn't do that way. You should sumodule - it to your project directory.

# Real tutorial
## Create project
To use submodules you have to have a project which will use some shared data space. You have to remember that whole file structure from submodule will be placed in a directory in the parent module. You can create structure like this if you are an Android developer:

* `Project1/Project1/src/*`
* `Project1/Project1/res/*`
* `Project1/Submodule1/*` - for submodule files (you do not need to actually create this directory)
Now you can do this:

1. `mkdir Project1`
2. `Project1$ git init`
3. `Project[]$` create some files and edit them
4. `Project[]$ git add -A`
5. `Project[]$ git commit` 
6. go back few times to pkt. 3

Now you have normal project with few commits as normaly you have. Remember to create .gitignore file for real world projects - to ommit unnecsery files.
## Create submodule
Now it is time to create shared space for your projects. I assume that shared space will be created in the same parent directory as previous project "Project1".
1. `mkdir Submodule1`
2. `Submodule1$ git init`
3. `Submodule1[]$` create some files
4. `Submodule1[]$ git add -A`
5. `Submodule1[]$ git commit` 
6. go back few times to pkt. 3

Now you have normal project with few commits as normaly you have. Yes I know it is copy and past from previous header, because as I previously marked - submodule is normal git repository. You have to better put it to Your mind for better uderstending.
## Add submodule to your project
Now it is time to add submodule to your project. That command we will use is git submodule add - it is similar to git clone, but it has to be run in the root of a some project directory (directory containing the .git directory). And another difference is that it creates/extends .gitmodules file. Let's do it:

1. `Project1[master]$ git add submodule ../Submodule1 Submodule1`
2. `Project1[master]$ git add -A`
3. `Project1[master]$ git commit`

the first command clones `../Submodule1` repository to `Submodule1` directory. It creates `.gitmodules` text file with information where repository is and where it is/should be cloned. And last but no less important: it creates reference from `Project1` commit to `Submodule1` commit.

After changing working directory to `Project1/Submodule1` you can invoke git commands, but note that those commands apply to your `Project1/Submodule1` project not `Project1`. I remind, submodule is only:

* `.gitmodules` file reference submodule repository to directory in your project
* reference from your commit in Project1 to submodule commit

Its means a lot, and this tutorial aims to highlight this.

Additionally you can observe that in your submodule directory there is a `.git` directory or, in newer version of git tool a `.git` file with reference to another directory (i.e. gitdir: `../.git/modules/Submodule1`). This directory (or this directory reference) contains all data for you submodule revision control.

Ok... back to work.

## Modifications in submodule
Ok.. now you know how to add a submodule. Then create a second project (`"Project2"`) that will contain this submodule - `Project2` will be used for testing proposes.

Assume that you realized that some changes in Submodule1 should be made (i.e. modification of file). Let me start:

1. `Project1[master]$ cd Submodule1`
2. `Submodule1[master]$` #edit some file
3. `Submodule1[master]$ cd ..`
4. `Project1[master]$ git status`

**Now you observe that in your project in `Submodule1` directory is marked as *"modified content"*. This means that your submodule has some uncommited content. If you see this marker you have to be careful because you can commit some changes in your project and send to repository omitting changes in your submodule.**

1. `Project1[master]$ cd Submodule1`
2. `Submodule1[master]$ git add -A`
3. `Submodule1[master]$ git commit`
4. `Submodule1[master]$ cd ..`
5. `Project1[master]$ git status`

**Now you can observe another marker near your `Submodule1` directory - *"new commits"*. This marker means that your `Submodule1` is checked-out in commit different that commit reference stored in `Project1` commit.**
**It is very important to understand what it means because you can piss off friends that work with you if you mess something up in the repository ;).**
**Just now it means that you created new commit in `Submodule1` but you did not update reference in `Project1` to newer version of `Submodule1` (this marker can mean something else but I will explain this in later in this document).**

Ok.. fix this up:

1. `Project1[master]$ git add Submodule1`
2. `Project1[master]$` edit some file and add them to commit if you want
3. `Project1[master]$ git commit`

Ok.. there is another place you can screw something up now. If you invoke `git push` on your `Project1` your friends will become evil zombies and bury you in the grave as soon as you return to the office. This can happen because you push changes to `Project1` repository without pushing `Submodule1`. This evil friend is the one who pulled `Project1` that has reference to `Submodule1` commit which is not in `Submodule1` repository. If you do not want to run from zombies you have to do those in the right order:

1. `Project1[master]$ cd Submodule1`
2. `Submodule1[master]$ git push`
3. `Submodule1[master]$` make sure that everything are OK
4. `Submodule1[master]$ cd ..`
5. `Project1[master]$ git push`

Ok now you are safe.

## Pulling project with submodules
coming soon

## Updating to the newest version of submodule

coming soon

## Credits
Thanks to Jarosław Gliwiński who pointed me a lot of spelling errors.