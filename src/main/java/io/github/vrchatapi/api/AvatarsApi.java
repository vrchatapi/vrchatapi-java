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


import io.github.vrchatapi.model.Avatar;
import io.github.vrchatapi.model.CurrentUser;
import io.github.vrchatapi.model.Error;
import io.github.vrchatapi.model.InlineObject10;
import io.github.vrchatapi.model.InlineObject11;
import io.github.vrchatapi.model.InlineResponse401;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AvatarsApi {
    private ApiClient localVarApiClient;

    public AvatarsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AvatarsApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for createAvatar
     * @param inlineObject10  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a single Avatar object. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response when set featured to true without being an admin. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createAvatarCall(InlineObject10 inlineObject10, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = inlineObject10;

        // create path and map variables
        String localVarPath = "/avatars";

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
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call createAvatarValidateBeforeCall(InlineObject10 inlineObject10, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = createAvatarCall(inlineObject10, _callback);
        return localVarCall;

    }

    /**
     * Create Avatar
     * Create an avatar. It&#39;s possible to optionally specify a ID if you want a custom one. Attempting to create an Avatar with an already claimed ID will result in a DB error.
     * @param inlineObject10  (optional)
     * @return Avatar
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a single Avatar object. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response when set featured to true without being an admin. </td><td>  -  </td></tr>
     </table>
     */
    public Avatar createAvatar(InlineObject10 inlineObject10) throws ApiException {
        ApiResponse<Avatar> localVarResp = createAvatarWithHttpInfo(inlineObject10);
        return localVarResp.getData();
    }

    /**
     * Create Avatar
     * Create an avatar. It&#39;s possible to optionally specify a ID if you want a custom one. Attempting to create an Avatar with an already claimed ID will result in a DB error.
     * @param inlineObject10  (optional)
     * @return ApiResponse&lt;Avatar&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a single Avatar object. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response when set featured to true without being an admin. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Avatar> createAvatarWithHttpInfo(InlineObject10 inlineObject10) throws ApiException {
        okhttp3.Call localVarCall = createAvatarValidateBeforeCall(inlineObject10, null);
        Type localVarReturnType = new TypeToken<Avatar>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Create Avatar (asynchronously)
     * Create an avatar. It&#39;s possible to optionally specify a ID if you want a custom one. Attempting to create an Avatar with an already claimed ID will result in a DB error.
     * @param inlineObject10  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a single Avatar object. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response when set featured to true without being an admin. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createAvatarAsync(InlineObject10 inlineObject10, final ApiCallback<Avatar> _callback) throws ApiException {

        okhttp3.Call localVarCall = createAvatarValidateBeforeCall(inlineObject10, _callback);
        Type localVarReturnType = new TypeToken<Avatar>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for deleteAvatar
     * @param avatarId  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a single Avatar object. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing apiKey or auth cookie. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Error response when trying to show information about a non-existent avatar. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteAvatarCall(String avatarId, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/avatars/{avatarId}"
            .replaceAll("\\{" + "avatarId" + "\\}", localVarApiClient.escapeString(avatarId.toString()));

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
        return localVarApiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call deleteAvatarValidateBeforeCall(String avatarId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'avatarId' is set
        if (avatarId == null) {
            throw new ApiException("Missing the required parameter 'avatarId' when calling deleteAvatar(Async)");
        }
        

        okhttp3.Call localVarCall = deleteAvatarCall(avatarId, _callback);
        return localVarCall;

    }

    /**
     * Delete Avatar
     * Delete an avatar. Notice an avatar is never fully \&quot;deleted\&quot;, only its ReleaseStatus is set to \&quot;hidden\&quot; and the linked Files are deleted. The AvatarID is permanently reserved.
     * @param avatarId  (required)
     * @return Avatar
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a single Avatar object. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing apiKey or auth cookie. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Error response when trying to show information about a non-existent avatar. </td><td>  -  </td></tr>
     </table>
     */
    public Avatar deleteAvatar(String avatarId) throws ApiException {
        ApiResponse<Avatar> localVarResp = deleteAvatarWithHttpInfo(avatarId);
        return localVarResp.getData();
    }

    /**
     * Delete Avatar
     * Delete an avatar. Notice an avatar is never fully \&quot;deleted\&quot;, only its ReleaseStatus is set to \&quot;hidden\&quot; and the linked Files are deleted. The AvatarID is permanently reserved.
     * @param avatarId  (required)
     * @return ApiResponse&lt;Avatar&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a single Avatar object. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing apiKey or auth cookie. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Error response when trying to show information about a non-existent avatar. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Avatar> deleteAvatarWithHttpInfo(String avatarId) throws ApiException {
        okhttp3.Call localVarCall = deleteAvatarValidateBeforeCall(avatarId, null);
        Type localVarReturnType = new TypeToken<Avatar>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Delete Avatar (asynchronously)
     * Delete an avatar. Notice an avatar is never fully \&quot;deleted\&quot;, only its ReleaseStatus is set to \&quot;hidden\&quot; and the linked Files are deleted. The AvatarID is permanently reserved.
     * @param avatarId  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a single Avatar object. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing apiKey or auth cookie. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Error response when trying to show information about a non-existent avatar. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteAvatarAsync(String avatarId, final ApiCallback<Avatar> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteAvatarValidateBeforeCall(avatarId, _callback);
        Type localVarReturnType = new TypeToken<Avatar>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getAvatar
     * @param avatarId  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a single Avatar object. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing apiKey or auth cookie. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Error response when trying to show information about a non-existent avatar. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getAvatarCall(String avatarId, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/avatars/{avatarId}"
            .replaceAll("\\{" + "avatarId" + "\\}", localVarApiClient.escapeString(avatarId.toString()));

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
    private okhttp3.Call getAvatarValidateBeforeCall(String avatarId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'avatarId' is set
        if (avatarId == null) {
            throw new ApiException("Missing the required parameter 'avatarId' when calling getAvatar(Async)");
        }
        

        okhttp3.Call localVarCall = getAvatarCall(avatarId, _callback);
        return localVarCall;

    }

    /**
     * Get Avatar
     * Get information about a specific Avatar.
     * @param avatarId  (required)
     * @return Avatar
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a single Avatar object. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing apiKey or auth cookie. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Error response when trying to show information about a non-existent avatar. </td><td>  -  </td></tr>
     </table>
     */
    public Avatar getAvatar(String avatarId) throws ApiException {
        ApiResponse<Avatar> localVarResp = getAvatarWithHttpInfo(avatarId);
        return localVarResp.getData();
    }

    /**
     * Get Avatar
     * Get information about a specific Avatar.
     * @param avatarId  (required)
     * @return ApiResponse&lt;Avatar&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a single Avatar object. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing apiKey or auth cookie. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Error response when trying to show information about a non-existent avatar. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Avatar> getAvatarWithHttpInfo(String avatarId) throws ApiException {
        okhttp3.Call localVarCall = getAvatarValidateBeforeCall(avatarId, null);
        Type localVarReturnType = new TypeToken<Avatar>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get Avatar (asynchronously)
     * Get information about a specific Avatar.
     * @param avatarId  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a single Avatar object. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing apiKey or auth cookie. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Error response when trying to show information about a non-existent avatar. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getAvatarAsync(String avatarId, final ApiCallback<Avatar> _callback) throws ApiException {

        okhttp3.Call localVarCall = getAvatarValidateBeforeCall(avatarId, _callback);
        Type localVarReturnType = new TypeToken<Avatar>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getFavoritedAvatars
     * @param featured Filters on featured results. (optional)
     * @param sort  (optional, default to popularity)
     * @param n The number of objects to return. (optional, default to 60)
     * @param order  (optional, default to descending)
     * @param offset A zero-based offset from the default object sorting from where search results start. (optional)
     * @param search Filters by world name. (optional)
     * @param tag Tags to include (comma-separated). (optional)
     * @param notag Tags to exclude (comma-separated). (optional)
     * @param releaseStatus Filter by ReleaseStatus. (optional, default to hidden)
     * @param maxUnityVersion The maximum Unity version supported by the asset. (optional)
     * @param minUnityVersion The minimum Unity version supported by the asset. (optional)
     * @param platform The platform the asset supports. (optional)
     * @param userId Target user to see information on, admin-only. (optional)
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
    public okhttp3.Call getFavoritedAvatarsCall(String featured, String sort, Integer n, String order, Integer offset, String search, String tag, String notag, String releaseStatus, String maxUnityVersion, String minUnityVersion, String platform, String userId, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/avatars/favorites";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (featured != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("featured", featured));
        }

        if (sort != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("sort", sort));
        }

        if (n != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("n", n));
        }

        if (order != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("order", order));
        }

        if (offset != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("offset", offset));
        }

        if (search != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("search", search));
        }

        if (tag != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("tag", tag));
        }

        if (notag != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("notag", notag));
        }

        if (releaseStatus != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("releaseStatus", releaseStatus));
        }

        if (maxUnityVersion != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("maxUnityVersion", maxUnityVersion));
        }

        if (minUnityVersion != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("minUnityVersion", minUnityVersion));
        }

        if (platform != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("platform", platform));
        }

        if (userId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("userId", userId));
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
    private okhttp3.Call getFavoritedAvatarsValidateBeforeCall(String featured, String sort, Integer n, String order, Integer offset, String search, String tag, String notag, String releaseStatus, String maxUnityVersion, String minUnityVersion, String platform, String userId, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = getFavoritedAvatarsCall(featured, sort, n, order, offset, search, tag, notag, releaseStatus, maxUnityVersion, minUnityVersion, platform, userId, _callback);
        return localVarCall;

    }

    /**
     * List Favorited Avatars
     * Search and list favorited avatars by query filters.
     * @param featured Filters on featured results. (optional)
     * @param sort  (optional, default to popularity)
     * @param n The number of objects to return. (optional, default to 60)
     * @param order  (optional, default to descending)
     * @param offset A zero-based offset from the default object sorting from where search results start. (optional)
     * @param search Filters by world name. (optional)
     * @param tag Tags to include (comma-separated). (optional)
     * @param notag Tags to exclude (comma-separated). (optional)
     * @param releaseStatus Filter by ReleaseStatus. (optional, default to hidden)
     * @param maxUnityVersion The maximum Unity version supported by the asset. (optional)
     * @param minUnityVersion The minimum Unity version supported by the asset. (optional)
     * @param platform The platform the asset supports. (optional)
     * @param userId Target user to see information on, admin-only. (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing apiKey or auth cookie. </td><td>  -  </td></tr>
     </table>
     */
    public void getFavoritedAvatars(String featured, String sort, Integer n, String order, Integer offset, String search, String tag, String notag, String releaseStatus, String maxUnityVersion, String minUnityVersion, String platform, String userId) throws ApiException {
        getFavoritedAvatarsWithHttpInfo(featured, sort, n, order, offset, search, tag, notag, releaseStatus, maxUnityVersion, minUnityVersion, platform, userId);
    }

    /**
     * List Favorited Avatars
     * Search and list favorited avatars by query filters.
     * @param featured Filters on featured results. (optional)
     * @param sort  (optional, default to popularity)
     * @param n The number of objects to return. (optional, default to 60)
     * @param order  (optional, default to descending)
     * @param offset A zero-based offset from the default object sorting from where search results start. (optional)
     * @param search Filters by world name. (optional)
     * @param tag Tags to include (comma-separated). (optional)
     * @param notag Tags to exclude (comma-separated). (optional)
     * @param releaseStatus Filter by ReleaseStatus. (optional, default to hidden)
     * @param maxUnityVersion The maximum Unity version supported by the asset. (optional)
     * @param minUnityVersion The minimum Unity version supported by the asset. (optional)
     * @param platform The platform the asset supports. (optional)
     * @param userId Target user to see information on, admin-only. (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing apiKey or auth cookie. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> getFavoritedAvatarsWithHttpInfo(String featured, String sort, Integer n, String order, Integer offset, String search, String tag, String notag, String releaseStatus, String maxUnityVersion, String minUnityVersion, String platform, String userId) throws ApiException {
        okhttp3.Call localVarCall = getFavoritedAvatarsValidateBeforeCall(featured, sort, n, order, offset, search, tag, notag, releaseStatus, maxUnityVersion, minUnityVersion, platform, userId, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * List Favorited Avatars (asynchronously)
     * Search and list favorited avatars by query filters.
     * @param featured Filters on featured results. (optional)
     * @param sort  (optional, default to popularity)
     * @param n The number of objects to return. (optional, default to 60)
     * @param order  (optional, default to descending)
     * @param offset A zero-based offset from the default object sorting from where search results start. (optional)
     * @param search Filters by world name. (optional)
     * @param tag Tags to include (comma-separated). (optional)
     * @param notag Tags to exclude (comma-separated). (optional)
     * @param releaseStatus Filter by ReleaseStatus. (optional, default to hidden)
     * @param maxUnityVersion The maximum Unity version supported by the asset. (optional)
     * @param minUnityVersion The minimum Unity version supported by the asset. (optional)
     * @param platform The platform the asset supports. (optional)
     * @param userId Target user to see information on, admin-only. (optional)
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
    public okhttp3.Call getFavoritedAvatarsAsync(String featured, String sort, Integer n, String order, Integer offset, String search, String tag, String notag, String releaseStatus, String maxUnityVersion, String minUnityVersion, String platform, String userId, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = getFavoritedAvatarsValidateBeforeCall(featured, sort, n, order, offset, search, tag, notag, releaseStatus, maxUnityVersion, minUnityVersion, platform, userId, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for searchAvatars
     * @param featured Filters on featured results. (optional)
     * @param sort  (optional, default to popularity)
     * @param user Set to &#x60;me&#x60; for searching own avatars. (optional)
     * @param userId Filter by author UserID (optional)
     * @param n The number of objects to return. (optional, default to 60)
     * @param order  (optional, default to descending)
     * @param offset A zero-based offset from the default object sorting from where search results start. (optional)
     * @param tag Tags to include (comma-separated). (optional)
     * @param notag Tags to exclude (comma-separated). (optional)
     * @param releaseStatus Filter by ReleaseStatus. (optional, default to hidden)
     * @param maxUnityVersion The maximum Unity version supported by the asset. (optional)
     * @param minUnityVersion The minimum Unity version supported by the asset. (optional)
     * @param platform The platform the asset supports. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a list of Avatar objects. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing apiKey or auth cookie. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call searchAvatarsCall(String featured, String sort, String user, String userId, Integer n, String order, Integer offset, String tag, String notag, String releaseStatus, String maxUnityVersion, String minUnityVersion, String platform, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/avatars";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (featured != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("featured", featured));
        }

        if (sort != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("sort", sort));
        }

        if (user != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("user", user));
        }

        if (userId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("userId", userId));
        }

        if (n != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("n", n));
        }

        if (order != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("order", order));
        }

        if (offset != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("offset", offset));
        }

        if (tag != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("tag", tag));
        }

        if (notag != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("notag", notag));
        }

        if (releaseStatus != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("releaseStatus", releaseStatus));
        }

        if (maxUnityVersion != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("maxUnityVersion", maxUnityVersion));
        }

        if (minUnityVersion != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("minUnityVersion", minUnityVersion));
        }

        if (platform != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("platform", platform));
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
    private okhttp3.Call searchAvatarsValidateBeforeCall(String featured, String sort, String user, String userId, Integer n, String order, Integer offset, String tag, String notag, String releaseStatus, String maxUnityVersion, String minUnityVersion, String platform, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = searchAvatarsCall(featured, sort, user, userId, n, order, offset, tag, notag, releaseStatus, maxUnityVersion, minUnityVersion, platform, _callback);
        return localVarCall;

    }

    /**
     * Search Avatars
     * Search and list avatars by query filters. You can only search your own or featured avatars. It is not possible as a normal user to search other peoples avatars.
     * @param featured Filters on featured results. (optional)
     * @param sort  (optional, default to popularity)
     * @param user Set to &#x60;me&#x60; for searching own avatars. (optional)
     * @param userId Filter by author UserID (optional)
     * @param n The number of objects to return. (optional, default to 60)
     * @param order  (optional, default to descending)
     * @param offset A zero-based offset from the default object sorting from where search results start. (optional)
     * @param tag Tags to include (comma-separated). (optional)
     * @param notag Tags to exclude (comma-separated). (optional)
     * @param releaseStatus Filter by ReleaseStatus. (optional, default to hidden)
     * @param maxUnityVersion The maximum Unity version supported by the asset. (optional)
     * @param minUnityVersion The minimum Unity version supported by the asset. (optional)
     * @param platform The platform the asset supports. (optional)
     * @return List&lt;Avatar&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a list of Avatar objects. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing apiKey or auth cookie. </td><td>  -  </td></tr>
     </table>
     */
    public List<Avatar> searchAvatars(String featured, String sort, String user, String userId, Integer n, String order, Integer offset, String tag, String notag, String releaseStatus, String maxUnityVersion, String minUnityVersion, String platform) throws ApiException {
        ApiResponse<List<Avatar>> localVarResp = searchAvatarsWithHttpInfo(featured, sort, user, userId, n, order, offset, tag, notag, releaseStatus, maxUnityVersion, minUnityVersion, platform);
        return localVarResp.getData();
    }

    /**
     * Search Avatars
     * Search and list avatars by query filters. You can only search your own or featured avatars. It is not possible as a normal user to search other peoples avatars.
     * @param featured Filters on featured results. (optional)
     * @param sort  (optional, default to popularity)
     * @param user Set to &#x60;me&#x60; for searching own avatars. (optional)
     * @param userId Filter by author UserID (optional)
     * @param n The number of objects to return. (optional, default to 60)
     * @param order  (optional, default to descending)
     * @param offset A zero-based offset from the default object sorting from where search results start. (optional)
     * @param tag Tags to include (comma-separated). (optional)
     * @param notag Tags to exclude (comma-separated). (optional)
     * @param releaseStatus Filter by ReleaseStatus. (optional, default to hidden)
     * @param maxUnityVersion The maximum Unity version supported by the asset. (optional)
     * @param minUnityVersion The minimum Unity version supported by the asset. (optional)
     * @param platform The platform the asset supports. (optional)
     * @return ApiResponse&lt;List&lt;Avatar&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a list of Avatar objects. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing apiKey or auth cookie. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<Avatar>> searchAvatarsWithHttpInfo(String featured, String sort, String user, String userId, Integer n, String order, Integer offset, String tag, String notag, String releaseStatus, String maxUnityVersion, String minUnityVersion, String platform) throws ApiException {
        okhttp3.Call localVarCall = searchAvatarsValidateBeforeCall(featured, sort, user, userId, n, order, offset, tag, notag, releaseStatus, maxUnityVersion, minUnityVersion, platform, null);
        Type localVarReturnType = new TypeToken<List<Avatar>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Search Avatars (asynchronously)
     * Search and list avatars by query filters. You can only search your own or featured avatars. It is not possible as a normal user to search other peoples avatars.
     * @param featured Filters on featured results. (optional)
     * @param sort  (optional, default to popularity)
     * @param user Set to &#x60;me&#x60; for searching own avatars. (optional)
     * @param userId Filter by author UserID (optional)
     * @param n The number of objects to return. (optional, default to 60)
     * @param order  (optional, default to descending)
     * @param offset A zero-based offset from the default object sorting from where search results start. (optional)
     * @param tag Tags to include (comma-separated). (optional)
     * @param notag Tags to exclude (comma-separated). (optional)
     * @param releaseStatus Filter by ReleaseStatus. (optional, default to hidden)
     * @param maxUnityVersion The maximum Unity version supported by the asset. (optional)
     * @param minUnityVersion The minimum Unity version supported by the asset. (optional)
     * @param platform The platform the asset supports. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a list of Avatar objects. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing apiKey or auth cookie. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call searchAvatarsAsync(String featured, String sort, String user, String userId, Integer n, String order, Integer offset, String tag, String notag, String releaseStatus, String maxUnityVersion, String minUnityVersion, String platform, final ApiCallback<List<Avatar>> _callback) throws ApiException {

        okhttp3.Call localVarCall = searchAvatarsValidateBeforeCall(featured, sort, user, userId, n, order, offset, tag, notag, releaseStatus, maxUnityVersion, minUnityVersion, platform, _callback);
        Type localVarReturnType = new TypeToken<List<Avatar>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for selectAvatar
     * @param avatarId  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a single CurrentUser object. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing apiKey or auth cookie. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Error response when trying to show information about a non-existent avatar. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call selectAvatarCall(String avatarId, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/avatars/{avatarId}/select"
            .replaceAll("\\{" + "avatarId" + "\\}", localVarApiClient.escapeString(avatarId.toString()));

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
        return localVarApiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call selectAvatarValidateBeforeCall(String avatarId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'avatarId' is set
        if (avatarId == null) {
            throw new ApiException("Missing the required parameter 'avatarId' when calling selectAvatar(Async)");
        }
        

        okhttp3.Call localVarCall = selectAvatarCall(avatarId, _callback);
        return localVarCall;

    }

    /**
     * Select Avatar
     * Switches into that avatar.
     * @param avatarId  (required)
     * @return CurrentUser
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a single CurrentUser object. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing apiKey or auth cookie. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Error response when trying to show information about a non-existent avatar. </td><td>  -  </td></tr>
     </table>
     */
    public CurrentUser selectAvatar(String avatarId) throws ApiException {
        ApiResponse<CurrentUser> localVarResp = selectAvatarWithHttpInfo(avatarId);
        return localVarResp.getData();
    }

    /**
     * Select Avatar
     * Switches into that avatar.
     * @param avatarId  (required)
     * @return ApiResponse&lt;CurrentUser&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a single CurrentUser object. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing apiKey or auth cookie. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Error response when trying to show information about a non-existent avatar. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<CurrentUser> selectAvatarWithHttpInfo(String avatarId) throws ApiException {
        okhttp3.Call localVarCall = selectAvatarValidateBeforeCall(avatarId, null);
        Type localVarReturnType = new TypeToken<CurrentUser>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Select Avatar (asynchronously)
     * Switches into that avatar.
     * @param avatarId  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a single CurrentUser object. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing apiKey or auth cookie. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Error response when trying to show information about a non-existent avatar. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call selectAvatarAsync(String avatarId, final ApiCallback<CurrentUser> _callback) throws ApiException {

        okhttp3.Call localVarCall = selectAvatarValidateBeforeCall(avatarId, _callback);
        Type localVarReturnType = new TypeToken<CurrentUser>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for updateAvatar
     * @param avatarId  (required)
     * @param inlineObject11  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a single Avatar object. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing apiKey or auth cookie. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Error response when trying to show information about a non-existent avatar. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateAvatarCall(String avatarId, InlineObject11 inlineObject11, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = inlineObject11;

        // create path and map variables
        String localVarPath = "/avatars/{avatarId}"
            .replaceAll("\\{" + "avatarId" + "\\}", localVarApiClient.escapeString(avatarId.toString()));

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
    private okhttp3.Call updateAvatarValidateBeforeCall(String avatarId, InlineObject11 inlineObject11, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'avatarId' is set
        if (avatarId == null) {
            throw new ApiException("Missing the required parameter 'avatarId' when calling updateAvatar(Async)");
        }
        

        okhttp3.Call localVarCall = updateAvatarCall(avatarId, inlineObject11, _callback);
        return localVarCall;

    }

    /**
     * Update Avatar
     * Update information about a specific avatar.
     * @param avatarId  (required)
     * @param inlineObject11  (optional)
     * @return Avatar
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a single Avatar object. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing apiKey or auth cookie. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Error response when trying to show information about a non-existent avatar. </td><td>  -  </td></tr>
     </table>
     */
    public Avatar updateAvatar(String avatarId, InlineObject11 inlineObject11) throws ApiException {
        ApiResponse<Avatar> localVarResp = updateAvatarWithHttpInfo(avatarId, inlineObject11);
        return localVarResp.getData();
    }

    /**
     * Update Avatar
     * Update information about a specific avatar.
     * @param avatarId  (required)
     * @param inlineObject11  (optional)
     * @return ApiResponse&lt;Avatar&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a single Avatar object. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing apiKey or auth cookie. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Error response when trying to show information about a non-existent avatar. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Avatar> updateAvatarWithHttpInfo(String avatarId, InlineObject11 inlineObject11) throws ApiException {
        okhttp3.Call localVarCall = updateAvatarValidateBeforeCall(avatarId, inlineObject11, null);
        Type localVarReturnType = new TypeToken<Avatar>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Update Avatar (asynchronously)
     * Update information about a specific avatar.
     * @param avatarId  (required)
     * @param inlineObject11  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a single Avatar object. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing apiKey or auth cookie. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Error response when trying to show information about a non-existent avatar. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateAvatarAsync(String avatarId, InlineObject11 inlineObject11, final ApiCallback<Avatar> _callback) throws ApiException {

        okhttp3.Call localVarCall = updateAvatarValidateBeforeCall(avatarId, inlineObject11, _callback);
        Type localVarReturnType = new TypeToken<Avatar>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
