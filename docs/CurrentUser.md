

# CurrentUser


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** |  | 
**username** | **String** |  | 
**displayName** | **String** |  | 
**userIcon** | **String** |  | 
**bio** | **String** |  | 
**bioLinks** | **List&lt;String&gt;** |  | 
**profilePicOverride** | **String** |  | 
**statusDescription** | **String** |  | 
**pastDisplayNames** | [**List&lt;PastDisplayName&gt;**](PastDisplayName.md) |  | 
**hasEmail** | **Boolean** |  | 
**hasPendingEmail** | **Boolean** |  | 
**obfuscatedEmail** | **String** |  | 
**obfuscatedPendingEmail** | **String** |  | 
**emailVerified** | **Boolean** |  | 
**hasBirthday** | **Boolean** |  | 
**unsubscribe** | **Boolean** |  | 
**statusHistory** | **List&lt;String&gt;** |  | 
**statusFirstTime** | **Boolean** |  | 
**friends** | **List&lt;String&gt;** |  | 
**friendGroupNames** | **List&lt;String&gt;** | Always empty array. | 
**currentAvatarImageUrl** | **String** |  | 
**currentAvatarThumbnailImageUrl** | **String** |  | 
**fallbackAvatar** | **String** |  | 
**currentAvatar** | **String** |  | 
**currentAvatarAssetUrl** | **String** |  | 
**accountDeletionDate** | **LocalDate** |  |  [optional]
**acceptedTOSVersion** | **BigDecimal** |  | 
**steamId** | **String** |  | 
**steamDetails** | **Object** |  | 
**oculusId** | **String** |  | 
**hasLoggedInFromClient** | **Boolean** |  | 
**homeLocation** | **String** |  | 
**twoFactorAuthEnabled** | **Boolean** |  | 
**state** | **UserState** |  | 
**tags** | **List&lt;String&gt;** |  | 
**developerType** | **DeveloperType** |  | 
**lastLogin** | **OffsetDateTime** |  | 
**lastPlatform** | **String** | This can be &#x60;standalonewindows&#x60; or &#x60;android&#x60;, but can also pretty much be any random Unity verison such as &#x60;2019.2.4-801-Release&#x60; or &#x60;2019.2.2-772-Release&#x60; or even &#x60;unknownplatform&#x60;. | 
**allowAvatarCopying** | **Boolean** |  | 
**status** | **UserStatus** |  | 
**dateJoined** | **LocalDate** |  |  [readonly]
**isFriend** | **Boolean** |  | 
**friendKey** | **String** |  | 
**onlineFriends** | **List&lt;String&gt;** |  |  [optional]
**activeFriends** | **List&lt;String&gt;** |  |  [optional]
**offlineFriends** | **List&lt;String&gt;** |  |  [optional]



