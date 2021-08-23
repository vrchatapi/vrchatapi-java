#!/bin/bash

rm src/main docs -rf
openapi-generator-cli generate \
-g java \
--additional-properties=groupId=io.github.vrchatapi,apiPackage=io.github.vrchatapi.api,invokerPackage=io.github.vrchatapi,modelPackage=io.github.vrchatapi.model,artifactId=vrchatapi,licenseName=MIT,licenseUrl=https://github.com/vrchatapi/vrchatapi-java/blob/main/LICENSE,developerEmail=me@ruby.js.org,developerName=VRChatAPI,developerOrganization=vrchatapi,developerOrganizationUrl=https://github.com/VRChatAPI,hideGenerationTimestamp=true \
--git-user-id=vrchatapi \
--git-repo-id=vrchatapi-java \
-o . \
-i https://vrchatapi.github.io/specification/openapi.yaml \
--http-user-agent="vrchatapi-java"

sed -i '/<\/dependencies>/i \
        <!-- Custom VRChat API dependencies -->\
        <dependency>\
            <groupId>com.squareup.okhttp3</groupId>\
            <artifactId>okhttp-urlconnection</artifactId>\
            <version>${okhttp-version}</version>\
        </dependency>' pom.xml

sed -i '/addNetworkInterceptor/a \
        builder.cookieJar(new okhttp3.JavaNetCookieJar(new java.net.CookieManager()));' src/main/java/io/github/vrchatapi/ApiClient.java