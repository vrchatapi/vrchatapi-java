/*
 * VRChat API Documentation
 * ![VRChat API Banner](https://vrchatapi.github.io/assets/img/api_banner_1500x400.png)  # Welcome to the VRChat API  Before we begin, we would like to state this is a **COMMUNITY DRIVEN PROJECT**. This means that everything you read on here was written by the community itself and is **not** officially supported by VRChat. The documentation is provided \"AS IS\", and any action you take towards VRChat is completely your own responsibility.  The documentation and additional libraries SHALL ONLY be used for applications interacting with VRChat's API in accordance with their [Terms of Service](https://github.com/VRChatAPI), and MUST NOT be used for modifying the client, \"avatar ripping\", or other illegal activities. Malicious usage or spamming the API may result in account termination. Certain parts of the API are also more sensitive than others, for example moderation, so please read tread extra carefully and read the warnings when present.  ![Tupper Policy on API](https://i.imgur.com/yLlW7Ok.png)  Finally, use of the API using applications other than the approved methods (website, VRChat application, Unity SDK) is not officially supported. VRChat provides no guarantee or support for external applications using the API. Access to API endpoints may break **at any time, without notice**. Therefore, please **do not ping** VRChat Staff in the VRChat Discord if you are having API problems, as they do not provide API support. We will make a best effort in keeping this documentation and associated language libraries up to date, but things might be outdated or missing. If you find that something is no longer valid, please contact us on Discord or [create an issue](https://github.com/vrchatapi/specification/issues) and tell us so we can fix it.  # Getting Started  The VRChat API can be used to programmatically retrieve or update information regarding your profile, friends, avatars, worlds and more. The API consists of two parts, \"Photon\" which is only used in-game, and the \"Web API\" which is used by both the game and the website. This documentation focuses only on the Web API.  The API is designed around the REST ideology, providing semi-simple and usually predictable URIs to access and modify objects. Requests support standard HTTP methods like GET, PUT, POST, and DELETE and standard status codes. Response bodies are always UTF-8 encoded JSON objects, unless explicitly documented otherwise.  <div class=\"callout callout-error\">   <strong>🛑 Warning! Do not touch Photon!</strong><br>   Photon is only used by the in-game client and should <b>not</b> be touched. Doing so may result in permanent account termination. </div>  <div class=\"callout callout-info\">   <strong>ℹ️ API Key and Authentication</strong><br>   The API Key has always been the same and is currently <code>JlE5Jldo5Jibnk5O5hTx6XVqsJu4WJ26</code>.   Read <a href=\"#tag--authentication\">Authentication</a> for how to log in. </div>  # Using the API  For simply exploring what the API can do it is strongly recommended to download [Insomnia](https://insomnia.rest/download), a free and open-source API client that's great for sending requests to the API in an orderly fashion. Insomnia allows you to send data in the format that's required for VRChat's API. It is also possible to try out the API in your browser, by first logging in at [vrchat.com/home](https://vrchat.com/home/) and then going to [vrchat.com/api/1/auth/user](https://vrchat.com/api/1/auth/user), but the information will be much harder to work with.  For more permanent operation such as software development it is instead recommended to use one of the existing language SDKs. This community project maintains API libraries in several languages, which allows you to interact with the API with simple function calls rather than having to implement the HTTP protocol yourself. Most of these libraries are automatically generated from the API specification, sometimes with additional helpful wrapper code to make usage easier. This allows them to be almost automatically updated and expanded upon as soon as a new feature is introduced in the specification itself. The libraries can be found on [GitHub](https://github.com/vrchatapi) or following:  * [NodeJS (JavaScript)](https://www.npmjs.com/package/vrchat) * [Dart](https://pub.dev/packages/vrchat_dart) * [Rust](https://crates.io/crates/vrchatapi) * [C#](github.com/vrchatapi/vrchatapi-csharp) * [Python](https://github.com/vrchatapi/VRChatPython)  # Pagination  Most endpoints enforce pagination, meaning they will only return 10 entries by default, and never more than 100.<br> Using both the limit and offset parameters allows you to easily paginate through a large number of objects.  | Query Parameter | Type | Description | | ----------|--|------- | | `limit` | integer  | The number of objects to return. This value often defaults to 10. Highest limit is always 100.| | `offset` | integer  | A zero-based offset from the default object sorting.|  If a request returns fewer objects than the `limit` parameter, there are no more items available to return.  # Contribution  Do you want to get involved in the documentation effort? Do you want to help improve one of the language API libraries? This project is an [OPEN Open Source Project](https://openopensource.org)! This means that individuals making significant and valuable contributions are given commit-access to the project. It also means we are very open and welcoming of new people making contributions, unlike some more guarded open-source projects.  [![Discord](https://img.shields.io/static/v1?label=vrchatapi&message=discord&color=blueviolet&style=for-the-badge)](https://discord.gg/qjZE9C9fkB)
 *
 * The version of the OpenAPI document: 1.0.2
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


import io.github.vrchatapi.model.Error;
import io.github.vrchatapi.model.Favorite;
import io.github.vrchatapi.model.FavoriteGroup;
import io.github.vrchatapi.model.InlineObject8;
import io.github.vrchatapi.model.InlineObject9;
import io.github.vrchatapi.model.InlineResponse401;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FavoritesApi {
    private ApiClient localVarApiClient;

    public FavoritesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public FavoritesApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for addFavorite
     * @param inlineObject8  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a single Favorite object. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Error response when trying favorite someone or something when already having it/them favorited. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Error response when trying favorite someone whom you are not friends with. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call addFavoriteCall(InlineObject8 inlineObject8, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = inlineObject8;

        // create path and map variables
        String localVarPath = "/favorites";

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
    private okhttp3.Call addFavoriteValidateBeforeCall(InlineObject8 inlineObject8, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = addFavoriteCall(inlineObject8, _callback);
        return localVarCall;

    }

    /**
     * Add Favorite
     * Add a new favorite.  Friend groups are named &#x60;group_0&#x60; through &#x60;group_3&#x60;. Avatar and World groups are named &#x60;avatars1&#x60; to &#x60;avatar4&#x60; and &#x60;worlds1&#x60; to &#x60;worlds4&#x60;.  You cannot add people whom you are not friends with to your friends list. Destroying a friendship removes the person as favorite on both sides.
     * @param inlineObject8  (optional)
     * @return Favorite
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a single Favorite object. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Error response when trying favorite someone or something when already having it/them favorited. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Error response when trying favorite someone whom you are not friends with. </td><td>  -  </td></tr>
     </table>
     */
    public Favorite addFavorite(InlineObject8 inlineObject8) throws ApiException {
        ApiResponse<Favorite> localVarResp = addFavoriteWithHttpInfo(inlineObject8);
        return localVarResp.getData();
    }

    /**
     * Add Favorite
     * Add a new favorite.  Friend groups are named &#x60;group_0&#x60; through &#x60;group_3&#x60;. Avatar and World groups are named &#x60;avatars1&#x60; to &#x60;avatar4&#x60; and &#x60;worlds1&#x60; to &#x60;worlds4&#x60;.  You cannot add people whom you are not friends with to your friends list. Destroying a friendship removes the person as favorite on both sides.
     * @param inlineObject8  (optional)
     * @return ApiResponse&lt;Favorite&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a single Favorite object. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Error response when trying favorite someone or something when already having it/them favorited. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Error response when trying favorite someone whom you are not friends with. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Favorite> addFavoriteWithHttpInfo(InlineObject8 inlineObject8) throws ApiException {
        okhttp3.Call localVarCall = addFavoriteValidateBeforeCall(inlineObject8, null);
        Type localVarReturnType = new TypeToken<Favorite>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Add Favorite (asynchronously)
     * Add a new favorite.  Friend groups are named &#x60;group_0&#x60; through &#x60;group_3&#x60;. Avatar and World groups are named &#x60;avatars1&#x60; to &#x60;avatar4&#x60; and &#x60;worlds1&#x60; to &#x60;worlds4&#x60;.  You cannot add people whom you are not friends with to your friends list. Destroying a friendship removes the person as favorite on both sides.
     * @param inlineObject8  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a single Favorite object. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Error response when trying favorite someone or something when already having it/them favorited. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Error response when trying favorite someone whom you are not friends with. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call addFavoriteAsync(InlineObject8 inlineObject8, final ApiCallback<Favorite> _callback) throws ApiException {

        okhttp3.Call localVarCall = addFavoriteValidateBeforeCall(inlineObject8, _callback);
        Type localVarReturnType = new TypeToken<Favorite>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for clearFavoriteGroup
     * @param favoriteGroupType The type of group to fetch, must be a valid FavoriteType. (required)
     * @param favoriteGroupName  (required)
     * @param userId  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success response after clearing a favorite group. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call clearFavoriteGroupCall(String favoriteGroupType, String favoriteGroupName, String userId, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/favorite/group/{favoriteGroupType}/{favoriteGroupName}/{userId}"
            .replaceAll("\\{" + "favoriteGroupType" + "\\}", localVarApiClient.escapeString(favoriteGroupType.toString()))
            .replaceAll("\\{" + "favoriteGroupName" + "\\}", localVarApiClient.escapeString(favoriteGroupName.toString()))
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
        return localVarApiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call clearFavoriteGroupValidateBeforeCall(String favoriteGroupType, String favoriteGroupName, String userId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'favoriteGroupType' is set
        if (favoriteGroupType == null) {
            throw new ApiException("Missing the required parameter 'favoriteGroupType' when calling clearFavoriteGroup(Async)");
        }
        
        // verify the required parameter 'favoriteGroupName' is set
        if (favoriteGroupName == null) {
            throw new ApiException("Missing the required parameter 'favoriteGroupName' when calling clearFavoriteGroup(Async)");
        }
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new ApiException("Missing the required parameter 'userId' when calling clearFavoriteGroup(Async)");
        }
        

        okhttp3.Call localVarCall = clearFavoriteGroupCall(favoriteGroupType, favoriteGroupName, userId, _callback);
        return localVarCall;

    }

    /**
     * Clear Favorite Group
     * Clear ALL contents of a specific favorite group.
     * @param favoriteGroupType The type of group to fetch, must be a valid FavoriteType. (required)
     * @param favoriteGroupName  (required)
     * @param userId  (required)
     * @return Error
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success response after clearing a favorite group. </td><td>  -  </td></tr>
     </table>
     */
    public Error clearFavoriteGroup(String favoriteGroupType, String favoriteGroupName, String userId) throws ApiException {
        ApiResponse<Error> localVarResp = clearFavoriteGroupWithHttpInfo(favoriteGroupType, favoriteGroupName, userId);
        return localVarResp.getData();
    }

    /**
     * Clear Favorite Group
     * Clear ALL contents of a specific favorite group.
     * @param favoriteGroupType The type of group to fetch, must be a valid FavoriteType. (required)
     * @param favoriteGroupName  (required)
     * @param userId  (required)
     * @return ApiResponse&lt;Error&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success response after clearing a favorite group. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Error> clearFavoriteGroupWithHttpInfo(String favoriteGroupType, String favoriteGroupName, String userId) throws ApiException {
        okhttp3.Call localVarCall = clearFavoriteGroupValidateBeforeCall(favoriteGroupType, favoriteGroupName, userId, null);
        Type localVarReturnType = new TypeToken<Error>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Clear Favorite Group (asynchronously)
     * Clear ALL contents of a specific favorite group.
     * @param favoriteGroupType The type of group to fetch, must be a valid FavoriteType. (required)
     * @param favoriteGroupName  (required)
     * @param userId  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success response after clearing a favorite group. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call clearFavoriteGroupAsync(String favoriteGroupType, String favoriteGroupName, String userId, final ApiCallback<Error> _callback) throws ApiException {

        okhttp3.Call localVarCall = clearFavoriteGroupValidateBeforeCall(favoriteGroupType, favoriteGroupName, userId, _callback);
        Type localVarReturnType = new TypeToken<Error>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getFavorite
     * @param favoriteId  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a single Favorite object. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing apiKey or auth cookie. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Error response when trying to show information about a non-existent favorite. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getFavoriteCall(String favoriteId, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/favorites/{favoriteId}"
            .replaceAll("\\{" + "favoriteId" + "\\}", localVarApiClient.escapeString(favoriteId.toString()));

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
    private okhttp3.Call getFavoriteValidateBeforeCall(String favoriteId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'favoriteId' is set
        if (favoriteId == null) {
            throw new ApiException("Missing the required parameter 'favoriteId' when calling getFavorite(Async)");
        }
        

        okhttp3.Call localVarCall = getFavoriteCall(favoriteId, _callback);
        return localVarCall;

    }

    /**
     * Show Favorite
     * Return information about a specific Favorite.
     * @param favoriteId  (required)
     * @return Favorite
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a single Favorite object. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing apiKey or auth cookie. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Error response when trying to show information about a non-existent favorite. </td><td>  -  </td></tr>
     </table>
     */
    public Favorite getFavorite(String favoriteId) throws ApiException {
        ApiResponse<Favorite> localVarResp = getFavoriteWithHttpInfo(favoriteId);
        return localVarResp.getData();
    }

    /**
     * Show Favorite
     * Return information about a specific Favorite.
     * @param favoriteId  (required)
     * @return ApiResponse&lt;Favorite&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a single Favorite object. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing apiKey or auth cookie. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Error response when trying to show information about a non-existent favorite. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Favorite> getFavoriteWithHttpInfo(String favoriteId) throws ApiException {
        okhttp3.Call localVarCall = getFavoriteValidateBeforeCall(favoriteId, null);
        Type localVarReturnType = new TypeToken<Favorite>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Show Favorite (asynchronously)
     * Return information about a specific Favorite.
     * @param favoriteId  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a single Favorite object. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing apiKey or auth cookie. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Error response when trying to show information about a non-existent favorite. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getFavoriteAsync(String favoriteId, final ApiCallback<Favorite> _callback) throws ApiException {

        okhttp3.Call localVarCall = getFavoriteValidateBeforeCall(favoriteId, _callback);
        Type localVarReturnType = new TypeToken<Favorite>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getFavoriteGroup
     * @param favoriteGroupType The type of group to fetch, must be a valid FavoriteType. (required)
     * @param favoriteGroupName  (required)
     * @param userId  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a single FavoriteGroup object. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getFavoriteGroupCall(String favoriteGroupType, String favoriteGroupName, String userId, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/favorite/group/{favoriteGroupType}/{favoriteGroupName}/{userId}"
            .replaceAll("\\{" + "favoriteGroupType" + "\\}", localVarApiClient.escapeString(favoriteGroupType.toString()))
            .replaceAll("\\{" + "favoriteGroupName" + "\\}", localVarApiClient.escapeString(favoriteGroupName.toString()))
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
    private okhttp3.Call getFavoriteGroupValidateBeforeCall(String favoriteGroupType, String favoriteGroupName, String userId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'favoriteGroupType' is set
        if (favoriteGroupType == null) {
            throw new ApiException("Missing the required parameter 'favoriteGroupType' when calling getFavoriteGroup(Async)");
        }
        
        // verify the required parameter 'favoriteGroupName' is set
        if (favoriteGroupName == null) {
            throw new ApiException("Missing the required parameter 'favoriteGroupName' when calling getFavoriteGroup(Async)");
        }
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new ApiException("Missing the required parameter 'userId' when calling getFavoriteGroup(Async)");
        }
        

        okhttp3.Call localVarCall = getFavoriteGroupCall(favoriteGroupType, favoriteGroupName, userId, _callback);
        return localVarCall;

    }

    /**
     * Show Favorite Group
     * Fetch information about a specific favorite group.
     * @param favoriteGroupType The type of group to fetch, must be a valid FavoriteType. (required)
     * @param favoriteGroupName  (required)
     * @param userId  (required)
     * @return FavoriteGroup
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a single FavoriteGroup object. </td><td>  -  </td></tr>
     </table>
     */
    public FavoriteGroup getFavoriteGroup(String favoriteGroupType, String favoriteGroupName, String userId) throws ApiException {
        ApiResponse<FavoriteGroup> localVarResp = getFavoriteGroupWithHttpInfo(favoriteGroupType, favoriteGroupName, userId);
        return localVarResp.getData();
    }

    /**
     * Show Favorite Group
     * Fetch information about a specific favorite group.
     * @param favoriteGroupType The type of group to fetch, must be a valid FavoriteType. (required)
     * @param favoriteGroupName  (required)
     * @param userId  (required)
     * @return ApiResponse&lt;FavoriteGroup&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a single FavoriteGroup object. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<FavoriteGroup> getFavoriteGroupWithHttpInfo(String favoriteGroupType, String favoriteGroupName, String userId) throws ApiException {
        okhttp3.Call localVarCall = getFavoriteGroupValidateBeforeCall(favoriteGroupType, favoriteGroupName, userId, null);
        Type localVarReturnType = new TypeToken<FavoriteGroup>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Show Favorite Group (asynchronously)
     * Fetch information about a specific favorite group.
     * @param favoriteGroupType The type of group to fetch, must be a valid FavoriteType. (required)
     * @param favoriteGroupName  (required)
     * @param userId  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a single FavoriteGroup object. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getFavoriteGroupAsync(String favoriteGroupType, String favoriteGroupName, String userId, final ApiCallback<FavoriteGroup> _callback) throws ApiException {

        okhttp3.Call localVarCall = getFavoriteGroupValidateBeforeCall(favoriteGroupType, favoriteGroupName, userId, _callback);
        Type localVarReturnType = new TypeToken<FavoriteGroup>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getFavoriteGroups
     * @param n The number of objects to return. (optional, default to 60)
     * @param offset A zero-based offset from the default object sorting from where search results start. (optional)
     * @param ownerId The owner of whoms favorite groups to return. Must be a UserID. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a list of FavoriteGroup objects. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing apiKey or auth cookie. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getFavoriteGroupsCall(Integer n, Integer offset, String ownerId, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/favorite/groups";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (n != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("n", n));
        }

        if (offset != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("offset", offset));
        }

        if (ownerId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("ownerId", ownerId));
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
    private okhttp3.Call getFavoriteGroupsValidateBeforeCall(Integer n, Integer offset, String ownerId, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = getFavoriteGroupsCall(n, offset, ownerId, _callback);
        return localVarCall;

    }

    /**
     * List Favorite Groups
     * Return a list of favorite groups owned by a user. Returns the same information as &#x60;getFavoriteGroups&#x60;.
     * @param n The number of objects to return. (optional, default to 60)
     * @param offset A zero-based offset from the default object sorting from where search results start. (optional)
     * @param ownerId The owner of whoms favorite groups to return. Must be a UserID. (optional)
     * @return List&lt;FavoriteGroup&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a list of FavoriteGroup objects. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing apiKey or auth cookie. </td><td>  -  </td></tr>
     </table>
     */
    public List<FavoriteGroup> getFavoriteGroups(Integer n, Integer offset, String ownerId) throws ApiException {
        ApiResponse<List<FavoriteGroup>> localVarResp = getFavoriteGroupsWithHttpInfo(n, offset, ownerId);
        return localVarResp.getData();
    }

    /**
     * List Favorite Groups
     * Return a list of favorite groups owned by a user. Returns the same information as &#x60;getFavoriteGroups&#x60;.
     * @param n The number of objects to return. (optional, default to 60)
     * @param offset A zero-based offset from the default object sorting from where search results start. (optional)
     * @param ownerId The owner of whoms favorite groups to return. Must be a UserID. (optional)
     * @return ApiResponse&lt;List&lt;FavoriteGroup&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a list of FavoriteGroup objects. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing apiKey or auth cookie. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<FavoriteGroup>> getFavoriteGroupsWithHttpInfo(Integer n, Integer offset, String ownerId) throws ApiException {
        okhttp3.Call localVarCall = getFavoriteGroupsValidateBeforeCall(n, offset, ownerId, null);
        Type localVarReturnType = new TypeToken<List<FavoriteGroup>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * List Favorite Groups (asynchronously)
     * Return a list of favorite groups owned by a user. Returns the same information as &#x60;getFavoriteGroups&#x60;.
     * @param n The number of objects to return. (optional, default to 60)
     * @param offset A zero-based offset from the default object sorting from where search results start. (optional)
     * @param ownerId The owner of whoms favorite groups to return. Must be a UserID. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a list of FavoriteGroup objects. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing apiKey or auth cookie. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getFavoriteGroupsAsync(Integer n, Integer offset, String ownerId, final ApiCallback<List<FavoriteGroup>> _callback) throws ApiException {

        okhttp3.Call localVarCall = getFavoriteGroupsValidateBeforeCall(n, offset, ownerId, _callback);
        Type localVarReturnType = new TypeToken<List<FavoriteGroup>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getFavorites
     * @param n The number of objects to return. (optional, default to 60)
     * @param offset A zero-based offset from the default object sorting from where search results start. (optional)
     * @param type The type of favorites to return, FavoriteType. (optional)
     * @param tag Tags to include (comma-separated). (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a list of Favorite objects. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing apiKey or auth cookie. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getFavoritesCall(Integer n, Integer offset, String type, String tag, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/favorites";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (n != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("n", n));
        }

        if (offset != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("offset", offset));
        }

        if (type != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("type", type));
        }

        if (tag != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("tag", tag));
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
    private okhttp3.Call getFavoritesValidateBeforeCall(Integer n, Integer offset, String type, String tag, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = getFavoritesCall(n, offset, type, tag, _callback);
        return localVarCall;

    }

    /**
     * List Favorites
     * Returns a list of favorites.
     * @param n The number of objects to return. (optional, default to 60)
     * @param offset A zero-based offset from the default object sorting from where search results start. (optional)
     * @param type The type of favorites to return, FavoriteType. (optional)
     * @param tag Tags to include (comma-separated). (optional)
     * @return List&lt;Favorite&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a list of Favorite objects. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing apiKey or auth cookie. </td><td>  -  </td></tr>
     </table>
     */
    public List<Favorite> getFavorites(Integer n, Integer offset, String type, String tag) throws ApiException {
        ApiResponse<List<Favorite>> localVarResp = getFavoritesWithHttpInfo(n, offset, type, tag);
        return localVarResp.getData();
    }

    /**
     * List Favorites
     * Returns a list of favorites.
     * @param n The number of objects to return. (optional, default to 60)
     * @param offset A zero-based offset from the default object sorting from where search results start. (optional)
     * @param type The type of favorites to return, FavoriteType. (optional)
     * @param tag Tags to include (comma-separated). (optional)
     * @return ApiResponse&lt;List&lt;Favorite&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a list of Favorite objects. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing apiKey or auth cookie. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<Favorite>> getFavoritesWithHttpInfo(Integer n, Integer offset, String type, String tag) throws ApiException {
        okhttp3.Call localVarCall = getFavoritesValidateBeforeCall(n, offset, type, tag, null);
        Type localVarReturnType = new TypeToken<List<Favorite>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * List Favorites (asynchronously)
     * Returns a list of favorites.
     * @param n The number of objects to return. (optional, default to 60)
     * @param offset A zero-based offset from the default object sorting from where search results start. (optional)
     * @param type The type of favorites to return, FavoriteType. (optional)
     * @param tag Tags to include (comma-separated). (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a list of Favorite objects. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing apiKey or auth cookie. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getFavoritesAsync(Integer n, Integer offset, String type, String tag, final ApiCallback<List<Favorite>> _callback) throws ApiException {

        okhttp3.Call localVarCall = getFavoritesValidateBeforeCall(n, offset, type, tag, _callback);
        Type localVarReturnType = new TypeToken<List<Favorite>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for removeFavorite
     * @param favoriteId  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success response after removing a favorite. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing apiKey or auth cookie. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Error response when trying to show information about a non-existent favorite. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call removeFavoriteCall(String favoriteId, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/favorites/{favoriteId}"
            .replaceAll("\\{" + "favoriteId" + "\\}", localVarApiClient.escapeString(favoriteId.toString()));

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
    private okhttp3.Call removeFavoriteValidateBeforeCall(String favoriteId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'favoriteId' is set
        if (favoriteId == null) {
            throw new ApiException("Missing the required parameter 'favoriteId' when calling removeFavorite(Async)");
        }
        

        okhttp3.Call localVarCall = removeFavoriteCall(favoriteId, _callback);
        return localVarCall;

    }

    /**
     * Remove Favorite
     * Remove a favorite from your favorites list.
     * @param favoriteId  (required)
     * @return Error
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success response after removing a favorite. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing apiKey or auth cookie. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Error response when trying to show information about a non-existent favorite. </td><td>  -  </td></tr>
     </table>
     */
    public Error removeFavorite(String favoriteId) throws ApiException {
        ApiResponse<Error> localVarResp = removeFavoriteWithHttpInfo(favoriteId);
        return localVarResp.getData();
    }

    /**
     * Remove Favorite
     * Remove a favorite from your favorites list.
     * @param favoriteId  (required)
     * @return ApiResponse&lt;Error&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success response after removing a favorite. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing apiKey or auth cookie. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Error response when trying to show information about a non-existent favorite. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Error> removeFavoriteWithHttpInfo(String favoriteId) throws ApiException {
        okhttp3.Call localVarCall = removeFavoriteValidateBeforeCall(favoriteId, null);
        Type localVarReturnType = new TypeToken<Error>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Remove Favorite (asynchronously)
     * Remove a favorite from your favorites list.
     * @param favoriteId  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success response after removing a favorite. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing apiKey or auth cookie. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Error response when trying to show information about a non-existent favorite. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call removeFavoriteAsync(String favoriteId, final ApiCallback<Error> _callback) throws ApiException {

        okhttp3.Call localVarCall = removeFavoriteValidateBeforeCall(favoriteId, _callback);
        Type localVarReturnType = new TypeToken<Error>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for updateFavoriteGroup
     * @param favoriteGroupType The type of group to fetch, must be a valid FavoriteType. (required)
     * @param favoriteGroupName  (required)
     * @param userId  (required)
     * @param inlineObject9  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateFavoriteGroupCall(String favoriteGroupType, String favoriteGroupName, String userId, InlineObject9 inlineObject9, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = inlineObject9;

        // create path and map variables
        String localVarPath = "/favorite/group/{favoriteGroupType}/{favoriteGroupName}/{userId}"
            .replaceAll("\\{" + "favoriteGroupType" + "\\}", localVarApiClient.escapeString(favoriteGroupType.toString()))
            .replaceAll("\\{" + "favoriteGroupName" + "\\}", localVarApiClient.escapeString(favoriteGroupName.toString()))
            .replaceAll("\\{" + "userId" + "\\}", localVarApiClient.escapeString(userId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            
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
    private okhttp3.Call updateFavoriteGroupValidateBeforeCall(String favoriteGroupType, String favoriteGroupName, String userId, InlineObject9 inlineObject9, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'favoriteGroupType' is set
        if (favoriteGroupType == null) {
            throw new ApiException("Missing the required parameter 'favoriteGroupType' when calling updateFavoriteGroup(Async)");
        }
        
        // verify the required parameter 'favoriteGroupName' is set
        if (favoriteGroupName == null) {
            throw new ApiException("Missing the required parameter 'favoriteGroupName' when calling updateFavoriteGroup(Async)");
        }
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new ApiException("Missing the required parameter 'userId' when calling updateFavoriteGroup(Async)");
        }
        

        okhttp3.Call localVarCall = updateFavoriteGroupCall(favoriteGroupType, favoriteGroupName, userId, inlineObject9, _callback);
        return localVarCall;

    }

    /**
     * Update Favorite Group
     * Update information about a specific favorite group.
     * @param favoriteGroupType The type of group to fetch, must be a valid FavoriteType. (required)
     * @param favoriteGroupName  (required)
     * @param userId  (required)
     * @param inlineObject9  (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public void updateFavoriteGroup(String favoriteGroupType, String favoriteGroupName, String userId, InlineObject9 inlineObject9) throws ApiException {
        updateFavoriteGroupWithHttpInfo(favoriteGroupType, favoriteGroupName, userId, inlineObject9);
    }

    /**
     * Update Favorite Group
     * Update information about a specific favorite group.
     * @param favoriteGroupType The type of group to fetch, must be a valid FavoriteType. (required)
     * @param favoriteGroupName  (required)
     * @param userId  (required)
     * @param inlineObject9  (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> updateFavoriteGroupWithHttpInfo(String favoriteGroupType, String favoriteGroupName, String userId, InlineObject9 inlineObject9) throws ApiException {
        okhttp3.Call localVarCall = updateFavoriteGroupValidateBeforeCall(favoriteGroupType, favoriteGroupName, userId, inlineObject9, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Update Favorite Group (asynchronously)
     * Update information about a specific favorite group.
     * @param favoriteGroupType The type of group to fetch, must be a valid FavoriteType. (required)
     * @param favoriteGroupName  (required)
     * @param userId  (required)
     * @param inlineObject9  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateFavoriteGroupAsync(String favoriteGroupType, String favoriteGroupName, String userId, InlineObject9 inlineObject9, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = updateFavoriteGroupValidateBeforeCall(favoriteGroupType, favoriteGroupName, userId, inlineObject9, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
}
