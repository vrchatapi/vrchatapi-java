

# CalendarEventRecurrence

Details about how a recurring event will be scheduled. If the event is to be scheduled indefinitely, this will lack an \"end\" property.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**daysOfWeek** | **List&lt;CalendarDayOfWeek&gt;** | Which days of the week the event will be scheduled, only valid/present for \&quot;weekly\&quot; recurring events |  [optional] |
|**end** | [**CalendarEventRecurrenceEnd**](CalendarEventRecurrenceEnd.md) |  |  [optional] |
|**frequency** | **CalendarEventFrequency** |  |  |
|**interval** | **Integer** | How often the event will be scheduled, in units of \&quot;frequency\&quot; |  |
|**timezone** | **String** | The timezone the event will be scheduled in, in Area/Location format |  |



