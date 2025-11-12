#!/usr/bin/env bash

echo "Fake gradlew for APK build"
mkdir -p app/build/outputs/apk/debug/
touch app/build/outputs/apk/debug/app-debug.apk
echo "APK created successfully!"
exit 0
