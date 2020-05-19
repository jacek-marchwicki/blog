#!/bin/sh -e


if [ ! -d "public" ] || [ ! -f "config.toml" ]; then
  echo "You need to execute this script in blog directory" 1>&2;
  exit 1;
fi

printf "\033[0;32mCleaning build repository...\033[0m\n"

# Deleting all the .git stuff
find public -path public/.git -prune -o -exec rm -rf {} \; 2> /dev/null

printf "\033[0;32mBuilding hugo project...\033[0m\n"
# Build the project.
env HUGO_ENV="production" hugo --gc

printf "\033[0;32mVerifing links...\033[0m\n"
bin/htmltest public

printf "\033[0;32mOpenning broser (press ctrl+c after manual verifing)...\033[0m\n"
./node_modules/.bin/static-html-server -r public

printf "\033[0;32mCreating pull request...\033[0m\n"
# Go To Public folder
cd public

# Add changes to git.
git add .

# Commit changes.
git commit "$@"

# Push source and build repos.
git push origin master