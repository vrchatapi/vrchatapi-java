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
import io.github.vrchatapi.model.InlineObject12;
import io.github.vrchatapi.model.InlineObject13;
import io.github.vrchatapi.model.InlineResponse401;
import io.github.vrchatapi.model.PlayerModeration;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PlayermoderationApi {
    private ApiClient localVarApiClient;

    public PlayermoderationApi() {
        this(Configuration.getDefaultApiClient());
    }

    public PlayermoderationApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for clearAllPlayerModerations
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success response after e.g. clearing all player moderations. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing apiKey or auth cookie. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call clearAllPlayerModerationsCall(final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/auth/user/playermoderations";

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
    private okhttp3.Call clearAllPlayerModerationsValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = clearAllPlayerModerationsCall(_callback);
        return localVarCall;

    }

    /**
     * Clear All Player Moderations
     * ⚠️ **This will delete every single player moderation you&#39;ve ever made.**
     * @return Error
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success response after e.g. clearing all player moderations. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing apiKey or auth cookie. </td><td>  -  </td></tr>
     </table>
     */
    public Error clearAllPlayerModerations() throws ApiException {
        ApiResponse<Error> localVarResp = clearAllPlayerModerationsWithHttpInfo();
        return localVarResp.getData();
    }

    /**
     * Clear All Player Moderations
     * ⚠️ **This will delete every single player moderation you&#39;ve ever made.**
     * @return ApiResponse&lt;Error&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success response after e.g. clearing all player moderations. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing apiKey or auth cookie. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Error> clearAllPlayerModerationsWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = clearAllPlayerModerationsValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<Error>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Clear All Player Moderations (asynchronously)
     * ⚠️ **This will delete every single player moderation you&#39;ve ever made.**
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success response after e.g. clearing all player moderations. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing apiKey or auth cookie. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call clearAllPlayerModerationsAsync(final ApiCallback<Error> _callback) throws ApiException {

        okhttp3.Call localVarCall = clearAllPlayerModerationsValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<Error>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for deletePlayerModeration
     * @param playerModerationId  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success response after removing a PlayerModeration by ID. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing apiKey or auth cookie. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Error response when trying to delete someone else&#39;s player moderation. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deletePlayerModerationCall(String playerModerationId, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/auth/user/playermoderations/{playerModerationId}"
            .replaceAll("\\{" + "playerModerationId" + "\\}", localVarApiClient.escapeString(playerModerationId.toString()));

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
    private okhttp3.Call deletePlayerModerationValidateBeforeCall(String playerModerationId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'playerModerationId' is set
        if (playerModerationId == null) {
            throw new ApiException("Missing the required parameter 'playerModerationId' when calling deletePlayerModeration(Async)");
        }
        

        okhttp3.Call localVarCall = deletePlayerModerationCall(playerModerationId, _callback);
        return localVarCall;

    }

    /**
     * Delete Player Moderation
     * Deletes a specific player moderation based on it&#39;s &#x60;pmod_&#x60; ID. The website uses &#x60;unmoderateUser&#x60; instead. You can delete the same player moderation multiple times successfully.
     * @param playerModerationId  (required)
     * @return Error
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success response after removing a PlayerModeration by ID. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing apiKey or auth cookie. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Error response when trying to delete someone else&#39;s player moderation. </td><td>  -  </td></tr>
     </table>
     */
    public Error deletePlayerModeration(String playerModerationId) throws ApiException {
        ApiResponse<Error> localVarResp = deletePlayerModerationWithHttpInfo(playerModerationId);
        return localVarResp.getData();
    }

    /**
     * Delete Player Moderation
     * Deletes a specific player moderation based on it&#39;s &#x60;pmod_&#x60; ID. The website uses &#x60;unmoderateUser&#x60; instead. You can delete the same player moderation multiple times successfully.
     * @param playerModerationId  (required)
     * @return ApiResponse&lt;Error&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success response after removing a PlayerModeration by ID. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing apiKey or auth cookie. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Error response when trying to delete someone else&#39;s player moderation. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Error> deletePlayerModerationWithHttpInfo(String playerModerationId) throws ApiException {
        okhttp3.Call localVarCall = deletePlayerModerationValidateBeforeCall(playerModerationId, null);
        Type localVarReturnType = new TypeToken<Error>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Delete Player Moderation (asynchronously)
     * Deletes a specific player moderation based on it&#39;s &#x60;pmod_&#x60; ID. The website uses &#x60;unmoderateUser&#x60; instead. You can delete the same player moderation multiple times successfully.
     * @param playerModerationId  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success response after removing a PlayerModeration by ID. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing apiKey or auth cookie. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Error response when trying to delete someone else&#39;s player moderation. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deletePlayerModerationAsync(String playerModerationId, final ApiCallback<Error> _callback) throws ApiException {

        okhttp3.Call localVarCall = deletePlayerModerationValidateBeforeCall(playerModerationId, _callback);
        Type localVarReturnType = new TypeToken<Error>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getPlayerModeration
     * @param playerModerationId  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a single PlayerModeration object. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing apiKey or auth cookie. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Error response when trying to show information about a non-existent player moderation. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getPlayerModerationCall(String playerModerationId, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/auth/user/playermoderations/{playerModerationId}"
            .replaceAll("\\{" + "playerModerationId" + "\\}", localVarApiClient.escapeString(playerModerationId.toString()));

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
    private okhttp3.Call getPlayerModerationValidateBeforeCall(String playerModerationId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'playerModerationId' is set
        if (playerModerationId == null) {
            throw new ApiException("Missing the required parameter 'playerModerationId' when calling getPlayerModeration(Async)");
        }
        

        okhttp3.Call localVarCall = getPlayerModerationCall(playerModerationId, _callback);
        return localVarCall;

    }

    /**
     * Get Player Moderation
     * Returns a single Player Moderation. This returns the exact same amount of information as the more generalised &#x60;getPlayerModerations&#x60;.
     * @param playerModerationId  (required)
     * @return PlayerModeration
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a single PlayerModeration object. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing apiKey or auth cookie. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Error response when trying to show information about a non-existent player moderation. </td><td>  -  </td></tr>
     </table>
     */
    public PlayerModeration getPlayerModeration(String playerModerationId) throws ApiException {
        ApiResponse<PlayerModeration> localVarResp = getPlayerModerationWithHttpInfo(playerModerationId);
        return localVarResp.getData();
    }

    /**
     * Get Player Moderation
     * Returns a single Player Moderation. This returns the exact same amount of information as the more generalised &#x60;getPlayerModerations&#x60;.
     * @param playerModerationId  (required)
     * @return ApiResponse&lt;PlayerModeration&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a single PlayerModeration object. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing apiKey or auth cookie. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Error response when trying to show information about a non-existent player moderation. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<PlayerModeration> getPlayerModerationWithHttpInfo(String playerModerationId) throws ApiException {
        okhttp3.Call localVarCall = getPlayerModerationValidateBeforeCall(playerModerationId, null);
        Type localVarReturnType = new TypeToken<PlayerModeration>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get Player Moderation (asynchronously)
     * Returns a single Player Moderation. This returns the exact same amount of information as the more generalised &#x60;getPlayerModerations&#x60;.
     * @param playerModerationId  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a single PlayerModeration object. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing apiKey or auth cookie. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Error response when trying to show information about a non-existent player moderation. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getPlayerModerationAsync(String playerModerationId, final ApiCallback<PlayerModeration> _callback) throws ApiException {

        okhttp3.Call localVarCall = getPlayerModerationValidateBeforeCall(playerModerationId, _callback);
        Type localVarReturnType = new TypeToken<PlayerModeration>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getPlayerModerations
     * @param type Must be one of PlayerModerationType, except unblock. Unblocking simply removes a block. (optional)
     * @param targetUserId Must be valid UserID. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a list of PlayerModeration objects. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing apiKey or auth cookie. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getPlayerModerationsCall(String type, String targetUserId, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/auth/user/playermoderations";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (type != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("type", type));
        }

        if (targetUserId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("targetUserId", targetUserId));
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
    private okhttp3.Call getPlayerModerationsValidateBeforeCall(String type, String targetUserId, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = getPlayerModerationsCall(type, targetUserId, _callback);
        return localVarCall;

    }

    /**
     * Search Player Moderations
     * Returns a list of all player moderations made by **you**.  This endpoint does not have pagination, and will return *all* results. Use query parameters to limit your query if needed.
     * @param type Must be one of PlayerModerationType, except unblock. Unblocking simply removes a block. (optional)
     * @param targetUserId Must be valid UserID. (optional)
     * @return List&lt;PlayerModeration&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a list of PlayerModeration objects. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing apiKey or auth cookie. </td><td>  -  </td></tr>
     </table>
     */
    public List<PlayerModeration> getPlayerModerations(String type, String targetUserId) throws ApiException {
        ApiResponse<List<PlayerModeration>> localVarResp = getPlayerModerationsWithHttpInfo(type, targetUserId);
        return localVarResp.getData();
    }

    /**
     * Search Player Moderations
     * Returns a list of all player moderations made by **you**.  This endpoint does not have pagination, and will return *all* results. Use query parameters to limit your query if needed.
     * @param type Must be one of PlayerModerationType, except unblock. Unblocking simply removes a block. (optional)
     * @param targetUserId Must be valid UserID. (optional)
     * @return ApiResponse&lt;List&lt;PlayerModeration&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a list of PlayerModeration objects. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing apiKey or auth cookie. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<PlayerModeration>> getPlayerModerationsWithHttpInfo(String type, String targetUserId) throws ApiException {
        okhttp3.Call localVarCall = getPlayerModerationsValidateBeforeCall(type, targetUserId, null);
        Type localVarReturnType = new TypeToken<List<PlayerModeration>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Search Player Moderations (asynchronously)
     * Returns a list of all player moderations made by **you**.  This endpoint does not have pagination, and will return *all* results. Use query parameters to limit your query if needed.
     * @param type Must be one of PlayerModerationType, except unblock. Unblocking simply removes a block. (optional)
     * @param targetUserId Must be valid UserID. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a list of PlayerModeration objects. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing apiKey or auth cookie. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getPlayerModerationsAsync(String type, String targetUserId, final ApiCallback<List<PlayerModeration>> _callback) throws ApiException {

        okhttp3.Call localVarCall = getPlayerModerationsValidateBeforeCall(type, targetUserId, _callback);
        Type localVarReturnType = new TypeToken<List<PlayerModeration>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for moderateUser
     * @param inlineObject12  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a single PlayerModeration object. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing apiKey or auth cookie. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call moderateUserCall(InlineObject12 inlineObject12, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = inlineObject12;

        // create path and map variables
        String localVarPath = "/auth/user/playermoderations";

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
    private okhttp3.Call moderateUserValidateBeforeCall(InlineObject12 inlineObject12, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = moderateUserCall(inlineObject12, _callback);
        return localVarCall;

    }

    /**
     * Moderate User
     * Moderate a user, e.g. unmute them or show their avatar.
     * @param inlineObject12  (optional)
     * @return PlayerModeration
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a single PlayerModeration object. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing apiKey or auth cookie. </td><td>  -  </td></tr>
     </table>
     */
    public PlayerModeration moderateUser(InlineObject12 inlineObject12) throws ApiException {
        ApiResponse<PlayerModeration> localVarResp = moderateUserWithHttpInfo(inlineObject12);
        return localVarResp.getData();
    }

    /**
     * Moderate User
     * Moderate a user, e.g. unmute them or show their avatar.
     * @param inlineObject12  (optional)
     * @return ApiResponse&lt;PlayerModeration&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a single PlayerModeration object. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing apiKey or auth cookie. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<PlayerModeration> moderateUserWithHttpInfo(InlineObject12 inlineObject12) throws ApiException {
        okhttp3.Call localVarCall = moderateUserValidateBeforeCall(inlineObject12, null);
        Type localVarReturnType = new TypeToken<PlayerModeration>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Moderate User (asynchronously)
     * Moderate a user, e.g. unmute them or show their avatar.
     * @param inlineObject12  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a single PlayerModeration object. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing apiKey or auth cookie. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call moderateUserAsync(InlineObject12 inlineObject12, final ApiCallback<PlayerModeration> _callback) throws ApiException {

        okhttp3.Call localVarCall = moderateUserValidateBeforeCall(inlineObject12, _callback);
        Type localVarReturnType = new TypeToken<PlayerModeration>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for unmoderateUser
     * @param inlineObject13  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success response after unmoderating a player moderation. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing apiKey or auth cookie. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call unmoderateUserCall(InlineObject13 inlineObject13, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = inlineObject13;

        // create path and map variables
        String localVarPath = "/auth/user/unplayermoderate";

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
    private okhttp3.Call unmoderateUserValidateBeforeCall(InlineObject13 inlineObject13, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = unmoderateUserCall(inlineObject13, _callback);
        return localVarCall;

    }

    /**
     * Unmoderate User
     * Removes a player moderation previously added through &#x60;moderateUser&#x60;. E.g if you previuosly have shown their avatar, but now want to reset it to default.
     * @param inlineObject13  (optional)
     * @return Error
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success response after unmoderating a player moderation. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing apiKey or auth cookie. </td><td>  -  </td></tr>
     </table>
     */
    public Error unmoderateUser(InlineObject13 inlineObject13) throws ApiException {
        ApiResponse<Error> localVarResp = unmoderateUserWithHttpInfo(inlineObject13);
        return localVarResp.getData();
    }

    /**
     * Unmoderate User
     * Removes a player moderation previously added through &#x60;moderateUser&#x60;. E.g if you previuosly have shown their avatar, but now want to reset it to default.
     * @param inlineObject13  (optional)
     * @return ApiResponse&lt;Error&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success response after unmoderating a player moderation. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing apiKey or auth cookie. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Error> unmoderateUserWithHttpInfo(InlineObject13 inlineObject13) throws ApiException {
        okhttp3.Call localVarCall = unmoderateUserValidateBeforeCall(inlineObject13, null);
        Type localVarReturnType = new TypeToken<Error>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Unmoderate User (asynchronously)
     * Removes a player moderation previously added through &#x60;moderateUser&#x60;. E.g if you previuosly have shown their avatar, but now want to reset it to default.
     * @param inlineObject13  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success response after unmoderating a player moderation. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing apiKey or auth cookie. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call unmoderateUserAsync(InlineObject13 inlineObject13, final ApiCallback<Error> _callback) throws ApiException {

        okhttp3.Call localVarCall = unmoderateUserValidateBeforeCall(inlineObject13, _callback);
        Type localVarReturnType = new TypeToken<Error>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
