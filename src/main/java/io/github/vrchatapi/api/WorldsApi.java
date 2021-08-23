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
import io.github.vrchatapi.model.InlineObject6;
import io.github.vrchatapi.model.InlineObject7;
import io.github.vrchatapi.model.InlineResponse2006;
import io.github.vrchatapi.model.InlineResponse2007;
import io.github.vrchatapi.model.InlineResponse401;
import io.github.vrchatapi.model.Instance;
import io.github.vrchatapi.model.LimitedWorld;
import io.github.vrchatapi.model.World;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WorldsApi {
    private ApiClient localVarApiClient;

    public WorldsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public WorldsApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for createWorld
     * @param inlineObject6  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a single World object. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Error response when trying create a world without having the neccesary Trust rank yet. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing apiKey or auth cookie. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createWorldCall(InlineObject6 inlineObject6, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = inlineObject6;

        // create path and map variables
        String localVarPath = "/worlds";

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

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call createWorldValidateBeforeCall(InlineObject6 inlineObject6, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = createWorldCall(inlineObject6, _callback);
        return localVarCall;

    }

    /**
     * Create World
     * Create a new world. This endpoint requires &#x60;assetUrl&#x60; to be a valid File object with &#x60;.vrcw&#x60; file extension, and &#x60;imageUrl&#x60; to be a valid File object with an image file extension.
     * @param inlineObject6  (optional)
     * @return World
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a single World object. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Error response when trying create a world without having the neccesary Trust rank yet. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing apiKey or auth cookie. </td><td>  -  </td></tr>
     </table>
     */
    public World createWorld(InlineObject6 inlineObject6) throws ApiException {
        ApiResponse<World> localVarResp = createWorldWithHttpInfo(inlineObject6);
        return localVarResp.getData();
    }

    /**
     * Create World
     * Create a new world. This endpoint requires &#x60;assetUrl&#x60; to be a valid File object with &#x60;.vrcw&#x60; file extension, and &#x60;imageUrl&#x60; to be a valid File object with an image file extension.
     * @param inlineObject6  (optional)
     * @return ApiResponse&lt;World&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a single World object. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Error response when trying create a world without having the neccesary Trust rank yet. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing apiKey or auth cookie. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<World> createWorldWithHttpInfo(InlineObject6 inlineObject6) throws ApiException {
        okhttp3.Call localVarCall = createWorldValidateBeforeCall(inlineObject6, null);
        Type localVarReturnType = new TypeToken<World>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Create World (asynchronously)
     * Create a new world. This endpoint requires &#x60;assetUrl&#x60; to be a valid File object with &#x60;.vrcw&#x60; file extension, and &#x60;imageUrl&#x60; to be a valid File object with an image file extension.
     * @param inlineObject6  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a single World object. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Error response when trying create a world without having the neccesary Trust rank yet. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing apiKey or auth cookie. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createWorldAsync(InlineObject6 inlineObject6, final ApiCallback<World> _callback) throws ApiException {

        okhttp3.Call localVarCall = createWorldValidateBeforeCall(inlineObject6, _callback);
        Type localVarReturnType = new TypeToken<World>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for deleteWorld
     * @param worldId  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing apiKey or auth cookie. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Error response when trying to show information about a non-existent world. Sometimes returns with &#x60;model &lt;worldId&gt; not found&#x60; instead of &#x60;World &lt;worldId not found&#x60;. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteWorldCall(String worldId, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/worlds/{worldId}"
            .replaceAll("\\{" + "worldId" + "\\}", localVarApiClient.escapeString(worldId.toString()));

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
    private okhttp3.Call deleteWorldValidateBeforeCall(String worldId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'worldId' is set
        if (worldId == null) {
            throw new ApiException("Missing the required parameter 'worldId' when calling deleteWorld(Async)");
        }
        

        okhttp3.Call localVarCall = deleteWorldCall(worldId, _callback);
        return localVarCall;

    }

    /**
     * Delete World
     * Delete a world. Notice a world is never fully \&quot;deleted\&quot;, only its ReleaseStatus is set to \&quot;hidden\&quot; and the linked Files are deleted. The WorldID is permanently reserved.
     * @param worldId  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing apiKey or auth cookie. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Error response when trying to show information about a non-existent world. Sometimes returns with &#x60;model &lt;worldId&gt; not found&#x60; instead of &#x60;World &lt;worldId not found&#x60;. </td><td>  -  </td></tr>
     </table>
     */
    public void deleteWorld(String worldId) throws ApiException {
        deleteWorldWithHttpInfo(worldId);
    }

    /**
     * Delete World
     * Delete a world. Notice a world is never fully \&quot;deleted\&quot;, only its ReleaseStatus is set to \&quot;hidden\&quot; and the linked Files are deleted. The WorldID is permanently reserved.
     * @param worldId  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing apiKey or auth cookie. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Error response when trying to show information about a non-existent world. Sometimes returns with &#x60;model &lt;worldId&gt; not found&#x60; instead of &#x60;World &lt;worldId not found&#x60;. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> deleteWorldWithHttpInfo(String worldId) throws ApiException {
        okhttp3.Call localVarCall = deleteWorldValidateBeforeCall(worldId, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Delete World (asynchronously)
     * Delete a world. Notice a world is never fully \&quot;deleted\&quot;, only its ReleaseStatus is set to \&quot;hidden\&quot; and the linked Files are deleted. The WorldID is permanently reserved.
     * @param worldId  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing apiKey or auth cookie. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Error response when trying to show information about a non-existent world. Sometimes returns with &#x60;model &lt;worldId&gt; not found&#x60; instead of &#x60;World &lt;worldId not found&#x60;. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteWorldAsync(String worldId, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteWorldValidateBeforeCall(worldId, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for getActiveWorlds
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
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a list of LimitedWorld objects. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing apiKey or auth cookie. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getActiveWorldsCall(String featured, String sort, Integer n, String order, Integer offset, String search, String tag, String notag, String releaseStatus, String maxUnityVersion, String minUnityVersion, String platform, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/worlds/active";

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
    private okhttp3.Call getActiveWorldsValidateBeforeCall(String featured, String sort, Integer n, String order, Integer offset, String search, String tag, String notag, String releaseStatus, String maxUnityVersion, String minUnityVersion, String platform, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = getActiveWorldsCall(featured, sort, n, order, offset, search, tag, notag, releaseStatus, maxUnityVersion, minUnityVersion, platform, _callback);
        return localVarCall;

    }

    /**
     * List Active Worlds
     * Search and list currently Active worlds by query filters.
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
     * @return List&lt;LimitedWorld&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a list of LimitedWorld objects. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing apiKey or auth cookie. </td><td>  -  </td></tr>
     </table>
     */
    public List<LimitedWorld> getActiveWorlds(String featured, String sort, Integer n, String order, Integer offset, String search, String tag, String notag, String releaseStatus, String maxUnityVersion, String minUnityVersion, String platform) throws ApiException {
        ApiResponse<List<LimitedWorld>> localVarResp = getActiveWorldsWithHttpInfo(featured, sort, n, order, offset, search, tag, notag, releaseStatus, maxUnityVersion, minUnityVersion, platform);
        return localVarResp.getData();
    }

    /**
     * List Active Worlds
     * Search and list currently Active worlds by query filters.
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
     * @return ApiResponse&lt;List&lt;LimitedWorld&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a list of LimitedWorld objects. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing apiKey or auth cookie. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<LimitedWorld>> getActiveWorldsWithHttpInfo(String featured, String sort, Integer n, String order, Integer offset, String search, String tag, String notag, String releaseStatus, String maxUnityVersion, String minUnityVersion, String platform) throws ApiException {
        okhttp3.Call localVarCall = getActiveWorldsValidateBeforeCall(featured, sort, n, order, offset, search, tag, notag, releaseStatus, maxUnityVersion, minUnityVersion, platform, null);
        Type localVarReturnType = new TypeToken<List<LimitedWorld>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * List Active Worlds (asynchronously)
     * Search and list currently Active worlds by query filters.
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
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a list of LimitedWorld objects. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing apiKey or auth cookie. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getActiveWorldsAsync(String featured, String sort, Integer n, String order, Integer offset, String search, String tag, String notag, String releaseStatus, String maxUnityVersion, String minUnityVersion, String platform, final ApiCallback<List<LimitedWorld>> _callback) throws ApiException {

        okhttp3.Call localVarCall = getActiveWorldsValidateBeforeCall(featured, sort, n, order, offset, search, tag, notag, releaseStatus, maxUnityVersion, minUnityVersion, platform, _callback);
        Type localVarReturnType = new TypeToken<List<LimitedWorld>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getFavoritedWorlds
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
        <tr><td> 200 </td><td> Returns a list of LimitedWorld objects. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing apiKey or auth cookie. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Error response when trying to see favourites of another user without sufficient admin permissions. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getFavoritedWorldsCall(String featured, String sort, Integer n, String order, Integer offset, String search, String tag, String notag, String releaseStatus, String maxUnityVersion, String minUnityVersion, String platform, String userId, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/worlds/favorites";

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
    private okhttp3.Call getFavoritedWorldsValidateBeforeCall(String featured, String sort, Integer n, String order, Integer offset, String search, String tag, String notag, String releaseStatus, String maxUnityVersion, String minUnityVersion, String platform, String userId, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = getFavoritedWorldsCall(featured, sort, n, order, offset, search, tag, notag, releaseStatus, maxUnityVersion, minUnityVersion, platform, userId, _callback);
        return localVarCall;

    }

    /**
     * List Favorited Worlds
     * Search and list favorited worlds by query filters.
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
     * @return List&lt;LimitedWorld&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a list of LimitedWorld objects. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing apiKey or auth cookie. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Error response when trying to see favourites of another user without sufficient admin permissions. </td><td>  -  </td></tr>
     </table>
     */
    public List<LimitedWorld> getFavoritedWorlds(String featured, String sort, Integer n, String order, Integer offset, String search, String tag, String notag, String releaseStatus, String maxUnityVersion, String minUnityVersion, String platform, String userId) throws ApiException {
        ApiResponse<List<LimitedWorld>> localVarResp = getFavoritedWorldsWithHttpInfo(featured, sort, n, order, offset, search, tag, notag, releaseStatus, maxUnityVersion, minUnityVersion, platform, userId);
        return localVarResp.getData();
    }

    /**
     * List Favorited Worlds
     * Search and list favorited worlds by query filters.
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
     * @return ApiResponse&lt;List&lt;LimitedWorld&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a list of LimitedWorld objects. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing apiKey or auth cookie. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Error response when trying to see favourites of another user without sufficient admin permissions. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<LimitedWorld>> getFavoritedWorldsWithHttpInfo(String featured, String sort, Integer n, String order, Integer offset, String search, String tag, String notag, String releaseStatus, String maxUnityVersion, String minUnityVersion, String platform, String userId) throws ApiException {
        okhttp3.Call localVarCall = getFavoritedWorldsValidateBeforeCall(featured, sort, n, order, offset, search, tag, notag, releaseStatus, maxUnityVersion, minUnityVersion, platform, userId, null);
        Type localVarReturnType = new TypeToken<List<LimitedWorld>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * List Favorited Worlds (asynchronously)
     * Search and list favorited worlds by query filters.
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
        <tr><td> 200 </td><td> Returns a list of LimitedWorld objects. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing apiKey or auth cookie. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Error response when trying to see favourites of another user without sufficient admin permissions. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getFavoritedWorldsAsync(String featured, String sort, Integer n, String order, Integer offset, String search, String tag, String notag, String releaseStatus, String maxUnityVersion, String minUnityVersion, String platform, String userId, final ApiCallback<List<LimitedWorld>> _callback) throws ApiException {

        okhttp3.Call localVarCall = getFavoritedWorldsValidateBeforeCall(featured, sort, n, order, offset, search, tag, notag, releaseStatus, maxUnityVersion, minUnityVersion, platform, userId, _callback);
        Type localVarReturnType = new TypeToken<List<LimitedWorld>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getRecentWorlds
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
        <tr><td> 200 </td><td> Returns a list of LimitedWorld objects. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing apiKey or auth cookie. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Error response when trying to accept a see recently visited worlds of another user without sufficient admin permissions. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getRecentWorldsCall(String featured, String sort, Integer n, String order, Integer offset, String search, String tag, String notag, String releaseStatus, String maxUnityVersion, String minUnityVersion, String platform, String userId, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/worlds/recent";

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
    private okhttp3.Call getRecentWorldsValidateBeforeCall(String featured, String sort, Integer n, String order, Integer offset, String search, String tag, String notag, String releaseStatus, String maxUnityVersion, String minUnityVersion, String platform, String userId, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = getRecentWorldsCall(featured, sort, n, order, offset, search, tag, notag, releaseStatus, maxUnityVersion, minUnityVersion, platform, userId, _callback);
        return localVarCall;

    }

    /**
     * List Recent Worlds
     * Search and list recently visited worlds by query filters.
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
     * @return List&lt;LimitedWorld&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a list of LimitedWorld objects. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing apiKey or auth cookie. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Error response when trying to accept a see recently visited worlds of another user without sufficient admin permissions. </td><td>  -  </td></tr>
     </table>
     */
    public List<LimitedWorld> getRecentWorlds(String featured, String sort, Integer n, String order, Integer offset, String search, String tag, String notag, String releaseStatus, String maxUnityVersion, String minUnityVersion, String platform, String userId) throws ApiException {
        ApiResponse<List<LimitedWorld>> localVarResp = getRecentWorldsWithHttpInfo(featured, sort, n, order, offset, search, tag, notag, releaseStatus, maxUnityVersion, minUnityVersion, platform, userId);
        return localVarResp.getData();
    }

    /**
     * List Recent Worlds
     * Search and list recently visited worlds by query filters.
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
     * @return ApiResponse&lt;List&lt;LimitedWorld&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a list of LimitedWorld objects. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing apiKey or auth cookie. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Error response when trying to accept a see recently visited worlds of another user without sufficient admin permissions. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<LimitedWorld>> getRecentWorldsWithHttpInfo(String featured, String sort, Integer n, String order, Integer offset, String search, String tag, String notag, String releaseStatus, String maxUnityVersion, String minUnityVersion, String platform, String userId) throws ApiException {
        okhttp3.Call localVarCall = getRecentWorldsValidateBeforeCall(featured, sort, n, order, offset, search, tag, notag, releaseStatus, maxUnityVersion, minUnityVersion, platform, userId, null);
        Type localVarReturnType = new TypeToken<List<LimitedWorld>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * List Recent Worlds (asynchronously)
     * Search and list recently visited worlds by query filters.
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
        <tr><td> 200 </td><td> Returns a list of LimitedWorld objects. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing apiKey or auth cookie. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Error response when trying to accept a see recently visited worlds of another user without sufficient admin permissions. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getRecentWorldsAsync(String featured, String sort, Integer n, String order, Integer offset, String search, String tag, String notag, String releaseStatus, String maxUnityVersion, String minUnityVersion, String platform, String userId, final ApiCallback<List<LimitedWorld>> _callback) throws ApiException {

        okhttp3.Call localVarCall = getRecentWorldsValidateBeforeCall(featured, sort, n, order, offset, search, tag, notag, releaseStatus, maxUnityVersion, minUnityVersion, platform, userId, _callback);
        Type localVarReturnType = new TypeToken<List<LimitedWorld>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getWorld
     * @param worldId  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a single World object. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Error response when trying to show information about a non-existent world. Sometimes returns with &#x60;model &lt;worldId&gt; not found&#x60; instead of &#x60;World &lt;worldId not found&#x60;. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getWorldCall(String worldId, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/worlds/{worldId}"
            .replaceAll("\\{" + "worldId" + "\\}", localVarApiClient.escapeString(worldId.toString()));

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

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getWorldValidateBeforeCall(String worldId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'worldId' is set
        if (worldId == null) {
            throw new ApiException("Missing the required parameter 'worldId' when calling getWorld(Async)");
        }
        

        okhttp3.Call localVarCall = getWorldCall(worldId, _callback);
        return localVarCall;

    }

    /**
     * Get World by ID
     * Get information about a specific World.
     * @param worldId  (required)
     * @return World
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a single World object. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Error response when trying to show information about a non-existent world. Sometimes returns with &#x60;model &lt;worldId&gt; not found&#x60; instead of &#x60;World &lt;worldId not found&#x60;. </td><td>  -  </td></tr>
     </table>
     */
    public World getWorld(String worldId) throws ApiException {
        ApiResponse<World> localVarResp = getWorldWithHttpInfo(worldId);
        return localVarResp.getData();
    }

    /**
     * Get World by ID
     * Get information about a specific World.
     * @param worldId  (required)
     * @return ApiResponse&lt;World&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a single World object. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Error response when trying to show information about a non-existent world. Sometimes returns with &#x60;model &lt;worldId&gt; not found&#x60; instead of &#x60;World &lt;worldId not found&#x60;. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<World> getWorldWithHttpInfo(String worldId) throws ApiException {
        okhttp3.Call localVarCall = getWorldValidateBeforeCall(worldId, null);
        Type localVarReturnType = new TypeToken<World>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get World by ID (asynchronously)
     * Get information about a specific World.
     * @param worldId  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a single World object. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Error response when trying to show information about a non-existent world. Sometimes returns with &#x60;model &lt;worldId&gt; not found&#x60; instead of &#x60;World &lt;worldId not found&#x60;. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getWorldAsync(String worldId, final ApiCallback<World> _callback) throws ApiException {

        okhttp3.Call localVarCall = getWorldValidateBeforeCall(worldId, _callback);
        Type localVarReturnType = new TypeToken<World>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getWorldInstance
     * @param worldId  (required)
     * @param instanceId  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a single Instance object. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing apiKey or auth cookie. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getWorldInstanceCall(String worldId, String instanceId, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/worlds/{worldId}/{instanceId}"
            .replaceAll("\\{" + "worldId" + "\\}", localVarApiClient.escapeString(worldId.toString()))
            .replaceAll("\\{" + "instanceId" + "\\}", localVarApiClient.escapeString(instanceId.toString()));

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
    private okhttp3.Call getWorldInstanceValidateBeforeCall(String worldId, String instanceId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'worldId' is set
        if (worldId == null) {
            throw new ApiException("Missing the required parameter 'worldId' when calling getWorldInstance(Async)");
        }
        
        // verify the required parameter 'instanceId' is set
        if (instanceId == null) {
            throw new ApiException("Missing the required parameter 'instanceId' when calling getWorldInstance(Async)");
        }
        

        okhttp3.Call localVarCall = getWorldInstanceCall(worldId, instanceId, _callback);
        return localVarCall;

    }

    /**
     * Get World Instance
     * Returns a worlds instance.
     * @param worldId  (required)
     * @param instanceId  (required)
     * @return Instance
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a single Instance object. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing apiKey or auth cookie. </td><td>  -  </td></tr>
     </table>
     */
    public Instance getWorldInstance(String worldId, String instanceId) throws ApiException {
        ApiResponse<Instance> localVarResp = getWorldInstanceWithHttpInfo(worldId, instanceId);
        return localVarResp.getData();
    }

    /**
     * Get World Instance
     * Returns a worlds instance.
     * @param worldId  (required)
     * @param instanceId  (required)
     * @return ApiResponse&lt;Instance&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a single Instance object. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing apiKey or auth cookie. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Instance> getWorldInstanceWithHttpInfo(String worldId, String instanceId) throws ApiException {
        okhttp3.Call localVarCall = getWorldInstanceValidateBeforeCall(worldId, instanceId, null);
        Type localVarReturnType = new TypeToken<Instance>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get World Instance (asynchronously)
     * Returns a worlds instance.
     * @param worldId  (required)
     * @param instanceId  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a single Instance object. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing apiKey or auth cookie. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getWorldInstanceAsync(String worldId, String instanceId, final ApiCallback<Instance> _callback) throws ApiException {

        okhttp3.Call localVarCall = getWorldInstanceValidateBeforeCall(worldId, instanceId, _callback);
        Type localVarReturnType = new TypeToken<Instance>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getWorldMetadata
     * @param worldId  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Error response when trying to show information about a non-existent world. Sometimes returns with &#x60;model &lt;worldId&gt; not found&#x60; instead of &#x60;World &lt;worldId not found&#x60;. </td><td>  -  </td></tr>
     </table>
     * @deprecated
     */
    @Deprecated
    public okhttp3.Call getWorldMetadataCall(String worldId, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/worlds/{worldId}/metadata"
            .replaceAll("\\{" + "worldId" + "\\}", localVarApiClient.escapeString(worldId.toString()));

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

    @Deprecated
    @SuppressWarnings("rawtypes")
    private okhttp3.Call getWorldMetadataValidateBeforeCall(String worldId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'worldId' is set
        if (worldId == null) {
            throw new ApiException("Missing the required parameter 'worldId' when calling getWorldMetadata(Async)");
        }
        

        okhttp3.Call localVarCall = getWorldMetadataCall(worldId, _callback);
        return localVarCall;

    }

    /**
     * Get World Metadata
     * Return a worlds custom metadata. This is currently believed to be unused. Metadata can be set with &#x60;updateWorld&#x60; and can be any arbitrary object.
     * @param worldId  (required)
     * @return InlineResponse2006
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Error response when trying to show information about a non-existent world. Sometimes returns with &#x60;model &lt;worldId&gt; not found&#x60; instead of &#x60;World &lt;worldId not found&#x60;. </td><td>  -  </td></tr>
     </table>
     * @deprecated
     */
    @Deprecated
    public InlineResponse2006 getWorldMetadata(String worldId) throws ApiException {
        ApiResponse<InlineResponse2006> localVarResp = getWorldMetadataWithHttpInfo(worldId);
        return localVarResp.getData();
    }

    /**
     * Get World Metadata
     * Return a worlds custom metadata. This is currently believed to be unused. Metadata can be set with &#x60;updateWorld&#x60; and can be any arbitrary object.
     * @param worldId  (required)
     * @return ApiResponse&lt;InlineResponse2006&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Error response when trying to show information about a non-existent world. Sometimes returns with &#x60;model &lt;worldId&gt; not found&#x60; instead of &#x60;World &lt;worldId not found&#x60;. </td><td>  -  </td></tr>
     </table>
     * @deprecated
     */
    @Deprecated
    public ApiResponse<InlineResponse2006> getWorldMetadataWithHttpInfo(String worldId) throws ApiException {
        okhttp3.Call localVarCall = getWorldMetadataValidateBeforeCall(worldId, null);
        Type localVarReturnType = new TypeToken<InlineResponse2006>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get World Metadata (asynchronously)
     * Return a worlds custom metadata. This is currently believed to be unused. Metadata can be set with &#x60;updateWorld&#x60; and can be any arbitrary object.
     * @param worldId  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Error response when trying to show information about a non-existent world. Sometimes returns with &#x60;model &lt;worldId&gt; not found&#x60; instead of &#x60;World &lt;worldId not found&#x60;. </td><td>  -  </td></tr>
     </table>
     * @deprecated
     */
    @Deprecated
    public okhttp3.Call getWorldMetadataAsync(String worldId, final ApiCallback<InlineResponse2006> _callback) throws ApiException {

        okhttp3.Call localVarCall = getWorldMetadataValidateBeforeCall(worldId, _callback);
        Type localVarReturnType = new TypeToken<InlineResponse2006>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getWorldPublishStatus
     * @param worldId  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing apiKey or auth cookie. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Error response when trying to show information about a non-existent world. Sometimes returns with &#x60;model &lt;worldId&gt; not found&#x60; instead of &#x60;World &lt;worldId not found&#x60;. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getWorldPublishStatusCall(String worldId, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/worlds/{worldId}/publish"
            .replaceAll("\\{" + "worldId" + "\\}", localVarApiClient.escapeString(worldId.toString()));

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
    private okhttp3.Call getWorldPublishStatusValidateBeforeCall(String worldId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'worldId' is set
        if (worldId == null) {
            throw new ApiException("Missing the required parameter 'worldId' when calling getWorldPublishStatus(Async)");
        }
        

        okhttp3.Call localVarCall = getWorldPublishStatusCall(worldId, _callback);
        return localVarCall;

    }

    /**
     * Get World Publish Status
     * Returns a worlds publish status.
     * @param worldId  (required)
     * @return InlineResponse2007
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing apiKey or auth cookie. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Error response when trying to show information about a non-existent world. Sometimes returns with &#x60;model &lt;worldId&gt; not found&#x60; instead of &#x60;World &lt;worldId not found&#x60;. </td><td>  -  </td></tr>
     </table>
     */
    public InlineResponse2007 getWorldPublishStatus(String worldId) throws ApiException {
        ApiResponse<InlineResponse2007> localVarResp = getWorldPublishStatusWithHttpInfo(worldId);
        return localVarResp.getData();
    }

    /**
     * Get World Publish Status
     * Returns a worlds publish status.
     * @param worldId  (required)
     * @return ApiResponse&lt;InlineResponse2007&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing apiKey or auth cookie. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Error response when trying to show information about a non-existent world. Sometimes returns with &#x60;model &lt;worldId&gt; not found&#x60; instead of &#x60;World &lt;worldId not found&#x60;. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<InlineResponse2007> getWorldPublishStatusWithHttpInfo(String worldId) throws ApiException {
        okhttp3.Call localVarCall = getWorldPublishStatusValidateBeforeCall(worldId, null);
        Type localVarReturnType = new TypeToken<InlineResponse2007>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get World Publish Status (asynchronously)
     * Returns a worlds publish status.
     * @param worldId  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing apiKey or auth cookie. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Error response when trying to show information about a non-existent world. Sometimes returns with &#x60;model &lt;worldId&gt; not found&#x60; instead of &#x60;World &lt;worldId not found&#x60;. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getWorldPublishStatusAsync(String worldId, final ApiCallback<InlineResponse2007> _callback) throws ApiException {

        okhttp3.Call localVarCall = getWorldPublishStatusValidateBeforeCall(worldId, _callback);
        Type localVarReturnType = new TypeToken<InlineResponse2007>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for publishWorld
     * @param worldId  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> TODO </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing apiKey or auth cookie. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Error response when trying to show information about a non-existent world. Sometimes returns with &#x60;model &lt;worldId&gt; not found&#x60; instead of &#x60;World &lt;worldId not found&#x60;. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call publishWorldCall(String worldId, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/worlds/{worldId}/publish"
            .replaceAll("\\{" + "worldId" + "\\}", localVarApiClient.escapeString(worldId.toString()));

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
    private okhttp3.Call publishWorldValidateBeforeCall(String worldId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'worldId' is set
        if (worldId == null) {
            throw new ApiException("Missing the required parameter 'worldId' when calling publishWorld(Async)");
        }
        

        okhttp3.Call localVarCall = publishWorldCall(worldId, _callback);
        return localVarCall;

    }

    /**
     * Publish World
     * Publish a world. You can only publish one world per week.
     * @param worldId  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> TODO </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing apiKey or auth cookie. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Error response when trying to show information about a non-existent world. Sometimes returns with &#x60;model &lt;worldId&gt; not found&#x60; instead of &#x60;World &lt;worldId not found&#x60;. </td><td>  -  </td></tr>
     </table>
     */
    public void publishWorld(String worldId) throws ApiException {
        publishWorldWithHttpInfo(worldId);
    }

    /**
     * Publish World
     * Publish a world. You can only publish one world per week.
     * @param worldId  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> TODO </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing apiKey or auth cookie. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Error response when trying to show information about a non-existent world. Sometimes returns with &#x60;model &lt;worldId&gt; not found&#x60; instead of &#x60;World &lt;worldId not found&#x60;. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> publishWorldWithHttpInfo(String worldId) throws ApiException {
        okhttp3.Call localVarCall = publishWorldValidateBeforeCall(worldId, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Publish World (asynchronously)
     * Publish a world. You can only publish one world per week.
     * @param worldId  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> TODO </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing apiKey or auth cookie. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Error response when trying to show information about a non-existent world. Sometimes returns with &#x60;model &lt;worldId&gt; not found&#x60; instead of &#x60;World &lt;worldId not found&#x60;. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call publishWorldAsync(String worldId, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = publishWorldValidateBeforeCall(worldId, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for searchWorlds
     * @param featured Filters on featured results. (optional)
     * @param sort  (optional, default to popularity)
     * @param user Set to &#x60;me&#x60; for searching own worlds. (optional)
     * @param userId Filter by author UserID (optional)
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
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a list of LimitedWorld objects. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing apiKey or auth cookie. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call searchWorldsCall(String featured, String sort, String user, String userId, Integer n, String order, Integer offset, String search, String tag, String notag, String releaseStatus, String maxUnityVersion, String minUnityVersion, String platform, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/worlds";

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
    private okhttp3.Call searchWorldsValidateBeforeCall(String featured, String sort, String user, String userId, Integer n, String order, Integer offset, String search, String tag, String notag, String releaseStatus, String maxUnityVersion, String minUnityVersion, String platform, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = searchWorldsCall(featured, sort, user, userId, n, order, offset, search, tag, notag, releaseStatus, maxUnityVersion, minUnityVersion, platform, _callback);
        return localVarCall;

    }

    /**
     * Search All Worlds
     * Search and list any worlds by query filters.
     * @param featured Filters on featured results. (optional)
     * @param sort  (optional, default to popularity)
     * @param user Set to &#x60;me&#x60; for searching own worlds. (optional)
     * @param userId Filter by author UserID (optional)
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
     * @return List&lt;LimitedWorld&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a list of LimitedWorld objects. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing apiKey or auth cookie. </td><td>  -  </td></tr>
     </table>
     */
    public List<LimitedWorld> searchWorlds(String featured, String sort, String user, String userId, Integer n, String order, Integer offset, String search, String tag, String notag, String releaseStatus, String maxUnityVersion, String minUnityVersion, String platform) throws ApiException {
        ApiResponse<List<LimitedWorld>> localVarResp = searchWorldsWithHttpInfo(featured, sort, user, userId, n, order, offset, search, tag, notag, releaseStatus, maxUnityVersion, minUnityVersion, platform);
        return localVarResp.getData();
    }

    /**
     * Search All Worlds
     * Search and list any worlds by query filters.
     * @param featured Filters on featured results. (optional)
     * @param sort  (optional, default to popularity)
     * @param user Set to &#x60;me&#x60; for searching own worlds. (optional)
     * @param userId Filter by author UserID (optional)
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
     * @return ApiResponse&lt;List&lt;LimitedWorld&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a list of LimitedWorld objects. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing apiKey or auth cookie. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<LimitedWorld>> searchWorldsWithHttpInfo(String featured, String sort, String user, String userId, Integer n, String order, Integer offset, String search, String tag, String notag, String releaseStatus, String maxUnityVersion, String minUnityVersion, String platform) throws ApiException {
        okhttp3.Call localVarCall = searchWorldsValidateBeforeCall(featured, sort, user, userId, n, order, offset, search, tag, notag, releaseStatus, maxUnityVersion, minUnityVersion, platform, null);
        Type localVarReturnType = new TypeToken<List<LimitedWorld>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Search All Worlds (asynchronously)
     * Search and list any worlds by query filters.
     * @param featured Filters on featured results. (optional)
     * @param sort  (optional, default to popularity)
     * @param user Set to &#x60;me&#x60; for searching own worlds. (optional)
     * @param userId Filter by author UserID (optional)
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
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a list of LimitedWorld objects. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing apiKey or auth cookie. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call searchWorldsAsync(String featured, String sort, String user, String userId, Integer n, String order, Integer offset, String search, String tag, String notag, String releaseStatus, String maxUnityVersion, String minUnityVersion, String platform, final ApiCallback<List<LimitedWorld>> _callback) throws ApiException {

        okhttp3.Call localVarCall = searchWorldsValidateBeforeCall(featured, sort, user, userId, n, order, offset, search, tag, notag, releaseStatus, maxUnityVersion, minUnityVersion, platform, _callback);
        Type localVarReturnType = new TypeToken<List<LimitedWorld>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for unpublishWorld
     * @param worldId  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing apiKey or auth cookie. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Error response when trying to show information about a non-existent world. Sometimes returns with &#x60;model &lt;worldId&gt; not found&#x60; instead of &#x60;World &lt;worldId not found&#x60;. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call unpublishWorldCall(String worldId, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/worlds/{worldId}/publish"
            .replaceAll("\\{" + "worldId" + "\\}", localVarApiClient.escapeString(worldId.toString()));

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
    private okhttp3.Call unpublishWorldValidateBeforeCall(String worldId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'worldId' is set
        if (worldId == null) {
            throw new ApiException("Missing the required parameter 'worldId' when calling unpublishWorld(Async)");
        }
        

        okhttp3.Call localVarCall = unpublishWorldCall(worldId, _callback);
        return localVarCall;

    }

    /**
     * Unpublish World
     * Unpublish a world.
     * @param worldId  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing apiKey or auth cookie. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Error response when trying to show information about a non-existent world. Sometimes returns with &#x60;model &lt;worldId&gt; not found&#x60; instead of &#x60;World &lt;worldId not found&#x60;. </td><td>  -  </td></tr>
     </table>
     */
    public void unpublishWorld(String worldId) throws ApiException {
        unpublishWorldWithHttpInfo(worldId);
    }

    /**
     * Unpublish World
     * Unpublish a world.
     * @param worldId  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing apiKey or auth cookie. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Error response when trying to show information about a non-existent world. Sometimes returns with &#x60;model &lt;worldId&gt; not found&#x60; instead of &#x60;World &lt;worldId not found&#x60;. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> unpublishWorldWithHttpInfo(String worldId) throws ApiException {
        okhttp3.Call localVarCall = unpublishWorldValidateBeforeCall(worldId, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Unpublish World (asynchronously)
     * Unpublish a world.
     * @param worldId  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing apiKey or auth cookie. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Error response when trying to show information about a non-existent world. Sometimes returns with &#x60;model &lt;worldId&gt; not found&#x60; instead of &#x60;World &lt;worldId not found&#x60;. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call unpublishWorldAsync(String worldId, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = unpublishWorldValidateBeforeCall(worldId, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for updateWorld
     * @param worldId  (required)
     * @param inlineObject7  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a single World object. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing apiKey or auth cookie. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Error response when trying to show information about a non-existent world. Sometimes returns with &#x60;model &lt;worldId&gt; not found&#x60; instead of &#x60;World &lt;worldId not found&#x60;. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateWorldCall(String worldId, InlineObject7 inlineObject7, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = inlineObject7;

        // create path and map variables
        String localVarPath = "/worlds/{worldId}"
            .replaceAll("\\{" + "worldId" + "\\}", localVarApiClient.escapeString(worldId.toString()));

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
    private okhttp3.Call updateWorldValidateBeforeCall(String worldId, InlineObject7 inlineObject7, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'worldId' is set
        if (worldId == null) {
            throw new ApiException("Missing the required parameter 'worldId' when calling updateWorld(Async)");
        }
        

        okhttp3.Call localVarCall = updateWorldCall(worldId, inlineObject7, _callback);
        return localVarCall;

    }

    /**
     * Update World
     * Update information about a specific World.
     * @param worldId  (required)
     * @param inlineObject7  (optional)
     * @return World
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a single World object. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing apiKey or auth cookie. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Error response when trying to show information about a non-existent world. Sometimes returns with &#x60;model &lt;worldId&gt; not found&#x60; instead of &#x60;World &lt;worldId not found&#x60;. </td><td>  -  </td></tr>
     </table>
     */
    public World updateWorld(String worldId, InlineObject7 inlineObject7) throws ApiException {
        ApiResponse<World> localVarResp = updateWorldWithHttpInfo(worldId, inlineObject7);
        return localVarResp.getData();
    }

    /**
     * Update World
     * Update information about a specific World.
     * @param worldId  (required)
     * @param inlineObject7  (optional)
     * @return ApiResponse&lt;World&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a single World object. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing apiKey or auth cookie. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Error response when trying to show information about a non-existent world. Sometimes returns with &#x60;model &lt;worldId&gt; not found&#x60; instead of &#x60;World &lt;worldId not found&#x60;. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<World> updateWorldWithHttpInfo(String worldId, InlineObject7 inlineObject7) throws ApiException {
        okhttp3.Call localVarCall = updateWorldValidateBeforeCall(worldId, inlineObject7, null);
        Type localVarReturnType = new TypeToken<World>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Update World (asynchronously)
     * Update information about a specific World.
     * @param worldId  (required)
     * @param inlineObject7  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a single World object. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing apiKey or auth cookie. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Error response when trying to show information about a non-existent world. Sometimes returns with &#x60;model &lt;worldId&gt; not found&#x60; instead of &#x60;World &lt;worldId not found&#x60;. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateWorldAsync(String worldId, InlineObject7 inlineObject7, final ApiCallback<World> _callback) throws ApiException {

        okhttp3.Call localVarCall = updateWorldValidateBeforeCall(worldId, inlineObject7, _callback);
        Type localVarReturnType = new TypeToken<World>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
