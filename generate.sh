#!/bin/bash

rm src/main docs -rf
openapi-generator-cli generate \
-g java \
--additional-properties=groupId=io.github.vrchatapi,apiPackage=io.github.vrchatapi.api,invokerPackage=io.github.vrchatapi,modelPackage=io.github.vrchatapi.model,artifactId=vrchatapi,licenseName=MIT,licenseUrl=https://github.com/vrchatapi/vrchatapi-java/blob/main/LICENSE,developerEmail=me@ruby.js.org,developerName=VRChatAPI,developerOrganization=vrchatapi,developerOrganizationUrl=https://github.com/VRChatAPI \
--git-user-id=vrchatapi \
--git-repo-id=vrchatapi-java \
-o . \
-i https://vrchatapi.github.io/specification/openapi.yaml \
--http-user-agent="vrchatapi-java"

sed -i '/<\/licenses>/a \
\
    <distributionManagement>\
        <repository>\
            <id>github</id>\
            <name>GitHub Packages</name>\
            <url>https://maven.pkg.github.com/vrchatapi/vrchatapi-java</url>\
        </repository>\
    </distributionManagement>' pom.xml