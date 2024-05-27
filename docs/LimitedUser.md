

# LimitedUser



## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**bio** | **String** |  |  [optional] |
|**bioLinks** | **List&lt;String&gt;** |   |  [optional] |
|**currentAvatarImageUrl** | **String** | When profilePicOverride is not empty, use it instead. |  [optional] |
|**currentAvatarThumbnailImageUrl** | **String** | When profilePicOverride is not empty, use it instead. |  [optional] |
|**currentAvatarTags** | **List&lt;String&gt;** |  |  [optional] |
|**developerType** | **DeveloperType** |  |  |
|**displayName** | **String** |  |  |
|**fallbackAvatar** | **String** |  |  [optional] |
|**id** | **String** | A users unique ID, usually in the form of &#x60;usr_c1644b5b-3ca4-45b4-97c6-a2a0de70d469&#x60;. Legacy players can have old IDs in the form of &#x60;8JoV9XEdpo&#x60;. The ID can never be changed. |  |
|**isFriend** | **Boolean** |  |  |
|**lastPlatform** | **String** | This can be &#x60;standalonewindows&#x60; or &#x60;android&#x60;, but can also pretty much be any random Unity verison such as &#x60;2019.2.4-801-Release&#x60; or &#x60;2019.2.2-772-Release&#x60; or even &#x60;unknownplatform&#x60;. |  |
|**profilePicOverride** | **String** |  |  [optional] |
|**pronouns** | **String** |  |  [optional] |
|**status** | **UserStatus** |  |  |
|**statusDescription** | **String** |  |  |
|**tags** | **List&lt;String&gt;** | &lt;- Always empty. |  |
|**userIcon** | **String** |  |  [optional] |
|**username** | **String** | -| **DEPRECATED:** VRChat API no longer return usernames of other users. [See issue by Tupper for more information](https://github.com/pypy-vrc/VRCX/issues/429). |  [optional] |
|**location** | **String** |  |  [optional] |
|**friendKey** | **String** |  |  [optional] |



