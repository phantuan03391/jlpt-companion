#!/usr/bin/env bash
set -e

# Determine JAVA_HOME if not already set
if [ -z "$JAVA_HOME" ]; then
    if [ -d "/Applications/Android Studio.app/Contents/jbr/Contents/Home" ]; then
        export JAVA_HOME="/Applications/Android Studio.app/Contents/jbr/Contents/Home"
    fi
fi

export NODE_OPTIONS="--max-old-space-size=4096"

echo "🚀 [1/2] Building Web application..."
./gradlew :webApp:jsBrowserDistribution

echo "☁️ [2/2] Deploying to Cloudflare Pages..."
npm_config_cache=/tmp/npm_cache npx --yes wrangler@3 pages deploy webApp/build/dist/js/productionExecutable --project-name=jlpt-companion

echo "✨ Deploy complete! Your website is live at:"
echo "👉 https://jlpt-companion.pages.dev"

