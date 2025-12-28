

# CalendarEventDiscovery


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**nextCursor** | **String** | Base64-encoded JSON:   type: object   properties:     dataSource:       type: string       enum:         - featured         - personalized     dataIndex:       type: integer       format: int32     phase:       type: string       enum:         - all         - live         - upcoming       description: see CalendarEventDiscoveryScope     asOf:       type: integer       format: int64       description: milliseconds since Unix epoch     paramHash:       type: string       format: string       description: Base64-encoded 256-bit hash of the original query parameters |  |
|**results** | [**List&lt;CalendarEvent&gt;**](CalendarEvent.md) |  |  |



