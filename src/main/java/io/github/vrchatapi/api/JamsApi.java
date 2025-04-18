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
import io.github.vrchatapi.model.Jam;
import io.github.vrchatapi.model.Submission;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class JamsApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public JamsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public JamsApi(ApiClient apiClient) {
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
     * Build call for getJam
     * @param jamId Must be a valid query ID. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a Jam object. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Error response when trying to show information about a non-existent jam. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getJamCall(String jamId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/jams/{jamId}"
            .replace("{" + "jamId" + "}", localVarApiClient.escapeString(jamId.toString()));

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
    private okhttp3.Call getJamValidateBeforeCall(String jamId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'jamId' is set
        if (jamId == null) {
            throw new ApiException("Missing the required parameter 'jamId' when calling getJam(Async)");
        }

        return getJamCall(jamId, _callback);

    }

    /**
     * Show jam information
     * Returns a jam.
     * @param jamId Must be a valid query ID. (required)
     * @return Jam
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a Jam object. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Error response when trying to show information about a non-existent jam. </td><td>  -  </td></tr>
     </table>
     */
    public Jam getJam(String jamId) throws ApiException {
        ApiResponse<Jam> localVarResp = getJamWithHttpInfo(jamId);
        return localVarResp.getData();
    }

    /**
     * Show jam information
     * Returns a jam.
     * @param jamId Must be a valid query ID. (required)
     * @return ApiResponse&lt;Jam&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a Jam object. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Error response when trying to show information about a non-existent jam. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Jam> getJamWithHttpInfo(String jamId) throws ApiException {
        okhttp3.Call localVarCall = getJamValidateBeforeCall(jamId, null);
        Type localVarReturnType = new TypeToken<Jam>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Show jam information (asynchronously)
     * Returns a jam.
     * @param jamId Must be a valid query ID. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a Jam object. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Error response when trying to show information about a non-existent jam. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getJamAsync(String jamId, final ApiCallback<Jam> _callback) throws ApiException {

        okhttp3.Call localVarCall = getJamValidateBeforeCall(jamId, _callback);
        Type localVarReturnType = new TypeToken<Jam>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getJamSubmissions
     * @param jamId Must be a valid query ID. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a list of Submission objects. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Error response when trying to show information about a non-existent jam. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getJamSubmissionsCall(String jamId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/jams/{jamId}/submissions"
            .replace("{" + "jamId" + "}", localVarApiClient.escapeString(jamId.toString()));

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
    private okhttp3.Call getJamSubmissionsValidateBeforeCall(String jamId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'jamId' is set
        if (jamId == null) {
            throw new ApiException("Missing the required parameter 'jamId' when calling getJamSubmissions(Async)");
        }

        return getJamSubmissionsCall(jamId, _callback);

    }

    /**
     * Show jam submissions
     * Returns all submissions of a jam.
     * @param jamId Must be a valid query ID. (required)
     * @return List&lt;Submission&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a list of Submission objects. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Error response when trying to show information about a non-existent jam. </td><td>  -  </td></tr>
     </table>
     */
    public List<Submission> getJamSubmissions(String jamId) throws ApiException {
        ApiResponse<List<Submission>> localVarResp = getJamSubmissionsWithHttpInfo(jamId);
        return localVarResp.getData();
    }

    /**
     * Show jam submissions
     * Returns all submissions of a jam.
     * @param jamId Must be a valid query ID. (required)
     * @return ApiResponse&lt;List&lt;Submission&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a list of Submission objects. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Error response when trying to show information about a non-existent jam. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<Submission>> getJamSubmissionsWithHttpInfo(String jamId) throws ApiException {
        okhttp3.Call localVarCall = getJamSubmissionsValidateBeforeCall(jamId, null);
        Type localVarReturnType = new TypeToken<List<Submission>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Show jam submissions (asynchronously)
     * Returns all submissions of a jam.
     * @param jamId Must be a valid query ID. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a list of Submission objects. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Error response when trying to show information about a non-existent jam. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getJamSubmissionsAsync(String jamId, final ApiCallback<List<Submission>> _callback) throws ApiException {

        okhttp3.Call localVarCall = getJamSubmissionsValidateBeforeCall(jamId, _callback);
        Type localVarReturnType = new TypeToken<List<Submission>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getJams
     * @param type Only show jams of this type (&#x60;avatar&#x60; or &#x60;world&#x60;). (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a list of Jam objects. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getJamsCall(String type, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/jams";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (type != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("type", type));
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
    private okhttp3.Call getJamsValidateBeforeCall(String type, final ApiCallback _callback) throws ApiException {
        return getJamsCall(type, _callback);

    }

    /**
     * Show jams list
     * Lists World Jams or Avatar Jams, both currently running and ones that have ended.  &#x60;isActive&#x60; is used to select only active or already ended jams.  &#x60;type&#x60; is used to select only world or avatar jams, and can only take &#x60;world&#x60; or &#x60;avatar&#x60;. &#x60;&#x60;
     * @param type Only show jams of this type (&#x60;avatar&#x60; or &#x60;world&#x60;). (optional)
     * @return List&lt;Jam&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a list of Jam objects. </td><td>  -  </td></tr>
     </table>
     */
    public List<Jam> getJams(String type) throws ApiException {
        ApiResponse<List<Jam>> localVarResp = getJamsWithHttpInfo(type);
        return localVarResp.getData();
    }

    /**
     * Show jams list
     * Lists World Jams or Avatar Jams, both currently running and ones that have ended.  &#x60;isActive&#x60; is used to select only active or already ended jams.  &#x60;type&#x60; is used to select only world or avatar jams, and can only take &#x60;world&#x60; or &#x60;avatar&#x60;. &#x60;&#x60;
     * @param type Only show jams of this type (&#x60;avatar&#x60; or &#x60;world&#x60;). (optional)
     * @return ApiResponse&lt;List&lt;Jam&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a list of Jam objects. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<Jam>> getJamsWithHttpInfo(String type) throws ApiException {
        okhttp3.Call localVarCall = getJamsValidateBeforeCall(type, null);
        Type localVarReturnType = new TypeToken<List<Jam>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Show jams list (asynchronously)
     * Lists World Jams or Avatar Jams, both currently running and ones that have ended.  &#x60;isActive&#x60; is used to select only active or already ended jams.  &#x60;type&#x60; is used to select only world or avatar jams, and can only take &#x60;world&#x60; or &#x60;avatar&#x60;. &#x60;&#x60;
     * @param type Only show jams of this type (&#x60;avatar&#x60; or &#x60;world&#x60;). (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a list of Jam objects. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getJamsAsync(String type, final ApiCallback<List<Jam>> _callback) throws ApiException {

        okhttp3.Call localVarCall = getJamsValidateBeforeCall(type, _callback);
        Type localVarReturnType = new TypeToken<List<Jam>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
