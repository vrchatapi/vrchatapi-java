

# User


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**acceptedPrivacyVersion** | **Integer** |  |  [optional] |
|**acceptedTOSVersion** | **Integer** |  |  [optional] |
|**accountDeletionDate** | **String** |  |  [optional] |
|**accountDeletionLog** | **List&lt;Object&gt;** |  |  [optional] |
|**ageVerificationStatus** | **AgeVerificationStatus** |  |  |
|**ageVerified** | **Boolean** | &#x60;true&#x60; if, user is age verified (not 18+). |  |
|**allowAvatarCopying** | **Boolean** |  |  |
|**appleDetails** | **Map&lt;String, Object&gt;** |  |  [optional] |
|**badges** | [**List&lt;Badge&gt;**](Badge.md) |   |  [optional] |
|**bannerColor** | **String** |  |  [optional] |
|**bannerType** | **String** |  |  [optional] |
|**bannerUrl** | **String** |  |  [optional] |
|**bio** | **String** |  |  |
|**bioLinks** | **List&lt;String&gt;** |  |  |
|**currentAvatarImageUrl** | **String** | When profilePicOverride is not empty, use it instead. |  |
|**currentAvatarTags** | **List&lt;String&gt;** |  |  |
|**currentAvatarThumbnailImageUrl** | **String** | When profilePicOverride is not empty, use it instead. |  |
|**dateJoined** | **LocalDate** |  |  |
|**developerType** | **DeveloperType** |  |  |
|**displayName** | **String** | A users visual display name. This is what shows up in-game, and can different from their &#x60;username&#x60;. Changing display name is restricted to a cooldown period. |  |
|**friendKey** | **String** |  |  |
|**friendRequestStatus** | **String** | State of a friend request between the caller and this user. VRChat sends the string &#x60;\&quot;null\&quot;&#x60;, not JSON &#x60;null&#x60;. |  [optional] |
|**iconFrame** | **String** |  |  [optional] |
|**iconUrl** | **String** |  |  [optional] |
|**id** | **String** | A users unique ID, usually in the form of &#x60;usr_c1644b5b-3ca4-45b4-97c6-a2a0de70d469&#x60;. Legacy players can have old IDs in the form of &#x60;8JoV9XEdpo&#x60;. The ID can never be changed. |  |
|**instanceId** | **String** | InstanceID can be \&quot;offline\&quot; on User profiles if you are not friends with that user and \&quot;private\&quot; if you are friends and user is in private instance. |  [optional] |
|**isEconomyCreator** | **Boolean** |  |  [optional] |
|**isFriend** | **Boolean** | Either their &#x60;friendKey&#x60;, or empty string if you are not friends. Unknown usage. |  |
|**lastActivity** | **String** | Either a date-time or empty string. |  |
|**lastLogin** | **String** | Either a date-time or empty string. |  |
|**lastMobile** | **String** |  |  [optional] |
|**lastPlatform** | **String** | This is normally &#x60;android&#x60;, &#x60;ios&#x60;, &#x60;standalonewindows&#x60;, &#x60;web&#x60;, or the empty value &#x60;&#x60;, but also supposedly can be any random Unity version such as &#x60;2019.2.4-801-Release&#x60; or &#x60;2019.2.2-772-Release&#x60; or even &#x60;unknownplatform&#x60;. |  |
|**location** | **String** | Represents a unique location, consisting of a world identifier and an instance identifier, or \&quot;offline\&quot; if the user is not on your friends list. |  [optional] |
|**nameplateEffect** | **String** |  |  [optional] |
|**note** | **String** |  |  [optional] |
|**platform** | **String** |  |  [optional] |
|**profileEffect** | **String** |  |  [optional] |
|**profilePicOverride** | **String** |  |  |
|**profilePicOverrideThumbnail** | **String** |  |  |
|**pronouns** | **String** |  |  |
|**state** | **UserState** |  |  |
|**status** | **UserStatus** |  |  |
|**statusDescription** | **String** |  |  |
|**tags** | **List&lt;String&gt;** |   |  |
|**travelingToInstance** | **String** |  |  [optional] |
|**travelingToLocation** | **String** |  |  [optional] |
|**travelingToWorld** | **String** |  |  [optional] |
|**userIcon** | **String** |  |  |
|**worldId** | **String** | WorldID be \&quot;offline\&quot; on User profiles if you are not friends with that user. |  [optional] |



