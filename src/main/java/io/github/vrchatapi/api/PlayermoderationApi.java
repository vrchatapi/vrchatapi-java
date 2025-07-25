/*
 * VRChat API Documentation
 *
 * The version of the OpenAPI document: 1.20.1
 * Contact: vrchatapi.lpv0t@aries.fyi
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
import io.github.vrchatapi.model.ModerateUserRequest;
import io.github.vrchatapi.model.PlayerModeration;
import io.github.vrchatapi.model.Success;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class PlayermoderationApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

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

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
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
        <tr><td> 401 </td><td> Error response due to missing auth cookie. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call clearAllPlayerModerationsCall(final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

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
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "authCookie" };
        return localVarApiClient.buildCall(basePath, localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call clearAllPlayerModerationsValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        return clearAllPlayerModerationsCall(_callback);

    }

    /**
     * Clear All Player Moderations
     * ⚠️ **This will delete every single player moderation you&#39;ve ever made.**
     * @return Success
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success response after e.g. clearing all player moderations. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing auth cookie. </td><td>  -  </td></tr>
     </table>
     */
    public Success clearAllPlayerModerations() throws ApiException {
        ApiResponse<Success> localVarResp = clearAllPlayerModerationsWithHttpInfo();
        return localVarResp.getData();
    }

    /**
     * Clear All Player Moderations
     * ⚠️ **This will delete every single player moderation you&#39;ve ever made.**
     * @return ApiResponse&lt;Success&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success response after e.g. clearing all player moderations. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing auth cookie. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Success> clearAllPlayerModerationsWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = clearAllPlayerModerationsValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<Success>(){}.getType();
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
        <tr><td> 401 </td><td> Error response due to missing auth cookie. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call clearAllPlayerModerationsAsync(final ApiCallback<Success> _callback) throws ApiException {

        okhttp3.Call localVarCall = clearAllPlayerModerationsValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<Success>(){}.getType();
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
        <tr><td> 401 </td><td> Error response due to missing auth cookie. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getPlayerModerationsCall(String type, String targetUserId, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

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
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "authCookie" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getPlayerModerationsValidateBeforeCall(String type, String targetUserId, final ApiCallback _callback) throws ApiException {
        return getPlayerModerationsCall(type, targetUserId, _callback);

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
        <tr><td> 401 </td><td> Error response due to missing auth cookie. </td><td>  -  </td></tr>
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
        <tr><td> 401 </td><td> Error response due to missing auth cookie. </td><td>  -  </td></tr>
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
        <tr><td> 401 </td><td> Error response due to missing auth cookie. </td><td>  -  </td></tr>
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
     * @param moderateUserRequest  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a single PlayerModeration object. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing auth cookie. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call moderateUserCall(ModerateUserRequest moderateUserRequest, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = moderateUserRequest;

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
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "authCookie" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call moderateUserValidateBeforeCall(ModerateUserRequest moderateUserRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'moderateUserRequest' is set
        if (moderateUserRequest == null) {
            throw new ApiException("Missing the required parameter 'moderateUserRequest' when calling moderateUser(Async)");
        }

        return moderateUserCall(moderateUserRequest, _callback);

    }

    /**
     * Moderate User
     * Moderate a user, e.g. unmute them or show their avatar.  Please see the [Player Moderation docs](https://vrchatapi.github.io/docs/api/#tag--playermoderation) on what playerModerations are, and how they differ from staff moderations.
     * @param moderateUserRequest  (required)
     * @return PlayerModeration
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a single PlayerModeration object. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing auth cookie. </td><td>  -  </td></tr>
     </table>
     */
    public PlayerModeration moderateUser(ModerateUserRequest moderateUserRequest) throws ApiException {
        ApiResponse<PlayerModeration> localVarResp = moderateUserWithHttpInfo(moderateUserRequest);
        return localVarResp.getData();
    }

    /**
     * Moderate User
     * Moderate a user, e.g. unmute them or show their avatar.  Please see the [Player Moderation docs](https://vrchatapi.github.io/docs/api/#tag--playermoderation) on what playerModerations are, and how they differ from staff moderations.
     * @param moderateUserRequest  (required)
     * @return ApiResponse&lt;PlayerModeration&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a single PlayerModeration object. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing auth cookie. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<PlayerModeration> moderateUserWithHttpInfo(ModerateUserRequest moderateUserRequest) throws ApiException {
        okhttp3.Call localVarCall = moderateUserValidateBeforeCall(moderateUserRequest, null);
        Type localVarReturnType = new TypeToken<PlayerModeration>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Moderate User (asynchronously)
     * Moderate a user, e.g. unmute them or show their avatar.  Please see the [Player Moderation docs](https://vrchatapi.github.io/docs/api/#tag--playermoderation) on what playerModerations are, and how they differ from staff moderations.
     * @param moderateUserRequest  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a single PlayerModeration object. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing auth cookie. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call moderateUserAsync(ModerateUserRequest moderateUserRequest, final ApiCallback<PlayerModeration> _callback) throws ApiException {

        okhttp3.Call localVarCall = moderateUserValidateBeforeCall(moderateUserRequest, _callback);
        Type localVarReturnType = new TypeToken<PlayerModeration>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for unmoderateUser
     * @param moderateUserRequest  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success response after unmoderating a player moderation. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing auth cookie. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call unmoderateUserCall(ModerateUserRequest moderateUserRequest, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = moderateUserRequest;

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
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "authCookie" };
        return localVarApiClient.buildCall(basePath, localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call unmoderateUserValidateBeforeCall(ModerateUserRequest moderateUserRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'moderateUserRequest' is set
        if (moderateUserRequest == null) {
            throw new ApiException("Missing the required parameter 'moderateUserRequest' when calling unmoderateUser(Async)");
        }

        return unmoderateUserCall(moderateUserRequest, _callback);

    }

    /**
     * Unmoderate User
     * Removes a player moderation previously added through &#x60;moderateUser&#x60;. E.g if you previously have shown their avatar, but now want to reset it to default.
     * @param moderateUserRequest  (required)
     * @return Success
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success response after unmoderating a player moderation. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing auth cookie. </td><td>  -  </td></tr>
     </table>
     */
    public Success unmoderateUser(ModerateUserRequest moderateUserRequest) throws ApiException {
        ApiResponse<Success> localVarResp = unmoderateUserWithHttpInfo(moderateUserRequest);
        return localVarResp.getData();
    }

    /**
     * Unmoderate User
     * Removes a player moderation previously added through &#x60;moderateUser&#x60;. E.g if you previously have shown their avatar, but now want to reset it to default.
     * @param moderateUserRequest  (required)
     * @return ApiResponse&lt;Success&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success response after unmoderating a player moderation. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing auth cookie. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Success> unmoderateUserWithHttpInfo(ModerateUserRequest moderateUserRequest) throws ApiException {
        okhttp3.Call localVarCall = unmoderateUserValidateBeforeCall(moderateUserRequest, null);
        Type localVarReturnType = new TypeToken<Success>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Unmoderate User (asynchronously)
     * Removes a player moderation previously added through &#x60;moderateUser&#x60;. E.g if you previously have shown their avatar, but now want to reset it to default.
     * @param moderateUserRequest  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success response after unmoderating a player moderation. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing auth cookie. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call unmoderateUserAsync(ModerateUserRequest moderateUserRequest, final ApiCallback<Success> _callback) throws ApiException {

        okhttp3.Call localVarCall = unmoderateUserValidateBeforeCall(moderateUserRequest, _callback);
        Type localVarReturnType = new TypeToken<Success>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
