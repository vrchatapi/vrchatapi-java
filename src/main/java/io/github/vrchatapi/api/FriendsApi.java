/*
 * VRChat API Documentation
 *
 * The version of the OpenAPI document: 1.6.8
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
import io.github.vrchatapi.model.FriendStatus;
import io.github.vrchatapi.model.LimitedUser;
import io.github.vrchatapi.model.Notification;
import io.github.vrchatapi.model.Success;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FriendsApi {
    private ApiClient localVarApiClient;

    public FriendsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public FriendsApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for deleteFriendRequest
     * @param userId  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response after cancelling a friend request. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing apiKey or auth cookie. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Error response when trying to delete a non-existent friend-request. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteFriendRequestCall(String userId, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/user/{userId}/friendRequest"
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
    private okhttp3.Call deleteFriendRequestValidateBeforeCall(String userId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new ApiException("Missing the required parameter 'userId' when calling deleteFriendRequest(Async)");
        }
        

        okhttp3.Call localVarCall = deleteFriendRequestCall(userId, _callback);
        return localVarCall;

    }

    /**
     * Delete Friend Request
     * Deletes an outgoing pending friend request to another user. To delete an incoming friend request, use the &#x60;deleteNotification&#x60; endpoint instead.
     * @param userId  (required)
     * @return Success
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response after cancelling a friend request. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing apiKey or auth cookie. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Error response when trying to delete a non-existent friend-request. </td><td>  -  </td></tr>
     </table>
     */
    public Success deleteFriendRequest(String userId) throws ApiException {
        ApiResponse<Success> localVarResp = deleteFriendRequestWithHttpInfo(userId);
        return localVarResp.getData();
    }

    /**
     * Delete Friend Request
     * Deletes an outgoing pending friend request to another user. To delete an incoming friend request, use the &#x60;deleteNotification&#x60; endpoint instead.
     * @param userId  (required)
     * @return ApiResponse&lt;Success&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response after cancelling a friend request. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing apiKey or auth cookie. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Error response when trying to delete a non-existent friend-request. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Success> deleteFriendRequestWithHttpInfo(String userId) throws ApiException {
        okhttp3.Call localVarCall = deleteFriendRequestValidateBeforeCall(userId, null);
        Type localVarReturnType = new TypeToken<Success>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Delete Friend Request (asynchronously)
     * Deletes an outgoing pending friend request to another user. To delete an incoming friend request, use the &#x60;deleteNotification&#x60; endpoint instead.
     * @param userId  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response after cancelling a friend request. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing apiKey or auth cookie. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Error response when trying to delete a non-existent friend-request. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteFriendRequestAsync(String userId, final ApiCallback<Success> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteFriendRequestValidateBeforeCall(userId, _callback);
        Type localVarReturnType = new TypeToken<Success>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for friend
     * @param userId  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a single Notifcation object. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing apiKey or auth cookie. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Error response when trying to send a friend request to a user which doesn&#39;t exist. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call friendCall(String userId, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/user/{userId}/friendRequest"
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
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call friendValidateBeforeCall(String userId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new ApiException("Missing the required parameter 'userId' when calling friend(Async)");
        }
        

        okhttp3.Call localVarCall = friendCall(userId, _callback);
        return localVarCall;

    }

    /**
     * Send Friend Request
     * Send a friend request to another user.
     * @param userId  (required)
     * @return Notification
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a single Notifcation object. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing apiKey or auth cookie. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Error response when trying to send a friend request to a user which doesn&#39;t exist. </td><td>  -  </td></tr>
     </table>
     */
    public Notification friend(String userId) throws ApiException {
        ApiResponse<Notification> localVarResp = friendWithHttpInfo(userId);
        return localVarResp.getData();
    }

    /**
     * Send Friend Request
     * Send a friend request to another user.
     * @param userId  (required)
     * @return ApiResponse&lt;Notification&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a single Notifcation object. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing apiKey or auth cookie. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Error response when trying to send a friend request to a user which doesn&#39;t exist. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Notification> friendWithHttpInfo(String userId) throws ApiException {
        okhttp3.Call localVarCall = friendValidateBeforeCall(userId, null);
        Type localVarReturnType = new TypeToken<Notification>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Send Friend Request (asynchronously)
     * Send a friend request to another user.
     * @param userId  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a single Notifcation object. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing apiKey or auth cookie. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Error response when trying to send a friend request to a user which doesn&#39;t exist. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call friendAsync(String userId, final ApiCallback<Notification> _callback) throws ApiException {

        okhttp3.Call localVarCall = friendValidateBeforeCall(userId, _callback);
        Type localVarReturnType = new TypeToken<Notification>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getFriendStatus
     * @param userId  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a users Friend Status. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing apiKey or auth cookie. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getFriendStatusCall(String userId, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/user/{userId}/friendStatus"
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
    private okhttp3.Call getFriendStatusValidateBeforeCall(String userId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new ApiException("Missing the required parameter 'userId' when calling getFriendStatus(Async)");
        }
        

        okhttp3.Call localVarCall = getFriendStatusCall(userId, _callback);
        return localVarCall;

    }

    /**
     * Check Friend Status
     * Retrieve if the user is currently a friend with a given user, if they have an outgoing friend request, and if they have an incoming friend request. The proper way to receive and accept friend request is by checking if the user has an incoming &#x60;Notification&#x60; of type &#x60;friendRequest&#x60;, and then accepting that notification.
     * @param userId  (required)
     * @return FriendStatus
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a users Friend Status. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing apiKey or auth cookie. </td><td>  -  </td></tr>
     </table>
     */
    public FriendStatus getFriendStatus(String userId) throws ApiException {
        ApiResponse<FriendStatus> localVarResp = getFriendStatusWithHttpInfo(userId);
        return localVarResp.getData();
    }

    /**
     * Check Friend Status
     * Retrieve if the user is currently a friend with a given user, if they have an outgoing friend request, and if they have an incoming friend request. The proper way to receive and accept friend request is by checking if the user has an incoming &#x60;Notification&#x60; of type &#x60;friendRequest&#x60;, and then accepting that notification.
     * @param userId  (required)
     * @return ApiResponse&lt;FriendStatus&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a users Friend Status. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing apiKey or auth cookie. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<FriendStatus> getFriendStatusWithHttpInfo(String userId) throws ApiException {
        okhttp3.Call localVarCall = getFriendStatusValidateBeforeCall(userId, null);
        Type localVarReturnType = new TypeToken<FriendStatus>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Check Friend Status (asynchronously)
     * Retrieve if the user is currently a friend with a given user, if they have an outgoing friend request, and if they have an incoming friend request. The proper way to receive and accept friend request is by checking if the user has an incoming &#x60;Notification&#x60; of type &#x60;friendRequest&#x60;, and then accepting that notification.
     * @param userId  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a users Friend Status. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing apiKey or auth cookie. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getFriendStatusAsync(String userId, final ApiCallback<FriendStatus> _callback) throws ApiException {

        okhttp3.Call localVarCall = getFriendStatusValidateBeforeCall(userId, _callback);
        Type localVarReturnType = new TypeToken<FriendStatus>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getFriends
     * @param offset A zero-based offset from the default object sorting from where search results start. (optional)
     * @param n The number of objects to return. (optional, default to 60)
     * @param offline Returns *only* offline users if true, returns only online and active users if false (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a list of LimitedUser objects. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing apiKey or auth cookie. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getFriendsCall(Integer offset, Integer n, Boolean offline, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/auth/user/friends";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (offset != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("offset", offset));
        }

        if (n != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("n", n));
        }

        if (offline != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("offline", offline));
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
    private okhttp3.Call getFriendsValidateBeforeCall(Integer offset, Integer n, Boolean offline, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = getFriendsCall(offset, n, offline, _callback);
        return localVarCall;

    }

    /**
     * List Friends
     * List information about friends.
     * @param offset A zero-based offset from the default object sorting from where search results start. (optional)
     * @param n The number of objects to return. (optional, default to 60)
     * @param offline Returns *only* offline users if true, returns only online and active users if false (optional)
     * @return List&lt;LimitedUser&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a list of LimitedUser objects. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing apiKey or auth cookie. </td><td>  -  </td></tr>
     </table>
     */
    public List<LimitedUser> getFriends(Integer offset, Integer n, Boolean offline) throws ApiException {
        ApiResponse<List<LimitedUser>> localVarResp = getFriendsWithHttpInfo(offset, n, offline);
        return localVarResp.getData();
    }

    /**
     * List Friends
     * List information about friends.
     * @param offset A zero-based offset from the default object sorting from where search results start. (optional)
     * @param n The number of objects to return. (optional, default to 60)
     * @param offline Returns *only* offline users if true, returns only online and active users if false (optional)
     * @return ApiResponse&lt;List&lt;LimitedUser&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a list of LimitedUser objects. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing apiKey or auth cookie. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<LimitedUser>> getFriendsWithHttpInfo(Integer offset, Integer n, Boolean offline) throws ApiException {
        okhttp3.Call localVarCall = getFriendsValidateBeforeCall(offset, n, offline, null);
        Type localVarReturnType = new TypeToken<List<LimitedUser>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * List Friends (asynchronously)
     * List information about friends.
     * @param offset A zero-based offset from the default object sorting from where search results start. (optional)
     * @param n The number of objects to return. (optional, default to 60)
     * @param offline Returns *only* offline users if true, returns only online and active users if false (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a list of LimitedUser objects. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing apiKey or auth cookie. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getFriendsAsync(Integer offset, Integer n, Boolean offline, final ApiCallback<List<LimitedUser>> _callback) throws ApiException {

        okhttp3.Call localVarCall = getFriendsValidateBeforeCall(offset, n, offline, _callback);
        Type localVarReturnType = new TypeToken<List<LimitedUser>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for unfriend
     * @param userId  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response after unfriending a user. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Error response when trying to unfriend someone who is not a friend. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing apiKey or auth cookie. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call unfriendCall(String userId, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/auth/user/friends/{userId}"
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
    private okhttp3.Call unfriendValidateBeforeCall(String userId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new ApiException("Missing the required parameter 'userId' when calling unfriend(Async)");
        }
        

        okhttp3.Call localVarCall = unfriendCall(userId, _callback);
        return localVarCall;

    }

    /**
     * Unfriend
     * Unfriend a user by ID.
     * @param userId  (required)
     * @return Success
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response after unfriending a user. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Error response when trying to unfriend someone who is not a friend. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing apiKey or auth cookie. </td><td>  -  </td></tr>
     </table>
     */
    public Success unfriend(String userId) throws ApiException {
        ApiResponse<Success> localVarResp = unfriendWithHttpInfo(userId);
        return localVarResp.getData();
    }

    /**
     * Unfriend
     * Unfriend a user by ID.
     * @param userId  (required)
     * @return ApiResponse&lt;Success&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response after unfriending a user. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Error response when trying to unfriend someone who is not a friend. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing apiKey or auth cookie. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Success> unfriendWithHttpInfo(String userId) throws ApiException {
        okhttp3.Call localVarCall = unfriendValidateBeforeCall(userId, null);
        Type localVarReturnType = new TypeToken<Success>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Unfriend (asynchronously)
     * Unfriend a user by ID.
     * @param userId  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response after unfriending a user. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Error response when trying to unfriend someone who is not a friend. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing apiKey or auth cookie. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call unfriendAsync(String userId, final ApiCallback<Success> _callback) throws ApiException {

        okhttp3.Call localVarCall = unfriendValidateBeforeCall(userId, _callback);
        Type localVarReturnType = new TypeToken<Success>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
