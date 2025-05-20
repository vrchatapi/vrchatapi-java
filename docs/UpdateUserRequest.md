

# UpdateUserRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**email** | **String** |  |  [optional] |
|**unsubscribe** | **Boolean** |  |  [optional] |
|**birthday** | **LocalDate** |  |  [optional] |
|**acceptedTOSVersion** | **Integer** |  |  [optional] |
|**tags** | **List&lt;String&gt;** |   |  [optional] |
|**status** | **UserStatus** |  |  [optional] |
|**statusDescription** | **String** |  |  [optional] |
|**bio** | **String** |  |  [optional] |
|**bioLinks** | **List&lt;String&gt;** |  |  [optional] |
|**pronouns** | **String** |  |  [optional] |
|**isBoopingEnabled** | **Boolean** |  |  [optional] |
|**userIcon** | **String** | MUST be a valid VRChat /file/ url. |  [optional] |
|**contentFilters** | **List&lt;String&gt;** | These tags begin with &#x60;content_&#x60; and control content gating |  [optional] |
|**displayName** | **String** | MUST specify currentPassword as well to change display name |  [optional] |
|**revertDisplayName** | **Boolean** | MUST specify currentPassword as well to revert display name |  [optional] |
|**password** | **String** | MUST specify currentPassword as well to change password |  [optional] |
|**currentPassword** | **String** |  |  [optional] |



