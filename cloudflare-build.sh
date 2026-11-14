#!/usr/bin/env bash
set -e

echo "📦 [1/3] Downloading OpenJDK 17 for Cloudflare Pages environment..."
mkdir -p /tmp/jdk17
curl -sL "https://api.adoptium.net/v3/binary/latest/17/ga/linux/x64/jdk/hotspot/normal/eclipse" | tar -xz -C /tmp/jdk17 --strip-components=1

export JAVA_HOME=/tmp/jdk17
export PATH="$JAVA_HOME/bin:$PATH"
export NODE_OPTIONS="--max-old-space-size=4096"

echo "☕ [2/3] Java environment ready:"
java -version

echo "🚀 [3/3] Compiling JLPT N5 Web Application..."
chmod +x ./gradlew
./gradlew :webApp:jsBrowserDistribution --no-daemon

echo "✅ Build complete! Assets ready in webApp/build/dist/js/productionExecutable"

