

# SubmitModerationReportRequestDetails

Relevant details specific to the type of the report. `fileId` is for the image file attached to an inventory item, such as an emoji. `holderId` is for the user who owns an inventory item, such as a emoji.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**fileId** | **String** |  |  [optional] |
|**holderId** | **String** | A users unique ID, usually in the form of &#x60;usr_c1644b5b-3ca4-45b4-97c6-a2a0de70d469&#x60;. Legacy players can have old IDs in the form of &#x60;8JoV9XEdpo&#x60;. The ID can never be changed. |  [optional] |
|**imageType** | **String** | Relevant detail for reports about image content, such as emoji. |  [optional] |
|**instanceAgeGated** | **Boolean** | Relevant detail for reports taking place from within an instance. |  [optional] |
|**instanceType** | **String** | Relevant detail for reports taking place from within an instance. |  [optional] |
|**suggestedWarnings** | **List&lt;ContentFilter&gt;** | Relevant detail for reports about content that might not be tagged properly. |  [optional] |
|**userInSameInstance** | **Boolean** | Relevant detail for reports involving another user in the same instance world. |  [optional] |



