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
import io.github.vrchatapi.model.InlineObject3;
import io.github.vrchatapi.model.InlineObject4;
import io.github.vrchatapi.model.InlineObject5;
import io.github.vrchatapi.model.InlineResponse2004;
import io.github.vrchatapi.model.InlineResponse2005;
import io.github.vrchatapi.model.Success;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FilesApi {
    private ApiClient localVarApiClient;

    public FilesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public FilesApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for createFile
     * @param inlineObject3  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a single File object. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createFileCall(InlineObject3 inlineObject3, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = inlineObject3;

        // create path and map variables
        String localVarPath = "/file";

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
    private okhttp3.Call createFileValidateBeforeCall(InlineObject3 inlineObject3, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = createFileCall(inlineObject3, _callback);
        return localVarCall;

    }

    /**
     * Create File
     * Creates a new File object
     * @param inlineObject3  (optional)
     * @return java.io.File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a single File object. </td><td>  -  </td></tr>
     </table>
     */
    public java.io.File createFile(InlineObject3 inlineObject3) throws ApiException {
        ApiResponse<java.io.File> localVarResp = createFileWithHttpInfo(inlineObject3);
        return localVarResp.getData();
    }

    /**
     * Create File
     * Creates a new File object
     * @param inlineObject3  (optional)
     * @return ApiResponse&lt;java.io.File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a single File object. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<java.io.File> createFileWithHttpInfo(InlineObject3 inlineObject3) throws ApiException {
        okhttp3.Call localVarCall = createFileValidateBeforeCall(inlineObject3, null);
        Type localVarReturnType = new TypeToken<java.io.File>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Create File (asynchronously)
     * Creates a new File object
     * @param inlineObject3  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a single File object. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createFileAsync(InlineObject3 inlineObject3, final ApiCallback<java.io.File> _callback) throws ApiException {

        okhttp3.Call localVarCall = createFileValidateBeforeCall(inlineObject3, _callback);
        Type localVarReturnType = new TypeToken<java.io.File>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for createFileVersion
     * @param fileId  (required)
     * @param inlineObject4  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a single File object. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createFileVersionCall(String fileId, InlineObject4 inlineObject4, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = inlineObject4;

        // create path and map variables
        String localVarPath = "/file/{fileId}"
            .replaceAll("\\{" + "fileId" + "\\}", localVarApiClient.escapeString(fileId.toString()));

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
    private okhttp3.Call createFileVersionValidateBeforeCall(String fileId, InlineObject4 inlineObject4, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'fileId' is set
        if (fileId == null) {
            throw new ApiException("Missing the required parameter 'fileId' when calling createFileVersion(Async)");
        }
        

        okhttp3.Call localVarCall = createFileVersionCall(fileId, inlineObject4, _callback);
        return localVarCall;

    }

    /**
     * Create File Version
     * Creates a new FileVersion. Once a Version has been created, proceed to the &#x60;/file/{fileId}/{versionId}/file/start&#x60; endpoint to start a file upload.
     * @param fileId  (required)
     * @param inlineObject4  (optional)
     * @return java.io.File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a single File object. </td><td>  -  </td></tr>
     </table>
     */
    public java.io.File createFileVersion(String fileId, InlineObject4 inlineObject4) throws ApiException {
        ApiResponse<java.io.File> localVarResp = createFileVersionWithHttpInfo(fileId, inlineObject4);
        return localVarResp.getData();
    }

    /**
     * Create File Version
     * Creates a new FileVersion. Once a Version has been created, proceed to the &#x60;/file/{fileId}/{versionId}/file/start&#x60; endpoint to start a file upload.
     * @param fileId  (required)
     * @param inlineObject4  (optional)
     * @return ApiResponse&lt;java.io.File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a single File object. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<java.io.File> createFileVersionWithHttpInfo(String fileId, InlineObject4 inlineObject4) throws ApiException {
        okhttp3.Call localVarCall = createFileVersionValidateBeforeCall(fileId, inlineObject4, null);
        Type localVarReturnType = new TypeToken<java.io.File>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Create File Version (asynchronously)
     * Creates a new FileVersion. Once a Version has been created, proceed to the &#x60;/file/{fileId}/{versionId}/file/start&#x60; endpoint to start a file upload.
     * @param fileId  (required)
     * @param inlineObject4  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a single File object. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createFileVersionAsync(String fileId, InlineObject4 inlineObject4, final ApiCallback<java.io.File> _callback) throws ApiException {

        okhttp3.Call localVarCall = createFileVersionValidateBeforeCall(fileId, inlineObject4, _callback);
        Type localVarReturnType = new TypeToken<java.io.File>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for deleteFile
     * @param fileId  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response after deleting a File. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Error response when trying to delete a non-existent file. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteFileCall(String fileId, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/file/{fileId}"
            .replaceAll("\\{" + "fileId" + "\\}", localVarApiClient.escapeString(fileId.toString()));

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
    private okhttp3.Call deleteFileValidateBeforeCall(String fileId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'fileId' is set
        if (fileId == null) {
            throw new ApiException("Missing the required parameter 'fileId' when calling deleteFile(Async)");
        }
        

        okhttp3.Call localVarCall = deleteFileCall(fileId, _callback);
        return localVarCall;

    }

    /**
     * Delete File
     * Deletes a File object.
     * @param fileId  (required)
     * @return Success
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response after deleting a File. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Error response when trying to delete a non-existent file. </td><td>  -  </td></tr>
     </table>
     */
    public Success deleteFile(String fileId) throws ApiException {
        ApiResponse<Success> localVarResp = deleteFileWithHttpInfo(fileId);
        return localVarResp.getData();
    }

    /**
     * Delete File
     * Deletes a File object.
     * @param fileId  (required)
     * @return ApiResponse&lt;Success&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response after deleting a File. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Error response when trying to delete a non-existent file. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Success> deleteFileWithHttpInfo(String fileId) throws ApiException {
        okhttp3.Call localVarCall = deleteFileValidateBeforeCall(fileId, null);
        Type localVarReturnType = new TypeToken<Success>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Delete File (asynchronously)
     * Deletes a File object.
     * @param fileId  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response after deleting a File. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Error response when trying to delete a non-existent file. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteFileAsync(String fileId, final ApiCallback<Success> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteFileValidateBeforeCall(fileId, _callback);
        Type localVarReturnType = new TypeToken<Success>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for deleteFileVersion
     * @param fileId  (required)
     * @param versionId  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a single File object. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Error response when trying to delete the initial version of a file. Delete the main File object instead. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Error response when trying to delete any version of a file that is not hte last one. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteFileVersionCall(String fileId, Integer versionId, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/file/{fileId}/{versionId}"
            .replaceAll("\\{" + "fileId" + "\\}", localVarApiClient.escapeString(fileId.toString()))
            .replaceAll("\\{" + "versionId" + "\\}", localVarApiClient.escapeString(versionId.toString()));

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
    private okhttp3.Call deleteFileVersionValidateBeforeCall(String fileId, Integer versionId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'fileId' is set
        if (fileId == null) {
            throw new ApiException("Missing the required parameter 'fileId' when calling deleteFileVersion(Async)");
        }
        
        // verify the required parameter 'versionId' is set
        if (versionId == null) {
            throw new ApiException("Missing the required parameter 'versionId' when calling deleteFileVersion(Async)");
        }
        

        okhttp3.Call localVarCall = deleteFileVersionCall(fileId, versionId, _callback);
        return localVarCall;

    }

    /**
     * Delete File Version
     * Delete a specific version of a file. You can only delete the latest version.
     * @param fileId  (required)
     * @param versionId  (required)
     * @return java.io.File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a single File object. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Error response when trying to delete the initial version of a file. Delete the main File object instead. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Error response when trying to delete any version of a file that is not hte last one. </td><td>  -  </td></tr>
     </table>
     */
    public java.io.File deleteFileVersion(String fileId, Integer versionId) throws ApiException {
        ApiResponse<java.io.File> localVarResp = deleteFileVersionWithHttpInfo(fileId, versionId);
        return localVarResp.getData();
    }

    /**
     * Delete File Version
     * Delete a specific version of a file. You can only delete the latest version.
     * @param fileId  (required)
     * @param versionId  (required)
     * @return ApiResponse&lt;java.io.File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a single File object. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Error response when trying to delete the initial version of a file. Delete the main File object instead. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Error response when trying to delete any version of a file that is not hte last one. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<java.io.File> deleteFileVersionWithHttpInfo(String fileId, Integer versionId) throws ApiException {
        okhttp3.Call localVarCall = deleteFileVersionValidateBeforeCall(fileId, versionId, null);
        Type localVarReturnType = new TypeToken<java.io.File>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Delete File Version (asynchronously)
     * Delete a specific version of a file. You can only delete the latest version.
     * @param fileId  (required)
     * @param versionId  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a single File object. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Error response when trying to delete the initial version of a file. Delete the main File object instead. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Error response when trying to delete any version of a file that is not hte last one. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteFileVersionAsync(String fileId, Integer versionId, final ApiCallback<java.io.File> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteFileVersionValidateBeforeCall(fileId, versionId, _callback);
        Type localVarReturnType = new TypeToken<java.io.File>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for downloadFileVersion
     * @param fileId  (required)
     * @param versionId  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Raw file </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call downloadFileVersionCall(String fileId, Integer versionId, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/file/{fileId}/{versionId}"
            .replaceAll("\\{" + "fileId" + "\\}", localVarApiClient.escapeString(fileId.toString()))
            .replaceAll("\\{" + "versionId" + "\\}", localVarApiClient.escapeString(versionId.toString()));

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
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "apiKeyCookie", "authCookie" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call downloadFileVersionValidateBeforeCall(String fileId, Integer versionId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'fileId' is set
        if (fileId == null) {
            throw new ApiException("Missing the required parameter 'fileId' when calling downloadFileVersion(Async)");
        }
        
        // verify the required parameter 'versionId' is set
        if (versionId == null) {
            throw new ApiException("Missing the required parameter 'versionId' when calling downloadFileVersion(Async)");
        }
        

        okhttp3.Call localVarCall = downloadFileVersionCall(fileId, versionId, _callback);
        return localVarCall;

    }

    /**
     * Download File Version
     * Downloads the file with the provided version number.  **Version Note:** Version 0 is always when the file was created. The real data is usually always located in version 1 and up.  **Extension Note:** Files are not guaranteed to have a file extensions. UnityPackage files tends to have it, images through this endpoint do not. You are responsible for appending file extension from the &#x60;extension&#x60; field when neccesary.
     * @param fileId  (required)
     * @param versionId  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Raw file </td><td>  -  </td></tr>
     </table>
     */
    public void downloadFileVersion(String fileId, Integer versionId) throws ApiException {
        downloadFileVersionWithHttpInfo(fileId, versionId);
    }

    /**
     * Download File Version
     * Downloads the file with the provided version number.  **Version Note:** Version 0 is always when the file was created. The real data is usually always located in version 1 and up.  **Extension Note:** Files are not guaranteed to have a file extensions. UnityPackage files tends to have it, images through this endpoint do not. You are responsible for appending file extension from the &#x60;extension&#x60; field when neccesary.
     * @param fileId  (required)
     * @param versionId  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Raw file </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> downloadFileVersionWithHttpInfo(String fileId, Integer versionId) throws ApiException {
        okhttp3.Call localVarCall = downloadFileVersionValidateBeforeCall(fileId, versionId, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Download File Version (asynchronously)
     * Downloads the file with the provided version number.  **Version Note:** Version 0 is always when the file was created. The real data is usually always located in version 1 and up.  **Extension Note:** Files are not guaranteed to have a file extensions. UnityPackage files tends to have it, images through this endpoint do not. You are responsible for appending file extension from the &#x60;extension&#x60; field when neccesary.
     * @param fileId  (required)
     * @param versionId  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Raw file </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call downloadFileVersionAsync(String fileId, Integer versionId, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = downloadFileVersionValidateBeforeCall(fileId, versionId, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for finishFileDataUpload
     * @param fileId  (required)
     * @param versionId  (required)
     * @param fileType  (required)
     * @param inlineObject5  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a single File object. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call finishFileDataUploadCall(String fileId, Integer versionId, String fileType, InlineObject5 inlineObject5, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = inlineObject5;

        // create path and map variables
        String localVarPath = "/file/{fileId}/{versionId}/{fileType}/finish"
            .replaceAll("\\{" + "fileId" + "\\}", localVarApiClient.escapeString(fileId.toString()))
            .replaceAll("\\{" + "versionId" + "\\}", localVarApiClient.escapeString(versionId.toString()))
            .replaceAll("\\{" + "fileType" + "\\}", localVarApiClient.escapeString(fileType.toString()));

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
    private okhttp3.Call finishFileDataUploadValidateBeforeCall(String fileId, Integer versionId, String fileType, InlineObject5 inlineObject5, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'fileId' is set
        if (fileId == null) {
            throw new ApiException("Missing the required parameter 'fileId' when calling finishFileDataUpload(Async)");
        }
        
        // verify the required parameter 'versionId' is set
        if (versionId == null) {
            throw new ApiException("Missing the required parameter 'versionId' when calling finishFileDataUpload(Async)");
        }
        
        // verify the required parameter 'fileType' is set
        if (fileType == null) {
            throw new ApiException("Missing the required parameter 'fileType' when calling finishFileDataUpload(Async)");
        }
        

        okhttp3.Call localVarCall = finishFileDataUploadCall(fileId, versionId, fileType, inlineObject5, _callback);
        return localVarCall;

    }

    /**
     * Finish FileData Upload
     * Finish an upload of a FileData. This will mark it as \&quot;complete\&quot;. After uploading the &#x60;file&#x60; for Avatars and Worlds you then have to upload a &#x60;signature&#x60; file.
     * @param fileId  (required)
     * @param versionId  (required)
     * @param fileType  (required)
     * @param inlineObject5  (optional)
     * @return java.io.File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a single File object. </td><td>  -  </td></tr>
     </table>
     */
    public java.io.File finishFileDataUpload(String fileId, Integer versionId, String fileType, InlineObject5 inlineObject5) throws ApiException {
        ApiResponse<java.io.File> localVarResp = finishFileDataUploadWithHttpInfo(fileId, versionId, fileType, inlineObject5);
        return localVarResp.getData();
    }

    /**
     * Finish FileData Upload
     * Finish an upload of a FileData. This will mark it as \&quot;complete\&quot;. After uploading the &#x60;file&#x60; for Avatars and Worlds you then have to upload a &#x60;signature&#x60; file.
     * @param fileId  (required)
     * @param versionId  (required)
     * @param fileType  (required)
     * @param inlineObject5  (optional)
     * @return ApiResponse&lt;java.io.File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a single File object. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<java.io.File> finishFileDataUploadWithHttpInfo(String fileId, Integer versionId, String fileType, InlineObject5 inlineObject5) throws ApiException {
        okhttp3.Call localVarCall = finishFileDataUploadValidateBeforeCall(fileId, versionId, fileType, inlineObject5, null);
        Type localVarReturnType = new TypeToken<java.io.File>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Finish FileData Upload (asynchronously)
     * Finish an upload of a FileData. This will mark it as \&quot;complete\&quot;. After uploading the &#x60;file&#x60; for Avatars and Worlds you then have to upload a &#x60;signature&#x60; file.
     * @param fileId  (required)
     * @param versionId  (required)
     * @param fileType  (required)
     * @param inlineObject5  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a single File object. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call finishFileDataUploadAsync(String fileId, Integer versionId, String fileType, InlineObject5 inlineObject5, final ApiCallback<java.io.File> _callback) throws ApiException {

        okhttp3.Call localVarCall = finishFileDataUploadValidateBeforeCall(fileId, versionId, fileType, inlineObject5, _callback);
        Type localVarReturnType = new TypeToken<java.io.File>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getFile
     * @param fileId  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a single File object. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Error response when trying to show information about a non-existent file. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getFileCall(String fileId, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/file/{fileId}"
            .replaceAll("\\{" + "fileId" + "\\}", localVarApiClient.escapeString(fileId.toString()));

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
    private okhttp3.Call getFileValidateBeforeCall(String fileId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'fileId' is set
        if (fileId == null) {
            throw new ApiException("Missing the required parameter 'fileId' when calling getFile(Async)");
        }
        

        okhttp3.Call localVarCall = getFileCall(fileId, _callback);
        return localVarCall;

    }

    /**
     * Show File
     * Shows general information about the \&quot;File\&quot; object. Each File can have several \&quot;Version\&quot;&#39;s, and each Version can have multiple real files or \&quot;Data\&quot; blobs.
     * @param fileId  (required)
     * @return java.io.File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a single File object. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Error response when trying to show information about a non-existent file. </td><td>  -  </td></tr>
     </table>
     */
    public java.io.File getFile(String fileId) throws ApiException {
        ApiResponse<java.io.File> localVarResp = getFileWithHttpInfo(fileId);
        return localVarResp.getData();
    }

    /**
     * Show File
     * Shows general information about the \&quot;File\&quot; object. Each File can have several \&quot;Version\&quot;&#39;s, and each Version can have multiple real files or \&quot;Data\&quot; blobs.
     * @param fileId  (required)
     * @return ApiResponse&lt;java.io.File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a single File object. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Error response when trying to show information about a non-existent file. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<java.io.File> getFileWithHttpInfo(String fileId) throws ApiException {
        okhttp3.Call localVarCall = getFileValidateBeforeCall(fileId, null);
        Type localVarReturnType = new TypeToken<java.io.File>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Show File (asynchronously)
     * Shows general information about the \&quot;File\&quot; object. Each File can have several \&quot;Version\&quot;&#39;s, and each Version can have multiple real files or \&quot;Data\&quot; blobs.
     * @param fileId  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a single File object. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Error response when trying to show information about a non-existent file. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getFileAsync(String fileId, final ApiCallback<java.io.File> _callback) throws ApiException {

        okhttp3.Call localVarCall = getFileValidateBeforeCall(fileId, _callback);
        Type localVarReturnType = new TypeToken<java.io.File>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getFileDataUploadStatus
     * @param fileId  (required)
     * @param versionId  (required)
     * @param fileType  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Current FileVersion upload status. Contains the uploadId needed for uploading, as well as the already uploaded parts. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getFileDataUploadStatusCall(String fileId, Integer versionId, String fileType, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/file/{fileId}/{versionId}/{fileType}/status"
            .replaceAll("\\{" + "fileId" + "\\}", localVarApiClient.escapeString(fileId.toString()))
            .replaceAll("\\{" + "versionId" + "\\}", localVarApiClient.escapeString(versionId.toString()))
            .replaceAll("\\{" + "fileType" + "\\}", localVarApiClient.escapeString(fileType.toString()));

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
    private okhttp3.Call getFileDataUploadStatusValidateBeforeCall(String fileId, Integer versionId, String fileType, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'fileId' is set
        if (fileId == null) {
            throw new ApiException("Missing the required parameter 'fileId' when calling getFileDataUploadStatus(Async)");
        }
        
        // verify the required parameter 'versionId' is set
        if (versionId == null) {
            throw new ApiException("Missing the required parameter 'versionId' when calling getFileDataUploadStatus(Async)");
        }
        
        // verify the required parameter 'fileType' is set
        if (fileType == null) {
            throw new ApiException("Missing the required parameter 'fileType' when calling getFileDataUploadStatus(Async)");
        }
        

        okhttp3.Call localVarCall = getFileDataUploadStatusCall(fileId, versionId, fileType, _callback);
        return localVarCall;

    }

    /**
     * Check FileData Upload Status
     * Retrieves the upload status for file upload. Can currently only be accessed when &#x60;status&#x60; is &#x60;waiting&#x60;. Trying to access it on a file version already uploaded currently times out.
     * @param fileId  (required)
     * @param versionId  (required)
     * @param fileType  (required)
     * @return InlineResponse2004
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Current FileVersion upload status. Contains the uploadId needed for uploading, as well as the already uploaded parts. </td><td>  -  </td></tr>
     </table>
     */
    public InlineResponse2004 getFileDataUploadStatus(String fileId, Integer versionId, String fileType) throws ApiException {
        ApiResponse<InlineResponse2004> localVarResp = getFileDataUploadStatusWithHttpInfo(fileId, versionId, fileType);
        return localVarResp.getData();
    }

    /**
     * Check FileData Upload Status
     * Retrieves the upload status for file upload. Can currently only be accessed when &#x60;status&#x60; is &#x60;waiting&#x60;. Trying to access it on a file version already uploaded currently times out.
     * @param fileId  (required)
     * @param versionId  (required)
     * @param fileType  (required)
     * @return ApiResponse&lt;InlineResponse2004&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Current FileVersion upload status. Contains the uploadId needed for uploading, as well as the already uploaded parts. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<InlineResponse2004> getFileDataUploadStatusWithHttpInfo(String fileId, Integer versionId, String fileType) throws ApiException {
        okhttp3.Call localVarCall = getFileDataUploadStatusValidateBeforeCall(fileId, versionId, fileType, null);
        Type localVarReturnType = new TypeToken<InlineResponse2004>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Check FileData Upload Status (asynchronously)
     * Retrieves the upload status for file upload. Can currently only be accessed when &#x60;status&#x60; is &#x60;waiting&#x60;. Trying to access it on a file version already uploaded currently times out.
     * @param fileId  (required)
     * @param versionId  (required)
     * @param fileType  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Current FileVersion upload status. Contains the uploadId needed for uploading, as well as the already uploaded parts. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getFileDataUploadStatusAsync(String fileId, Integer versionId, String fileType, final ApiCallback<InlineResponse2004> _callback) throws ApiException {

        okhttp3.Call localVarCall = getFileDataUploadStatusValidateBeforeCall(fileId, versionId, fileType, _callback);
        Type localVarReturnType = new TypeToken<InlineResponse2004>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getFiles
     * @param tag Tag, for example \&quot;icon\&quot; or \&quot;gallery\&quot;, not included by default. (optional)
     * @param userId UserID, will always generate a 500 permission error. (optional)
     * @param n The number of objects to return. (optional, default to 60)
     * @param offset A zero-based offset from the default object sorting from where search results start. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a list of File objects. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getFilesCall(String tag, String userId, Integer n, Integer offset, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/files";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (tag != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("tag", tag));
        }

        if (userId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("userId", userId));
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
    private okhttp3.Call getFilesValidateBeforeCall(String tag, String userId, Integer n, Integer offset, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = getFilesCall(tag, userId, n, offset, _callback);
        return localVarCall;

    }

    /**
     * List Files
     * Returns a list of files
     * @param tag Tag, for example \&quot;icon\&quot; or \&quot;gallery\&quot;, not included by default. (optional)
     * @param userId UserID, will always generate a 500 permission error. (optional)
     * @param n The number of objects to return. (optional, default to 60)
     * @param offset A zero-based offset from the default object sorting from where search results start. (optional)
     * @return List&lt;java.io.File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a list of File objects. </td><td>  -  </td></tr>
     </table>
     */
    public List<java.io.File> getFiles(String tag, String userId, Integer n, Integer offset) throws ApiException {
        ApiResponse<List<java.io.File>> localVarResp = getFilesWithHttpInfo(tag, userId, n, offset);
        return localVarResp.getData();
    }

    /**
     * List Files
     * Returns a list of files
     * @param tag Tag, for example \&quot;icon\&quot; or \&quot;gallery\&quot;, not included by default. (optional)
     * @param userId UserID, will always generate a 500 permission error. (optional)
     * @param n The number of objects to return. (optional, default to 60)
     * @param offset A zero-based offset from the default object sorting from where search results start. (optional)
     * @return ApiResponse&lt;List&lt;java.io.File&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a list of File objects. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<java.io.File>> getFilesWithHttpInfo(String tag, String userId, Integer n, Integer offset) throws ApiException {
        okhttp3.Call localVarCall = getFilesValidateBeforeCall(tag, userId, n, offset, null);
        Type localVarReturnType = new TypeToken<List<java.io.File>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * List Files (asynchronously)
     * Returns a list of files
     * @param tag Tag, for example \&quot;icon\&quot; or \&quot;gallery\&quot;, not included by default. (optional)
     * @param userId UserID, will always generate a 500 permission error. (optional)
     * @param n The number of objects to return. (optional, default to 60)
     * @param offset A zero-based offset from the default object sorting from where search results start. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a list of File objects. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getFilesAsync(String tag, String userId, Integer n, Integer offset, final ApiCallback<List<java.io.File>> _callback) throws ApiException {

        okhttp3.Call localVarCall = getFilesValidateBeforeCall(tag, userId, n, offset, _callback);
        Type localVarReturnType = new TypeToken<List<java.io.File>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for startFileDataUpload
     * @param fileId  (required)
     * @param versionId  (required)
     * @param fileType  (required)
     * @param partNumber  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> See [https://docs.aws.amazon.com/AmazonS3/latest/API/API_PutObject.html](AWS REST docs - PUT Object) </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Error response when trying to start an upload against a FileVersion that is already marked as  &#x60;complete&#x60;. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call startFileDataUploadCall(String fileId, Integer versionId, String fileType, Integer partNumber, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/file/{fileId}/{versionId}/{fileType}/start"
            .replaceAll("\\{" + "fileId" + "\\}", localVarApiClient.escapeString(fileId.toString()))
            .replaceAll("\\{" + "versionId" + "\\}", localVarApiClient.escapeString(versionId.toString()))
            .replaceAll("\\{" + "fileType" + "\\}", localVarApiClient.escapeString(fileType.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (partNumber != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("partNumber", partNumber));
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
        return localVarApiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call startFileDataUploadValidateBeforeCall(String fileId, Integer versionId, String fileType, Integer partNumber, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'fileId' is set
        if (fileId == null) {
            throw new ApiException("Missing the required parameter 'fileId' when calling startFileDataUpload(Async)");
        }
        
        // verify the required parameter 'versionId' is set
        if (versionId == null) {
            throw new ApiException("Missing the required parameter 'versionId' when calling startFileDataUpload(Async)");
        }
        
        // verify the required parameter 'fileType' is set
        if (fileType == null) {
            throw new ApiException("Missing the required parameter 'fileType' when calling startFileDataUpload(Async)");
        }
        
        // verify the required parameter 'partNumber' is set
        if (partNumber == null) {
            throw new ApiException("Missing the required parameter 'partNumber' when calling startFileDataUpload(Async)");
        }
        

        okhttp3.Call localVarCall = startFileDataUploadCall(fileId, versionId, fileType, partNumber, _callback);
        return localVarCall;

    }

    /**
     * Start FileData Upload
     * Starts an upload of a specific FilePart. This endpoint will return an AWS URL which you can PUT data to. You need to call this and receive a new AWS API URL for each &#x60;partNumber&#x60;. Please see AWS&#39;s REST documentation on \&quot;PUT Object to S3\&quot; on how to upload. Once all parts has been uploaded, proceed to &#x60;/finish&#x60; endpoint.  **Note:** &#x60;nextPartNumber&#x60; seems like it is always ignored. Despite it returning 0, first partNumber is always 1.
     * @param fileId  (required)
     * @param versionId  (required)
     * @param fileType  (required)
     * @param partNumber  (required)
     * @return InlineResponse2005
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> See [https://docs.aws.amazon.com/AmazonS3/latest/API/API_PutObject.html](AWS REST docs - PUT Object) </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Error response when trying to start an upload against a FileVersion that is already marked as  &#x60;complete&#x60;. </td><td>  -  </td></tr>
     </table>
     */
    public InlineResponse2005 startFileDataUpload(String fileId, Integer versionId, String fileType, Integer partNumber) throws ApiException {
        ApiResponse<InlineResponse2005> localVarResp = startFileDataUploadWithHttpInfo(fileId, versionId, fileType, partNumber);
        return localVarResp.getData();
    }

    /**
     * Start FileData Upload
     * Starts an upload of a specific FilePart. This endpoint will return an AWS URL which you can PUT data to. You need to call this and receive a new AWS API URL for each &#x60;partNumber&#x60;. Please see AWS&#39;s REST documentation on \&quot;PUT Object to S3\&quot; on how to upload. Once all parts has been uploaded, proceed to &#x60;/finish&#x60; endpoint.  **Note:** &#x60;nextPartNumber&#x60; seems like it is always ignored. Despite it returning 0, first partNumber is always 1.
     * @param fileId  (required)
     * @param versionId  (required)
     * @param fileType  (required)
     * @param partNumber  (required)
     * @return ApiResponse&lt;InlineResponse2005&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> See [https://docs.aws.amazon.com/AmazonS3/latest/API/API_PutObject.html](AWS REST docs - PUT Object) </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Error response when trying to start an upload against a FileVersion that is already marked as  &#x60;complete&#x60;. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<InlineResponse2005> startFileDataUploadWithHttpInfo(String fileId, Integer versionId, String fileType, Integer partNumber) throws ApiException {
        okhttp3.Call localVarCall = startFileDataUploadValidateBeforeCall(fileId, versionId, fileType, partNumber, null);
        Type localVarReturnType = new TypeToken<InlineResponse2005>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Start FileData Upload (asynchronously)
     * Starts an upload of a specific FilePart. This endpoint will return an AWS URL which you can PUT data to. You need to call this and receive a new AWS API URL for each &#x60;partNumber&#x60;. Please see AWS&#39;s REST documentation on \&quot;PUT Object to S3\&quot; on how to upload. Once all parts has been uploaded, proceed to &#x60;/finish&#x60; endpoint.  **Note:** &#x60;nextPartNumber&#x60; seems like it is always ignored. Despite it returning 0, first partNumber is always 1.
     * @param fileId  (required)
     * @param versionId  (required)
     * @param fileType  (required)
     * @param partNumber  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> See [https://docs.aws.amazon.com/AmazonS3/latest/API/API_PutObject.html](AWS REST docs - PUT Object) </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Error response when trying to start an upload against a FileVersion that is already marked as  &#x60;complete&#x60;. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call startFileDataUploadAsync(String fileId, Integer versionId, String fileType, Integer partNumber, final ApiCallback<InlineResponse2005> _callback) throws ApiException {

        okhttp3.Call localVarCall = startFileDataUploadValidateBeforeCall(fileId, versionId, fileType, partNumber, _callback);
        Type localVarReturnType = new TypeToken<InlineResponse2005>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
