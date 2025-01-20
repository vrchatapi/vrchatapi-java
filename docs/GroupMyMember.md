

# GroupMyMember


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** |  |  [optional] |
|**groupId** | **String** |  |  [optional] |
|**userId** | **String** | A users unique ID, usually in the form of &#x60;usr_c1644b5b-3ca4-45b4-97c6-a2a0de70d469&#x60;. Legacy players can have old IDs in the form of &#x60;8JoV9XEdpo&#x60;. The ID can never be changed. |  [optional] |
|**roleIds** | **List&lt;String&gt;** |  |  [optional] |
|**acceptedByDisplayName** | **String** |  |  [optional] |
|**acceptedById** | **String** |  |  [optional] |
|**createdAt** | **OffsetDateTime** |  |  [optional] |
|**managerNotes** | **String** |  |  [optional] |
|**membershipStatus** | **String** |  |  [optional] |
|**isSubscribedToAnnouncements** | **Boolean** |  |  [optional] |
|**visibility** | **String** |  |  [optional] |
|**isRepresenting** | **Boolean** |  |  [optional] |
|**joinedAt** | **OffsetDateTime** |  |  [optional] |
|**bannedAt** | **String** |  |  [optional] |
|**has2FA** | **Boolean** |  |  [optional] |
|**hasJoinedFromPurchase** | **Boolean** |  |  [optional] |
|**lastPostReadAt** | **OffsetDateTime** |  |  [optional] |
|**mRoleIds** | **List&lt;String&gt;** |  |  [optional] |
|**permissions** | [**List&lt;PermissionsEnum&gt;**](#List&lt;PermissionsEnum&gt;) |  |  [optional] |



## Enum: List&lt;PermissionsEnum&gt;

| Name | Value |
|---- | -----|
| group_all | &quot;\\*&quot; |
| group_announcement_manage | &quot;group-announcement-manage&quot; |
| group_audit_view | &quot;group-audit-view&quot; |
| group_bans_manage | &quot;group-bans-manage&quot; |
| group_data_manage | &quot;group-data-manage&quot; |
| group_default_role_manage | &quot;group-default-role-manage&quot; |
| group_galleries_manage | &quot;group-galleries-manage&quot; |
| group_instance_age_gated_create | &quot;group-instance-age-gated-create&quot; |
| group_instance_join | &quot;group-instance-join&quot; |
| group_instance_manage | &quot;group-instance-manage&quot; |
| group_instance_moderate | &quot;group-instance-moderate&quot; |
| group_instance_open_create | &quot;group-instance-open-create&quot; |
| group_instance_plus_create | &quot;group-instance-plus-create&quot; |
| group_instance_plus_portal | &quot;group-instance-plus-portal&quot; |
| group_instance_plus_portal_unlocked | &quot;group-instance-plus-portal-unlocked&quot; |
| group_instance_public_create | &quot;group-instance-public-create&quot; |
| group_instance_queue_priority | &quot;group-instance-queue-priority&quot; |
| group_instance_restricted_create | &quot;group-instance-restricted-create&quot; |
| group_invites_manage | &quot;group-invites-manage&quot; |
| group_members_manage | &quot;group-members-manage&quot; |
| group_members_remove | &quot;group-members-remove&quot; |
| group_members_viewall | &quot;group-members-viewall&quot; |
| group_roles_assign | &quot;group-roles-assign&quot; |
| group_roles_manage | &quot;group-roles-manage&quot; |



