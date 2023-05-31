# GroupsApi

All URIs are relative to *https://api.vrchat.cloud/api/1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addGroupGalleryImage**](GroupsApi.md#addGroupGalleryImage) | **POST** /groups/{groupId}/galleries/{groupGalleryId}/images | Add Group Gallery Image |
| [**addGroupMemberRole**](GroupsApi.md#addGroupMemberRole) | **PUT** /groups/{groupId}/members/{userId}/roles/{groupRoleId} | Add Role to GroupMember |
| [**banGroupMember**](GroupsApi.md#banGroupMember) | **POST** /groups/{groupId}/bans | Ban Group Member |
| [**cancelGroupRequest**](GroupsApi.md#cancelGroupRequest) | **DELETE** /groups/{groupId}/requests | Cancel Group Join Request |
| [**createGroup**](GroupsApi.md#createGroup) | **POST** /groups | Create Group |
| [**createGroupAnnouncement**](GroupsApi.md#createGroupAnnouncement) | **POST** /groups/{groupId}/announcement | Create Group Announcement |
| [**createGroupGallery**](GroupsApi.md#createGroupGallery) | **POST** /groups/{groupId}/galleries | Create Group Gallery |
| [**createGroupInvite**](GroupsApi.md#createGroupInvite) | **POST** /groups/{groupId}/invites | Invite User to Group |
| [**createGroupRole**](GroupsApi.md#createGroupRole) | **POST** /groups/{groupId}/roles | Create GroupRole |
| [**deleteGroup**](GroupsApi.md#deleteGroup) | **DELETE** /groups/{groupId} | Delete Group |
| [**deleteGroupAnnouncement**](GroupsApi.md#deleteGroupAnnouncement) | **DELETE** /groups/{groupId}/announcement | Delete Group Announcement |
| [**deleteGroupGallery**](GroupsApi.md#deleteGroupGallery) | **DELETE** /groups/{groupId}/galleries/{groupGalleryId} | Delete Group Gallery |
| [**deleteGroupGalleryImage**](GroupsApi.md#deleteGroupGalleryImage) | **DELETE** /groups/{groupId}/galleries/{groupGalleryId}/images/{groupGalleryImageId} | Delete Group Gallery Image |
| [**deleteGroupInvite**](GroupsApi.md#deleteGroupInvite) | **DELETE** /groups/{groupId}/invites/{userId} | Delete User Invite |
| [**deleteGroupRole**](GroupsApi.md#deleteGroupRole) | **DELETE** /groups/{groupId}/roles/{groupRoleId} | Delete Group Role |
| [**getGroup**](GroupsApi.md#getGroup) | **GET** /groups/{groupId} | Get Group by ID |
| [**getGroupAnnouncements**](GroupsApi.md#getGroupAnnouncements) | **GET** /groups/{groupId}/announcement | Get Group Announcement |
| [**getGroupAuditLogs**](GroupsApi.md#getGroupAuditLogs) | **GET** /groups/{groupId}/auditLogs | Get Group Audit Logs |
| [**getGroupBans**](GroupsApi.md#getGroupBans) | **GET** /groups/{groupId}/bans | Get Group Bans |
| [**getGroupGalleryImages**](GroupsApi.md#getGroupGalleryImages) | **GET** /groups/{groupId}/galleries/{groupGalleryId} | Get Group Gallery Images |
| [**getGroupInvites**](GroupsApi.md#getGroupInvites) | **GET** /groups/{groupId}/invites | Get Group Invites Sent |
| [**getGroupMember**](GroupsApi.md#getGroupMember) | **GET** /groups/{groupId}/members/{userId} | Get Group Member |
| [**getGroupMembers**](GroupsApi.md#getGroupMembers) | **GET** /groups/{groupId}/members | List Group Members |
| [**getGroupPermissions**](GroupsApi.md#getGroupPermissions) | **GET** /groups/{groupId}/permissions | List Group Permissions |
| [**getGroupRequests**](GroupsApi.md#getGroupRequests) | **GET** /groups/{groupId}/requests | Get Group Join Requests |
| [**getGroupRoles**](GroupsApi.md#getGroupRoles) | **GET** /groups/{groupId}/roles | Get Group Roles |
| [**joinGroup**](GroupsApi.md#joinGroup) | **POST** /groups/{groupId}/join | Join Group |
| [**kickGroupMember**](GroupsApi.md#kickGroupMember) | **DELETE** /groups/{groupId}/members/{userId} | Kick Group Member |
| [**leaveGroup**](GroupsApi.md#leaveGroup) | **POST** /groups/{groupId}/leave | Leave Group |
| [**removeGroupMemberRole**](GroupsApi.md#removeGroupMemberRole) | **DELETE** /groups/{groupId}/members/{userId}/roles/{groupRoleId} | Remove Role from GroupMember |
| [**respondGroupJoinRequest**](GroupsApi.md#respondGroupJoinRequest) | **PUT** /groups/{groupId}/requests/{userId} | Respond Group Join request |
| [**unbanGroupMember**](GroupsApi.md#unbanGroupMember) | **DELETE** /groups/{groupId}/bans/{userId} | Unban Group Member |
| [**updateGroup**](GroupsApi.md#updateGroup) | **PUT** /groups/{groupId} | Update Group |
| [**updateGroupGallery**](GroupsApi.md#updateGroupGallery) | **PUT** /groups/{groupId}/galleries/{groupGalleryId} | Update Group Gallery |
| [**updateGroupMember**](GroupsApi.md#updateGroupMember) | **PUT** /groups/{groupId}/members/{userId} | Update Group Member |
| [**updateGroupRole**](GroupsApi.md#updateGroupRole) | **PUT** /groups/{groupId}/roles/{groupRoleId} | Update Group Role |


<a name="addGroupGalleryImage"></a>
# **addGroupGalleryImage**
> GroupGalleryImage addGroupGalleryImage(groupId, groupGalleryId, addGroupGalleryImageRequest)

Add Group Gallery Image

Adds an image to a Group gallery.

### Example
```java
// Import classes:
import io.github.vrchatapi.ApiClient;
import io.github.vrchatapi.ApiException;
import io.github.vrchatapi.Configuration;
import io.github.vrchatapi.auth.*;
import io.github.vrchatapi.models.*;
import io.github.vrchatapi.api.GroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.vrchat.cloud/api/1");
    
    // Configure API key authorization: authCookie
    ApiKeyAuth authCookie = (ApiKeyAuth) defaultClient.getAuthentication("authCookie");
    authCookie.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //authCookie.setApiKeyPrefix("Token");

    GroupsApi apiInstance = new GroupsApi(defaultClient);
    String groupId = "grp_00000000-0000-0000-0000-000000000000"; // String | Must be a valid group ID.
    String groupGalleryId = "ggal_00000000-0000-0000-0000-000000000000"; // String | Must be a valid group gallery ID.
    AddGroupGalleryImageRequest addGroupGalleryImageRequest = new AddGroupGalleryImageRequest(); // AddGroupGalleryImageRequest | 
    try {
      GroupGalleryImage result = apiInstance.addGroupGalleryImage(groupId, groupGalleryId, addGroupGalleryImageRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupsApi#addGroupGalleryImage");
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
| **groupGalleryId** | **String**| Must be a valid group gallery ID. | |
| **addGroupGalleryImageRequest** | [**AddGroupGalleryImageRequest**](AddGroupGalleryImageRequest.md)|  | [optional] |

### Return type

[**GroupGalleryImage**](GroupGalleryImage.md)

### Authorization

[authCookie](../README.md#authCookie)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a single GroupGalleryImage object. |  -  |
| **401** | Error response due to missing auth cookie. |  -  |
| **404** | Error response when trying to perform operations on a non-existing group. |  -  |

<a name="addGroupMemberRole"></a>
# **addGroupMemberRole**
> List&lt;String&gt; addGroupMemberRole(groupId, userId, groupRoleId)

Add Role to GroupMember

Adds a Role to a Group Member

### Example
```java
// Import classes:
import io.github.vrchatapi.ApiClient;
import io.github.vrchatapi.ApiException;
import io.github.vrchatapi.Configuration;
import io.github.vrchatapi.auth.*;
import io.github.vrchatapi.models.*;
import io.github.vrchatapi.api.GroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.vrchat.cloud/api/1");
    
    // Configure API key authorization: authCookie
    ApiKeyAuth authCookie = (ApiKeyAuth) defaultClient.getAuthentication("authCookie");
    authCookie.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //authCookie.setApiKeyPrefix("Token");

    GroupsApi apiInstance = new GroupsApi(defaultClient);
    String groupId = "grp_00000000-0000-0000-0000-000000000000"; // String | Must be a valid group ID.
    String userId = "userId_example"; // String | Must be a valid user ID.
    String groupRoleId = "grol_00000000-0000-0000-0000-000000000000"; // String | Must be a valid group role ID.
    try {
      List<String> result = apiInstance.addGroupMemberRole(groupId, userId, groupRoleId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupsApi#addGroupMemberRole");
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
| **userId** | **String**| Must be a valid user ID. | |
| **groupRoleId** | **String**| Must be a valid group role ID. | |

### Return type

**List&lt;String&gt;**

### Authorization

[authCookie](../README.md#authCookie)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a list of GroupRoleID objects. |  -  |
| **401** | Error response due to missing auth cookie. |  -  |
| **404** | Error response when trying to perform operations on a non-existing group. |  -  |

<a name="banGroupMember"></a>
# **banGroupMember**
> GroupMember banGroupMember(groupId, banGroupMemberRequest)

Ban Group Member

Bans a user from a Group.

### Example
```java
// Import classes:
import io.github.vrchatapi.ApiClient;
import io.github.vrchatapi.ApiException;
import io.github.vrchatapi.Configuration;
import io.github.vrchatapi.auth.*;
import io.github.vrchatapi.models.*;
import io.github.vrchatapi.api.GroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.vrchat.cloud/api/1");
    
    // Configure API key authorization: authCookie
    ApiKeyAuth authCookie = (ApiKeyAuth) defaultClient.getAuthentication("authCookie");
    authCookie.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //authCookie.setApiKeyPrefix("Token");

    GroupsApi apiInstance = new GroupsApi(defaultClient);
    String groupId = "grp_00000000-0000-0000-0000-000000000000"; // String | Must be a valid group ID.
    BanGroupMemberRequest banGroupMemberRequest = new BanGroupMemberRequest(); // BanGroupMemberRequest | 
    try {
      GroupMember result = apiInstance.banGroupMember(groupId, banGroupMemberRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupsApi#banGroupMember");
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
| **banGroupMemberRequest** | [**BanGroupMemberRequest**](BanGroupMemberRequest.md)|  | [optional] |

### Return type

[**GroupMember**](GroupMember.md)

### Authorization

[authCookie](../README.md#authCookie)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a list of GroupMember objects. |  -  |
| **401** | Error response due to missing auth cookie. |  -  |
| **404** | Error response when trying to perform operations on a non-existing group. |  -  |

<a name="cancelGroupRequest"></a>
# **cancelGroupRequest**
> cancelGroupRequest(groupId)

Cancel Group Join Request

Cancels a request sent to join the group.

### Example
```java
// Import classes:
import io.github.vrchatapi.ApiClient;
import io.github.vrchatapi.ApiException;
import io.github.vrchatapi.Configuration;
import io.github.vrchatapi.auth.*;
import io.github.vrchatapi.models.*;
import io.github.vrchatapi.api.GroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.vrchat.cloud/api/1");
    
    // Configure API key authorization: authCookie
    ApiKeyAuth authCookie = (ApiKeyAuth) defaultClient.getAuthentication("authCookie");
    authCookie.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //authCookie.setApiKeyPrefix("Token");

    GroupsApi apiInstance = new GroupsApi(defaultClient);
    String groupId = "grp_00000000-0000-0000-0000-000000000000"; // String | Must be a valid group ID.
    try {
      apiInstance.cancelGroupRequest(groupId);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupsApi#cancelGroupRequest");
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

null (empty response body)

### Authorization

[authCookie](../README.md#authCookie)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | You can&#39;t cancel a join request if you didn&#39;t request to join․ |  -  |
| **403** | Error response when trying to perform operations on a group you are not member of. |  -  |
| **404** | Error response when trying to perform operations on a non-existing group. |  -  |

<a name="createGroup"></a>
# **createGroup**
> Group createGroup(createGroupRequest)

Create Group

Creates a Group and returns a Group object. **Requires VRC+ Subscription.**

### Example
```java
// Import classes:
import io.github.vrchatapi.ApiClient;
import io.github.vrchatapi.ApiException;
import io.github.vrchatapi.Configuration;
import io.github.vrchatapi.auth.*;
import io.github.vrchatapi.models.*;
import io.github.vrchatapi.api.GroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.vrchat.cloud/api/1");
    
    // Configure API key authorization: authCookie
    ApiKeyAuth authCookie = (ApiKeyAuth) defaultClient.getAuthentication("authCookie");
    authCookie.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //authCookie.setApiKeyPrefix("Token");

    GroupsApi apiInstance = new GroupsApi(defaultClient);
    CreateGroupRequest createGroupRequest = new CreateGroupRequest(); // CreateGroupRequest | 
    try {
      Group result = apiInstance.createGroup(createGroupRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupsApi#createGroup");
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
| **createGroupRequest** | [**CreateGroupRequest**](CreateGroupRequest.md)|  | [optional] |

### Return type

[**Group**](Group.md)

### Authorization

[authCookie](../README.md#authCookie)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a single Group object. |  -  |
| **401** | Error response due to missing auth cookie. |  -  |

<a name="createGroupAnnouncement"></a>
# **createGroupAnnouncement**
> GroupAnnouncement createGroupAnnouncement(groupId, createGroupAnnouncementRequest)

Create Group Announcement

Creates an Announcement for a Group.

### Example
```java
// Import classes:
import io.github.vrchatapi.ApiClient;
import io.github.vrchatapi.ApiException;
import io.github.vrchatapi.Configuration;
import io.github.vrchatapi.auth.*;
import io.github.vrchatapi.models.*;
import io.github.vrchatapi.api.GroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.vrchat.cloud/api/1");
    
    // Configure API key authorization: authCookie
    ApiKeyAuth authCookie = (ApiKeyAuth) defaultClient.getAuthentication("authCookie");
    authCookie.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //authCookie.setApiKeyPrefix("Token");

    GroupsApi apiInstance = new GroupsApi(defaultClient);
    String groupId = "grp_00000000-0000-0000-0000-000000000000"; // String | Must be a valid group ID.
    CreateGroupAnnouncementRequest createGroupAnnouncementRequest = new CreateGroupAnnouncementRequest(); // CreateGroupAnnouncementRequest | 
    try {
      GroupAnnouncement result = apiInstance.createGroupAnnouncement(groupId, createGroupAnnouncementRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupsApi#createGroupAnnouncement");
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
| **createGroupAnnouncementRequest** | [**CreateGroupAnnouncementRequest**](CreateGroupAnnouncementRequest.md)|  | [optional] |

### Return type

[**GroupAnnouncement**](GroupAnnouncement.md)

### Authorization

[authCookie](../README.md#authCookie)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a single GroupAnnouncement object. |  -  |
| **401** | Error response due to missing auth cookie. |  -  |
| **404** | Error response when trying to perform operations on a non-existing group. |  -  |

<a name="createGroupGallery"></a>
# **createGroupGallery**
> GroupGallery createGroupGallery(groupId, createGroupGalleryRequest)

Create Group Gallery

Creates a gallery for a Group.

### Example
```java
// Import classes:
import io.github.vrchatapi.ApiClient;
import io.github.vrchatapi.ApiException;
import io.github.vrchatapi.Configuration;
import io.github.vrchatapi.auth.*;
import io.github.vrchatapi.models.*;
import io.github.vrchatapi.api.GroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.vrchat.cloud/api/1");
    
    // Configure API key authorization: authCookie
    ApiKeyAuth authCookie = (ApiKeyAuth) defaultClient.getAuthentication("authCookie");
    authCookie.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //authCookie.setApiKeyPrefix("Token");

    GroupsApi apiInstance = new GroupsApi(defaultClient);
    String groupId = "grp_00000000-0000-0000-0000-000000000000"; // String | Must be a valid group ID.
    CreateGroupGalleryRequest createGroupGalleryRequest = new CreateGroupGalleryRequest(); // CreateGroupGalleryRequest | 
    try {
      GroupGallery result = apiInstance.createGroupGallery(groupId, createGroupGalleryRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupsApi#createGroupGallery");
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
| **createGroupGalleryRequest** | [**CreateGroupGalleryRequest**](CreateGroupGalleryRequest.md)|  | [optional] |

### Return type

[**GroupGallery**](GroupGallery.md)

### Authorization

[authCookie](../README.md#authCookie)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a single GroupGallery object. |  -  |
| **401** | Error response due to missing auth cookie. |  -  |
| **404** | Error response when trying to perform operations on a non-existing group. |  -  |

<a name="createGroupInvite"></a>
# **createGroupInvite**
> createGroupInvite(groupId, createGroupInviteRequest)

Invite User to Group

Sends an invite to a user to join the group.

### Example
```java
// Import classes:
import io.github.vrchatapi.ApiClient;
import io.github.vrchatapi.ApiException;
import io.github.vrchatapi.Configuration;
import io.github.vrchatapi.auth.*;
import io.github.vrchatapi.models.*;
import io.github.vrchatapi.api.GroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.vrchat.cloud/api/1");
    
    // Configure API key authorization: authCookie
    ApiKeyAuth authCookie = (ApiKeyAuth) defaultClient.getAuthentication("authCookie");
    authCookie.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //authCookie.setApiKeyPrefix("Token");

    GroupsApi apiInstance = new GroupsApi(defaultClient);
    String groupId = "grp_00000000-0000-0000-0000-000000000000"; // String | Must be a valid group ID.
    CreateGroupInviteRequest createGroupInviteRequest = new CreateGroupInviteRequest(); // CreateGroupInviteRequest | 
    try {
      apiInstance.createGroupInvite(groupId, createGroupInviteRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupsApi#createGroupInvite");
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
| **createGroupInviteRequest** | [**CreateGroupInviteRequest**](CreateGroupInviteRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[authCookie](../README.md#authCookie)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | User &lt;displayName&gt; is already invited |  -  |
| **401** | Error response due to missing auth cookie. |  -  |
| **404** | Error response when trying to perform operations on a non-existing group. |  -  |

<a name="createGroupRole"></a>
# **createGroupRole**
> GroupRole createGroupRole(groupId, createGroupRoleRequest)

Create GroupRole

Create a Group role.

### Example
```java
// Import classes:
import io.github.vrchatapi.ApiClient;
import io.github.vrchatapi.ApiException;
import io.github.vrchatapi.Configuration;
import io.github.vrchatapi.auth.*;
import io.github.vrchatapi.models.*;
import io.github.vrchatapi.api.GroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.vrchat.cloud/api/1");
    
    // Configure API key authorization: authCookie
    ApiKeyAuth authCookie = (ApiKeyAuth) defaultClient.getAuthentication("authCookie");
    authCookie.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //authCookie.setApiKeyPrefix("Token");

    GroupsApi apiInstance = new GroupsApi(defaultClient);
    String groupId = "grp_00000000-0000-0000-0000-000000000000"; // String | Must be a valid group ID.
    CreateGroupRoleRequest createGroupRoleRequest = new CreateGroupRoleRequest(); // CreateGroupRoleRequest | 
    try {
      GroupRole result = apiInstance.createGroupRole(groupId, createGroupRoleRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupsApi#createGroupRole");
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
| **createGroupRoleRequest** | [**CreateGroupRoleRequest**](CreateGroupRoleRequest.md)|  | [optional] |

### Return type

[**GroupRole**](GroupRole.md)

### Authorization

[authCookie](../README.md#authCookie)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a single GroupRole object. |  -  |
| **401** | Error response due to missing auth cookie. |  -  |
| **404** | Error response when trying to perform operations on a non-existing group. |  -  |

<a name="deleteGroup"></a>
# **deleteGroup**
> Success deleteGroup(groupId)

Delete Group

Deletes a Group.

### Example
```java
// Import classes:
import io.github.vrchatapi.ApiClient;
import io.github.vrchatapi.ApiException;
import io.github.vrchatapi.Configuration;
import io.github.vrchatapi.auth.*;
import io.github.vrchatapi.models.*;
import io.github.vrchatapi.api.GroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.vrchat.cloud/api/1");
    
    // Configure API key authorization: authCookie
    ApiKeyAuth authCookie = (ApiKeyAuth) defaultClient.getAuthentication("authCookie");
    authCookie.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //authCookie.setApiKeyPrefix("Token");

    GroupsApi apiInstance = new GroupsApi(defaultClient);
    String groupId = "grp_00000000-0000-0000-0000-000000000000"; // String | Must be a valid group ID.
    try {
      Success result = apiInstance.deleteGroup(groupId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupsApi#deleteGroup");
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

[**Success**](Success.md)

### Authorization

[authCookie](../README.md#authCookie)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response after deleting a Group. |  -  |
| **401** | Error response due to missing auth cookie. |  -  |
| **404** | Error response when trying to perform operations on a non-existing group. |  -  |

<a name="deleteGroupAnnouncement"></a>
# **deleteGroupAnnouncement**
> Success deleteGroupAnnouncement(groupId)

Delete Group Announcement

Deletes the announcement for a Group.

### Example
```java
// Import classes:
import io.github.vrchatapi.ApiClient;
import io.github.vrchatapi.ApiException;
import io.github.vrchatapi.Configuration;
import io.github.vrchatapi.auth.*;
import io.github.vrchatapi.models.*;
import io.github.vrchatapi.api.GroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.vrchat.cloud/api/1");
    
    // Configure API key authorization: authCookie
    ApiKeyAuth authCookie = (ApiKeyAuth) defaultClient.getAuthentication("authCookie");
    authCookie.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //authCookie.setApiKeyPrefix("Token");

    GroupsApi apiInstance = new GroupsApi(defaultClient);
    String groupId = "grp_00000000-0000-0000-0000-000000000000"; // String | Must be a valid group ID.
    try {
      Success result = apiInstance.deleteGroupAnnouncement(groupId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupsApi#deleteGroupAnnouncement");
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

[**Success**](Success.md)

### Authorization

[authCookie](../README.md#authCookie)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response after deleting/clearing the group announcement. |  -  |
| **401** | Error response due to missing auth cookie. |  -  |
| **404** | Error response when trying to perform operations on a non-existing group. |  -  |

<a name="deleteGroupGallery"></a>
# **deleteGroupGallery**
> Success deleteGroupGallery(groupId, groupGalleryId)

Delete Group Gallery

Deletes a gallery for a Group.

### Example
```java
// Import classes:
import io.github.vrchatapi.ApiClient;
import io.github.vrchatapi.ApiException;
import io.github.vrchatapi.Configuration;
import io.github.vrchatapi.auth.*;
import io.github.vrchatapi.models.*;
import io.github.vrchatapi.api.GroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.vrchat.cloud/api/1");
    
    // Configure API key authorization: authCookie
    ApiKeyAuth authCookie = (ApiKeyAuth) defaultClient.getAuthentication("authCookie");
    authCookie.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //authCookie.setApiKeyPrefix("Token");

    GroupsApi apiInstance = new GroupsApi(defaultClient);
    String groupId = "grp_00000000-0000-0000-0000-000000000000"; // String | Must be a valid group ID.
    String groupGalleryId = "ggal_00000000-0000-0000-0000-000000000000"; // String | Must be a valid group gallery ID.
    try {
      Success result = apiInstance.deleteGroupGallery(groupId, groupGalleryId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupsApi#deleteGroupGallery");
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
| **groupGalleryId** | **String**| Must be a valid group gallery ID. | |

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
| **200** | Successful response after deleting a group gallery. |  -  |
| **401** | Error response due to missing auth cookie. |  -  |
| **404** | Error response when trying to perform operations on a non-existing group. |  -  |

<a name="deleteGroupGalleryImage"></a>
# **deleteGroupGalleryImage**
> Success deleteGroupGalleryImage(groupId, groupGalleryId, groupGalleryImageId)

Delete Group Gallery Image

Deletes an image from a Group gallery.

### Example
```java
// Import classes:
import io.github.vrchatapi.ApiClient;
import io.github.vrchatapi.ApiException;
import io.github.vrchatapi.Configuration;
import io.github.vrchatapi.auth.*;
import io.github.vrchatapi.models.*;
import io.github.vrchatapi.api.GroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.vrchat.cloud/api/1");
    
    // Configure API key authorization: authCookie
    ApiKeyAuth authCookie = (ApiKeyAuth) defaultClient.getAuthentication("authCookie");
    authCookie.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //authCookie.setApiKeyPrefix("Token");

    GroupsApi apiInstance = new GroupsApi(defaultClient);
    String groupId = "grp_00000000-0000-0000-0000-000000000000"; // String | Must be a valid group ID.
    String groupGalleryId = "ggal_00000000-0000-0000-0000-000000000000"; // String | Must be a valid group gallery ID.
    String groupGalleryImageId = "ggim_00000000-0000-0000-0000-000000000000"; // String | Must be a valid group gallery image ID.
    try {
      Success result = apiInstance.deleteGroupGalleryImage(groupId, groupGalleryId, groupGalleryImageId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupsApi#deleteGroupGalleryImage");
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
| **groupGalleryId** | **String**| Must be a valid group gallery ID. | |
| **groupGalleryImageId** | **String**| Must be a valid group gallery image ID. | |

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
| **200** | Successful response after deleting a group gallery image. |  -  |
| **401** | Error response due to missing auth cookie. |  -  |
| **403** | Error response when trying to delete a submission to a group&#39;s gallery when the user does not have permission to do so. |  -  |
| **404** | Error response when trying to perform operations on a non-existing group. |  -  |

<a name="deleteGroupInvite"></a>
# **deleteGroupInvite**
> deleteGroupInvite(groupId, userId)

Delete User Invite

Deletes an Group invite sent to a User

### Example
```java
// Import classes:
import io.github.vrchatapi.ApiClient;
import io.github.vrchatapi.ApiException;
import io.github.vrchatapi.Configuration;
import io.github.vrchatapi.auth.*;
import io.github.vrchatapi.models.*;
import io.github.vrchatapi.api.GroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.vrchat.cloud/api/1");
    
    // Configure API key authorization: authCookie
    ApiKeyAuth authCookie = (ApiKeyAuth) defaultClient.getAuthentication("authCookie");
    authCookie.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //authCookie.setApiKeyPrefix("Token");

    GroupsApi apiInstance = new GroupsApi(defaultClient);
    String groupId = "grp_00000000-0000-0000-0000-000000000000"; // String | Must be a valid group ID.
    String userId = "userId_example"; // String | Must be a valid user ID.
    try {
      apiInstance.deleteGroupInvite(groupId, userId);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupsApi#deleteGroupInvite");
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
| **userId** | **String**| Must be a valid user ID. | |

### Return type

null (empty response body)

### Authorization

[authCookie](../README.md#authCookie)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Error response due to missing auth cookie. |  -  |

<a name="deleteGroupRole"></a>
# **deleteGroupRole**
> List&lt;GroupRole&gt; deleteGroupRole(groupId, groupRoleId)

Delete Group Role

Deletes a Group Role by ID and returns the remaining roles.

### Example
```java
// Import classes:
import io.github.vrchatapi.ApiClient;
import io.github.vrchatapi.ApiException;
import io.github.vrchatapi.Configuration;
import io.github.vrchatapi.auth.*;
import io.github.vrchatapi.models.*;
import io.github.vrchatapi.api.GroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.vrchat.cloud/api/1");
    
    // Configure API key authorization: authCookie
    ApiKeyAuth authCookie = (ApiKeyAuth) defaultClient.getAuthentication("authCookie");
    authCookie.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //authCookie.setApiKeyPrefix("Token");

    GroupsApi apiInstance = new GroupsApi(defaultClient);
    String groupId = "grp_00000000-0000-0000-0000-000000000000"; // String | Must be a valid group ID.
    String groupRoleId = "grol_00000000-0000-0000-0000-000000000000"; // String | Must be a valid group role ID.
    try {
      List<GroupRole> result = apiInstance.deleteGroupRole(groupId, groupRoleId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupsApi#deleteGroupRole");
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
| **groupRoleId** | **String**| Must be a valid group role ID. | |

### Return type

[**List&lt;GroupRole&gt;**](GroupRole.md)

### Authorization

[authCookie](../README.md#authCookie)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a list of GroupRole objects. |  -  |
| **401** | Error response due to missing auth cookie. |  -  |
| **404** | Error response when trying to perform operations on a group you are not member of. |  -  |

<a name="getGroup"></a>
# **getGroup**
> Group getGroup(groupId, includeRoles)

Get Group by ID

Returns a single Group by ID.

### Example
```java
// Import classes:
import io.github.vrchatapi.ApiClient;
import io.github.vrchatapi.ApiException;
import io.github.vrchatapi.Configuration;
import io.github.vrchatapi.auth.*;
import io.github.vrchatapi.models.*;
import io.github.vrchatapi.api.GroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.vrchat.cloud/api/1");
    
    // Configure API key authorization: authCookie
    ApiKeyAuth authCookie = (ApiKeyAuth) defaultClient.getAuthentication("authCookie");
    authCookie.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //authCookie.setApiKeyPrefix("Token");

    GroupsApi apiInstance = new GroupsApi(defaultClient);
    String groupId = "grp_00000000-0000-0000-0000-000000000000"; // String | Must be a valid group ID.
    Boolean includeRoles = true; // Boolean | Include roles for the Group object. Defaults to false.
    try {
      Group result = apiInstance.getGroup(groupId, includeRoles);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupsApi#getGroup");
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
| **includeRoles** | **Boolean**| Include roles for the Group object. Defaults to false. | [optional] |

### Return type

[**Group**](Group.md)

### Authorization

[authCookie](../README.md#authCookie)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a single Group object. |  -  |
| **401** | Error response due to missing auth cookie. |  -  |
| **404** | Error response when trying to perform operations on a non-existing group. |  -  |

<a name="getGroupAnnouncements"></a>
# **getGroupAnnouncements**
> GroupAnnouncement getGroupAnnouncements(groupId)

Get Group Announcement

Returns the announcement for a Group. If no announcement has been made, then it returns **empty object**.  If an announcement exists, then it will always return all fields except &#x60;imageId&#x60; and &#x60;imageUrl&#x60; which may be null.

### Example
```java
// Import classes:
import io.github.vrchatapi.ApiClient;
import io.github.vrchatapi.ApiException;
import io.github.vrchatapi.Configuration;
import io.github.vrchatapi.auth.*;
import io.github.vrchatapi.models.*;
import io.github.vrchatapi.api.GroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.vrchat.cloud/api/1");
    
    // Configure API key authorization: authCookie
    ApiKeyAuth authCookie = (ApiKeyAuth) defaultClient.getAuthentication("authCookie");
    authCookie.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //authCookie.setApiKeyPrefix("Token");

    GroupsApi apiInstance = new GroupsApi(defaultClient);
    String groupId = "grp_00000000-0000-0000-0000-000000000000"; // String | Must be a valid group ID.
    try {
      GroupAnnouncement result = apiInstance.getGroupAnnouncements(groupId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupsApi#getGroupAnnouncements");
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

[**GroupAnnouncement**](GroupAnnouncement.md)

### Authorization

[authCookie](../README.md#authCookie)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a single GroupAnnouncement object. |  -  |
| **401** | Error response due to missing auth cookie. |  -  |
| **404** | Error response when trying to perform operations on a non-existing group. |  -  |

<a name="getGroupAuditLogs"></a>
# **getGroupAuditLogs**
> PaginatedGroupAuditLogEntryList getGroupAuditLogs(groupId, n, offset, startDate, endDate)

Get Group Audit Logs

Returns a list of audit logs for a Group.

### Example
```java
// Import classes:
import io.github.vrchatapi.ApiClient;
import io.github.vrchatapi.ApiException;
import io.github.vrchatapi.Configuration;
import io.github.vrchatapi.auth.*;
import io.github.vrchatapi.models.*;
import io.github.vrchatapi.api.GroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.vrchat.cloud/api/1");
    
    // Configure API key authorization: authCookie
    ApiKeyAuth authCookie = (ApiKeyAuth) defaultClient.getAuthentication("authCookie");
    authCookie.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //authCookie.setApiKeyPrefix("Token");

    GroupsApi apiInstance = new GroupsApi(defaultClient);
    String groupId = "grp_00000000-0000-0000-0000-000000000000"; // String | Must be a valid group ID.
    Integer n = 60; // Integer | The number of objects to return.
    Integer offset = 56; // Integer | A zero-based offset from the default object sorting from where search results start.
    OffsetDateTime startDate = OffsetDateTime.now(); // OffsetDateTime | The start date of the search range.
    OffsetDateTime endDate = OffsetDateTime.now(); // OffsetDateTime | The end date of the search range.
    try {
      PaginatedGroupAuditLogEntryList result = apiInstance.getGroupAuditLogs(groupId, n, offset, startDate, endDate);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupsApi#getGroupAuditLogs");
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
| **n** | **Integer**| The number of objects to return. | [optional] [default to 60] |
| **offset** | **Integer**| A zero-based offset from the default object sorting from where search results start. | [optional] |
| **startDate** | **OffsetDateTime**| The start date of the search range. | [optional] |
| **endDate** | **OffsetDateTime**| The end date of the search range. | [optional] |

### Return type

[**PaginatedGroupAuditLogEntryList**](PaginatedGroupAuditLogEntryList.md)

### Authorization

[authCookie](../README.md#authCookie)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a list of GroupAudit objects, wrapped in new pagination format. |  -  |
| **401** | Error response due to missing auth cookie. |  -  |
| **404** | Error response when trying to perform operations on a non-existing group. |  -  |

<a name="getGroupBans"></a>
# **getGroupBans**
> List&lt;GroupMember&gt; getGroupBans(groupId, n, offset)

Get Group Bans

Returns a list of banned users for a Group.

### Example
```java
// Import classes:
import io.github.vrchatapi.ApiClient;
import io.github.vrchatapi.ApiException;
import io.github.vrchatapi.Configuration;
import io.github.vrchatapi.auth.*;
import io.github.vrchatapi.models.*;
import io.github.vrchatapi.api.GroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.vrchat.cloud/api/1");
    
    // Configure API key authorization: authCookie
    ApiKeyAuth authCookie = (ApiKeyAuth) defaultClient.getAuthentication("authCookie");
    authCookie.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //authCookie.setApiKeyPrefix("Token");

    GroupsApi apiInstance = new GroupsApi(defaultClient);
    String groupId = "grp_00000000-0000-0000-0000-000000000000"; // String | Must be a valid group ID.
    Integer n = 60; // Integer | The number of objects to return.
    Integer offset = 56; // Integer | A zero-based offset from the default object sorting from where search results start.
    try {
      List<GroupMember> result = apiInstance.getGroupBans(groupId, n, offset);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupsApi#getGroupBans");
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
| **n** | **Integer**| The number of objects to return. | [optional] [default to 60] |
| **offset** | **Integer**| A zero-based offset from the default object sorting from where search results start. | [optional] |

### Return type

[**List&lt;GroupMember&gt;**](GroupMember.md)

### Authorization

[authCookie](../README.md#authCookie)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a list of GroupMember objects. |  -  |
| **401** | Error response due to missing auth cookie. |  -  |
| **404** | Error response when trying to perform operations on a non-existing group. |  -  |

<a name="getGroupGalleryImages"></a>
# **getGroupGalleryImages**
> List&lt;GroupGalleryImage&gt; getGroupGalleryImages(groupId, groupGalleryId, n, offset, approved)

Get Group Gallery Images

Returns a list of images for a Group gallery.

### Example
```java
// Import classes:
import io.github.vrchatapi.ApiClient;
import io.github.vrchatapi.ApiException;
import io.github.vrchatapi.Configuration;
import io.github.vrchatapi.auth.*;
import io.github.vrchatapi.models.*;
import io.github.vrchatapi.api.GroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.vrchat.cloud/api/1");
    
    // Configure API key authorization: authCookie
    ApiKeyAuth authCookie = (ApiKeyAuth) defaultClient.getAuthentication("authCookie");
    authCookie.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //authCookie.setApiKeyPrefix("Token");

    GroupsApi apiInstance = new GroupsApi(defaultClient);
    String groupId = "grp_00000000-0000-0000-0000-000000000000"; // String | Must be a valid group ID.
    String groupGalleryId = "ggal_00000000-0000-0000-0000-000000000000"; // String | Must be a valid group gallery ID.
    Integer n = 60; // Integer | The number of objects to return.
    Integer offset = 56; // Integer | A zero-based offset from the default object sorting from where search results start.
    Boolean approved = true; // Boolean | If specified, only returns images that have been approved or not approved.
    try {
      List<GroupGalleryImage> result = apiInstance.getGroupGalleryImages(groupId, groupGalleryId, n, offset, approved);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupsApi#getGroupGalleryImages");
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
| **groupGalleryId** | **String**| Must be a valid group gallery ID. | |
| **n** | **Integer**| The number of objects to return. | [optional] [default to 60] |
| **offset** | **Integer**| A zero-based offset from the default object sorting from where search results start. | [optional] |
| **approved** | **Boolean**| If specified, only returns images that have been approved or not approved. | [optional] |

### Return type

[**List&lt;GroupGalleryImage&gt;**](GroupGalleryImage.md)

### Authorization

[authCookie](../README.md#authCookie)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a list of GroupGalleryImage objects. |  -  |
| **401** | Error response due to missing auth cookie. |  -  |
| **404** | Error response when trying to perform operations on a non-existing group. |  -  |

<a name="getGroupInvites"></a>
# **getGroupInvites**
> List&lt;GroupMember&gt; getGroupInvites(groupId)

Get Group Invites Sent

Returns a list of members that have been invited to the Group.

### Example
```java
// Import classes:
import io.github.vrchatapi.ApiClient;
import io.github.vrchatapi.ApiException;
import io.github.vrchatapi.Configuration;
import io.github.vrchatapi.auth.*;
import io.github.vrchatapi.models.*;
import io.github.vrchatapi.api.GroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.vrchat.cloud/api/1");
    
    // Configure API key authorization: authCookie
    ApiKeyAuth authCookie = (ApiKeyAuth) defaultClient.getAuthentication("authCookie");
    authCookie.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //authCookie.setApiKeyPrefix("Token");

    GroupsApi apiInstance = new GroupsApi(defaultClient);
    String groupId = "grp_00000000-0000-0000-0000-000000000000"; // String | Must be a valid group ID.
    try {
      List<GroupMember> result = apiInstance.getGroupInvites(groupId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupsApi#getGroupInvites");
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

[**List&lt;GroupMember&gt;**](GroupMember.md)

### Authorization

[authCookie](../README.md#authCookie)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a list of GroupMember objects. |  -  |
| **401** | Error response due to missing auth cookie. |  -  |
| **403** | Error response when trying to perform operations on a group you are not member of. |  -  |
| **404** | Error response when trying to perform operations on a non-existing group. |  -  |

<a name="getGroupMember"></a>
# **getGroupMember**
> GroupLimitedMember getGroupMember(groupId, userId)

Get Group Member

Returns a LimitedGroup Member.

### Example
```java
// Import classes:
import io.github.vrchatapi.ApiClient;
import io.github.vrchatapi.ApiException;
import io.github.vrchatapi.Configuration;
import io.github.vrchatapi.auth.*;
import io.github.vrchatapi.models.*;
import io.github.vrchatapi.api.GroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.vrchat.cloud/api/1");
    
    // Configure API key authorization: authCookie
    ApiKeyAuth authCookie = (ApiKeyAuth) defaultClient.getAuthentication("authCookie");
    authCookie.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //authCookie.setApiKeyPrefix("Token");

    GroupsApi apiInstance = new GroupsApi(defaultClient);
    String groupId = "grp_00000000-0000-0000-0000-000000000000"; // String | Must be a valid group ID.
    String userId = "userId_example"; // String | Must be a valid user ID.
    try {
      GroupLimitedMember result = apiInstance.getGroupMember(groupId, userId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupsApi#getGroupMember");
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
| **userId** | **String**| Must be a valid user ID. | |

### Return type

[**GroupLimitedMember**](GroupLimitedMember.md)

### Authorization

[authCookie](../README.md#authCookie)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a list of GroupMember objects. |  -  |
| **401** | Error response due to missing auth cookie. |  -  |
| **404** | Error response when trying to perform operations on a non-existing group. |  -  |

<a name="getGroupMembers"></a>
# **getGroupMembers**
> List&lt;GroupMember&gt; getGroupMembers(groupId, n, offset)

List Group Members

Returns a List of all **other** Group Members. This endpoint will never return the user calling the endpoint. Information about the user calling the endpoint must be found in the &#x60;myMember&#x60; field of the Group object.

### Example
```java
// Import classes:
import io.github.vrchatapi.ApiClient;
import io.github.vrchatapi.ApiException;
import io.github.vrchatapi.Configuration;
import io.github.vrchatapi.auth.*;
import io.github.vrchatapi.models.*;
import io.github.vrchatapi.api.GroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.vrchat.cloud/api/1");
    
    // Configure API key authorization: authCookie
    ApiKeyAuth authCookie = (ApiKeyAuth) defaultClient.getAuthentication("authCookie");
    authCookie.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //authCookie.setApiKeyPrefix("Token");

    GroupsApi apiInstance = new GroupsApi(defaultClient);
    String groupId = "grp_00000000-0000-0000-0000-000000000000"; // String | Must be a valid group ID.
    Integer n = 60; // Integer | The number of objects to return.
    Integer offset = 56; // Integer | A zero-based offset from the default object sorting from where search results start.
    try {
      List<GroupMember> result = apiInstance.getGroupMembers(groupId, n, offset);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupsApi#getGroupMembers");
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
| **n** | **Integer**| The number of objects to return. | [optional] [default to 60] |
| **offset** | **Integer**| A zero-based offset from the default object sorting from where search results start. | [optional] |

### Return type

[**List&lt;GroupMember&gt;**](GroupMember.md)

### Authorization

[authCookie](../README.md#authCookie)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a list of GroupMember objects. |  -  |
| **400** | Error response when trying to search list of users with an invalid request. |  -  |
| **401** | Error response due to missing auth cookie. |  -  |
| **404** | Error response when trying to perform operations on a non-existing group. |  -  |

<a name="getGroupPermissions"></a>
# **getGroupPermissions**
> List&lt;GroupPermission&gt; getGroupPermissions(groupId)

List Group Permissions

Returns a List of all possible/available permissions for a Group.

### Example
```java
// Import classes:
import io.github.vrchatapi.ApiClient;
import io.github.vrchatapi.ApiException;
import io.github.vrchatapi.Configuration;
import io.github.vrchatapi.auth.*;
import io.github.vrchatapi.models.*;
import io.github.vrchatapi.api.GroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.vrchat.cloud/api/1");
    
    // Configure API key authorization: authCookie
    ApiKeyAuth authCookie = (ApiKeyAuth) defaultClient.getAuthentication("authCookie");
    authCookie.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //authCookie.setApiKeyPrefix("Token");

    GroupsApi apiInstance = new GroupsApi(defaultClient);
    String groupId = "grp_00000000-0000-0000-0000-000000000000"; // String | Must be a valid group ID.
    try {
      List<GroupPermission> result = apiInstance.getGroupPermissions(groupId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupsApi#getGroupPermissions");
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

[**List&lt;GroupPermission&gt;**](GroupPermission.md)

### Authorization

[authCookie](../README.md#authCookie)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a list of GroupPermission objects. |  -  |
| **400** | Error response when trying to search list of users with an invalid request. |  -  |
| **401** | Error response due to missing auth cookie. |  -  |
| **404** | Error response when trying to perform operations on a non-existing group. |  -  |

<a name="getGroupRequests"></a>
# **getGroupRequests**
> List&lt;GroupMember&gt; getGroupRequests(groupId)

Get Group Join Requests

Returns a list of members that have requested to join the Group.

### Example
```java
// Import classes:
import io.github.vrchatapi.ApiClient;
import io.github.vrchatapi.ApiException;
import io.github.vrchatapi.Configuration;
import io.github.vrchatapi.auth.*;
import io.github.vrchatapi.models.*;
import io.github.vrchatapi.api.GroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.vrchat.cloud/api/1");
    
    // Configure API key authorization: authCookie
    ApiKeyAuth authCookie = (ApiKeyAuth) defaultClient.getAuthentication("authCookie");
    authCookie.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //authCookie.setApiKeyPrefix("Token");

    GroupsApi apiInstance = new GroupsApi(defaultClient);
    String groupId = "grp_00000000-0000-0000-0000-000000000000"; // String | Must be a valid group ID.
    try {
      List<GroupMember> result = apiInstance.getGroupRequests(groupId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupsApi#getGroupRequests");
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

[**List&lt;GroupMember&gt;**](GroupMember.md)

### Authorization

[authCookie](../README.md#authCookie)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a list of GroupMember objects. |  -  |
| **403** | Error response when trying to perform operations on a group you are not member of. |  -  |
| **404** | Error response when trying to perform operations on a non-existing group. |  -  |

<a name="getGroupRoles"></a>
# **getGroupRoles**
> List&lt;GroupRole&gt; getGroupRoles(groupId)

Get Group Roles

Returns a Group Role by ID.

### Example
```java
// Import classes:
import io.github.vrchatapi.ApiClient;
import io.github.vrchatapi.ApiException;
import io.github.vrchatapi.Configuration;
import io.github.vrchatapi.auth.*;
import io.github.vrchatapi.models.*;
import io.github.vrchatapi.api.GroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.vrchat.cloud/api/1");
    
    // Configure API key authorization: authCookie
    ApiKeyAuth authCookie = (ApiKeyAuth) defaultClient.getAuthentication("authCookie");
    authCookie.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //authCookie.setApiKeyPrefix("Token");

    GroupsApi apiInstance = new GroupsApi(defaultClient);
    String groupId = "grp_00000000-0000-0000-0000-000000000000"; // String | Must be a valid group ID.
    try {
      List<GroupRole> result = apiInstance.getGroupRoles(groupId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupsApi#getGroupRoles");
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

[**List&lt;GroupRole&gt;**](GroupRole.md)

### Authorization

[authCookie](../README.md#authCookie)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a list of GroupRole objects. |  -  |
| **401** | Error response due to missing auth cookie. |  -  |
| **404** | Error response when trying to perform operations on a non-existing group. |  -  |

<a name="joinGroup"></a>
# **joinGroup**
> GroupMember joinGroup(groupId)

Join Group

Join a Group by ID and returns the member object.

### Example
```java
// Import classes:
import io.github.vrchatapi.ApiClient;
import io.github.vrchatapi.ApiException;
import io.github.vrchatapi.Configuration;
import io.github.vrchatapi.auth.*;
import io.github.vrchatapi.models.*;
import io.github.vrchatapi.api.GroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.vrchat.cloud/api/1");
    
    // Configure API key authorization: authCookie
    ApiKeyAuth authCookie = (ApiKeyAuth) defaultClient.getAuthentication("authCookie");
    authCookie.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //authCookie.setApiKeyPrefix("Token");

    GroupsApi apiInstance = new GroupsApi(defaultClient);
    String groupId = "grp_00000000-0000-0000-0000-000000000000"; // String | Must be a valid group ID.
    try {
      GroupMember result = apiInstance.joinGroup(groupId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupsApi#joinGroup");
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

[**GroupMember**](GroupMember.md)

### Authorization

[authCookie](../README.md#authCookie)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a list of GroupMember objects. |  -  |
| **400** | Error response when trying to join a group that the user is already a member of. |  -  |
| **401** | Error response due to missing auth cookie. |  -  |
| **404** | Error response when trying to perform operations on a non-existing group. |  -  |

<a name="kickGroupMember"></a>
# **kickGroupMember**
> kickGroupMember(groupId, userId)

Kick Group Member

Kicks a Group Member from the Group. The current user must have the \&quot;Remove Group Members\&quot; permission.

### Example
```java
// Import classes:
import io.github.vrchatapi.ApiClient;
import io.github.vrchatapi.ApiException;
import io.github.vrchatapi.Configuration;
import io.github.vrchatapi.auth.*;
import io.github.vrchatapi.models.*;
import io.github.vrchatapi.api.GroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.vrchat.cloud/api/1");
    
    // Configure API key authorization: authCookie
    ApiKeyAuth authCookie = (ApiKeyAuth) defaultClient.getAuthentication("authCookie");
    authCookie.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //authCookie.setApiKeyPrefix("Token");

    GroupsApi apiInstance = new GroupsApi(defaultClient);
    String groupId = "grp_00000000-0000-0000-0000-000000000000"; // String | Must be a valid group ID.
    String userId = "userId_example"; // String | Must be a valid user ID.
    try {
      apiInstance.kickGroupMember(groupId, userId);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupsApi#kickGroupMember");
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
| **userId** | **String**| Must be a valid user ID. | |

### Return type

null (empty response body)

### Authorization

[authCookie](../README.md#authCookie)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Error response due to missing auth cookie. |  -  |
| **403** | Error response when trying to perform operations on a group you are not member of. |  -  |
| **404** | Error response when trying to perform operations on a non-existing group. |  -  |

<a name="leaveGroup"></a>
# **leaveGroup**
> leaveGroup(groupId)

Leave Group

Leave a group by ID.

### Example
```java
// Import classes:
import io.github.vrchatapi.ApiClient;
import io.github.vrchatapi.ApiException;
import io.github.vrchatapi.Configuration;
import io.github.vrchatapi.auth.*;
import io.github.vrchatapi.models.*;
import io.github.vrchatapi.api.GroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.vrchat.cloud/api/1");
    
    // Configure API key authorization: authCookie
    ApiKeyAuth authCookie = (ApiKeyAuth) defaultClient.getAuthentication("authCookie");
    authCookie.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //authCookie.setApiKeyPrefix("Token");

    GroupsApi apiInstance = new GroupsApi(defaultClient);
    String groupId = "grp_00000000-0000-0000-0000-000000000000"; // String | Must be a valid group ID.
    try {
      apiInstance.leaveGroup(groupId);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupsApi#leaveGroup");
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

null (empty response body)

### Authorization

[authCookie](../README.md#authCookie)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **403** | Error response when trying to perform operations on a group you are not member of. |  -  |
| **404** | Error response when trying to perform operations on a non-existing group. |  -  |

<a name="removeGroupMemberRole"></a>
# **removeGroupMemberRole**
> List&lt;String&gt; removeGroupMemberRole(groupId, userId, groupRoleId)

Remove Role from GroupMember

Removes a Role from a Group Member

### Example
```java
// Import classes:
import io.github.vrchatapi.ApiClient;
import io.github.vrchatapi.ApiException;
import io.github.vrchatapi.Configuration;
import io.github.vrchatapi.auth.*;
import io.github.vrchatapi.models.*;
import io.github.vrchatapi.api.GroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.vrchat.cloud/api/1");
    
    // Configure API key authorization: authCookie
    ApiKeyAuth authCookie = (ApiKeyAuth) defaultClient.getAuthentication("authCookie");
    authCookie.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //authCookie.setApiKeyPrefix("Token");

    GroupsApi apiInstance = new GroupsApi(defaultClient);
    String groupId = "grp_00000000-0000-0000-0000-000000000000"; // String | Must be a valid group ID.
    String userId = "userId_example"; // String | Must be a valid user ID.
    String groupRoleId = "grol_00000000-0000-0000-0000-000000000000"; // String | Must be a valid group role ID.
    try {
      List<String> result = apiInstance.removeGroupMemberRole(groupId, userId, groupRoleId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupsApi#removeGroupMemberRole");
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
| **userId** | **String**| Must be a valid user ID. | |
| **groupRoleId** | **String**| Must be a valid group role ID. | |

### Return type

**List&lt;String&gt;**

### Authorization

[authCookie](../README.md#authCookie)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a list of GroupRoleID objects. |  -  |
| **401** | Error response due to missing auth cookie. |  -  |
| **404** | Error response when trying to perform operations on a non-existing group. |  -  |

<a name="respondGroupJoinRequest"></a>
# **respondGroupJoinRequest**
> respondGroupJoinRequest(groupId, userId, respondGroupJoinRequest)

Respond Group Join request

Responds to a Group Join Request with Accept/Deny

### Example
```java
// Import classes:
import io.github.vrchatapi.ApiClient;
import io.github.vrchatapi.ApiException;
import io.github.vrchatapi.Configuration;
import io.github.vrchatapi.auth.*;
import io.github.vrchatapi.models.*;
import io.github.vrchatapi.api.GroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.vrchat.cloud/api/1");
    
    // Configure API key authorization: authCookie
    ApiKeyAuth authCookie = (ApiKeyAuth) defaultClient.getAuthentication("authCookie");
    authCookie.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //authCookie.setApiKeyPrefix("Token");

    GroupsApi apiInstance = new GroupsApi(defaultClient);
    String groupId = "grp_00000000-0000-0000-0000-000000000000"; // String | Must be a valid group ID.
    String userId = "userId_example"; // String | Must be a valid user ID.
    RespondGroupJoinRequest respondGroupJoinRequest = new RespondGroupJoinRequest(); // RespondGroupJoinRequest | 
    try {
      apiInstance.respondGroupJoinRequest(groupId, userId, respondGroupJoinRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupsApi#respondGroupJoinRequest");
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
| **userId** | **String**| Must be a valid user ID. | |
| **respondGroupJoinRequest** | [**RespondGroupJoinRequest**](RespondGroupJoinRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[authCookie](../README.md#authCookie)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Error response due to missing auth cookie. |  -  |
| **404** | Error response when trying to perform operations on a non-existing group. |  -  |

<a name="unbanGroupMember"></a>
# **unbanGroupMember**
> GroupMember unbanGroupMember(groupId, userId)

Unban Group Member

Unbans a user from a Group.

### Example
```java
// Import classes:
import io.github.vrchatapi.ApiClient;
import io.github.vrchatapi.ApiException;
import io.github.vrchatapi.Configuration;
import io.github.vrchatapi.auth.*;
import io.github.vrchatapi.models.*;
import io.github.vrchatapi.api.GroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.vrchat.cloud/api/1");
    
    // Configure API key authorization: authCookie
    ApiKeyAuth authCookie = (ApiKeyAuth) defaultClient.getAuthentication("authCookie");
    authCookie.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //authCookie.setApiKeyPrefix("Token");

    GroupsApi apiInstance = new GroupsApi(defaultClient);
    String groupId = "grp_00000000-0000-0000-0000-000000000000"; // String | Must be a valid group ID.
    String userId = "userId_example"; // String | Must be a valid user ID.
    try {
      GroupMember result = apiInstance.unbanGroupMember(groupId, userId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupsApi#unbanGroupMember");
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
| **userId** | **String**| Must be a valid user ID. | |

### Return type

[**GroupMember**](GroupMember.md)

### Authorization

[authCookie](../README.md#authCookie)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a list of GroupMember objects. |  -  |
| **401** | Error response due to missing auth cookie. |  -  |
| **404** | Error response when trying to perform operations on a non-existing group. |  -  |

<a name="updateGroup"></a>
# **updateGroup**
> Group updateGroup(groupId, updateGroupRequest)

Update Group

Updates a Group and returns it.

### Example
```java
// Import classes:
import io.github.vrchatapi.ApiClient;
import io.github.vrchatapi.ApiException;
import io.github.vrchatapi.Configuration;
import io.github.vrchatapi.auth.*;
import io.github.vrchatapi.models.*;
import io.github.vrchatapi.api.GroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.vrchat.cloud/api/1");
    
    // Configure API key authorization: authCookie
    ApiKeyAuth authCookie = (ApiKeyAuth) defaultClient.getAuthentication("authCookie");
    authCookie.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //authCookie.setApiKeyPrefix("Token");

    GroupsApi apiInstance = new GroupsApi(defaultClient);
    String groupId = "grp_00000000-0000-0000-0000-000000000000"; // String | Must be a valid group ID.
    UpdateGroupRequest updateGroupRequest = new UpdateGroupRequest(); // UpdateGroupRequest | 
    try {
      Group result = apiInstance.updateGroup(groupId, updateGroupRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupsApi#updateGroup");
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
| **updateGroupRequest** | [**UpdateGroupRequest**](UpdateGroupRequest.md)|  | [optional] |

### Return type

[**Group**](Group.md)

### Authorization

[authCookie](../README.md#authCookie)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a single Group object. |  -  |
| **401** | Error response due to missing auth cookie. |  -  |
| **404** | Error response when trying to perform operations on a non-existing group. |  -  |

<a name="updateGroupGallery"></a>
# **updateGroupGallery**
> GroupGallery updateGroupGallery(groupId, groupGalleryId, updateGroupGalleryRequest)

Update Group Gallery

Updates a gallery for a Group.

### Example
```java
// Import classes:
import io.github.vrchatapi.ApiClient;
import io.github.vrchatapi.ApiException;
import io.github.vrchatapi.Configuration;
import io.github.vrchatapi.auth.*;
import io.github.vrchatapi.models.*;
import io.github.vrchatapi.api.GroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.vrchat.cloud/api/1");
    
    // Configure API key authorization: authCookie
    ApiKeyAuth authCookie = (ApiKeyAuth) defaultClient.getAuthentication("authCookie");
    authCookie.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //authCookie.setApiKeyPrefix("Token");

    GroupsApi apiInstance = new GroupsApi(defaultClient);
    String groupId = "grp_00000000-0000-0000-0000-000000000000"; // String | Must be a valid group ID.
    String groupGalleryId = "ggal_00000000-0000-0000-0000-000000000000"; // String | Must be a valid group gallery ID.
    UpdateGroupGalleryRequest updateGroupGalleryRequest = new UpdateGroupGalleryRequest(); // UpdateGroupGalleryRequest | 
    try {
      GroupGallery result = apiInstance.updateGroupGallery(groupId, groupGalleryId, updateGroupGalleryRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupsApi#updateGroupGallery");
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
| **groupGalleryId** | **String**| Must be a valid group gallery ID. | |
| **updateGroupGalleryRequest** | [**UpdateGroupGalleryRequest**](UpdateGroupGalleryRequest.md)|  | [optional] |

### Return type

[**GroupGallery**](GroupGallery.md)

### Authorization

[authCookie](../README.md#authCookie)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a single GroupGallery object. |  -  |
| **401** | Error response due to missing auth cookie. |  -  |
| **404** | Error response when trying to perform operations on a non-existing group. |  -  |

<a name="updateGroupMember"></a>
# **updateGroupMember**
> GroupLimitedMember updateGroupMember(groupId, userId, updateGroupMemberRequest)

Update Group Member

Updates a Group Member

### Example
```java
// Import classes:
import io.github.vrchatapi.ApiClient;
import io.github.vrchatapi.ApiException;
import io.github.vrchatapi.Configuration;
import io.github.vrchatapi.auth.*;
import io.github.vrchatapi.models.*;
import io.github.vrchatapi.api.GroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.vrchat.cloud/api/1");
    
    // Configure API key authorization: authCookie
    ApiKeyAuth authCookie = (ApiKeyAuth) defaultClient.getAuthentication("authCookie");
    authCookie.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //authCookie.setApiKeyPrefix("Token");

    GroupsApi apiInstance = new GroupsApi(defaultClient);
    String groupId = "grp_00000000-0000-0000-0000-000000000000"; // String | Must be a valid group ID.
    String userId = "userId_example"; // String | Must be a valid user ID.
    UpdateGroupMemberRequest updateGroupMemberRequest = new UpdateGroupMemberRequest(); // UpdateGroupMemberRequest | 
    try {
      GroupLimitedMember result = apiInstance.updateGroupMember(groupId, userId, updateGroupMemberRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupsApi#updateGroupMember");
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
| **userId** | **String**| Must be a valid user ID. | |
| **updateGroupMemberRequest** | [**UpdateGroupMemberRequest**](UpdateGroupMemberRequest.md)|  | [optional] |

### Return type

[**GroupLimitedMember**](GroupLimitedMember.md)

### Authorization

[authCookie](../README.md#authCookie)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a list of GroupMember objects. |  -  |
| **401** | Error response due to missing auth cookie. |  -  |
| **404** | Error response when trying to perform operations on a non-existing group. |  -  |

<a name="updateGroupRole"></a>
# **updateGroupRole**
> List&lt;GroupRole&gt; updateGroupRole(groupId, groupRoleId, updateGroupRoleRequest)

Update Group Role

Updates a group role by ID.

### Example
```java
// Import classes:
import io.github.vrchatapi.ApiClient;
import io.github.vrchatapi.ApiException;
import io.github.vrchatapi.Configuration;
import io.github.vrchatapi.auth.*;
import io.github.vrchatapi.models.*;
import io.github.vrchatapi.api.GroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.vrchat.cloud/api/1");
    
    // Configure API key authorization: authCookie
    ApiKeyAuth authCookie = (ApiKeyAuth) defaultClient.getAuthentication("authCookie");
    authCookie.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //authCookie.setApiKeyPrefix("Token");

    GroupsApi apiInstance = new GroupsApi(defaultClient);
    String groupId = "grp_00000000-0000-0000-0000-000000000000"; // String | Must be a valid group ID.
    String groupRoleId = "grol_00000000-0000-0000-0000-000000000000"; // String | Must be a valid group role ID.
    UpdateGroupRoleRequest updateGroupRoleRequest = new UpdateGroupRoleRequest(); // UpdateGroupRoleRequest | 
    try {
      List<GroupRole> result = apiInstance.updateGroupRole(groupId, groupRoleId, updateGroupRoleRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupsApi#updateGroupRole");
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
| **groupRoleId** | **String**| Must be a valid group role ID. | |
| **updateGroupRoleRequest** | [**UpdateGroupRoleRequest**](UpdateGroupRoleRequest.md)|  | [optional] |

### Return type

[**List&lt;GroupRole&gt;**](GroupRole.md)

### Authorization

[authCookie](../README.md#authCookie)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a list of GroupRole objects. |  -  |
| **401** | Error response due to missing auth cookie. |  -  |

