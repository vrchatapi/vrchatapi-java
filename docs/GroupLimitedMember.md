

# GroupLimitedMember

May be null when attempting to retrieve group membership for a user who is not part of the group

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**bannedAt** | **OffsetDateTime** | Only visible via the /groups/:groupId/members endpoint, **not** when fetching a specific user. |  [optional] |
|**createdAt** | **OffsetDateTime** | Only visible via the /groups/:groupId/members endpoint, **not** when fetching a specific user. |  [optional] |
|**groupId** | **String** |  |  [optional] |
|**hasJoinedFromPurchase** | **Boolean** |  |  [optional] |
|**id** | **String** |  |  [optional] |
|**isRepresenting** | **Boolean** | Whether the user is representing the group. This makes the group show up above the name tag in-game. |  [optional] |
|**isSubscribedToAnnouncements** | **Boolean** |  |  [optional] |
|**isSubscribedToEventAnnouncements** | **Boolean** |  |  [optional] |
|**joinedAt** | **OffsetDateTime** |  |  [optional] |
|**lastPostReadAt** | **OffsetDateTime** |  |  [optional] |
|**mRoleIds** | **List&lt;String&gt;** |  |  [optional] |
|**managerNotes** | **String** | Only visible via the /groups/:groupId/members endpoint, **not** when fetching a specific user. |  [optional] |
|**membershipStatus** | **GroupMemberStatus** |  |  [optional] |
|**roleIds** | **List&lt;String&gt;** |  |  [optional] |
|**userId** | **String** | A users unique ID, usually in the form of &#x60;usr_c1644b5b-3ca4-45b4-97c6-a2a0de70d469&#x60;. Legacy players can have old IDs in the form of &#x60;8JoV9XEdpo&#x60;. The ID can never be changed. |  [optional] |
|**visibility** | **String** |  |  [optional] |



