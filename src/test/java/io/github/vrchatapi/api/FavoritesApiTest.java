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
import io.github.vrchatapi.model.Favorite;
import io.github.vrchatapi.model.FavoriteGroup;
import io.github.vrchatapi.model.InlineObject8;
import io.github.vrchatapi.model.InlineObject9;
import io.github.vrchatapi.model.InlineResponse401;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for FavoritesApi
 */
@Ignore
public class FavoritesApiTest {

    private final FavoritesApi api = new FavoritesApi();

    
    /**
     * Add Favorite
     *
     * Add a new favorite.  Friend groups are named &#x60;group_0&#x60; through &#x60;group_3&#x60;. Avatar and World groups are named &#x60;avatars1&#x60; to &#x60;avatar4&#x60; and &#x60;worlds1&#x60; to &#x60;worlds4&#x60;.  You cannot add people whom you are not friends with to your friends list. Destroying a friendship removes the person as favorite on both sides.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addFavoriteTest() throws ApiException {
        InlineObject8 inlineObject8 = null;
        Favorite response = api.addFavorite(inlineObject8);

        // TODO: test validations
    }
    
    /**
     * Clear Favorite Group
     *
     * Clear ALL contents of a specific favorite group.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void clearFavoriteGroupTest() throws ApiException {
        String favoriteGroupType = null;
        String favoriteGroupName = null;
        String userId = null;
        Error response = api.clearFavoriteGroup(favoriteGroupType, favoriteGroupName, userId);

        // TODO: test validations
    }
    
    /**
     * Show Favorite
     *
     * Return information about a specific Favorite.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFavoriteTest() throws ApiException {
        String favoriteId = null;
        Favorite response = api.getFavorite(favoriteId);

        // TODO: test validations
    }
    
    /**
     * Show Favorite Group
     *
     * Fetch information about a specific favorite group.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFavoriteGroupTest() throws ApiException {
        String favoriteGroupType = null;
        String favoriteGroupName = null;
        String userId = null;
        FavoriteGroup response = api.getFavoriteGroup(favoriteGroupType, favoriteGroupName, userId);

        // TODO: test validations
    }
    
    /**
     * List Favorite Groups
     *
     * Return a list of favorite groups owned by a user. Returns the same information as &#x60;getFavoriteGroups&#x60;.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFavoriteGroupsTest() throws ApiException {
        Integer n = null;
        Integer offset = null;
        String ownerId = null;
        List<FavoriteGroup> response = api.getFavoriteGroups(n, offset, ownerId);

        // TODO: test validations
    }
    
    /**
     * List Favorites
     *
     * Returns a list of favorites.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFavoritesTest() throws ApiException {
        Integer n = null;
        Integer offset = null;
        String type = null;
        String tag = null;
        List<Favorite> response = api.getFavorites(n, offset, type, tag);

        // TODO: test validations
    }
    
    /**
     * Remove Favorite
     *
     * Remove a favorite from your favorites list.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void removeFavoriteTest() throws ApiException {
        String favoriteId = null;
        Error response = api.removeFavorite(favoriteId);

        // TODO: test validations
    }
    
    /**
     * Update Favorite Group
     *
     * Update information about a specific favorite group.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateFavoriteGroupTest() throws ApiException {
        String favoriteGroupType = null;
        String favoriteGroupName = null;
        String userId = null;
        InlineObject9 inlineObject9 = null;
        api.updateFavoriteGroup(favoriteGroupType, favoriteGroupName, userId, inlineObject9);

        // TODO: test validations
    }
    
}
