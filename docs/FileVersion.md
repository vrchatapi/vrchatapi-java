

# FileVersion


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**version** | **BigDecimal** | Incremental version counter, can only be increased. | 
**status** | **FileStatus** |  | 
**createdAt** | **OffsetDateTime** |  |  [readonly]
**file** | [**FileData**](FileData.md) |  |  [optional]
**delta** | [**FileData**](FileData.md) |  |  [optional]
**signature** | [**FileData**](FileData.md) |  |  [optional]
**deleted** | **Boolean** | Usually only present if &#x60;true&#x60; |  [optional]



