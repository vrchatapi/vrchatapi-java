

# BareError

An error body carrying only a message string. Unlike `Error`, there is no nested object and no `status_code`, so a consumer that assumes the usual shape will read `undefined` from it.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**error** | **String** |  |  |



