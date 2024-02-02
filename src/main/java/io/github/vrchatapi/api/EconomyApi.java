/*
 * VRChat API Documentation
 *
 * The version of the OpenAPI document: 1.16.4
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
import io.github.vrchatapi.model.LicenseGroup;
import io.github.vrchatapi.model.Subscription;
import io.github.vrchatapi.model.Transaction;
import io.github.vrchatapi.model.UserSubscription;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class EconomyApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public EconomyApi() {
        this(Configuration.getDefaultApiClient());
    }

    public EconomyApi(ApiClient apiClient) {
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
     * Build call for getCurrentSubscriptions
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a list of UserSubscription objects. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing auth cookie. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getCurrentSubscriptionsCall(final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/auth/user/subscription";

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
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getCurrentSubscriptionsValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        return getCurrentSubscriptionsCall(_callback);

    }

    /**
     * Get Current Subscriptions
     * Get a list of all current user subscriptions.
     * @return List&lt;UserSubscription&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a list of UserSubscription objects. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing auth cookie. </td><td>  -  </td></tr>
     </table>
     */
    public List<UserSubscription> getCurrentSubscriptions() throws ApiException {
        ApiResponse<List<UserSubscription>> localVarResp = getCurrentSubscriptionsWithHttpInfo();
        return localVarResp.getData();
    }

    /**
     * Get Current Subscriptions
     * Get a list of all current user subscriptions.
     * @return ApiResponse&lt;List&lt;UserSubscription&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a list of UserSubscription objects. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing auth cookie. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<UserSubscription>> getCurrentSubscriptionsWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = getCurrentSubscriptionsValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<List<UserSubscription>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get Current Subscriptions (asynchronously)
     * Get a list of all current user subscriptions.
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a list of UserSubscription objects. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing auth cookie. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getCurrentSubscriptionsAsync(final ApiCallback<List<UserSubscription>> _callback) throws ApiException {

        okhttp3.Call localVarCall = getCurrentSubscriptionsValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<List<UserSubscription>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getLicenseGroup
     * @param licenseGroupId Must be a valid license group ID. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a single LicenseGroup object. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing auth cookie. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getLicenseGroupCall(String licenseGroupId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/licenseGroups/{licenseGroupId}"
            .replace("{" + "licenseGroupId" + "}", localVarApiClient.escapeString(licenseGroupId.toString()));

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
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getLicenseGroupValidateBeforeCall(String licenseGroupId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'licenseGroupId' is set
        if (licenseGroupId == null) {
            throw new ApiException("Missing the required parameter 'licenseGroupId' when calling getLicenseGroup(Async)");
        }

        return getLicenseGroupCall(licenseGroupId, _callback);

    }

    /**
     * Get License Group
     * Get a single License Group by given ID.
     * @param licenseGroupId Must be a valid license group ID. (required)
     * @return LicenseGroup
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a single LicenseGroup object. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing auth cookie. </td><td>  -  </td></tr>
     </table>
     */
    public LicenseGroup getLicenseGroup(String licenseGroupId) throws ApiException {
        ApiResponse<LicenseGroup> localVarResp = getLicenseGroupWithHttpInfo(licenseGroupId);
        return localVarResp.getData();
    }

    /**
     * Get License Group
     * Get a single License Group by given ID.
     * @param licenseGroupId Must be a valid license group ID. (required)
     * @return ApiResponse&lt;LicenseGroup&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a single LicenseGroup object. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing auth cookie. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<LicenseGroup> getLicenseGroupWithHttpInfo(String licenseGroupId) throws ApiException {
        okhttp3.Call localVarCall = getLicenseGroupValidateBeforeCall(licenseGroupId, null);
        Type localVarReturnType = new TypeToken<LicenseGroup>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get License Group (asynchronously)
     * Get a single License Group by given ID.
     * @param licenseGroupId Must be a valid license group ID. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a single LicenseGroup object. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing auth cookie. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getLicenseGroupAsync(String licenseGroupId, final ApiCallback<LicenseGroup> _callback) throws ApiException {

        okhttp3.Call localVarCall = getLicenseGroupValidateBeforeCall(licenseGroupId, _callback);
        Type localVarReturnType = new TypeToken<LicenseGroup>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getSteamTransaction
     * @param transactionId Must be a valid transaction ID. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a single Transaction object. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing auth cookie. </td><td>  -  </td></tr>
     </table>
     * @deprecated
     */
    @Deprecated
    public okhttp3.Call getSteamTransactionCall(String transactionId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/Steam/transactions/{transactionId}"
            .replace("{" + "transactionId" + "}", localVarApiClient.escapeString(transactionId.toString()));

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
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @Deprecated
    @SuppressWarnings("rawtypes")
    private okhttp3.Call getSteamTransactionValidateBeforeCall(String transactionId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'transactionId' is set
        if (transactionId == null) {
            throw new ApiException("Missing the required parameter 'transactionId' when calling getSteamTransaction(Async)");
        }

        return getSteamTransactionCall(transactionId, _callback);

    }

    /**
     * Get Steam Transaction
     * Get a single Steam transactions by ID. This returns the exact same information as &#x60;getSteamTransactions&#x60;, so no point in using this endpoint.
     * @param transactionId Must be a valid transaction ID. (required)
     * @return Transaction
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a single Transaction object. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing auth cookie. </td><td>  -  </td></tr>
     </table>
     * @deprecated
     */
    @Deprecated
    public Transaction getSteamTransaction(String transactionId) throws ApiException {
        ApiResponse<Transaction> localVarResp = getSteamTransactionWithHttpInfo(transactionId);
        return localVarResp.getData();
    }

    /**
     * Get Steam Transaction
     * Get a single Steam transactions by ID. This returns the exact same information as &#x60;getSteamTransactions&#x60;, so no point in using this endpoint.
     * @param transactionId Must be a valid transaction ID. (required)
     * @return ApiResponse&lt;Transaction&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a single Transaction object. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing auth cookie. </td><td>  -  </td></tr>
     </table>
     * @deprecated
     */
    @Deprecated
    public ApiResponse<Transaction> getSteamTransactionWithHttpInfo(String transactionId) throws ApiException {
        okhttp3.Call localVarCall = getSteamTransactionValidateBeforeCall(transactionId, null);
        Type localVarReturnType = new TypeToken<Transaction>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get Steam Transaction (asynchronously)
     * Get a single Steam transactions by ID. This returns the exact same information as &#x60;getSteamTransactions&#x60;, so no point in using this endpoint.
     * @param transactionId Must be a valid transaction ID. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a single Transaction object. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing auth cookie. </td><td>  -  </td></tr>
     </table>
     * @deprecated
     */
    @Deprecated
    public okhttp3.Call getSteamTransactionAsync(String transactionId, final ApiCallback<Transaction> _callback) throws ApiException {

        okhttp3.Call localVarCall = getSteamTransactionValidateBeforeCall(transactionId, _callback);
        Type localVarReturnType = new TypeToken<Transaction>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getSteamTransactions
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a list of Transaction objects. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing auth cookie. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getSteamTransactionsCall(final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/Steam/transactions";

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
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getSteamTransactionsValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        return getSteamTransactionsCall(_callback);

    }

    /**
     * List Steam Transactions
     * Get all own Steam transactions.
     * @return List&lt;Transaction&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a list of Transaction objects. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing auth cookie. </td><td>  -  </td></tr>
     </table>
     */
    public List<Transaction> getSteamTransactions() throws ApiException {
        ApiResponse<List<Transaction>> localVarResp = getSteamTransactionsWithHttpInfo();
        return localVarResp.getData();
    }

    /**
     * List Steam Transactions
     * Get all own Steam transactions.
     * @return ApiResponse&lt;List&lt;Transaction&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a list of Transaction objects. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing auth cookie. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<Transaction>> getSteamTransactionsWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = getSteamTransactionsValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<List<Transaction>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * List Steam Transactions (asynchronously)
     * Get all own Steam transactions.
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a list of Transaction objects. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing auth cookie. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getSteamTransactionsAsync(final ApiCallback<List<Transaction>> _callback) throws ApiException {

        okhttp3.Call localVarCall = getSteamTransactionsValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<List<Transaction>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getSubscriptions
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a list of Subscription objects. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing auth cookie. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getSubscriptionsCall(final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/subscriptions";

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
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getSubscriptionsValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        return getSubscriptionsCall(_callback);

    }

    /**
     * List Subscriptions
     * List all existing Subscriptions. For example, \&quot;vrchatplus-monthly\&quot; and \&quot;vrchatplus-yearly\&quot;.
     * @return List&lt;Subscription&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a list of Subscription objects. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing auth cookie. </td><td>  -  </td></tr>
     </table>
     */
    public List<Subscription> getSubscriptions() throws ApiException {
        ApiResponse<List<Subscription>> localVarResp = getSubscriptionsWithHttpInfo();
        return localVarResp.getData();
    }

    /**
     * List Subscriptions
     * List all existing Subscriptions. For example, \&quot;vrchatplus-monthly\&quot; and \&quot;vrchatplus-yearly\&quot;.
     * @return ApiResponse&lt;List&lt;Subscription&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a list of Subscription objects. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing auth cookie. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<Subscription>> getSubscriptionsWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = getSubscriptionsValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<List<Subscription>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * List Subscriptions (asynchronously)
     * List all existing Subscriptions. For example, \&quot;vrchatplus-monthly\&quot; and \&quot;vrchatplus-yearly\&quot;.
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a list of Subscription objects. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing auth cookie. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getSubscriptionsAsync(final ApiCallback<List<Subscription>> _callback) throws ApiException {

        okhttp3.Call localVarCall = getSubscriptionsValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<List<Subscription>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
