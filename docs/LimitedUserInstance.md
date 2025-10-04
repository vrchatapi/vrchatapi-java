

# LimitedUserInstance

User object received when querying your own instance

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**ageVerificationStatus** | **AgeVerificationStatus** |  |  |
|**ageVerified** | **Boolean** | &#x60;true&#x60; if, user is age verified (not 18+). |  |
|**allowAvatarCopying** | **Boolean** |  |  |
|**bio** | **String** |  |  [optional] |
|**bioLinks** | **List&lt;String&gt;** |   |  [optional] |
|**currentAvatarImageUrl** | **String** | When profilePicOverride is not empty, use it instead. |  |
|**currentAvatarThumbnailImageUrl** | **String** | When profilePicOverride is not empty, use it instead. |  |
|**currentAvatarTags** | **List&lt;String&gt;** |  |  |
|**dateJoined** | **OffsetDateTime** |  |  |
|**developerType** | **DeveloperType** |  |  |
|**displayName** | **String** |  |  |
|**friendKey** | **String** |  |  |
|**id** | **String** | A users unique ID, usually in the form of &#x60;usr_c1644b5b-3ca4-45b4-97c6-a2a0de70d469&#x60;. Legacy players can have old IDs in the form of &#x60;8JoV9XEdpo&#x60;. The ID can never be changed. |  |
|**isFriend** | **Boolean** |  |  |
|**imageUrl** | **String** |  |  [optional] |
|**lastPlatform** | **String** | This can be &#x60;standalonewindows&#x60; or &#x60;android&#x60;, but can also pretty much be any random Unity verison such as &#x60;2019.2.4-801-Release&#x60; or &#x60;2019.2.2-772-Release&#x60; or even &#x60;unknownplatform&#x60;. |  |
|**lastActivity** | **OffsetDateTime** |  |  |
|**lastMobile** | **OffsetDateTime** |  |  |
|**platform** | **String** |  |  [optional] |
|**profilePicOverride** | **String** |  |  [optional] |
|**profilePicOverrideThumbnail** | **String** |  |  [optional] |
|**pronouns** | **String** |  |  |
|**state** | **UserState** |  |  |
|**status** | **UserStatus** |  |  |
|**statusDescription** | **String** |  |  |
|**tags** | **List&lt;String&gt;** |  |  |
|**userIcon** | **String** |  |  [optional] |



