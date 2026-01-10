

# GroupMember

May be null when attempting to retrieve group membership for a user who is not part of the group

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**acceptedByDisplayName** | **String** | Only missing when explicitly fetching own user. |  [optional] |
|**acceptedById** | **String** | Only missing when explicitly fetching own user. |  [optional] |
|**bannedAt** | **OffsetDateTime** | Only missing when explicitly fetching own user. |  [optional] |
|**createdAt** | **OffsetDateTime** | Only missing when explicitly fetching own user. |  [optional] |
|**groupId** | **String** |  |  |
|**hasJoinedFromPurchase** | **Boolean** | Missing when explicitly fetching own user, or when group isn&#39;t linked to a purchase. |  [optional] |
|**id** | **String** |  |  |
|**isRepresenting** | **Boolean** | Whether the user is representing the group. This makes the group show up above the name tag in-game. |  |
|**isSubscribedToAnnouncements** | **Boolean** |  |  |
|**isSubscribedToEventAnnouncements** | **Boolean** | Only missing when explicitly fetching own user. |  [optional] |
|**joinedAt** | **OffsetDateTime** |  |  |
|**lastPostReadAt** | **OffsetDateTime** |  |  |
|**mRoleIds** | **List&lt;String&gt;** |  |  |
|**managerNotes** | **String** | Only missing when explicitly fetching own user. |  [optional] |
|**membershipStatus** | **GroupMemberStatus** |  |  |
|**roleIds** | **List&lt;String&gt;** |  |  |
|**user** | [**GroupMemberLimitedUser**](GroupMemberLimitedUser.md) |  |  [optional] |
|**userId** | **String** | A users unique ID, usually in the form of &#x60;usr_c1644b5b-3ca4-45b4-97c6-a2a0de70d469&#x60;. Legacy players can have old IDs in the form of &#x60;8JoV9XEdpo&#x60;. The ID can never be changed. |  |
|**visibility** | **String** |  |  |



