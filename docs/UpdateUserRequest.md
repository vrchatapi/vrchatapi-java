

# UpdateUserRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**acceptedTOSVersion** | **Integer** |  |  [optional] |
|**bio** | **String** |  |  [optional] |
|**bioLinks** | **List&lt;String&gt;** |  |  [optional] |
|**birthday** | **LocalDate** |  |  [optional] |
|**contentFilters** | **List&lt;ContentFilter&gt;** | These tags begin with &#x60;content_&#x60; and control content gating |  [optional] |
|**currentPassword** | **String** |  |  [optional] |
|**displayName** | **String** | MUST specify currentPassword as well to change display name |  [optional] |
|**email** | **String** |  |  [optional] |
|**hasSharedConnectionsOptOut** | **Boolean** | Opt out of the Mutuals feature |  [optional] |
|**isBoopingEnabled** | **Boolean** |  |  [optional] |
|**password** | **String** | MUST specify currentPassword as well to change password |  [optional] |
|**pronouns** | **String** |  |  [optional] |
|**revertDisplayName** | **Boolean** | MUST specify currentPassword as well to revert display name |  [optional] |
|**status** | **UserStatus** |  |  [optional] |
|**statusDescription** | **String** |  |  [optional] |
|**tags** | **List&lt;String&gt;** |   |  [optional] |
|**unsubscribe** | **Boolean** |  |  [optional] |
|**userIcon** | **String** | MUST be a valid VRChat /file/ url. |  [optional] |



