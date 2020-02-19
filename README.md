# Blog

There are source files for blog made by Jacek Marchwicki:

## Running blog
```bash
brew install hugo
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
 hugo
 bin/htmltest public
 ```