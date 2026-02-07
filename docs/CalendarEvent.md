

# CalendarEvent

An event scheduled on a group's calendar

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accessType** | **CalendarEventAccess** |  |  |
|**category** | **CalendarEventCategory** |  |  |
|**closeInstanceAfterEndMinutes** | **Integer** |  |  [optional] |
|**createdAt** | **OffsetDateTime** |  |  [optional] |
|**deletedAt** | **OffsetDateTime** |  |  [optional] |
|**description** | **String** |  |  |
|**durationInMs** | **Long** |  |  [optional] |
|**endsAt** | **OffsetDateTime** |  |  |
|**featured** | **Boolean** |  |  [optional] |
|**guestEarlyJoinMinutes** | **Integer** |  |  [optional] |
|**hostEarlyJoinMinutes** | **Integer** |  |  [optional] |
|**id** | **String** |  |  |
|**imageId** | **String** |  |  [optional] |
|**imageUrl** | **String** |  |  [optional] |
|**interestedUserCount** | **Integer** |  |  [optional] |
|**isDraft** | **Boolean** |  |  [optional] |
|**languages** | **List&lt;String&gt;** | Languages that might be spoken at this event |  [optional] |
|**occurrenceKind** | **String** | So far if it exists, always the string \&quot;single\&quot; |  [optional] |
|**ownerId** | **String** |  |  [optional] |
|**platforms** | **List&lt;CalendarEventPlatform&gt;** |  |  [optional] |
|**recurrence** | **String** | So far unused, always \&quot;null\&quot; |  [optional] |
|**roleIds** | **List&lt;String&gt;** | Group roles that may join this event |  [optional] |
|**seriesId** | **String** | So far unused, always \&quot;null\&quot; |  [optional] |
|**startsAt** | **OffsetDateTime** |  |  |
|**tags** | **List&lt;String&gt;** | Custom tags for this event |  [optional] |
|**title** | **String** |  |  |
|**type** | **String** |  |  [optional] |
|**updatedAt** | **OffsetDateTime** |  |  [optional] |
|**userInterest** | [**CalendarEventUserInterest**](CalendarEventUserInterest.md) |  |  [optional] |
|**usesInstanceOverflow** | **Boolean** |  |  [optional] |



