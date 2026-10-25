

# DeviceCode

A code that logs this device in once someone approves it at `verificationUrl`.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**deviceCode** | **String** | Identifies this login attempt to &#x60;checkDeviceCode&#x60;. |  |
|**expiresIn** | **Integer** | Seconds until the code expires. |  |
|**interval** | **Integer** | Seconds to wait between calls to &#x60;checkDeviceCode&#x60;. |  |
|**userCode** | **String** | The code a person enters at &#x60;verificationUrl&#x60; to approve the login. |  |
|**verificationUrl** | **URI** |  |  |
|**verificationUrlComplete** | **URI** | &#x60;verificationUrl&#x60; with the code already filled in. |  |



