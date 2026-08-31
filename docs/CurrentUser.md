

# CurrentUser


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**acceptedPrivacyVersion** | **Integer** |  |  [optional] |
|**acceptedTOSVersion** | **Integer** |  |  |
|**accountDeletionDate** | **LocalDate** |  |  [optional] |
|**accountDeletionLog** | [**List&lt;AccountDeletionLog&gt;**](AccountDeletionLog.md) |   |  [optional] |
|**activeFriends** | **List&lt;String&gt;** |   |  [optional] |
|**ageVerificationStatus** | **AgeVerificationStatus** |  |  |
|**ageVerified** | **Boolean** | &#x60;true&#x60; if, user is age verified (not 18+). |  |
|**allowAvatarCopying** | **Boolean** |  |  |
|**appleDetails** | **Object** |  |  [optional] |
|**appleId** | **String** |  |  [optional] |
|**authToken** | **String** | The auth token for NEWLY REGISTERED ACCOUNTS ONLY (/auth/register) |  [optional] |
|**badges** | [**List&lt;Badge&gt;**](Badge.md) |   |  [optional] |
|**bannerColor** | **String** |  |  [optional] |
|**bannerType** | **String** |  |  [optional] |
|**bio** | **String** |  |  |
|**bioLinks** | **List&lt;String&gt;** |   |  |
|**completedTutorials** | **List&lt;String&gt;** |  |  [optional] |
|**contentFilters** | **List&lt;String&gt;** | These tags begin with &#x60;content_&#x60; and control content gating |  [optional] |
|**currentAvatar** | **String** |  |  |
|**currentAvatarImageUrl** | **String** | When profilePicOverride is not empty, use it instead. |  |
|**currentAvatarTags** | **List&lt;String&gt;** |  |  |
|**currentAvatarThumbnailImageUrl** | **String** | When profilePicOverride is not empty, use it instead. |  |
|**dateJoined** | **LocalDate** |  |  |
|**developerType** | **DeveloperType** |  |  |
|**discordDetails** | [**DiscordDetails**](DiscordDetails.md) |  |  [optional] |
|**discordId** | **String** | https://discord.com/developers/docs/reference#snowflakes |  [optional] |
|**displayName** | **String** |  |  |
|**emailVerified** | **Boolean** |  |  |
|**fallbackAvatar** | **String** |  |  [optional] |
|**friendGroupNames** | **List&lt;String&gt;** | Always empty array. |  |
|**friendKey** | **String** |  |  |
|**friendRequestStatus** | **String** | State of a friend request between the caller and this user. VRChat sends the string &#x60;\&quot;null\&quot;&#x60;, not JSON &#x60;null&#x60;. |  [optional] |
|**friends** | **List&lt;String&gt;** |  |  |
|**googleDetails** | **Object** |  |  [optional] |
|**googleId** | **String** |  |  [optional] |
|**hasBirthday** | **Boolean** |  |  |
|**hasDiscordFriendsOptOut** | **Boolean** |  |  [optional] |
|**hasEmail** | **Boolean** |  |  |
|**hasLoggedInFromClient** | **Boolean** |  |  |
|**hasPendingEmail** | **Boolean** |  |  |
|**hasSharedConnectionsOptOut** | **Boolean** |  |  [optional] |
|**hideContentFilterSettings** | **Boolean** |  |  [optional] |
|**homeLocation** | **String** | WorldID be \&quot;offline\&quot; on User profiles if you are not friends with that user. |  |
|**iconFrame** | **String** |  |  [optional] |
|**iconUrl** | **String** |  |  [optional] |
|**id** | **String** | A users unique ID, usually in the form of &#x60;usr_c1644b5b-3ca4-45b4-97c6-a2a0de70d469&#x60;. Legacy players can have old IDs in the form of &#x60;8JoV9XEdpo&#x60;. The ID can never be changed. |  |
|**instanceId** | **String** | InstanceID can be \&quot;offline\&quot; on User profiles if you are not friends with that user and \&quot;private\&quot; if you are friends and user is in private instance. |  [optional] |
|**isAdult** | **Boolean** |  |  |
|**isBoopingEnabled** | **Boolean** |  |  [optional] |
|**isEconomyCreator** | **Boolean** |  |  [optional] |
|**isFriend** | **Boolean** |  |  |
|**isTemporary** | **Boolean** |  |  [optional] |
|**lastActivity** | **OffsetDateTime** |  |  [optional] |
|**lastLogin** | **OffsetDateTime** |  |  |
|**lastMobile** | **OffsetDateTime** |  |  |
|**lastPlatform** | **String** | This is normally &#x60;android&#x60;, &#x60;ios&#x60;, &#x60;standalonewindows&#x60;, &#x60;web&#x60;, or the empty value &#x60;&#x60;, but also supposedly can be any random Unity version such as &#x60;2019.2.4-801-Release&#x60; or &#x60;2019.2.2-772-Release&#x60; or even &#x60;unknownplatform&#x60;. |  |
|**location** | **String** | Represents a unique location, consisting of a world identifier and an instance identifier, or \&quot;offline\&quot; if the user is not on your friends list. |  [optional] |
|**nameplateEffect** | **String** |  |  [optional] |
|**note** | **String** |  |  [optional] |
|**obfuscatedEmail** | **String** |  |  |
|**obfuscatedPendingEmail** | **String** |  |  |
|**oculusId** | **String** |  |  |
|**offlineFriends** | **List&lt;String&gt;** |  |  [optional] |
|**onlineFriends** | **List&lt;String&gt;** |  |  [optional] |
|**pastDisplayNames** | [**List&lt;PastDisplayName&gt;**](PastDisplayName.md) |   |  |
|**personalizationOptOut** | **Boolean** |  |  [optional] |
|**picoId** | **String** |  |  [optional] |
|**platform** | **String** |  |  [optional] |
|**platformHistory** | [**List&lt;CurrentUserPlatformHistoryInner&gt;**](CurrentUserPlatformHistoryInner.md) |  |  [optional] |
|**presence** | [**CurrentUserPresence**](CurrentUserPresence.md) |  |  [optional] |
|**profileEffect** | **String** |  |  [optional] |
|**profilePicOverride** | **String** |  |  |
|**profilePicOverrideThumbnail** | **String** |  |  |
|**pronouns** | **String** |  |  |
|**pronounsHistory** | **List&lt;String&gt;** |  |  |
|**queuedInstance** | **String** |  |  [optional] |
|**receiveMobileInvitations** | **Boolean** |  |  [optional] |
|**state** | **UserState** |  |  |
|**status** | **UserStatus** |  |  |
|**statusDescription** | **String** |  |  |
|**statusFirstTime** | **Boolean** |  |  |
|**statusHistory** | **List&lt;String&gt;** |  |  |
|**steamDetails** | **Object** |  |  |
|**steamId** | **String** |  |  |
|**tags** | **List&lt;String&gt;** |  |  |
|**temporaryExpiryDate** | **Object** |  |  [optional] |
|**travelingToInstance** | **String** |  |  [optional] |
|**travelingToLocation** | **String** |  |  [optional] |
|**travelingToWorld** | **String** |  |  [optional] |
|**twitchDetails** | **Object** |  |  [optional] |
|**twitchId** | **String** |  |  [optional] |
|**twoFactorAuthEnabled** | **Boolean** |  |  |
|**twoFactorAuthEnabledDate** | **OffsetDateTime** |  |  [optional] |
|**unsubscribe** | **Boolean** |  |  |
|**updatedAt** | **OffsetDateTime** |  |  [optional] |
|**userIcon** | **String** |  |  |
|**userLanguage** | **String** |  |  [optional] |
|**userLanguageCode** | **String** |  |  [optional] |
|**username** | **String** | Your own unique name, used during login. Distinct from &#x60;displayName&#x60;, and never returned for another user. |  [optional] |
|**usesGeneratedPassword** | **Boolean** |  |  |
|**viveId** | **String** |  |  [optional] |
|**worldId** | **String** | WorldID be \&quot;offline\&quot; on User profiles if you are not friends with that user. |  [optional] |



