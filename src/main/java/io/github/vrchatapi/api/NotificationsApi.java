/*
 * VRChat API Documentation
 *
 * The version of the OpenAPI document: 1.8.0
 * Contact: me@ariesclark.com
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
import io.github.vrchatapi.model.Notification;
import io.github.vrchatapi.model.Success;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NotificationsApi {
    private ApiClient localVarApiClient;

    public NotificationsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public NotificationsApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for acceptFriendRequest
     * @param notificationId  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response after friending a user. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing apiKey or auth cookie. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Error response when trying to accept a non-existent friend request. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call acceptFriendRequestCall(String notificationId, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/auth/user/notifications/{notificationId}/accept"
            .replaceAll("\\{" + "notificationId" + "\\}", localVarApiClient.escapeString(notificationId.toString()));

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
    private okhttp3.Call acceptFriendRequestValidateBeforeCall(String notificationId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'notificationId' is set
        if (notificationId == null) {
            throw new ApiException("Missing the required parameter 'notificationId' when calling acceptFriendRequest(Async)");
        }
        

        okhttp3.Call localVarCall = acceptFriendRequestCall(notificationId, _callback);
        return localVarCall;

    }

    /**
     * Accept Friend Request
     * Accept a friend request by notification &#x60;frq_&#x60; ID. Friend requests can be found using the NotificationsAPI &#x60;getNotifications&#x60; by filtering of type &#x60;friendRequest&#x60;.
     * @param notificationId  (required)
     * @return Success
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response after friending a user. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing apiKey or auth cookie. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Error response when trying to accept a non-existent friend request. </td><td>  -  </td></tr>
     </table>
     */
    public Success acceptFriendRequest(String notificationId) throws ApiException {
        ApiResponse<Success> localVarResp = acceptFriendRequestWithHttpInfo(notificationId);
        return localVarResp.getData();
    }

    /**
     * Accept Friend Request
     * Accept a friend request by notification &#x60;frq_&#x60; ID. Friend requests can be found using the NotificationsAPI &#x60;getNotifications&#x60; by filtering of type &#x60;friendRequest&#x60;.
     * @param notificationId  (required)
     * @return ApiResponse&lt;Success&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response after friending a user. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing apiKey or auth cookie. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Error response when trying to accept a non-existent friend request. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Success> acceptFriendRequestWithHttpInfo(String notificationId) throws ApiException {
        okhttp3.Call localVarCall = acceptFriendRequestValidateBeforeCall(notificationId, null);
        Type localVarReturnType = new TypeToken<Success>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Accept Friend Request (asynchronously)
     * Accept a friend request by notification &#x60;frq_&#x60; ID. Friend requests can be found using the NotificationsAPI &#x60;getNotifications&#x60; by filtering of type &#x60;friendRequest&#x60;.
     * @param notificationId  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response after friending a user. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing apiKey or auth cookie. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Error response when trying to accept a non-existent friend request. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call acceptFriendRequestAsync(String notificationId, final ApiCallback<Success> _callback) throws ApiException {

        okhttp3.Call localVarCall = acceptFriendRequestValidateBeforeCall(notificationId, _callback);
        Type localVarReturnType = new TypeToken<Success>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for clearNotifications
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response after clearing all notifications. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing apiKey or auth cookie. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call clearNotificationsCall(final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/auth/user/notifications/clear";

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
    private okhttp3.Call clearNotificationsValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = clearNotificationsCall(_callback);
        return localVarCall;

    }

    /**
     * Clear All Notifications
     * Clear **all** notifications.
     * @return Success
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response after clearing all notifications. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing apiKey or auth cookie. </td><td>  -  </td></tr>
     </table>
     */
    public Success clearNotifications() throws ApiException {
        ApiResponse<Success> localVarResp = clearNotificationsWithHttpInfo();
        return localVarResp.getData();
    }

    /**
     * Clear All Notifications
     * Clear **all** notifications.
     * @return ApiResponse&lt;Success&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response after clearing all notifications. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing apiKey or auth cookie. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Success> clearNotificationsWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = clearNotificationsValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<Success>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Clear All Notifications (asynchronously)
     * Clear **all** notifications.
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response after clearing all notifications. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing apiKey or auth cookie. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call clearNotificationsAsync(final ApiCallback<Success> _callback) throws ApiException {

        okhttp3.Call localVarCall = clearNotificationsValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<Success>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for deleteNotification
     * @param notificationId  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a single Notifcation object. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing apiKey or auth cookie. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteNotificationCall(String notificationId, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/auth/user/notifications/{notificationId}/hide"
            .replaceAll("\\{" + "notificationId" + "\\}", localVarApiClient.escapeString(notificationId.toString()));

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
    private okhttp3.Call deleteNotificationValidateBeforeCall(String notificationId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'notificationId' is set
        if (notificationId == null) {
            throw new ApiException("Missing the required parameter 'notificationId' when calling deleteNotification(Async)");
        }
        

        okhttp3.Call localVarCall = deleteNotificationCall(notificationId, _callback);
        return localVarCall;

    }

    /**
     * Delete Notification
     * Delete a notification.
     * @param notificationId  (required)
     * @return Notification
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a single Notifcation object. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing apiKey or auth cookie. </td><td>  -  </td></tr>
     </table>
     */
    public Notification deleteNotification(String notificationId) throws ApiException {
        ApiResponse<Notification> localVarResp = deleteNotificationWithHttpInfo(notificationId);
        return localVarResp.getData();
    }

    /**
     * Delete Notification
     * Delete a notification.
     * @param notificationId  (required)
     * @return ApiResponse&lt;Notification&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a single Notifcation object. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing apiKey or auth cookie. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Notification> deleteNotificationWithHttpInfo(String notificationId) throws ApiException {
        okhttp3.Call localVarCall = deleteNotificationValidateBeforeCall(notificationId, null);
        Type localVarReturnType = new TypeToken<Notification>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Delete Notification (asynchronously)
     * Delete a notification.
     * @param notificationId  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a single Notifcation object. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing apiKey or auth cookie. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteNotificationAsync(String notificationId, final ApiCallback<Notification> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteNotificationValidateBeforeCall(notificationId, _callback);
        Type localVarReturnType = new TypeToken<Notification>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getNotifications
     * @param type Only send notifications of this type (can use &#x60;all&#x60; for all). This parameter no longer does anything, and is deprecated. (optional)
     * @param sent Return notifications sent by the user. Must be false or omitted. (optional)
     * @param hidden Whether to return hidden or non-hidden notifications. True only allowed on type &#x60;friendRequest&#x60;. (optional)
     * @param after Only return notifications sent after this Date. Ignored if type is &#x60;friendRequest&#x60;. (optional)
     * @param n The number of objects to return. (optional, default to 60)
     * @param offset A zero-based offset from the default object sorting from where search results start. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a list of Notifcation objects. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing apiKey or auth cookie. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getNotificationsCall(String type, Boolean sent, Boolean hidden, String after, Integer n, Integer offset, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/auth/user/notifications";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (type != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("type", type));
        }

        if (sent != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("sent", sent));
        }

        if (hidden != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("hidden", hidden));
        }

        if (after != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("after", after));
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
    private okhttp3.Call getNotificationsValidateBeforeCall(String type, Boolean sent, Boolean hidden, String after, Integer n, Integer offset, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = getNotificationsCall(type, sent, hidden, after, n, offset, _callback);
        return localVarCall;

    }

    /**
     * List Notifications
     * Retrieve all of the current user&#39;s notifications.
     * @param type Only send notifications of this type (can use &#x60;all&#x60; for all). This parameter no longer does anything, and is deprecated. (optional)
     * @param sent Return notifications sent by the user. Must be false or omitted. (optional)
     * @param hidden Whether to return hidden or non-hidden notifications. True only allowed on type &#x60;friendRequest&#x60;. (optional)
     * @param after Only return notifications sent after this Date. Ignored if type is &#x60;friendRequest&#x60;. (optional)
     * @param n The number of objects to return. (optional, default to 60)
     * @param offset A zero-based offset from the default object sorting from where search results start. (optional)
     * @return List&lt;Notification&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a list of Notifcation objects. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing apiKey or auth cookie. </td><td>  -  </td></tr>
     </table>
     */
    public List<Notification> getNotifications(String type, Boolean sent, Boolean hidden, String after, Integer n, Integer offset) throws ApiException {
        ApiResponse<List<Notification>> localVarResp = getNotificationsWithHttpInfo(type, sent, hidden, after, n, offset);
        return localVarResp.getData();
    }

    /**
     * List Notifications
     * Retrieve all of the current user&#39;s notifications.
     * @param type Only send notifications of this type (can use &#x60;all&#x60; for all). This parameter no longer does anything, and is deprecated. (optional)
     * @param sent Return notifications sent by the user. Must be false or omitted. (optional)
     * @param hidden Whether to return hidden or non-hidden notifications. True only allowed on type &#x60;friendRequest&#x60;. (optional)
     * @param after Only return notifications sent after this Date. Ignored if type is &#x60;friendRequest&#x60;. (optional)
     * @param n The number of objects to return. (optional, default to 60)
     * @param offset A zero-based offset from the default object sorting from where search results start. (optional)
     * @return ApiResponse&lt;List&lt;Notification&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a list of Notifcation objects. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing apiKey or auth cookie. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<Notification>> getNotificationsWithHttpInfo(String type, Boolean sent, Boolean hidden, String after, Integer n, Integer offset) throws ApiException {
        okhttp3.Call localVarCall = getNotificationsValidateBeforeCall(type, sent, hidden, after, n, offset, null);
        Type localVarReturnType = new TypeToken<List<Notification>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * List Notifications (asynchronously)
     * Retrieve all of the current user&#39;s notifications.
     * @param type Only send notifications of this type (can use &#x60;all&#x60; for all). This parameter no longer does anything, and is deprecated. (optional)
     * @param sent Return notifications sent by the user. Must be false or omitted. (optional)
     * @param hidden Whether to return hidden or non-hidden notifications. True only allowed on type &#x60;friendRequest&#x60;. (optional)
     * @param after Only return notifications sent after this Date. Ignored if type is &#x60;friendRequest&#x60;. (optional)
     * @param n The number of objects to return. (optional, default to 60)
     * @param offset A zero-based offset from the default object sorting from where search results start. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a list of Notifcation objects. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing apiKey or auth cookie. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getNotificationsAsync(String type, Boolean sent, Boolean hidden, String after, Integer n, Integer offset, final ApiCallback<List<Notification>> _callback) throws ApiException {

        okhttp3.Call localVarCall = getNotificationsValidateBeforeCall(type, sent, hidden, after, n, offset, _callback);
        Type localVarReturnType = new TypeToken<List<Notification>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for markNotificationAsRead
     * @param notificationId  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a single Notifcation object. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing apiKey or auth cookie. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call markNotificationAsReadCall(String notificationId, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/auth/user/notifications/{notificationId}/see"
            .replaceAll("\\{" + "notificationId" + "\\}", localVarApiClient.escapeString(notificationId.toString()));

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
    private okhttp3.Call markNotificationAsReadValidateBeforeCall(String notificationId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'notificationId' is set
        if (notificationId == null) {
            throw new ApiException("Missing the required parameter 'notificationId' when calling markNotificationAsRead(Async)");
        }
        

        okhttp3.Call localVarCall = markNotificationAsReadCall(notificationId, _callback);
        return localVarCall;

    }

    /**
     * Mark Notification As Read
     * Mark a notification as seen.
     * @param notificationId  (required)
     * @return Notification
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a single Notifcation object. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing apiKey or auth cookie. </td><td>  -  </td></tr>
     </table>
     */
    public Notification markNotificationAsRead(String notificationId) throws ApiException {
        ApiResponse<Notification> localVarResp = markNotificationAsReadWithHttpInfo(notificationId);
        return localVarResp.getData();
    }

    /**
     * Mark Notification As Read
     * Mark a notification as seen.
     * @param notificationId  (required)
     * @return ApiResponse&lt;Notification&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a single Notifcation object. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing apiKey or auth cookie. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Notification> markNotificationAsReadWithHttpInfo(String notificationId) throws ApiException {
        okhttp3.Call localVarCall = markNotificationAsReadValidateBeforeCall(notificationId, null);
        Type localVarReturnType = new TypeToken<Notification>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Mark Notification As Read (asynchronously)
     * Mark a notification as seen.
     * @param notificationId  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a single Notifcation object. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing apiKey or auth cookie. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call markNotificationAsReadAsync(String notificationId, final ApiCallback<Notification> _callback) throws ApiException {

        okhttp3.Call localVarCall = markNotificationAsReadValidateBeforeCall(notificationId, _callback);
        Type localVarReturnType = new TypeToken<Notification>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
