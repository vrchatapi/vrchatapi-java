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
import io.github.vrchatapi.model.InlineObject6;
import io.github.vrchatapi.model.InlineObject7;
import io.github.vrchatapi.model.InlineResponse2006;
import io.github.vrchatapi.model.InlineResponse2007;
import io.github.vrchatapi.model.InlineResponse401;
import io.github.vrchatapi.model.Instance;
import io.github.vrchatapi.model.LimitedWorld;
import io.github.vrchatapi.model.World;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for WorldsApi
 */
@Ignore
public class WorldsApiTest {

    private final WorldsApi api = new WorldsApi();

    
    /**
     * Create World
     *
     * Create a new world. This endpoint requires &#x60;assetUrl&#x60; to be a valid File object with &#x60;.vrcw&#x60; file extension, and &#x60;imageUrl&#x60; to be a valid File object with an image file extension.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createWorldTest() throws ApiException {
        InlineObject6 inlineObject6 = null;
        World response = api.createWorld(inlineObject6);

        // TODO: test validations
    }
    
    /**
     * Delete World
     *
     * Delete a world. Notice a world is never fully \&quot;deleted\&quot;, only its ReleaseStatus is set to \&quot;hidden\&quot; and the linked Files are deleted. The WorldID is permanently reserved.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteWorldTest() throws ApiException {
        String worldId = null;
        api.deleteWorld(worldId);

        // TODO: test validations
    }
    
    /**
     * List Active Worlds
     *
     * Search and list currently Active worlds by query filters.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getActiveWorldsTest() throws ApiException {
        String featured = null;
        String sort = null;
        Integer n = null;
        String order = null;
        Integer offset = null;
        String search = null;
        String tag = null;
        String notag = null;
        String releaseStatus = null;
        String maxUnityVersion = null;
        String minUnityVersion = null;
        String platform = null;
        List<LimitedWorld> response = api.getActiveWorlds(featured, sort, n, order, offset, search, tag, notag, releaseStatus, maxUnityVersion, minUnityVersion, platform);

        // TODO: test validations
    }
    
    /**
     * List Favorited Worlds
     *
     * Search and list favorited worlds by query filters.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFavoritedWorldsTest() throws ApiException {
        String featured = null;
        String sort = null;
        Integer n = null;
        String order = null;
        Integer offset = null;
        String search = null;
        String tag = null;
        String notag = null;
        String releaseStatus = null;
        String maxUnityVersion = null;
        String minUnityVersion = null;
        String platform = null;
        String userId = null;
        List<LimitedWorld> response = api.getFavoritedWorlds(featured, sort, n, order, offset, search, tag, notag, releaseStatus, maxUnityVersion, minUnityVersion, platform, userId);

        // TODO: test validations
    }
    
    /**
     * List Recent Worlds
     *
     * Search and list recently visited worlds by query filters.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getRecentWorldsTest() throws ApiException {
        String featured = null;
        String sort = null;
        Integer n = null;
        String order = null;
        Integer offset = null;
        String search = null;
        String tag = null;
        String notag = null;
        String releaseStatus = null;
        String maxUnityVersion = null;
        String minUnityVersion = null;
        String platform = null;
        String userId = null;
        List<LimitedWorld> response = api.getRecentWorlds(featured, sort, n, order, offset, search, tag, notag, releaseStatus, maxUnityVersion, minUnityVersion, platform, userId);

        // TODO: test validations
    }
    
    /**
     * Get World by ID
     *
     * Get information about a specific World.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getWorldTest() throws ApiException {
        String worldId = null;
        World response = api.getWorld(worldId);

        // TODO: test validations
    }
    
    /**
     * Get World Instance
     *
     * Returns a worlds instance.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getWorldInstanceTest() throws ApiException {
        String worldId = null;
        String instanceId = null;
        Instance response = api.getWorldInstance(worldId, instanceId);

        // TODO: test validations
    }
    
    /**
     * Get World Metadata
     *
     * Return a worlds custom metadata. This is currently believed to be unused. Metadata can be set with &#x60;updateWorld&#x60; and can be any arbitrary object.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getWorldMetadataTest() throws ApiException {
        String worldId = null;
        InlineResponse2006 response = api.getWorldMetadata(worldId);

        // TODO: test validations
    }
    
    /**
     * Get World Publish Status
     *
     * Returns a worlds publish status.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getWorldPublishStatusTest() throws ApiException {
        String worldId = null;
        InlineResponse2007 response = api.getWorldPublishStatus(worldId);

        // TODO: test validations
    }
    
    /**
     * Publish World
     *
     * Publish a world. You can only publish one world per week.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void publishWorldTest() throws ApiException {
        String worldId = null;
        api.publishWorld(worldId);

        // TODO: test validations
    }
    
    /**
     * Search All Worlds
     *
     * Search and list any worlds by query filters.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void searchWorldsTest() throws ApiException {
        String featured = null;
        String sort = null;
        String user = null;
        String userId = null;
        Integer n = null;
        String order = null;
        Integer offset = null;
        String search = null;
        String tag = null;
        String notag = null;
        String releaseStatus = null;
        String maxUnityVersion = null;
        String minUnityVersion = null;
        String platform = null;
        List<LimitedWorld> response = api.searchWorlds(featured, sort, user, userId, n, order, offset, search, tag, notag, releaseStatus, maxUnityVersion, minUnityVersion, platform);

        // TODO: test validations
    }
    
    /**
     * Unpublish World
     *
     * Unpublish a world.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void unpublishWorldTest() throws ApiException {
        String worldId = null;
        api.unpublishWorld(worldId);

        // TODO: test validations
    }
    
    /**
     * Update World
     *
     * Update information about a specific World.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateWorldTest() throws ApiException {
        String worldId = null;
        InlineObject7 inlineObject7 = null;
        World response = api.updateWorld(worldId, inlineObject7);

        // TODO: test validations
    }
    
}
