# Project: Jacek Marchwicki's Blog

This document outlines key development information for Jacek Marchwicki's blog, focusing on the blog itself and not the associated example projects.

## New Article Placement

New articles should be placed in the `blog/content/blog/` directory. Each article should be a new Markdown file (e.g., `my-new-article.md`) within a subdirectory named after the article's slug (e.g., `blog/content/blog/my-new-article/index.md`). This structure ensures proper URL generation and organization.

## Build/Configuration Instructions

This blog is built using Hugo. To build the project, navigate to the `blog/` directory and run the following command:

```bash
hugo --gc
```

This command generates the static site in the `blog/public/` directory. The `--gc` flag performs garbage collection, removing unused files.

To run a local development server with live reloading, use:

```bash
hugo server
```

This will typically serve the site at `http://localhost:1313/`.

## Testing Information

The primary testing mechanism for this project is `htmltest`, which validates all internal and external links within the generated static site.

### Running Tests

To run the link validation tests, navigate to the `blog/` directory and execute:

```bash
./bin/htmltest -c .htmltest.yml
```

This command will check all links in the `public/` directory based on the configuration in `.htmltest.yml`. Any broken links or other issues will be reported in the console.

### Adding New Tests

`htmltest` automatically scans the generated `public/` directory. Therefore, there's no need to "add new tests" in the traditional sense for new content. As long as new articles or pages are generated into the `public/` directory, `htmltest` will include them in its scan.

If you need to ignore specific URLs from `htmltest` checks (e.g., known broken external links that are out of your control), you can add them to the `IgnoreURLs` section in the `blog/.htmltest.yml` file.

## Additional Development Information

### Code Style

The content of the blog posts is written in Markdown. Adhere to standard Markdown syntax. For Hugo-specific features, refer to the Hugo documentation for shortcodes and other templating functionalities.

### Deployment

The `blog/deploy.sh` script is used for deployment. It cleans the `public` directory, builds the Hugo project, runs `htmltest`, and then commits and pushes the changes to the `master` branch of the `public` directory's Git repository. This script is designed for automated deployment and should be used with caution.
