# CalendarApi

All URIs are relative to *https://api.vrchat.cloud/api/1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createGroupCalendarEvent**](CalendarApi.md#createGroupCalendarEvent) | **POST** /calendar/{groupId}/event | Create a calendar event |
| [**deleteGroupCalendarEvent**](CalendarApi.md#deleteGroupCalendarEvent) | **DELETE** /calendar/{groupId}/{calendarId} | Delete a calendar event |
| [**discoverCalendarEvents**](CalendarApi.md#discoverCalendarEvents) | **GET** /calendar/discover | Discover calendar events |
| [**followGroupCalendarEvent**](CalendarApi.md#followGroupCalendarEvent) | **POST** /calendar/{groupId}/{calendarId}/follow | Follow a calendar event |
| [**getCalendarEvents**](CalendarApi.md#getCalendarEvents) | **GET** /calendar | List calendar events |
| [**getFeaturedCalendarEvents**](CalendarApi.md#getFeaturedCalendarEvents) | **GET** /calendar/featured | List featured calendar events |
| [**getFollowedCalendarEvents**](CalendarApi.md#getFollowedCalendarEvents) | **GET** /calendar/following | List followed calendar events |
| [**getGroupCalendarEvent**](CalendarApi.md#getGroupCalendarEvent) | **GET** /calendar/{groupId}/{calendarId} | Get a calendar event |
| [**getGroupCalendarEventICS**](CalendarApi.md#getGroupCalendarEventICS) | **GET** /calendar/{groupId}/{calendarId}.ics | Download calendar event as ICS |
| [**getGroupCalendarEvents**](CalendarApi.md#getGroupCalendarEvents) | **GET** /calendar/{groupId} | List a group&#39;s calendar events |
| [**getGroupNextCalendarEvent**](CalendarApi.md#getGroupNextCalendarEvent) | **GET** /calendar/{groupId}/next | Get next calendar event |
| [**searchCalendarEvents**](CalendarApi.md#searchCalendarEvents) | **GET** /calendar/search | Search for calendar events |
| [**updateGroupCalendarEvent**](CalendarApi.md#updateGroupCalendarEvent) | **PUT** /calendar/{groupId}/{calendarId}/event | Update a calendar event |


<a name="createGroupCalendarEvent"></a>
# **createGroupCalendarEvent**
> CalendarEvent createGroupCalendarEvent(groupId, createCalendarEventRequest)

Create a calendar event

Creates an event for a group on the calendar

### Example
```java
// Import classes:
import io.github.vrchatapi.ApiClient;
import io.github.vrchatapi.ApiException;
import io.github.vrchatapi.Configuration;
import io.github.vrchatapi.auth.*;
import io.github.vrchatapi.models.*;
import io.github.vrchatapi.api.CalendarApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.vrchat.cloud/api/1");
    
    // Configure API key authorization: authCookie
    ApiKeyAuth authCookie = (ApiKeyAuth) defaultClient.getAuthentication("authCookie");
    authCookie.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //authCookie.setApiKeyPrefix("Token");

    CalendarApi apiInstance = new CalendarApi(defaultClient);
    String groupId = "grp_00000000-0000-0000-0000-000000000000"; // String | Must be a valid group ID.
    CreateCalendarEventRequest createCalendarEventRequest = new CreateCalendarEventRequest(); // CreateCalendarEventRequest | 
    try {
      CalendarEvent result = apiInstance.createGroupCalendarEvent(groupId, createCalendarEventRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CalendarApi#createGroupCalendarEvent");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **groupId** | **String**| Must be a valid group ID. | |
| **createCalendarEventRequest** | [**CreateCalendarEventRequest**](CreateCalendarEventRequest.md)|  | |

### Return type

[**CalendarEvent**](CalendarEvent.md)

### Authorization

[authCookie](../README.md#authCookie)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a single CalendarEvent object. |  -  |
| **400** | Error response due to an invalid or illegal calendar request. |  -  |
| **401** | Error response due to missing auth cookie. |  -  |
| **403** | Error response due to an invalid or illegal calendar request. |  -  |

<a name="deleteGroupCalendarEvent"></a>
# **deleteGroupCalendarEvent**
> Success deleteGroupCalendarEvent(groupId, calendarId)

Delete a calendar event

Delete a group calendar event

### Example
```java
// Import classes:
import io.github.vrchatapi.ApiClient;
import io.github.vrchatapi.ApiException;
import io.github.vrchatapi.Configuration;
import io.github.vrchatapi.auth.*;
import io.github.vrchatapi.models.*;
import io.github.vrchatapi.api.CalendarApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.vrchat.cloud/api/1");
    
    // Configure API key authorization: authCookie
    ApiKeyAuth authCookie = (ApiKeyAuth) defaultClient.getAuthentication("authCookie");
    authCookie.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //authCookie.setApiKeyPrefix("Token");

    CalendarApi apiInstance = new CalendarApi(defaultClient);
    String groupId = "grp_00000000-0000-0000-0000-000000000000"; // String | Must be a valid group ID.
    String calendarId = "cal_00000000-0000-0000-0000-000000000000"; // String | Must be a valid calendar ID.
    try {
      Success result = apiInstance.deleteGroupCalendarEvent(groupId, calendarId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CalendarApi#deleteGroupCalendarEvent");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **groupId** | **String**| Must be a valid group ID. | |
| **calendarId** | **String**| Must be a valid calendar ID. | |

### Return type

[**Success**](Success.md)

### Authorization

[authCookie](../README.md#authCookie)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response after deleting a calendar event. |  -  |
| **401** | Error response due to missing auth cookie. |  -  |
| **404** | Error response when trying to download ICS calendar of a non-existent calendar entry, get such a calendar entry, or get the next event for a group that lacks any future scheduled events. |  -  |

<a name="discoverCalendarEvents"></a>
# **discoverCalendarEvents**
> CalendarEventDiscovery discoverCalendarEvents(scope, categories, tags, featuredResults, nonFeaturedResults, personalizedResults, minimumInterestCount, minimumRemainingMinutes, upcomingOffsetMinutes, n, nextCursor)

Discover calendar events

Get a list of calendar events Initially, call without a &#x60;nextCursor&#x60; parameter For every successive call, use the &#x60;nextCursor&#x60; property returned in the previous call &amp; the &#x60;number&#x60; of entries desired for this call The &#x60;nextCursor&#x60; internally keeps track of the &#x60;offset&#x60; of the results, the initial request parameters, and accounts for discrepancies that might arise from time elapsed between calls

### Example
```java
// Import classes:
import io.github.vrchatapi.ApiClient;
import io.github.vrchatapi.ApiException;
import io.github.vrchatapi.Configuration;
import io.github.vrchatapi.auth.*;
import io.github.vrchatapi.models.*;
import io.github.vrchatapi.api.CalendarApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.vrchat.cloud/api/1");
    
    // Configure API key authorization: authCookie
    ApiKeyAuth authCookie = (ApiKeyAuth) defaultClient.getAuthentication("authCookie");
    authCookie.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //authCookie.setApiKeyPrefix("Token");

    CalendarApi apiInstance = new CalendarApi(defaultClient);
    CalendarEventDiscoveryScope scope = CalendarEventDiscoveryScope.fromValue("all"); // CalendarEventDiscoveryScope | Scope for calendar event discovery.
    String categories = "avatars,exploration,gaming,roleplaying,music,performance"; // String | Filter for calendar event discovery.
    String tags = "vrc_event_group_fair"; // String | Filter for calendar event discovery.
    CalendarEventDiscoveryInclusion featuredResults = CalendarEventDiscoveryInclusion.fromValue("exclude"); // CalendarEventDiscoveryInclusion | Filter for calendar event discovery.
    CalendarEventDiscoveryInclusion nonFeaturedResults = CalendarEventDiscoveryInclusion.fromValue("exclude"); // CalendarEventDiscoveryInclusion | Filter for calendar event discovery.
    CalendarEventDiscoveryInclusion personalizedResults = CalendarEventDiscoveryInclusion.fromValue("exclude"); // CalendarEventDiscoveryInclusion | Filter for calendar event discovery.
    Integer minimumInterestCount = 5; // Integer | Filter for calendar event discovery.
    Integer minimumRemainingMinutes = 10; // Integer | Filter for calendar event discovery.
    Integer upcomingOffsetMinutes = 10080; // Integer | Filter for calendar event discovery.
    Integer n = 60; // Integer | The number of objects to return.
    String nextCursor = "nextCursor_example"; // String | Cursor returned from previous calendar discovery queries (see nextCursor property of the schema CalendarEventDiscovery).
    try {
      CalendarEventDiscovery result = apiInstance.discoverCalendarEvents(scope, categories, tags, featuredResults, nonFeaturedResults, personalizedResults, minimumInterestCount, minimumRemainingMinutes, upcomingOffsetMinutes, n, nextCursor);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CalendarApi#discoverCalendarEvents");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **scope** | [**CalendarEventDiscoveryScope**](.md)| Scope for calendar event discovery. | [optional] [default to upcoming] [enum: all, live, upcoming] |
| **categories** | **String**| Filter for calendar event discovery. | [optional] |
| **tags** | **String**| Filter for calendar event discovery. | [optional] |
| **featuredResults** | [**CalendarEventDiscoveryInclusion**](.md)| Filter for calendar event discovery. | [optional] [default to include] [enum: exclude, include, skip] |
| **nonFeaturedResults** | [**CalendarEventDiscoveryInclusion**](.md)| Filter for calendar event discovery. | [optional] [default to include] [enum: exclude, include, skip] |
| **personalizedResults** | [**CalendarEventDiscoveryInclusion**](.md)| Filter for calendar event discovery. | [optional] [default to include] [enum: exclude, include, skip] |
| **minimumInterestCount** | **Integer**| Filter for calendar event discovery. | [optional] |
| **minimumRemainingMinutes** | **Integer**| Filter for calendar event discovery. | [optional] |
| **upcomingOffsetMinutes** | **Integer**| Filter for calendar event discovery. | [optional] |
| **n** | **Integer**| The number of objects to return. | [optional] [default to 60] |
| **nextCursor** | **String**| Cursor returned from previous calendar discovery queries (see nextCursor property of the schema CalendarEventDiscovery). | [optional] |

### Return type

[**CalendarEventDiscovery**](CalendarEventDiscovery.md)

### Authorization

[authCookie](../README.md#authCookie)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a CalendarEventDiscovery objects. |  -  |
| **401** | Error response due to missing auth cookie. |  -  |

<a name="followGroupCalendarEvent"></a>
# **followGroupCalendarEvent**
> CalendarEvent followGroupCalendarEvent(groupId, calendarId, followCalendarEventRequest)

Follow a calendar event

Follow or unfollow an event on a group&#39;s calendar

### Example
```java
// Import classes:
import io.github.vrchatapi.ApiClient;
import io.github.vrchatapi.ApiException;
import io.github.vrchatapi.Configuration;
import io.github.vrchatapi.auth.*;
import io.github.vrchatapi.models.*;
import io.github.vrchatapi.api.CalendarApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.vrchat.cloud/api/1");
    
    // Configure API key authorization: authCookie
    ApiKeyAuth authCookie = (ApiKeyAuth) defaultClient.getAuthentication("authCookie");
    authCookie.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //authCookie.setApiKeyPrefix("Token");

    CalendarApi apiInstance = new CalendarApi(defaultClient);
    String groupId = "grp_00000000-0000-0000-0000-000000000000"; // String | Must be a valid group ID.
    String calendarId = "cal_00000000-0000-0000-0000-000000000000"; // String | Must be a valid calendar ID.
    FollowCalendarEventRequest followCalendarEventRequest = new FollowCalendarEventRequest(); // FollowCalendarEventRequest | 
    try {
      CalendarEvent result = apiInstance.followGroupCalendarEvent(groupId, calendarId, followCalendarEventRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CalendarApi#followGroupCalendarEvent");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **groupId** | **String**| Must be a valid group ID. | |
| **calendarId** | **String**| Must be a valid calendar ID. | |
| **followCalendarEventRequest** | [**FollowCalendarEventRequest**](FollowCalendarEventRequest.md)|  | |

### Return type

[**CalendarEvent**](CalendarEvent.md)

### Authorization

[authCookie](../README.md#authCookie)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a single CalendarEvent object. |  -  |
| **401** | Error response due to missing auth cookie. |  -  |

<a name="getCalendarEvents"></a>
# **getCalendarEvents**
> PaginatedCalendarEventList getCalendarEvents(date, n, offset)

List calendar events

Get a list of a user&#39;s calendar events for the month in ?date

### Example
```java
// Import classes:
import io.github.vrchatapi.ApiClient;
import io.github.vrchatapi.ApiException;
import io.github.vrchatapi.Configuration;
import io.github.vrchatapi.auth.*;
import io.github.vrchatapi.models.*;
import io.github.vrchatapi.api.CalendarApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.vrchat.cloud/api/1");
    
    // Configure API key authorization: authCookie
    ApiKeyAuth authCookie = (ApiKeyAuth) defaultClient.getAuthentication("authCookie");
    authCookie.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //authCookie.setApiKeyPrefix("Token");

    CalendarApi apiInstance = new CalendarApi(defaultClient);
    OffsetDateTime date = OffsetDateTime.now(); // OffsetDateTime | The month to search in.
    Integer n = 60; // Integer | The number of objects to return.
    Integer offset = 56; // Integer | A zero-based offset from the default object sorting from where search results start.
    try {
      PaginatedCalendarEventList result = apiInstance.getCalendarEvents(date, n, offset);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CalendarApi#getCalendarEvents");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **date** | **OffsetDateTime**| The month to search in. | [optional] |
| **n** | **Integer**| The number of objects to return. | [optional] [default to 60] |
| **offset** | **Integer**| A zero-based offset from the default object sorting from where search results start. | [optional] |

### Return type

[**PaginatedCalendarEventList**](PaginatedCalendarEventList.md)

### Authorization

[authCookie](../README.md#authCookie)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a list of CalendarEvent objects. |  -  |
| **401** | Error response due to missing auth cookie. |  -  |

<a name="getFeaturedCalendarEvents"></a>
# **getFeaturedCalendarEvents**
> PaginatedCalendarEventList getFeaturedCalendarEvents(date, n, offset)

List featured calendar events

Get a list of a featured calendar events for the month in ?date

### Example
```java
// Import classes:
import io.github.vrchatapi.ApiClient;
import io.github.vrchatapi.ApiException;
import io.github.vrchatapi.Configuration;
import io.github.vrchatapi.auth.*;
import io.github.vrchatapi.models.*;
import io.github.vrchatapi.api.CalendarApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.vrchat.cloud/api/1");
    
    // Configure API key authorization: authCookie
    ApiKeyAuth authCookie = (ApiKeyAuth) defaultClient.getAuthentication("authCookie");
    authCookie.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //authCookie.setApiKeyPrefix("Token");

    CalendarApi apiInstance = new CalendarApi(defaultClient);
    OffsetDateTime date = OffsetDateTime.now(); // OffsetDateTime | The month to search in.
    Integer n = 60; // Integer | The number of objects to return.
    Integer offset = 56; // Integer | A zero-based offset from the default object sorting from where search results start.
    try {
      PaginatedCalendarEventList result = apiInstance.getFeaturedCalendarEvents(date, n, offset);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CalendarApi#getFeaturedCalendarEvents");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **date** | **OffsetDateTime**| The month to search in. | [optional] |
| **n** | **Integer**| The number of objects to return. | [optional] [default to 60] |
| **offset** | **Integer**| A zero-based offset from the default object sorting from where search results start. | [optional] |

### Return type

[**PaginatedCalendarEventList**](PaginatedCalendarEventList.md)

### Authorization

[authCookie](../README.md#authCookie)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a list of CalendarEvent objects. |  -  |
| **401** | Error response due to missing auth cookie. |  -  |

<a name="getFollowedCalendarEvents"></a>
# **getFollowedCalendarEvents**
> PaginatedCalendarEventList getFollowedCalendarEvents(date, n, offset)

List followed calendar events

Get a list of a followed calendar events for the month in ?date

### Example
```java
// Import classes:
import io.github.vrchatapi.ApiClient;
import io.github.vrchatapi.ApiException;
import io.github.vrchatapi.Configuration;
import io.github.vrchatapi.auth.*;
import io.github.vrchatapi.models.*;
import io.github.vrchatapi.api.CalendarApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.vrchat.cloud/api/1");
    
    // Configure API key authorization: authCookie
    ApiKeyAuth authCookie = (ApiKeyAuth) defaultClient.getAuthentication("authCookie");
    authCookie.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //authCookie.setApiKeyPrefix("Token");

    CalendarApi apiInstance = new CalendarApi(defaultClient);
    OffsetDateTime date = OffsetDateTime.now(); // OffsetDateTime | The month to search in.
    Integer n = 60; // Integer | The number of objects to return.
    Integer offset = 56; // Integer | A zero-based offset from the default object sorting from where search results start.
    try {
      PaginatedCalendarEventList result = apiInstance.getFollowedCalendarEvents(date, n, offset);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CalendarApi#getFollowedCalendarEvents");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **date** | **OffsetDateTime**| The month to search in. | [optional] |
| **n** | **Integer**| The number of objects to return. | [optional] [default to 60] |
| **offset** | **Integer**| A zero-based offset from the default object sorting from where search results start. | [optional] |

### Return type

[**PaginatedCalendarEventList**](PaginatedCalendarEventList.md)

### Authorization

[authCookie](../README.md#authCookie)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a list of CalendarEvent objects. |  -  |
| **401** | Error response due to missing auth cookie. |  -  |

<a name="getGroupCalendarEvent"></a>
# **getGroupCalendarEvent**
> CalendarEvent getGroupCalendarEvent(groupId, calendarId)

Get a calendar event

Get a group calendar event

### Example
```java
// Import classes:
import io.github.vrchatapi.ApiClient;
import io.github.vrchatapi.ApiException;
import io.github.vrchatapi.Configuration;
import io.github.vrchatapi.auth.*;
import io.github.vrchatapi.models.*;
import io.github.vrchatapi.api.CalendarApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.vrchat.cloud/api/1");
    
    // Configure API key authorization: authCookie
    ApiKeyAuth authCookie = (ApiKeyAuth) defaultClient.getAuthentication("authCookie");
    authCookie.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //authCookie.setApiKeyPrefix("Token");

    CalendarApi apiInstance = new CalendarApi(defaultClient);
    String groupId = "grp_00000000-0000-0000-0000-000000000000"; // String | Must be a valid group ID.
    String calendarId = "cal_00000000-0000-0000-0000-000000000000"; // String | Must be a valid calendar ID.
    try {
      CalendarEvent result = apiInstance.getGroupCalendarEvent(groupId, calendarId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CalendarApi#getGroupCalendarEvent");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **groupId** | **String**| Must be a valid group ID. | |
| **calendarId** | **String**| Must be a valid calendar ID. | |

### Return type

[**CalendarEvent**](CalendarEvent.md)

### Authorization

[authCookie](../README.md#authCookie)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a single CalendarEvent object. |  -  |
| **401** | Error response due to missing auth cookie. |  -  |

<a name="getGroupCalendarEventICS"></a>
# **getGroupCalendarEventICS**
> File getGroupCalendarEventICS(groupId, calendarId)

Download calendar event as ICS

Returns the specified calendar in iCalendar (ICS) format.

### Example
```java
// Import classes:
import io.github.vrchatapi.ApiClient;
import io.github.vrchatapi.ApiException;
import io.github.vrchatapi.Configuration;
import io.github.vrchatapi.models.*;
import io.github.vrchatapi.api.CalendarApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.vrchat.cloud/api/1");

    CalendarApi apiInstance = new CalendarApi(defaultClient);
    String groupId = "grp_00000000-0000-0000-0000-000000000000"; // String | Must be a valid group ID.
    String calendarId = "cal_00000000-0000-0000-0000-000000000000"; // String | Must be a valid calendar ID.
    try {
      File result = apiInstance.getGroupCalendarEventICS(groupId, calendarId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CalendarApi#getGroupCalendarEventICS");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **groupId** | **String**| Must be a valid group ID. | |
| **calendarId** | **String**| Must be a valid calendar ID. | |

### Return type

[**File**](File.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/calendar, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | iCalendar file download |  -  |
| **401** | Error response due to missing auth cookie. |  -  |
| **404** | Error response when trying to download ICS calendar of a non-existent calendar entry, get such a calendar entry, or get the next event for a group that lacks any future scheduled events. |  -  |

<a name="getGroupCalendarEvents"></a>
# **getGroupCalendarEvents**
> PaginatedCalendarEventList getGroupCalendarEvents(groupId, date, n, offset)

List a group&#39;s calendar events

Get a list of a group&#39;s calendar events

### Example
```java
// Import classes:
import io.github.vrchatapi.ApiClient;
import io.github.vrchatapi.ApiException;
import io.github.vrchatapi.Configuration;
import io.github.vrchatapi.auth.*;
import io.github.vrchatapi.models.*;
import io.github.vrchatapi.api.CalendarApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.vrchat.cloud/api/1");
    
    // Configure API key authorization: authCookie
    ApiKeyAuth authCookie = (ApiKeyAuth) defaultClient.getAuthentication("authCookie");
    authCookie.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //authCookie.setApiKeyPrefix("Token");

    CalendarApi apiInstance = new CalendarApi(defaultClient);
    String groupId = "grp_00000000-0000-0000-0000-000000000000"; // String | Must be a valid group ID.
    OffsetDateTime date = OffsetDateTime.now(); // OffsetDateTime | The month to search in.
    Integer n = 60; // Integer | The number of objects to return.
    Integer offset = 56; // Integer | A zero-based offset from the default object sorting from where search results start.
    try {
      PaginatedCalendarEventList result = apiInstance.getGroupCalendarEvents(groupId, date, n, offset);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CalendarApi#getGroupCalendarEvents");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **groupId** | **String**| Must be a valid group ID. | |
| **date** | **OffsetDateTime**| The month to search in. | [optional] |
| **n** | **Integer**| The number of objects to return. | [optional] [default to 60] |
| **offset** | **Integer**| A zero-based offset from the default object sorting from where search results start. | [optional] |

### Return type

[**PaginatedCalendarEventList**](PaginatedCalendarEventList.md)

### Authorization

[authCookie](../README.md#authCookie)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a list of CalendarEvent objects. |  -  |
| **401** | Error response due to missing auth cookie. |  -  |

<a name="getGroupNextCalendarEvent"></a>
# **getGroupNextCalendarEvent**
> CalendarEvent getGroupNextCalendarEvent(groupId)

Get next calendar event

Get the closest future calendar event scheduled for a group

### Example
```java
// Import classes:
import io.github.vrchatapi.ApiClient;
import io.github.vrchatapi.ApiException;
import io.github.vrchatapi.Configuration;
import io.github.vrchatapi.auth.*;
import io.github.vrchatapi.models.*;
import io.github.vrchatapi.api.CalendarApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.vrchat.cloud/api/1");
    
    // Configure API key authorization: authCookie
    ApiKeyAuth authCookie = (ApiKeyAuth) defaultClient.getAuthentication("authCookie");
    authCookie.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //authCookie.setApiKeyPrefix("Token");

    CalendarApi apiInstance = new CalendarApi(defaultClient);
    String groupId = "grp_00000000-0000-0000-0000-000000000000"; // String | Must be a valid group ID.
    try {
      CalendarEvent result = apiInstance.getGroupNextCalendarEvent(groupId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CalendarApi#getGroupNextCalendarEvent");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **groupId** | **String**| Must be a valid group ID. | |

### Return type

[**CalendarEvent**](CalendarEvent.md)

### Authorization

[authCookie](../README.md#authCookie)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a single CalendarEvent object. |  -  |
| **401** | Error response due to missing auth cookie. |  -  |
| **404** | Error response when trying to download ICS calendar of a non-existent calendar entry, get such a calendar entry, or get the next event for a group that lacks any future scheduled events. |  -  |

<a name="searchCalendarEvents"></a>
# **searchCalendarEvents**
> PaginatedCalendarEventList searchCalendarEvents(searchTerm, utcOffset, n, offset, isInternalVariant)

Search for calendar events

Get a list of calendar events by search terms

### Example
```java
// Import classes:
import io.github.vrchatapi.ApiClient;
import io.github.vrchatapi.ApiException;
import io.github.vrchatapi.Configuration;
import io.github.vrchatapi.auth.*;
import io.github.vrchatapi.models.*;
import io.github.vrchatapi.api.CalendarApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.vrchat.cloud/api/1");
    
    // Configure API key authorization: authCookie
    ApiKeyAuth authCookie = (ApiKeyAuth) defaultClient.getAuthentication("authCookie");
    authCookie.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //authCookie.setApiKeyPrefix("Token");

    CalendarApi apiInstance = new CalendarApi(defaultClient);
    String searchTerm = "game night"; // String | Search term for calendar events.
    Integer utcOffset = 56; // Integer | The offset from UTC in hours of the client or authenticated user.
    Integer n = 60; // Integer | The number of objects to return.
    Integer offset = 56; // Integer | A zero-based offset from the default object sorting from where search results start.
    Boolean isInternalVariant = false; // Boolean | Not quite sure what this actually does (exists on the website but doesn't seem to be used)
    try {
      PaginatedCalendarEventList result = apiInstance.searchCalendarEvents(searchTerm, utcOffset, n, offset, isInternalVariant);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CalendarApi#searchCalendarEvents");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **searchTerm** | **String**| Search term for calendar events. | |
| **utcOffset** | **Integer**| The offset from UTC in hours of the client or authenticated user. | [optional] |
| **n** | **Integer**| The number of objects to return. | [optional] [default to 60] |
| **offset** | **Integer**| A zero-based offset from the default object sorting from where search results start. | [optional] |
| **isInternalVariant** | **Boolean**| Not quite sure what this actually does (exists on the website but doesn&#39;t seem to be used) | [optional] |

### Return type

[**PaginatedCalendarEventList**](PaginatedCalendarEventList.md)

### Authorization

[authCookie](../README.md#authCookie)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a list of CalendarEvent objects. |  -  |
| **401** | Error response due to missing auth cookie. |  -  |

<a name="updateGroupCalendarEvent"></a>
# **updateGroupCalendarEvent**
> CalendarEvent updateGroupCalendarEvent(groupId, calendarId, updateCalendarEventRequest)

Update a calendar event

Updates an event for a group on the calendar

### Example
```java
// Import classes:
import io.github.vrchatapi.ApiClient;
import io.github.vrchatapi.ApiException;
import io.github.vrchatapi.Configuration;
import io.github.vrchatapi.auth.*;
import io.github.vrchatapi.models.*;
import io.github.vrchatapi.api.CalendarApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.vrchat.cloud/api/1");
    
    // Configure API key authorization: authCookie
    ApiKeyAuth authCookie = (ApiKeyAuth) defaultClient.getAuthentication("authCookie");
    authCookie.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //authCookie.setApiKeyPrefix("Token");

    CalendarApi apiInstance = new CalendarApi(defaultClient);
    String groupId = "grp_00000000-0000-0000-0000-000000000000"; // String | Must be a valid group ID.
    String calendarId = "cal_00000000-0000-0000-0000-000000000000"; // String | Must be a valid calendar ID.
    UpdateCalendarEventRequest updateCalendarEventRequest = new UpdateCalendarEventRequest(); // UpdateCalendarEventRequest | 
    try {
      CalendarEvent result = apiInstance.updateGroupCalendarEvent(groupId, calendarId, updateCalendarEventRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CalendarApi#updateGroupCalendarEvent");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **groupId** | **String**| Must be a valid group ID. | |
| **calendarId** | **String**| Must be a valid calendar ID. | |
| **updateCalendarEventRequest** | [**UpdateCalendarEventRequest**](UpdateCalendarEventRequest.md)|  | |

### Return type

[**CalendarEvent**](CalendarEvent.md)

### Authorization

[authCookie](../README.md#authCookie)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a single CalendarEvent object. |  -  |
| **401** | Error response due to missing auth cookie. |  -  |

