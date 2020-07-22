#!/bin/sh -e

if [ ! -d "public" ] || [ ! -f "config.toml" ]; then
  echo "You need to execute this script in blog directory" 1>&2;
  exit 1;
fi



# Ensure all sub-process are killed after exit
cleanup() {
  pids=$(jobs -pr)
  [ -n "$pids" ] && kill "$pids"
}
trap "cleanup" INT QUIT TERM EXIT

printf "\033[0;32mCleaning build repository...\033[0m\n"

# Deleting all the .git stuff
find public -mindepth 1 ! -path public/.git -delete
# How to debug: find public -mindepth 1 ! -path public/.git -print

printf "\033[0;32mBuilding hugo project...\033[0m\n"
# Build the project.
env HUGO_ENV="production" hugo --gc

printf "\033[0;32mVerifing links...\033[0m\n"
bin/htmltest public

printf "\033[0;32mOpenning broser (press ctrl+c after manual verifing)...\033[0m\n"
./node_modules/.bin/static-html-server -r public &
SERVER_PID=$!
sleep 2;

printf "\033[0;33mPress enter to continue\033[0m\n"
read
kill $SERVER_PID

printf "\033[0;32mCreating pull request...\033[0m\n"
# Go To Public folder
cd public

# Add changes to git.
git add .

# Commit changes.
git commit "$@"

# Push source and build repos.
git push origin master


printf "\033[0;32mDeployed\033[0m\n"
