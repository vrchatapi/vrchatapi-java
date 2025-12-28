

# ModerationReport


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**category** | **String** | Valid values are the keys of the object &#x60;$.reportOptions[type]&#x60; from &#x60;GET /config&#x60;. Descriptions of these are found at &#x60;$.reportCategories[type]&#x60;. |  |
|**contentId** | **String** |  |  |
|**contentName** | **String** |  |  |
|**contentThumbnailImageUrl** | **String** |  |  |
|**description** | **String** | The subjective reason for the report |  |
|**evidenceRequired** | **Boolean** |  |  |
|**id** | **String** |  |  |
|**reason** | **String** | Valid values are the strings in the array &#x60;$.reportOptions[type][category]&#x60; from &#x60;GET /config&#x60;. Descriptions of these are found at &#x60;$.reportReasons[type]&#x60;. |  |
|**supportRequired** | **Boolean** |  |  |
|**type** | **String** | Valid values are the keys of the object &#x60;$.reportOptions&#x60; from &#x60;GET /config&#x60;. |  |



