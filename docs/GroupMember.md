

# GroupMember


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** |  |  [optional] |
|**groupId** | **String** |  |  [optional] |
|**userId** | **String** | A users unique ID, usually in the form of &#x60;usr_c1644b5b-3ca4-45b4-97c6-a2a0de70d469&#x60;. Legacy players can have old IDs in the form of &#x60;8JoV9XEdpo&#x60;. The ID can never be changed. |  [optional] |
|**isRepresenting** | **Boolean** | Whether the user is representing the group. This makes the group show up above the name tag in-game. |  [optional] |
|**user** | [**GroupMemberLimitedUser**](GroupMemberLimitedUser.md) |  |  [optional] |
|**roleIds** | **List&lt;String&gt;** |  |  [optional] |
|**mRoleIds** | **List&lt;String&gt;** |  |  [optional] |
|**joinedAt** | **OffsetDateTime** |  |  [optional] |
|**membershipStatus** | **GroupMemberStatus** |  |  [optional] |
|**visibility** | **String** |  |  [optional] |
|**isSubscribedToAnnouncements** | **Boolean** |  |  [optional] |
|**createdAt** | **OffsetDateTime** | Only visible via the /groups/:groupId/members endpoint, **not** when fetching a specific user. |  [optional] |
|**bannedAt** | **OffsetDateTime** | Only visible via the /groups/:groupId/members endpoint, **not** when fetching a specific user. |  [optional] |
|**managerNotes** | **String** | Only visible via the /groups/:groupId/members endpoint, **not** when fetching a specific user. |  [optional] |
|**lastPostReadAt** | **OffsetDateTime** |  |  [optional] |
|**hasJoinedFromPurchase** | **Boolean** |  |  [optional] |



