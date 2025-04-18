

# ServiceStatus

Status information for a service request

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**createdAt** | **OffsetDateTime** |  |  |
|**id** | **String** | The id of this service, NOT the id of the thing this service was requested for. |  |
|**progress** | **List&lt;Object&gt;** |  |  |
|**requesterUserId** | **String** | A users unique ID, usually in the form of &#x60;usr_c1644b5b-3ca4-45b4-97c6-a2a0de70d469&#x60;. Legacy players can have old IDs in the form of &#x60;8JoV9XEdpo&#x60;. The ID can never be changed. |  |
|**state** | **String** |  |  |
|**subjectId** | **String** | The id of the thing this service was requested for. |  |
|**subjectType** | **String** | The kind of the thing this service was requested for. |  |
|**type** | **String** | The kind of service that was requested. |  |
|**updatedAt** | **OffsetDateTime** |  |  |



