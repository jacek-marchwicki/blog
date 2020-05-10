# Blog

There are source files for blog made by Jacek Marchwicki:

## Running blog
```bash
brew install hugo
brew install npm
git submodule update --init --recursive
cd blog
npm install
hugo server

 ```
 
 ## Generating blog 
 ```bash
 cd blog
 curl https://htmltest.wjdp.uk | bash
 rm -rf public
 env HUGO_ENV="production" hugo --gc
 bin/htmltest public
 ```