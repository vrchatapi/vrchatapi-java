![](https://github.com/vrchatapi/vrchatapi.github.io/blob/master/assets/img/lang/lang_java_banner_1500x300.png?raw=true)

# VRChat API Library for Java

A Java client to interact with the unofficial VRChat API. Supports all REST calls specified in the [API specification](https://github.com/vrchatapi/specification).

## Disclaimer

This is the official response of the VRChat Team (from Tupper more specifically) on the usage of the VRChat API.

> Use of the API using applications other than the approved methods (website, VRChat application) are not officially supported. You may use the API for your own application, but keep these guidelines in mind:
> * We do not provide documentation or support for the API.
> * Do not make queries to the API more than once per 60 seconds.
> * Abuse of the API may result in account termination.
> * Access to API endpoints may break at any given time, with no warning.

As stated, this documentation was not created with the help of the official VRChat team. Therefore this documentation is not an official documentation of the VRChat API and may not be always up to date with the latest versions. If you find that a page or endpoint is not longer valid please create an issue and tell us so we can fix it.

## Getting Started

First add the package to to your project:
```xml
<repositories>
  <repository>
    <id>jitpack.io</id>
    <url>https://jitpack.io</url>
  </repository>
</repositories>
<dependency>
  <groupId>com.github.vrchatapi</groupId>
  <artifactId>vrchatapi-java</artifactId>
  <version>1.0.1</version>
  <scope>compile</scope>
</dependency>
```
or
```groovy
allprojects {
  repositories {
    ...
    maven { url 'https://jitpack.io' }
  }
}
dependencies {
  implementation 'com.github.vrchatapi:vrchatapi-java:1.0.1'
}
```

Below is an example on how to login to the API and fetch your own user information.

```java
// Step 1. VRChat consists of several API's
// e.g. (WorldsApi, UsersApi, FilesApi, NotificationsApi, FriendsApi, etc...)
// Here we instantiate the Authentication API which is required for logging in.
ApiClient defaultClient = Configuration.getDefaultApiClient();
AuthenticationApi authApi = new AuthenticationApi(defaultClient);

// Step 2. We begin with creating a Configuration
// This contains the username and password for authentication.
HttpBasicAuth authHeader = (HttpBasicAuth) defaultClient.getAuthentication("authHeader");
authHeader.setUsername("username");
authHeader.setPassword("password");
// Also configure API key
ApiKeyAuth authCookie = (ApiKeyAuth) defaultClient.getAuthentication("authCookie");
authCookie.setApiKey("JlE5Jldo5Jibnk5O5hTx6XVqsJu4WJ26");

// Step 3. Call getCurrentUser on Authentication API.
// This logs you in if the user isn't already logged in.
CurrentUser result = authApi.getCurrentUser();
System.out.println(result.getDisplayName());
```

See [examples](https://github.com/vrchatapi/vrchatapi-java/blob/master/examples) for more example usage on getting started.

## Contributing

Contributions are welcome, but do not add features that should be handled by the OpenAPI specification.

Join the [Discord server](https://discord.gg/Ge2APMhPfD) to get in touch with us.
