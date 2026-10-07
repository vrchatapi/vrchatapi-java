

# GroupAuditLogEntryData


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**authorId** | **String** | A users unique ID, usually in the form of &#x60;usr_c1644b5b-3ca4-45b4-97c6-a2a0de70d469&#x60;. Legacy players can have old IDs in the form of &#x60;8JoV9XEdpo&#x60;. The ID can never be changed. |  [optional] |
|**imageId** | **String** |  |  [optional] |
|**sendNotification** | **Boolean** |  |  [optional] |
|**text** | **Object** |  |  [optional] |
|**title** | **Object** |  |  [optional] |
|**accessType** | **CalendarEventAccess** |  |  [optional] |
|**description** | **Object** |  |  [optional] |
|**type** | **String** | The type of calendar entry. |  [optional] |
|**category** | **String** | The category of the event. |  [optional] |
|**closeInstanceAfterEndMinutes** | **Integer** | Minutes after the event ends to close the instance. |  [optional] |
|**createdAt** | **OffsetDateTime** |  |  [optional] |
|**deletedAt** | **OffsetDateTime** | The deletion timestamp. |  [optional] |
|**durationInMs** | **Integer** | The duration of the event in milliseconds. |  [optional] |
|**endsAt** | **OffsetDateTime** | The end timestamp. |  [optional] |
|**featured** | **Boolean** | Whether the event is featured. |  [optional] |
|**guestEarlyJoinMinutes** | **Integer** | Minutes before the start that guests can join. |  [optional] |
|**hostEarlyJoinMinutes** | **Integer** | Minutes before the start that hosts can join. |  [optional] |
|**interestedUserCount** | **Integer** | The number of interested users. |  [optional] |
|**isDraft** | **Boolean** | Whether the event is a draft. |  [optional] |
|**languages** | **Object** |  |  [optional] |
|**occurrenceKind** | **CalendarEventOccurrenceKind** |  |  [optional] |
|**occurrenceModified** | **String** |  |  [optional] |
|**ownerId** | **String** |  |  [optional] |
|**platforms** | **List&lt;String&gt;** | The supported platforms. |  [optional] |
|**recurrence** | [**CalendarEventRecurrence**](CalendarEventRecurrence.md) |  |  [optional] |
|**roleIds** | **List&lt;String&gt;** |  |  [optional] |
|**seriesId** | **String** | The ID of the recurring series the event belongs to. |  [optional] |
|**shortCode** | **Object** |  |  [optional] |
|**startsAt** | **OffsetDateTime** | The start timestamp. |  [optional] |
|**tags** | **Object** |  |  [optional] |
|**updatedAt** | **OffsetDateTime** |  |  [optional] |
|**usesInstanceOverflow** | **Boolean** | Whether the event uses instance overflow. |  [optional] |
|**membersOnly** | **Object** |  |  [optional] |
|**name** | **Object** |  |  [optional] |
|**roleIdsToAutoApprove** | **List&lt;String&gt;** | The role IDs whose submissions are approved automatically. |  [optional] |
|**roleIdsToManage** | **List&lt;String&gt;** | The role IDs that can manage the gallery. |  [optional] |
|**roleIdsToSubmit** | **List&lt;String&gt;** | The role IDs that can submit to the gallery. |  [optional] |
|**roleIdsToView** | **List&lt;String&gt;** | The role IDs that can view the gallery. |  [optional] |
|**message** | **String** | The announcement message. |  [optional] |
|**groupAccessType** | **GroupAccessType** |  |  [optional] |
|**calendarEntryId** | **String** |  |  [optional] |
|**location** | **String** | Represents a unique location, consisting of a world identifier and an instance identifier, or \&quot;offline\&quot; if the user is not on your friends list. |  [optional] |
|**roleId** | **String** |  |  [optional] |
|**roleName** | **String** | The name of the role that was assigned or unassigned. |  [optional] |
|**managerNotes** | [**GroupAuditLogEntryStringChange**](GroupAuditLogEntryStringChange.md) |  |  [optional] |
|**visibility** | **GroupPostVisibility** |  |  [optional] |
|**editorId** | **Object** |  |  [optional] |
|**imageUrl** | **URI** | The URL of the post image. |  [optional] |
|**isAddedOnJoin** | **Object** |  |  [optional] |
|**isSelfAssignable** | **Object** |  |  [optional] |
|**order** | **Object** |  |  [optional] |
|**permissions** | **Object** |  |  [optional] |
|**requiresPurchase** | **Boolean** | Whether the role requires a purchase. |  [optional] |
|**requiresTwoFactor** | **Boolean** | Whether the role requires two-factor authentication. |  [optional] |
|**groupId** | **String** |  |  [optional] |
|**lastUpdatedByUserId** | **String** | A users unique ID, usually in the form of &#x60;usr_c1644b5b-3ca4-45b4-97c6-a2a0de70d469&#x60;. Legacy players can have old IDs in the form of &#x60;8JoV9XEdpo&#x60;. The ID can never be changed. |  [optional] |
|**defaultRole** | **Boolean** | Whether the role is the group&#39;s default role. |  [optional] |
|**isManagementRole** | **Boolean** | Whether the role is a management role. |  [optional] |
|**allowGroupJoinPrompt** | [**GroupAuditLogEntryBooleanChange**](GroupAuditLogEntryBooleanChange.md) |  |  [optional] |
|**bannerId** | [**GroupAuditLogEntryFileIDChange**](GroupAuditLogEntryFileIDChange.md) |  |  [optional] |
|**iconId** | [**GroupAuditLogEntryFileIDChange**](GroupAuditLogEntryFileIDChange.md) |  |  [optional] |
|**joinState** | [**GroupAuditLogEntryJoinStateChange**](GroupAuditLogEntryJoinStateChange.md) |  |  [optional] |
|**links** | [**GroupAuditLogEntryStringListChange**](GroupAuditLogEntryStringListChange.md) |  |  [optional] |
|**nameplateId** | [**GroupAuditLogEntryFileIDChange**](GroupAuditLogEntryFileIDChange.md) |  |  [optional] |
|**rules** | [**GroupAuditLogEntryStringChange**](GroupAuditLogEntryStringChange.md) |  |  [optional] |



