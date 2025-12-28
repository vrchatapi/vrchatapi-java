

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
|**currentAvatarTags** | **List&lt;String&gt;** |  |  |
|**currentAvatarThumbnailImageUrl** | **String** | When profilePicOverride is not empty, use it instead. |  |
|**dateJoined** | **OffsetDateTime** |  |  |
|**developerType** | **DeveloperType** |  |  |
|**displayName** | **String** |  |  |
|**friendKey** | **String** |  |  |
|**id** | **String** | A users unique ID, usually in the form of &#x60;usr_c1644b5b-3ca4-45b4-97c6-a2a0de70d469&#x60;. Legacy players can have old IDs in the form of &#x60;8JoV9XEdpo&#x60;. The ID can never be changed. |  |
|**imageUrl** | **String** |  |  [optional] |
|**isFriend** | **Boolean** |  |  |
|**lastActivity** | **OffsetDateTime** |  |  |
|**lastMobile** | **OffsetDateTime** |  |  [optional] |
|**lastPlatform** | **String** | This is normally &#x60;android&#x60;, &#x60;ios&#x60;, &#x60;standalonewindows&#x60;, &#x60;web&#x60;, or the empty value &#x60;&#x60;, but also supposedly can be any random Unity version such as &#x60;2019.2.4-801-Release&#x60; or &#x60;2019.2.2-772-Release&#x60; or even &#x60;unknownplatform&#x60;. |  |
|**platform** | **String** | This is normally &#x60;android&#x60;, &#x60;ios&#x60;, &#x60;standalonewindows&#x60;, &#x60;web&#x60;, or the empty value &#x60;&#x60;, but also supposedly can be any random Unity version such as &#x60;2019.2.4-801-Release&#x60; or &#x60;2019.2.2-772-Release&#x60; or even &#x60;unknownplatform&#x60;. |  [optional] |
|**profilePicOverride** | **String** |  |  [optional] |
|**profilePicOverrideThumbnail** | **String** |  |  [optional] |
|**pronouns** | **String** |  |  |
|**state** | **UserState** |  |  [optional] |
|**status** | **UserStatus** |  |  |
|**statusDescription** | **String** |  |  |
|**tags** | **List&lt;String&gt;** |  |  |
|**userIcon** | **String** |  |  [optional] |



