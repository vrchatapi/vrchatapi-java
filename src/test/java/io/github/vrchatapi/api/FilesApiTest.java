/*
 * VRChat API Documentation
 * ![VRChat API Banner](https://vrchatapi.github.io/assets/img/api_banner_1500x400.png)  # Welcome to the VRChat API  Before we begin, we would like to state this is a **COMMUNITY DRIVEN PROJECT**. This means that everything you read on here was written by the community itself and is **not** officially supported by VRChat. The documentation is provided \"AS IS\", and any action you take towards VRChat is completely your own responsibility.  The documentation and additional libraries SHALL ONLY be used for applications interacting with VRChat's API in accordance with their [Terms of Service](https://github.com/VRChatAPI), and MUST NOT be used for modifying the client, \"avatar ripping\", or other illegal activities. Malicious usage or spamming the API may result in account termination. Certain parts of the API are also more sensitive than others, for example moderation, so please read tread extra carefully and read the warnings when present.  ![Tupper Policy on API](https://i.imgur.com/yLlW7Ok.png)  Finally, use of the API using applications other than the approved methods (website, VRChat application, Unity SDK) is not officially supported. VRChat provides no guarantee or support for external applications using the API. Access to API endpoints may break **at any time, without notice**. Therefore, please **do not ping** VRChat Staff in the VRChat Discord if you are having API problems, as they do not provide API support. We will make a best effort in keeping this documentation and associated language libraries up to date, but things might be outdated or missing. If you find that something is no longer valid, please contact us on Discord or [create an issue](https://github.com/vrchatapi/specification/issues) and tell us so we can fix it.  # Getting Started  The VRChat API can be used to programmatically retrieve or update information regarding your profile, friends, avatars, worlds and more. The API consists of two parts, \"Photon\" which is only used in-game, and the \"Web API\" which is used by both the game and the website. This documentation focuses only on the Web API.  The API is designed around the REST ideology, providing semi-simple and usually predictable URIs to access and modify objects. Requests support standard HTTP methods like GET, PUT, POST, and DELETE and standard status codes. Response bodies are always UTF-8 encoded JSON objects, unless explicitly documented otherwise.  <div class=\"callout callout-error\">   <strong>🛑 Warning! Do not touch Photon!</strong><br>   Photon is only used by the in-game client and should <b>not</b> be touched. Doing so may result in permanent account termination. </div>  <div class=\"callout callout-info\">   <strong>ℹ️ API Key and Authentication</strong><br>   The API Key has always been the same and is currently <code>JlE5Jldo5Jibnk5O5hTx6XVqsJu4WJ26</code>.   Read <a href=\"#tag--authentication\">Authentication</a> for how to log in. </div>  # Using the API  For simply exploring what the API can do it is strongly recommended to download [Insomnia](https://insomnia.rest/download), a free and open-source API client that's great for sending requests to the API in an orderly fashion. Insomnia allows you to send data in the format that's required for VRChat's API. It is also possible to try out the API in your browser, by first logging in at [vrchat.com/home](https://vrchat.com/home/) and then going to [vrchat.com/api/1/auth/user](https://vrchat.com/api/1/auth/user), but the information will be much harder to work with.  For more permanent operation such as software development it is instead recommended to use one of the existing language SDKs. This community project maintains API libraries in several languages, which allows you to interact with the API with simple function calls rather than having to implement the HTTP protocol yourself. Most of these libraries are automatically generated from the API specification, sometimes with additional helpful wrapper code to make usage easier. This allows them to be almost automatically updated and expanded upon as soon as a new feature is introduced in the specification itself. The libraries can be found on [GitHub](https://github.com/vrchatapi) or following:  * [NodeJS (JavaScript)](https://www.npmjs.com/package/vrchat) * [Dart](https://pub.dev/packages/vrchat_dart) * [Rust](https://crates.io/crates/vrchatapi) * [C#](github.com/vrchatapi/vrchatapi-csharp) * [Python](https://github.com/vrchatapi/VRChatPython)  # Pagination  Most endpoints enforce pagination, meaning they will only return 10 entries by default, and never more than 100.<br> Using both the limit and offset parameters allows you to easily paginate through a large number of objects.  | Query Parameter | Type | Description | | ----------|--|------- | | `limit` | integer  | The number of objects to return. This value often defaults to 10. Highest limit is always 100.| | `offset` | integer  | A zero-based offset from the default object sorting.|  If a request returns fewer objects than the `limit` parameter, there are no more items available to return.  # Contribution  Do you want to get involved in the documentation effort? Do you want to help improve one of the language API libraries? This project is an [OPEN Open Source Project](https://openopensource.org)! This means that individuals making significant and valuable contributions are given commit-access to the project. It also means we are very open and welcoming of new people making contributions, unlike some more guarded open-source projects.  [![Discord](https://img.shields.io/static/v1?label=vrchatapi&message=discord&color=blueviolet&style=for-the-badge)](https://discord.gg/qjZE9C9fkB)
 *
 * The version of the OpenAPI document: 1.0.1
 * Contact: me@ruby.js.org
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.github.vrchatapi.api;

import io.github.vrchatapi.ApiException;
import io.github.vrchatapi.model.Error;
import io.github.vrchatapi.model.InlineObject3;
import io.github.vrchatapi.model.InlineObject4;
import io.github.vrchatapi.model.InlineObject5;
import io.github.vrchatapi.model.InlineResponse2004;
import io.github.vrchatapi.model.InlineResponse2005;
import io.github.vrchatapi.model.Success;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for FilesApi
 */
