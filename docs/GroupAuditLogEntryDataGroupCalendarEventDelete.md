

# GroupAuditLogEntryDataGroupCalendarEventDelete


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accessType** | **CalendarEventAccess** |  |  |
|**description** | **String** | The description of the calendar event. |  |
|**imageId** | **String** | The image file ID for the event. |  |
|**title** | **String** | The title of the calendar event. |  |
|**type** | **String** | The type of calendar entry. |  |
|**category** | **String** | The category of the event. |  |
|**closeInstanceAfterEndMinutes** | **Integer** | Minutes after the event ends to close the instance. |  |
|**createdAt** | **OffsetDateTime** | The creation timestamp. |  |
|**deletedAt** | **OffsetDateTime** | The deletion timestamp. |  |
|**durationInMs** | **Integer** | The duration of the event in milliseconds. |  |
|**endsAt** | **OffsetDateTime** | The end timestamp. |  |
|**featured** | **Boolean** | Whether the event is featured. |  |
|**guestEarlyJoinMinutes** | **Integer** | Minutes before the start that guests can join. |  |
|**hostEarlyJoinMinutes** | **Integer** | Minutes before the start that hosts can join. |  |
|**interestedUserCount** | **Integer** | The number of interested users. |  |
|**isDraft** | **Boolean** | Whether the event is a draft. |  |
|**languages** | **List&lt;String&gt;** | The languages for the event. |  |
|**occurrenceKind** | **CalendarEventOccurrenceKind** |  |  |
|**occurrenceModified** | **String** |  |  |
|**ownerId** | **String** | The ID of the group that owns the event. |  |
|**platforms** | **List&lt;String&gt;** | The supported platforms. |  |
|**recurrence** | [**CalendarEventRecurrence**](CalendarEventRecurrence.md) | The recurrence rule. |  |
|**roleIds** | **List&lt;String&gt;** | Group roles that may join this event. |  |
|**seriesId** | **String** | The ID of the recurring series the event belongs to. |  |
|**shortCode** | **String** | The short code. |  |
|**startsAt** | **OffsetDateTime** | The start timestamp. |  |
|**tags** | **List&lt;String&gt;** | The event tags. |  |
|**updatedAt** | **OffsetDateTime** | The last update timestamp. |  |
|**usesInstanceOverflow** | **Boolean** | Whether the event uses instance overflow. |  |



