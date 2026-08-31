

# RouteNotImplemented

The body VRChat returns for a route it does not serve. The shape differs from every other error in this description: `error` is a string here, not an `Error` object with `message` and `status_code` inside it.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**error** | [**ErrorEnum**](#ErrorEnum) |  |  |
|**statusCode** | [**StatusCodeEnum**](#StatusCodeEnum) |  |  |



## Enum: ErrorEnum

| Name | Value |
|---- | -----|
| THE_ENDPOINT_YOU_RE_LOOKING_FOR_IS_NOT_IMPLEMENTED_BY_OUR_SYSTEM_ | &quot;The endpoint you&#39;re looking for is not implemented by our system.&quot; |



## Enum: StatusCodeEnum

| Name | Value |
|---- | -----|
| NUMBER_404 | 404 |



