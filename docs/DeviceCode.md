

# DeviceCode

A code that logs the device that created it in, once a logged-in user approves it with `approveDeviceAuth`.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**deviceCode** | **String** | Identifies this login attempt to &#x60;checkDeviceCode&#x60;. |  |
|**expiresIn** | **Integer** |  |  |
|**interval** | **Integer** |  |  |
|**userCode** | **String** | Identifies this login attempt to &#x60;getDeviceAuthInfo&#x60; and &#x60;approveDeviceAuth&#x60;. |  |
|**verificationUrl** | **URI** |  |  |
|**verificationUrlComplete** | **URI** | &#x60;verificationUrl&#x60; with the code already filled in. |  |