@Ignore
public class FilesApiTest {

    private final FilesApi api = new FilesApi();

    
    /**
     * Create File
     *
     * Creates a new File object
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createFileTest() throws ApiException {
        InlineObject3 inlineObject3 = null;
        java.io.File response = api.createFile(inlineObject3);

        // TODO: test validations
    }
    
    /**
     * Create File Version
     *
     * Creates a new FileVersion. Once a Version has been created, proceed to the &#x60;/file/{fileId}/{versionId}/file/start&#x60; endpoint to start a file upload.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createFileVersionTest() throws ApiException {
        String fileId = null;
        InlineObject4 inlineObject4 = null;
        java.io.File response = api.createFileVersion(fileId, inlineObject4);

        // TODO: test validations
    }
    
    /**
     * Delete File
     *
     * Deletes a File object.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteFileTest() throws ApiException {
        String fileId = null;
        Success response = api.deleteFile(fileId);

        // TODO: test validations
    }
    
    /**
     * Delete File Version
     *
     * Delete a specific version of a file. You can only delete the latest version.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteFileVersionTest() throws ApiException {
        String fileId = null;
        Integer versionId = null;
        java.io.File response = api.deleteFileVersion(fileId, versionId);

        // TODO: test validations
    }
    
    /**
     * Download File Version
     *
     * Downloads the file with the provided version number.  **Version Note:** Version 0 is always when the file was created. The real data is usually always located in version 1 and up.  **Extension Note:** Files are not guaranteed to have a file extensions. UnityPackage files tends to have it, images through this endpoint do not. You are responsible for appending file extension from the &#x60;extension&#x60; field when neccesary.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void downloadFileVersionTest() throws ApiException {
        String fileId = null;
        Integer versionId = null;
        api.downloadFileVersion(fileId, versionId);

        // TODO: test validations
    }
    
    /**
     * Finish FileData Upload
     *
     * Finish an upload of a FileData. This will mark it as \&quot;complete\&quot;. After uploading the &#x60;file&#x60; for Avatars and Worlds you then have to upload a &#x60;signature&#x60; file.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void finishFileDataUploadTest() throws ApiException {
        String fileId = null;
        Integer versionId = null;
        String fileType = null;
        InlineObject5 inlineObject5 = null;
        java.io.File response = api.finishFileDataUpload(fileId, versionId, fileType, inlineObject5);

        // TODO: test validations
    }
    
    /**
     * Show File
     *
     * Shows general information about the \&quot;File\&quot; object. Each File can have several \&quot;Version\&quot;&#39;s, and each Version can have multiple real files or \&quot;Data\&quot; blobs.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFileTest() throws ApiException {
        String fileId = null;
        java.io.File response = api.getFile(fileId);

        // TODO: test validations
    }
    
    /**
     * Check FileData Upload Status
     *
     * Retrieves the upload status for file upload. Can currently only be accessed when &#x60;status&#x60; is &#x60;waiting&#x60;. Trying to access it on a file version already uploaded currently times out.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFileDataUploadStatusTest() throws ApiException {
        String fileId = null;
        Integer versionId = null;
        String fileType = null;
        InlineResponse2004 response = api.getFileDataUploadStatus(fileId, versionId, fileType);

        // TODO: test validations
    }
    
    /**
     * List Files
     *
     * Returns a list of files
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFilesTest() throws ApiException {
        String tag = null;
        String userId = null;
        Integer n = null;
        Integer offset = null;
        List<java.io.File> response = api.getFiles(tag, userId, n, offset);

        // TODO: test validations
    }
    
    /**
     * Start FileData Upload
     *
     * Starts an upload of a specific FilePart. This endpoint will return an AWS URL which you can PUT data to. You need to call this and receive a new AWS API URL for each &#x60;partNumber&#x60;. Please see AWS&#39;s REST documentation on \&quot;PUT Object to S3\&quot; on how to upload. Once all parts has been uploaded, proceed to &#x60;/finish&#x60; endpoint.  **Note:** &#x60;nextPartNumber&#x60; seems like it is always ignored. Despite it returning 0, first partNumber is always 1.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void startFileDataUploadTest() throws ApiException {
        String fileId = null;
        Integer versionId = null;
        String fileType = null;
        Integer partNumber = null;
        InlineResponse2005 response = api.startFileDataUpload(fileId, versionId, fileType, partNumber);

        // TODO: test validations
    }
    
}
