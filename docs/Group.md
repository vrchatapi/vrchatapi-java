

# Group


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** |  |  [optional] |
|**name** | **String** |  |  [optional] |
|**shortCode** | **String** |  |  [optional] |
|**discriminator** | **String** |  |  [optional] |
|**description** | **String** |  |  [optional] |
|**iconUrl** | **String** |  |  [optional] |
|**bannerUrl** | **String** |  |  [optional] |
|**privacy** | **GroupPrivacy** |  |  [optional] |
|**ownerId** | **String** | A users unique ID, usually in the form of &#x60;usr_c1644b5b-3ca4-45b4-97c6-a2a0de70d469&#x60;. Legacy players can have old IDs in the form of &#x60;8JoV9XEdpo&#x60;. The ID can never be changed. |  [optional] |
|**rules** | **String** |  |  [optional] |
|**links** | **List&lt;String&gt;** |  |  [optional] |
|**languages** | **List&lt;String&gt;** |  |  [optional] |
|**iconId** | **String** |  |  [optional] |
|**bannerId** | **String** |  |  [optional] |
|**memberCount** | **Integer** |  |  [optional] |
|**memberCountSyncedAt** | **OffsetDateTime** |  |  [optional] |
|**isVerified** | **Boolean** |  |  [optional] |
|**joinState** | **GroupJoinState** |  |  [optional] |
|**tags** | **List&lt;String&gt;** |   |  [optional] |
|**galleries** | [**List&lt;GroupGallery&gt;**](GroupGallery.md) |   |  [optional] |
|**createdAt** | **OffsetDateTime** |  |  [optional] |
|**onlineMemberCount** | **Integer** |  |  [optional] |
|**membershipStatus** | **GroupMemberStatus** |  |  [optional] |
|**myMember** | [**GroupMyMember**](GroupMyMember.md) |  |  [optional] |
|**roles** | [**List&lt;GroupRole&gt;**](GroupRole.md) | Only returned if ?includeRoles&#x3D;true is specified. |  [optional] |



