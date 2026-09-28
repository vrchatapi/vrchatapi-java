

# UpdateUserRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**acceptedTOSVersion** | **Integer** |  |  [optional] |
|**allowWorldsToCountFriendsInInstance** | **Boolean** | The \&quot;Allow Worlds to Count Friends in Instance\&quot; setting, introduced under [Udon Methods for Friend Info](https://ask.vrchat.com/t/developer-update-24-september-2026/48972#p-90922-udon-methods-for-friend-info-13) in the Developer Update of September 24, 2026. |  [optional] |
|**birthday** | **LocalDate** |  |  [optional] |
|**contentFilters** | **List&lt;ContentFilter&gt;** | These tags begin with &#x60;content_&#x60; and control content gating |  [optional] |
|**currentPassword** | **String** |  |  [optional] |
|**displayName** | **String** | MUST specify currentPassword as well to change display name |  [optional] |
|**email** | **String** |  |  [optional] |
|**hasDiscordFriendsOptOut** | **Boolean** | Opt out of the Discord Friend Connections feature |  [optional] |
|**hasSharedConnectionsOptOut** | **Boolean** | Opt out of the Mutuals feature |  [optional] |
|**isBoopingEnabled** | **Boolean** |  |  [optional] |
|**password** | **String** | MUST specify currentPassword as well to change password |  [optional] |
|**pronouns** | **String** |  |  [optional] |
|**revertDisplayName** | **Boolean** | MUST specify currentPassword as well to revert display name |  [optional] |
|**status** | **UserStatus** |  |  [optional] |
|**statusDescription** | **String** |  |  [optional] |
|**tags** | **List&lt;String&gt;** |  |  [optional] |
|**unsubscribe** | **Boolean** |  |  [optional] |



