/*
 * VRChat API Documentation
 * ![VRChat API Banner](https://vrchatapi.github.io/assets/img/api_banner_1500x400.png)  # Welcome to the VRChat API  Before we begin, we would like to state this is a **COMMUNITY DRIVEN PROJECT**. This means that everything you read on here was written by the community itself and is **not** officially supported by VRChat. The documentation is provided \"AS IS\", and any action you take towards VRChat is completely your own responsibility.  The documentation and additional libraries SHALL ONLY be used for applications interacting with VRChat's API in accordance with their [Terms of Service](https://github.com/VRChatAPI), and MUST NOT be used for modifying the client, \"avatar ripping\", or other illegal activities. Malicious usage or spamming the API may result in account termination. Certain parts of the API are also more sensitive than others, for example moderation, so please read tread extra carefully and read the warnings when present.  ![Tupper Policy on API](https://i.imgur.com/yLlW7Ok.png)  Finally, use of the API using applications other than the approved methods (website, VRChat application, Unity SDK) is not officially supported. VRChat provides no guarantee or support for external applications using the API. Access to API endpoints may break **at any time, without notice**. Therefore, please **do not ping** VRChat Staff in the VRChat Discord if you are having API problems, as they do not provide API support. We will make a best effort in keeping this documentation and associated language libraries up to date, but things might be outdated or missing. If you find that something is no longer valid, please contact us on Discord or [create an issue](https://github.com/vrchatapi/specification/issues) and tell us so we can fix it.  # Getting Started  The VRChat API can be used to programmatically retrieve or update information regarding your profile, friends, avatars, worlds and more. The API consists of two parts, \"Photon\" which is only used in-game, and the \"Web API\" which is used by both the game and the website. This documentation focuses only on the Web API.  The API is designed around the REST ideology, providing semi-simple and usually predictable URIs to access and modify objects. Requests support standard HTTP methods like GET, PUT, POST, and DELETE and standard status codes. Response bodies are always UTF-8 encoded JSON objects, unless explicitly documented otherwise.  <div class=\"callout callout-error\">   <strong>🛑 Warning! Do not touch Photon!</strong><br>   Photon is only used by the in-game client and should <b>not</b> be touched. Doing so may result in permanent account termination. </div>  <div class=\"callout callout-info\">   <strong>ℹ️ API Key and Authentication</strong><br>   The API Key has always been the same and is currently <code>JlE5Jldo5Jibnk5O5hTx6XVqsJu4WJ26</code>.   Read <a href=\"#tag--authentication\">Authentication</a> for how to log in. </div>  # Using the API  For simply exploring what the API can do it is strongly recommended to download [Insomnia](https://insomnia.rest/download), a free and open-source API client that's great for sending requests to the API in an orderly fashion. Insomnia allows you to send data in the format that's required for VRChat's API. It is also possible to try out the API in your browser, by first logging in at [vrchat.com/home](https://vrchat.com/home/) and then going to [vrchat.com/api/1/auth/user](https://vrchat.com/api/1/auth/user), but the information will be much harder to work with.  For more permanent operation such as software development it is instead recommended to use one of the existing language SDKs. This community project maintains API libraries in several languages, which allows you to interact with the API with simple function calls rather than having to implement the HTTP protocol yourself. Most of these libraries are automatically generated from the API specification, sometimes with additional helpful wrapper code to make usage easier. This allows them to be almost automatically updated and expanded upon as soon as a new feature is introduced in the specification itself. The libraries can be found on [GitHub](https://github.com/vrchatapi) or following:  * [NodeJS (JavaScript)](https://www.npmjs.com/package/vrchat) * [Dart](https://pub.dev/packages/vrchat_dart) * [Rust](https://crates.io/crates/vrchatapi) * [C#](github.com/vrchatapi/vrchatapi-csharp) * [Python](https://github.com/vrchatapi/VRChatPython)  # Pagination  Most endpoints enforce pagination, meaning they will only return 10 entries by default, and never more than 100.<br> Using both the limit and offset parameters allows you to easily paginate through a large number of objects.  | Query Parameter | Type | Description | | ----------|--|------- | | `limit` | integer  | The number of objects to return. This value often defaults to 10. Highest limit is always 100.| | `offset` | integer  | A zero-based offset from the default object sorting.|  If a request returns fewer objects than the `limit` parameter, there are no more items available to return.  # Contribution  Do you want to get involved in the documentation effort? Do you want to help improve one of the language API libraries? This project is an [OPEN Open Source Project](https://openopensource.org)! This means that individuals making significant and valuable contributions are given commit-access to the project. It also means we are very open and welcoming of new people making contributions, unlike some more guarded open-source projects.  [![Discord](https://img.shields.io/static/v1?label=vrchatapi&message=discord&color=blueviolet&style=for-the-badge)](https://discord.gg/qjZE9C9fkB)
 *
 * The version of the OpenAPI document: 1.0.1
 * Contact: me@ruby.js.org
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.github.vrchatapi.api;

import io.github.vrchatapi.ApiCallback;
import io.github.vrchatapi.ApiClient;
import io.github.vrchatapi.ApiException;
import io.github.vrchatapi.ApiResponse;
import io.github.vrchatapi.Configuration;
import io.github.vrchatapi.Pair;
import io.github.vrchatapi.ProgressRequestBody;
import io.github.vrchatapi.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import io.github.vrchatapi.model.CurrentUser;
import io.github.vrchatapi.model.Error;
import io.github.vrchatapi.model.InlineObject2;
import io.github.vrchatapi.model.InlineResponse401;
import io.github.vrchatapi.model.LimitedUser;
import io.github.vrchatapi.model.User;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UsersApi {
    private ApiClient localVarApiClient;

    public UsersApi() {
        this(Configuration.getDefaultApiClient());
    }

    public UsersApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for getUser
     * @param userId  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing apiKey or auth cookie. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getUserCall(String userId, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/users/{userId}"
            .replaceAll("\\{" + "userId" + "\\}", localVarApiClient.escapeString(userId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "apiKeyCookie", "authCookie" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getUserValidateBeforeCall(String userId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new ApiException("Missing the required parameter 'userId' when calling getUser(Async)");
        }
        

        okhttp3.Call localVarCall = getUserCall(userId, _callback);
        return localVarCall;

    }

    /**
     * Get User by ID
     * Get public user information about a specific user using their ID.
     * @param userId  (required)
     * @return User
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing apiKey or auth cookie. </td><td>  -  </td></tr>
     </table>
     */
    public User getUser(String userId) throws ApiException {
        ApiResponse<User> localVarResp = getUserWithHttpInfo(userId);
        return localVarResp.getData();
    }

    /**
     * Get User by ID
     * Get public user information about a specific user using their ID.
     * @param userId  (required)
     * @return ApiResponse&lt;User&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing apiKey or auth cookie. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<User> getUserWithHttpInfo(String userId) throws ApiException {
        okhttp3.Call localVarCall = getUserValidateBeforeCall(userId, null);
        Type localVarReturnType = new TypeToken<User>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get User by ID (asynchronously)
     * Get public user information about a specific user using their ID.
     * @param userId  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing apiKey or auth cookie. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getUserAsync(String userId, final ApiCallback<User> _callback) throws ApiException {

        okhttp3.Call localVarCall = getUserValidateBeforeCall(userId, _callback);
        Type localVarReturnType = new TypeToken<User>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getUserByName
     * @param username  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing apiKey or auth cookie. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getUserByNameCall(String username, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/users/{username}/name"
            .replaceAll("\\{" + "username" + "\\}", localVarApiClient.escapeString(username.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "apiKeyCookie", "authCookie" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getUserByNameValidateBeforeCall(String username, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'username' is set
        if (username == null) {
            throw new ApiException("Missing the required parameter 'username' when calling getUserByName(Async)");
        }
        

        okhttp3.Call localVarCall = getUserByNameCall(username, _callback);
        return localVarCall;

    }

    /**
     * Get User by Username
     * Get public user information about a specific user using their name.
     * @param username  (required)
     * @return User
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing apiKey or auth cookie. </td><td>  -  </td></tr>
     </table>
     */
    public User getUserByName(String username) throws ApiException {
        ApiResponse<User> localVarResp = getUserByNameWithHttpInfo(username);
        return localVarResp.getData();
    }

    /**
     * Get User by Username
     * Get public user information about a specific user using their name.
     * @param username  (required)
     * @return ApiResponse&lt;User&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing apiKey or auth cookie. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<User> getUserByNameWithHttpInfo(String username) throws ApiException {
        okhttp3.Call localVarCall = getUserByNameValidateBeforeCall(username, null);
        Type localVarReturnType = new TypeToken<User>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get User by Username (asynchronously)
     * Get public user information about a specific user using their name.
     * @param username  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing apiKey or auth cookie. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getUserByNameAsync(String username, final ApiCallback<User> _callback) throws ApiException {

        okhttp3.Call localVarCall = getUserByNameValidateBeforeCall(username, _callback);
        Type localVarReturnType = new TypeToken<User>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for searchActiveUsers
     * @param search Username to search for (required)
     * @param developerType Active user by developer type, none for normal users and internal for moderators (optional)
     * @param offset A zero-based offset from the default object sorting from where search results start. (optional)
     * @param n The number of objects to return. (optional, default to 60)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Error response due to missing Administrator credentials. </td><td>  -  </td></tr>
     </table>
     * @deprecated
     */
    @Deprecated
    public okhttp3.Call searchActiveUsersCall(String search, String developerType, Integer offset, Integer n, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/users/active";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (search != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("search", search));
        }

        if (developerType != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("developerType", developerType));
        }

        if (offset != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("offset", offset));
        }

        if (n != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("n", n));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "apiKeyCookie", "authCookie" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @Deprecated
    @SuppressWarnings("rawtypes")
    private okhttp3.Call searchActiveUsersValidateBeforeCall(String search, String developerType, Integer offset, Integer n, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'search' is set
        if (search == null) {
            throw new ApiException("Missing the required parameter 'search' when calling searchActiveUsers(Async)");
        }
        

        okhttp3.Call localVarCall = searchActiveUsersCall(search, developerType, offset, n, _callback);
        return localVarCall;

    }

    /**
     * Search Active Users
     * Search and list any Active users by text query.  **Has been locked down and now always respond with \&quot;Invalid Admin Credentials\&quot;.**
     * @param search Username to search for (required)
     * @param developerType Active user by developer type, none for normal users and internal for moderators (optional)
     * @param offset A zero-based offset from the default object sorting from where search results start. (optional)
     * @param n The number of objects to return. (optional, default to 60)
     * @return List&lt;LimitedUser&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Error response due to missing Administrator credentials. </td><td>  -  </td></tr>
     </table>
     * @deprecated
     */
    @Deprecated
    public List<LimitedUser> searchActiveUsers(String search, String developerType, Integer offset, Integer n) throws ApiException {
        ApiResponse<List<LimitedUser>> localVarResp = searchActiveUsersWithHttpInfo(search, developerType, offset, n);
        return localVarResp.getData();
    }

    /**
     * Search Active Users
     * Search and list any Active users by text query.  **Has been locked down and now always respond with \&quot;Invalid Admin Credentials\&quot;.**
     * @param search Username to search for (required)
     * @param developerType Active user by developer type, none for normal users and internal for moderators (optional)
     * @param offset A zero-based offset from the default object sorting from where search results start. (optional)
     * @param n The number of objects to return. (optional, default to 60)
     * @return ApiResponse&lt;List&lt;LimitedUser&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Error response due to missing Administrator credentials. </td><td>  -  </td></tr>
     </table>
     * @deprecated
     */
    @Deprecated
    public ApiResponse<List<LimitedUser>> searchActiveUsersWithHttpInfo(String search, String developerType, Integer offset, Integer n) throws ApiException {
        okhttp3.Call localVarCall = searchActiveUsersValidateBeforeCall(search, developerType, offset, n, null);
        Type localVarReturnType = new TypeToken<List<LimitedUser>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Search Active Users (asynchronously)
     * Search and list any Active users by text query.  **Has been locked down and now always respond with \&quot;Invalid Admin Credentials\&quot;.**
     * @param search Username to search for (required)
     * @param developerType Active user by developer type, none for normal users and internal for moderators (optional)
     * @param offset A zero-based offset from the default object sorting from where search results start. (optional)
     * @param n The number of objects to return. (optional, default to 60)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Error response due to missing Administrator credentials. </td><td>  -  </td></tr>
     </table>
     * @deprecated
     */
    @Deprecated
    public okhttp3.Call searchActiveUsersAsync(String search, String developerType, Integer offset, Integer n, final ApiCallback<List<LimitedUser>> _callback) throws ApiException {

        okhttp3.Call localVarCall = searchActiveUsersValidateBeforeCall(search, developerType, offset, n, _callback);
        Type localVarReturnType = new TypeToken<List<LimitedUser>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for searchUsers
     * @param search Searches by &#x60;displayName&#x60;. Will return empty array if search query is empty or missing. (optional)
     * @param developerType Active user by developer type, none for normal users and internal for moderators (optional)
     * @param n The number of objects to return. (optional, default to 60)
     * @param offset A zero-based offset from the default object sorting from where search results start. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Error response when trying to search list of users with an invalid request. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing apiKey or auth cookie. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call searchUsersCall(String search, String developerType, Integer n, Integer offset, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/users";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (search != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("search", search));
        }

        if (developerType != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("developerType", developerType));
        }

        if (n != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("n", n));
        }

        if (offset != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("offset", offset));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "apiKeyCookie", "authCookie" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call searchUsersValidateBeforeCall(String search, String developerType, Integer n, Integer offset, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = searchUsersCall(search, developerType, n, offset, _callback);
        return localVarCall;

    }

    /**
     * Search All Users
     * Search and list any users by text query
     * @param search Searches by &#x60;displayName&#x60;. Will return empty array if search query is empty or missing. (optional)
     * @param developerType Active user by developer type, none for normal users and internal for moderators (optional)
     * @param n The number of objects to return. (optional, default to 60)
     * @param offset A zero-based offset from the default object sorting from where search results start. (optional)
     * @return List&lt;LimitedUser&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Error response when trying to search list of users with an invalid request. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing apiKey or auth cookie. </td><td>  -  </td></tr>
     </table>
     */
    public List<LimitedUser> searchUsers(String search, String developerType, Integer n, Integer offset) throws ApiException {
        ApiResponse<List<LimitedUser>> localVarResp = searchUsersWithHttpInfo(search, developerType, n, offset);
        return localVarResp.getData();
    }

    /**
     * Search All Users
     * Search and list any users by text query
     * @param search Searches by &#x60;displayName&#x60;. Will return empty array if search query is empty or missing. (optional)
     * @param developerType Active user by developer type, none for normal users and internal for moderators (optional)
     * @param n The number of objects to return. (optional, default to 60)
     * @param offset A zero-based offset from the default object sorting from where search results start. (optional)
     * @return ApiResponse&lt;List&lt;LimitedUser&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Error response when trying to search list of users with an invalid request. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing apiKey or auth cookie. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<LimitedUser>> searchUsersWithHttpInfo(String search, String developerType, Integer n, Integer offset) throws ApiException {
        okhttp3.Call localVarCall = searchUsersValidateBeforeCall(search, developerType, n, offset, null);
        Type localVarReturnType = new TypeToken<List<LimitedUser>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Search All Users (asynchronously)
     * Search and list any users by text query
     * @param search Searches by &#x60;displayName&#x60;. Will return empty array if search query is empty or missing. (optional)
     * @param developerType Active user by developer type, none for normal users and internal for moderators (optional)
     * @param n The number of objects to return. (optional, default to 60)
     * @param offset A zero-based offset from the default object sorting from where search results start. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Error response when trying to search list of users with an invalid request. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing apiKey or auth cookie. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call searchUsersAsync(String search, String developerType, Integer n, Integer offset, final ApiCallback<List<LimitedUser>> _callback) throws ApiException {

        okhttp3.Call localVarCall = searchUsersValidateBeforeCall(search, developerType, n, offset, _callback);
        Type localVarReturnType = new TypeToken<List<LimitedUser>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for updateUser
     * @param userId  (required)
     * @param inlineObject2  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateUserCall(String userId, InlineObject2 inlineObject2, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = inlineObject2;

        // create path and map variables
        String localVarPath = "/users/{userId}"
            .replaceAll("\\{" + "userId" + "\\}", localVarApiClient.escapeString(userId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "apiKeyCookie", "authCookie" };
        return localVarApiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call updateUserValidateBeforeCall(String userId, InlineObject2 inlineObject2, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new ApiException("Missing the required parameter 'userId' when calling updateUser(Async)");
        }
        

        okhttp3.Call localVarCall = updateUserCall(userId, inlineObject2, _callback);
        return localVarCall;

    }

    /**
     * Update User Info
     * Update a users information such as the email and birthday.
     * @param userId  (required)
     * @param inlineObject2  (optional)
     * @return CurrentUser
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public CurrentUser updateUser(String userId, InlineObject2 inlineObject2) throws ApiException {
        ApiResponse<CurrentUser> localVarResp = updateUserWithHttpInfo(userId, inlineObject2);
        return localVarResp.getData();
    }

    /**
     * Update User Info
     * Update a users information such as the email and birthday.
     * @param userId  (required)
     * @param inlineObject2  (optional)
     * @return ApiResponse&lt;CurrentUser&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<CurrentUser> updateUserWithHttpInfo(String userId, InlineObject2 inlineObject2) throws ApiException {
        okhttp3.Call localVarCall = updateUserValidateBeforeCall(userId, inlineObject2, null);
        Type localVarReturnType = new TypeToken<CurrentUser>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Update User Info (asynchronously)
     * Update a users information such as the email and birthday.
     * @param userId  (required)
     * @param inlineObject2  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateUserAsync(String userId, InlineObject2 inlineObject2, final ApiCallback<CurrentUser> _callback) throws ApiException {

        okhttp3.Call localVarCall = updateUserValidateBeforeCall(userId, inlineObject2, _callback);
        Type localVarReturnType = new TypeToken<CurrentUser>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
