#!/bin/bash

npm install @openapitools/openapi-generator-cli

rm docs -rf
rm src/main/java/io/github/vrchatapi/*.java
rm src/main/java/io/github/vrchatapi/api -rf
rm src/main/java/io/github/vrchatapi/auth -rf
rm src/main/java/io/github/vrchatapi/model -rf

./node_modules/\@openapitools/openapi-generator-cli/main.js generate \
-g java \
--additional-properties=groupId=io.github.vrchatapi,apiPackage=io.github.vrchatapi.api,invokerPackage=io.github.vrchatapi,modelPackage=io.github.vrchatapi.model,artifactId=vrchatapi,licenseName=MIT,licenseUrl=https://github.com/vrchatapi/vrchatapi-java/blob/main/LICENSE,developerEmail=me@ruby.js.org,developerName=VRChatAPI,developerOrganization=vrchatapi,developerOrganizationUrl=https://github.com/VRChatAPI,hideGenerationTimestamp=true \
--git-user-id=vrchatapi \
--git-repo-id=vrchatapi-java \
-o . \
-i https://raw.githubusercontent.com/vrchatapi/specification/gh-pages/openapi.yaml \
--http-user-agent="vrchatapi-java"

# Remove unneccesary copy of spec
rm api/ -rf

# Update Java 7 to Java 8
sed -i 's/java.version>1.7/java.version>1.8/g' pom.xml

# Add global cookie storage
sed -i '/addNetworkInterceptor/a \
        builder.cookieJar(new io.github.vrchatapi.util.SimpleOkHttpCookieJar());' src/main/java/io/github/vrchatapi/ApiClient.java

# Remove messily pasted markdown at top of every file
find src -type f -exec sed -i '/VRChat API Banner/d' {} \;