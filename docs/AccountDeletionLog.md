

# AccountDeletionLog


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**dateTime** | **OffsetDateTime** | Date and time of the deletion request. |  [optional] |
|**deletionScheduled** | **OffsetDateTime** | When the deletion is scheduled to happen, standard is 14 days after the request. |  [optional] |
|**message** | **String** | Typically \&quot;Deletion requested\&quot; or \&quot;Deletion canceled\&quot;. Other messages like \&quot;Deletion completed\&quot; may exist, but are these are not possible to see as a regular user. |  [optional] |



