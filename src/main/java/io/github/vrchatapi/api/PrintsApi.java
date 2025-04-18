/*
 * VRChat API Documentation
 *
 * The version of the OpenAPI document: 1.19.2
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
import io.github.vrchatapi.model.Print;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class PrintsApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public PrintsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public PrintsApi(ApiClient apiClient) {
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
     * Build call for deletePrint
     * @param printId Print ID. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Empty response if successful </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing auth cookie. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deletePrintCall(String printId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/prints/{printId}"
            .replace("{" + "printId" + "}", localVarApiClient.escapeString(printId.toString()));

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
    private okhttp3.Call deletePrintValidateBeforeCall(String printId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'printId' is set
        if (printId == null) {
            throw new ApiException("Missing the required parameter 'printId' when calling deletePrint(Async)");
        }

        return deletePrintCall(printId, _callback);

    }

    /**
     * Delete Print
     * Returns a print.
     * @param printId Print ID. (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Empty response if successful </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing auth cookie. </td><td>  -  </td></tr>
     </table>
     */
    public void deletePrint(String printId) throws ApiException {
        deletePrintWithHttpInfo(printId);
    }

    /**
     * Delete Print
     * Returns a print.
     * @param printId Print ID. (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Empty response if successful </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing auth cookie. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> deletePrintWithHttpInfo(String printId) throws ApiException {
        okhttp3.Call localVarCall = deletePrintValidateBeforeCall(printId, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Delete Print (asynchronously)
     * Returns a print.
     * @param printId Print ID. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Empty response if successful </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing auth cookie. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deletePrintAsync(String printId, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = deletePrintValidateBeforeCall(printId, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for getPrint
     * @param printId Print ID. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a single Print object. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing auth cookie. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getPrintCall(String printId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/prints/{printId}"
            .replace("{" + "printId" + "}", localVarApiClient.escapeString(printId.toString()));

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
    private okhttp3.Call getPrintValidateBeforeCall(String printId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'printId' is set
        if (printId == null) {
            throw new ApiException("Missing the required parameter 'printId' when calling getPrint(Async)");
        }

        return getPrintCall(printId, _callback);

    }

    /**
     * Get Print
     * Returns a print.
     * @param printId Print ID. (required)
     * @return Print
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a single Print object. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing auth cookie. </td><td>  -  </td></tr>
     </table>
     */
    public Print getPrint(String printId) throws ApiException {
        ApiResponse<Print> localVarResp = getPrintWithHttpInfo(printId);
        return localVarResp.getData();
    }

    /**
     * Get Print
     * Returns a print.
     * @param printId Print ID. (required)
     * @return ApiResponse&lt;Print&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a single Print object. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing auth cookie. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Print> getPrintWithHttpInfo(String printId) throws ApiException {
        okhttp3.Call localVarCall = getPrintValidateBeforeCall(printId, null);
        Type localVarReturnType = new TypeToken<Print>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get Print (asynchronously)
     * Returns a print.
     * @param printId Print ID. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a single Print object. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing auth cookie. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getPrintAsync(String printId, final ApiCallback<Print> _callback) throws ApiException {

        okhttp3.Call localVarCall = getPrintValidateBeforeCall(printId, _callback);
        Type localVarReturnType = new TypeToken<Print>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getUserPrints
     * @param userId Must be a valid user ID. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a list of Print objects. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing auth cookie. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Error response when trying to request another user&#39;s prints. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getUserPrintsCall(String userId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/prints/user/{userId}"
            .replace("{" + "userId" + "}", localVarApiClient.escapeString(userId.toString()));

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
    private okhttp3.Call getUserPrintsValidateBeforeCall(String userId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new ApiException("Missing the required parameter 'userId' when calling getUserPrints(Async)");
        }

        return getUserPrintsCall(userId, _callback);

    }

    /**
     * Get Own Prints
     * Returns a list of all prints of the user. User id has to be your own userId, as you can&#39;t request other user&#39;s prints.
     * @param userId Must be a valid user ID. (required)
     * @return List&lt;Print&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a list of Print objects. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing auth cookie. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Error response when trying to request another user&#39;s prints. </td><td>  -  </td></tr>
     </table>
     */
    public List<Print> getUserPrints(String userId) throws ApiException {
        ApiResponse<List<Print>> localVarResp = getUserPrintsWithHttpInfo(userId);
        return localVarResp.getData();
    }

    /**
     * Get Own Prints
     * Returns a list of all prints of the user. User id has to be your own userId, as you can&#39;t request other user&#39;s prints.
     * @param userId Must be a valid user ID. (required)
     * @return ApiResponse&lt;List&lt;Print&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a list of Print objects. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing auth cookie. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Error response when trying to request another user&#39;s prints. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<Print>> getUserPrintsWithHttpInfo(String userId) throws ApiException {
        okhttp3.Call localVarCall = getUserPrintsValidateBeforeCall(userId, null);
        Type localVarReturnType = new TypeToken<List<Print>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get Own Prints (asynchronously)
     * Returns a list of all prints of the user. User id has to be your own userId, as you can&#39;t request other user&#39;s prints.
     * @param userId Must be a valid user ID. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a list of Print objects. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing auth cookie. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Error response when trying to request another user&#39;s prints. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getUserPrintsAsync(String userId, final ApiCallback<List<Print>> _callback) throws ApiException {

        okhttp3.Call localVarCall = getUserPrintsValidateBeforeCall(userId, _callback);
        Type localVarReturnType = new TypeToken<List<Print>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
