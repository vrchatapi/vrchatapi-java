#!/bin/bash

rm docs -rf
rm src/main/java/io/github/vrchatapi/*.java
rm src/main/java/io/github/vrchatapi/api -rf
rm src/main/java/io/github/vrchatapi/auth -rf
rm src/main/java/io/github/vrchatapi/model -rf
openapi-generator-cli generate \
-g java \
--additional-properties=groupId=io.github.vrchatapi,apiPackage=io.github.vrchatapi.api,invokerPackage=io.github.vrchatapi,modelPackage=io.github.vrchatapi.model,artifactId=vrchatapi,licenseName=MIT,licenseUrl=https://github.com/vrchatapi/vrchatapi-java/blob/main/LICENSE,developerEmail=me@ruby.js.org,developerName=VRChatAPI,developerOrganization=vrchatapi,developerOrganizationUrl=https://github.com/VRChatAPI,hideGenerationTimestamp=true \
--git-user-id=vrchatapi \
--git-repo-id=vrchatapi-java \
-o . \
-i https://vrchatapi.github.io/specification/openapi.yaml \
--http-user-agent="vrchatapi-java"

sed -i 's/java.version>1.7/java.version>1.8/g' pom.xml

sed -i '/addNetworkInterceptor/a \
        builder.cookieJar(new io.github.vrchatapi.util.SimpleOkHttpCookieJar());' src/main/java/io/github/vrchatapi/ApiClient.java