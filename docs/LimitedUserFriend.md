

# LimitedUserFriend

User object received when querying your friends list

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**bio** | **String** |  |  [optional] |
|**bioLinks** | **List&lt;String&gt;** |   |  [optional] |
|**currentAvatarImageUrl** | **String** | When profilePicOverride is not empty, use it instead. |  |
|**currentAvatarThumbnailImageUrl** | **String** | When profilePicOverride is not empty, use it instead. |  [optional] |
|**currentAvatarTags** | **List&lt;String&gt;** |  |  [optional] |
|**developerType** | **DeveloperType** |  |  |
|**displayName** | **String** |  |  |
|**friendKey** | **String** |  |  |
|**id** | **String** | A users unique ID, usually in the form of &#x60;usr_c1644b5b-3ca4-45b4-97c6-a2a0de70d469&#x60;. Legacy players can have old IDs in the form of &#x60;8JoV9XEdpo&#x60;. The ID can never be changed. |  |
|**isFriend** | **Boolean** |  |  |
|**imageUrl** | **String** |  |  |
|**lastPlatform** | **String** | This can be &#x60;standalonewindows&#x60; or &#x60;android&#x60;, but can also pretty much be any random Unity verison such as &#x60;2019.2.4-801-Release&#x60; or &#x60;2019.2.2-772-Release&#x60; or even &#x60;unknownplatform&#x60;. |  |
|**location** | **String** |  |  |
|**lastLogin** | **OffsetDateTime** |  |  |
|**lastActivity** | **OffsetDateTime** |  |  |
|**lastMobile** | **OffsetDateTime** |  |  |
|**platform** | **String** |  |  |
|**profilePicOverride** | **String** |  |  |
|**profilePicOverrideThumbnail** | **String** |  |  |
|**status** | **UserStatus** |  |  |
|**statusDescription** | **String** |  |  |
|**tags** | **List&lt;String&gt;** | &lt;- Always empty. |  |
|**userIcon** | **String** |  |  |



