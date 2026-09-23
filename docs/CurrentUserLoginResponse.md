

# CurrentUserLoginResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**acceptedPrivacyVersion** | **Integer** |  |  [optional] |
|**acceptedTOSVersion** | **Integer** |  |  [optional] |
|**accountDeletionDate** | **LocalDate** |  |  [optional] |
|**accountDeletionLog** | [**List&lt;AccountDeletionLog&gt;**](AccountDeletionLog.md) |  |  [optional] |
|**activeFriends** | **List&lt;String&gt;** |  |  [optional] |
|**ageVerificationStatus** | **AgeVerificationStatus** |  |  [optional] |
|**ageVerified** | **Boolean** | &#x60;true&#x60; if, user is age verified (not 18+). |  [optional] |
|**allowAvatarCopying** | **Boolean** |  |  [optional] |
|**appleDetails** | **Object** | Details of an account on another service linked to this one. |  [optional] |
|**appleId** | **String** |  |  [optional] |
|**authToken** | **String** | The auth token for NEWLY REGISTERED ACCOUNTS ONLY (/auth/register) |  [optional] |
|**bannerColor** | **String** | Six hexadecimal digits, without a leading &#x60;#&#x60;. May be empty. |  [optional] |
|**bannerType** | **String** |  |  [optional] |
|**bannerUrl** | **String** |  |  [optional] |
|**completedTutorials** | **List&lt;String&gt;** |  |  [optional] |
|**contentFilters** | **List&lt;String&gt;** | These tags begin with &#x60;content_&#x60; and control content gating |  [optional] |
|**currentAvatar** | **String** |  |  [optional] |
|**currentAvatarImageUrl** | **String** | When profilePicOverride is not empty, use it instead. |  [optional] |
|**currentAvatarTags** | **List&lt;String&gt;** |  |  [optional] |
|**currentAvatarThumbnailImageUrl** | **String** | When profilePicOverride is not empty, use it instead. |  [optional] |
|**dateJoined** | **LocalDate** |  |  [optional] |
|**developerType** | **DeveloperType** |  |  [optional] |
|**discordDetails** | [**DiscordDetails**](DiscordDetails.md) |  |  [optional] |
|**discordId** | **String** | https://discord.com/developers/docs/reference#snowflakes |  [optional] |
|**displayName** | **String** |  |  [optional] |
|**emailVerified** | **Boolean** |  |  [optional] |
|**fallbackAvatar** | **String** |  |  [optional] |
|**friendGroupNames** | **List&lt;String&gt;** | Always empty array. |  [optional] |
|**friendKey** | **String** |  |  [optional] |
|**friendRequestStatus** | **String** | State of a friend request between the caller and this user. VRChat sends the string &#x60;\&quot;null\&quot;&#x60;, not JSON &#x60;null&#x60;. |  [optional] |
|**friends** | **List&lt;String&gt;** |  |  [optional] |
|**googleDetails** | **Object** | Details of an account on another service linked to this one. |  [optional] |
|**googleId** | **String** |  |  [optional] |
|**hasBirthday** | **Boolean** |  |  [optional] |
|**hasDiscordFriendsOptOut** | **Boolean** |  |  [optional] |
|**hasEmail** | **Boolean** |  |  [optional] |
|**hasLoggedInFromClient** | **Boolean** |  |  [optional] |
|**hasPendingEmail** | **Boolean** |  |  [optional] |
|**hasSharedConnectionsOptOut** | **Boolean** |  |  [optional] |
|**hideContentFilterSettings** | **Boolean** |  |  [optional] |
|**homeLocation** | **String** | WorldID be \&quot;offline\&quot; on User profiles if you are not friends with that user. |  [optional] |
|**iconFrame** | **String** |  |  [optional] |
|**iconUrl** | **String** |  |  [optional] |
|**id** | **String** | A users unique ID, usually in the form of &#x60;usr_c1644b5b-3ca4-45b4-97c6-a2a0de70d469&#x60;. Legacy players can have old IDs in the form of &#x60;8JoV9XEdpo&#x60;. The ID can never be changed. |  [optional] |
|**instanceId** | **String** | InstanceID can be \&quot;offline\&quot; on User profiles if you are not friends with that user and \&quot;private\&quot; if you are friends and user is in private instance. |  [optional] |
|**isAdult** | **Boolean** |  |  [optional] |
|**isBoopingEnabled** | **Boolean** |  |  [optional] |
|**isEconomyCreator** | **Boolean** |  |  [optional] |
|**isFriend** | **Boolean** |  |  [optional] |
|**isTemporary** | **Boolean** |  |  [optional] |
|**lastActivity** | **OffsetDateTime** |  |  [optional] |
|**lastLogin** | **OffsetDateTime** |  |  [optional] |
|**lastMobile** | **OffsetDateTime** |  |  [optional] |
|**lastPlatform** | **String** | This is normally &#x60;android&#x60;, &#x60;ios&#x60;, &#x60;standalonewindows&#x60;, &#x60;web&#x60;, or the empty value &#x60;&#x60;, but also supposedly can be any random Unity version such as &#x60;2019.2.4-801-Release&#x60; or &#x60;2019.2.2-772-Release&#x60; or even &#x60;unknownplatform&#x60;. |  [optional] |
|**location** | **String** | Represents a unique location, consisting of a world identifier and an instance identifier, or \&quot;offline\&quot; if the user is not on your friends list. |  [optional] |
|**nameplateEffect** | **String** |  |  [optional] |
|**note** | **String** |  |  [optional] |
|**obfuscatedEmail** | **String** |  |  [optional] |
|**obfuscatedPendingEmail** | **String** |  |  [optional] |
|**oculusId** | **String** |  |  [optional] |
|**offlineFriends** | **List&lt;String&gt;** |  |  [optional] |
|**onlineFriends** | **List&lt;String&gt;** |  |  [optional] |
|**pastDisplayNames** | [**List&lt;PastDisplayName&gt;**](PastDisplayName.md) |  |  [optional] |
|**personalizationOptOut** | **Boolean** |  |  [optional] |
|**picoId** | **String** |  |  [optional] |
|**platform** | **String** |  |  [optional] |
|**platformHistory** | [**List&lt;PlatformHistoryEntry&gt;**](PlatformHistoryEntry.md) |  |  [optional] |
|**presence** | [**CurrentUserPresence**](CurrentUserPresence.md) |  |  [optional] |
|**profileEffect** | **String** |  |  [optional] |
|**pronouns** | **String** |  |  [optional] |
|**pronounsHistory** | **List&lt;String&gt;** |  |  [optional] |
|**queuedInstance** | **String** |  |  [optional] |
|**receiveMobileInvitations** | **Boolean** |  |  [optional] |
|**state** | **UserState** |  |  [optional] |
|**status** | **UserStatus** |  |  [optional] |
|**statusDescription** | **String** |  |  [optional] |
|**statusFirstTime** | **Boolean** |  |  [optional] |
|**statusHistory** | **List&lt;String&gt;** |  |  [optional] |
|**steamDetails** | **Object** | Details of an account on another service linked to this one. |  [optional] |
|**steamId** | **String** |  |  [optional] |
|**tags** | **List&lt;String&gt;** |  |  [optional] |
|**temporaryExpiryDate** | **Object** |  |  [optional] |
|**travelingToInstance** | **String** |  |  [optional] |
|**travelingToLocation** | **String** |  |  [optional] |
|**travelingToWorld** | **String** |  |  [optional] |
|**twitchDetails** | **Object** | Details of an account on another service linked to this one. |  [optional] |
|**twitchId** | **String** |  |  [optional] |
|**twoFactorAuthEnabled** | **Boolean** |  |  [optional] |
|**twoFactorAuthEnabledDate** | **OffsetDateTime** |  |  [optional] |
|**unsubscribe** | **Boolean** |  |  [optional] |
|**updatedAt** | **OffsetDateTime** |  |  [optional] |
|**userLanguage** | **String** |  |  [optional] |
|**userLanguageCode** | **String** |  |  [optional] |
|**username** | **String** | Your own unique name, used during login. Distinct from &#x60;displayName&#x60;, and never returned for another user. |  [optional] |
|**usesGeneratedPassword** | **Boolean** |  |  [optional] |
|**viveId** | **String** |  |  [optional] |
|**worldId** | **String** | WorldID be \&quot;offline\&quot; on User profiles if you are not friends with that user. |  [optional] |
|**requiresTwoFactorAuth** | **List&lt;TwoFactorAuthType&gt;** |  |  [optional] |



