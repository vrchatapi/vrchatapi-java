

# SubmitModerationReportRequest

Pseudocode steps to build a request with a valid combination: request = {} config = json.parse(GET /config) valid_types = config.reportOptions.keys request.type = select_one(valid_types, (id) => { text: id, tooltip: \"\" }) valid_categories = config.reportOptions[request.type].keys request.category = select_one(valid_categories, (id) => config.reportCategories[id]) valid_reasons = config.reportOptions[request.type][request.category] request.reason = select_one(valid_reasons, (id) => config.reportReasons[id]) request.contentId = relevant_id_of_type(request.type) request.details = relevant_details_based_on_type(request.type) request.description = input_string()

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**category** | **String** | Valid values are the keys of the object &#x60;$.reportOptions[type]&#x60; from &#x60;GET /config&#x60;. Descriptions of these are found at &#x60;$.reportCategories[type]&#x60;. |  |
|**contentId** | **String** | The id of the user, group, world, avatar, inventory item, print, etc. being reported. |  |
|**description** | **String** | The subjective reason for the report |  [optional] |
|**details** | [**SubmitModerationReportRequestDetails**](SubmitModerationReportRequestDetails.md) |  |  [optional] |
|**reason** | **String** | Valid values are the strings in the array &#x60;$.reportOptions[type][category]&#x60; from &#x60;GET /config&#x60;. Descriptions of these are found at &#x60;$.reportReasons[type]&#x60;. |  |
|**type** | **String** | Valid values are the keys of the object &#x60;$.reportOptions&#x60; from &#x60;GET /config&#x60;. |  |



