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


package io.github.vrchatapi.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.github.vrchatapi.model.InstancePlatforms;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Instance
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-08-23T12:06:12.536997800+02:00[Europe/Stockholm]")
public class Instance {
  public static final String SERIALIZED_NAME_ACTIVE = "active";
  @SerializedName(SERIALIZED_NAME_ACTIVE)
  private Boolean active = true;

  public static final String SERIALIZED_NAME_CAN_REQUEST_INVITE = "canRequestInvite";
  @SerializedName(SERIALIZED_NAME_CAN_REQUEST_INVITE)
  private Boolean canRequestInvite = true;

  public static final String SERIALIZED_NAME_CAPACITY = "capacity";
  @SerializedName(SERIALIZED_NAME_CAPACITY)
  private BigDecimal capacity;

  public static final String SERIALIZED_NAME_CLIENT_NUMBER = "clientNumber";
  @SerializedName(SERIALIZED_NAME_CLIENT_NUMBER)
  private String clientNumber;

  public static final String SERIALIZED_NAME_FULL = "full";
  @SerializedName(SERIALIZED_NAME_FULL)
  private Boolean full = false;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_INSTANCE_ID = "instanceId";
  @SerializedName(SERIALIZED_NAME_INSTANCE_ID)
  private String instanceId;

  public static final String SERIALIZED_NAME_LOCATION = "location";
  @SerializedName(SERIALIZED_NAME_LOCATION)
  private String location;

  public static final String SERIALIZED_NAME_N_USERS = "n_users";
  @SerializedName(SERIALIZED_NAME_N_USERS)
  private BigDecimal nUsers;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NONCE = "nonce";
  @SerializedName(SERIALIZED_NAME_NONCE)
  private String nonce;

  public static final String SERIALIZED_NAME_OWNER_ID = "ownerId";
  @SerializedName(SERIALIZED_NAME_OWNER_ID)
  private String ownerId;

  public static final String SERIALIZED_NAME_PERMANENT = "permanent";
  @SerializedName(SERIALIZED_NAME_PERMANENT)
  private Boolean permanent = false;

  public static final String SERIALIZED_NAME_PHOTON_REGION = "photonRegion";
  @SerializedName(SERIALIZED_NAME_PHOTON_REGION)
  private String photonRegion;

  public static final String SERIALIZED_NAME_PLATFORMS = "platforms";
  @SerializedName(SERIALIZED_NAME_PLATFORMS)
  private InstancePlatforms platforms;

  public static final String SERIALIZED_NAME_REGION = "region";
  @SerializedName(SERIALIZED_NAME_REGION)
  private String region;

  public static final String SERIALIZED_NAME_SHORT_NAME = "shortName";
  @SerializedName(SERIALIZED_NAME_SHORT_NAME)
  private String shortName;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<String> tags = new ArrayList<String>();

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_USERS = "users";
  @SerializedName(SERIALIZED_NAME_USERS)
  private List<Object> users = null;

  public static final String SERIALIZED_NAME_WORLD = "world";
  @SerializedName(SERIALIZED_NAME_WORLD)
  private Object world;

  public static final String SERIALIZED_NAME_WORLD_ID = "worldId";
  @SerializedName(SERIALIZED_NAME_WORLD_ID)
  private String worldId;


  public Instance active(Boolean active) {
    
    this.active = active;
    return this;
  }

   /**
   * Get active
   * @return active
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getActive() {
    return active;
  }


  public void setActive(Boolean active) {
    this.active = active;
  }


  public Instance canRequestInvite(Boolean canRequestInvite) {
    
    this.canRequestInvite = canRequestInvite;
    return this;
  }

   /**
   * Get canRequestInvite
   * @return canRequestInvite
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getCanRequestInvite() {
    return canRequestInvite;
  }


  public void setCanRequestInvite(Boolean canRequestInvite) {
    this.canRequestInvite = canRequestInvite;
  }


  public Instance capacity(BigDecimal capacity) {
    
    this.capacity = capacity;
    return this;
  }

   /**
   * Get capacity
   * minimum: 0
   * maximum: 40
   * @return capacity
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public BigDecimal getCapacity() {
    return capacity;
  }


  public void setCapacity(BigDecimal capacity) {
    this.capacity = capacity;
  }


  public Instance clientNumber(String clientNumber) {
    
    this.clientNumber = clientNumber;
    return this;
  }

   /**
   * Get clientNumber
   * @return clientNumber
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getClientNumber() {
    return clientNumber;
  }


  public void setClientNumber(String clientNumber) {
    this.clientNumber = clientNumber;
  }


  public Instance full(Boolean full) {
    
    this.full = full;
    return this;
  }

   /**
   * Get full
   * @return full
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getFull() {
    return full;
  }


  public void setFull(Boolean full) {
    this.full = full;
  }


  public Instance id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public Instance instanceId(String instanceId) {
    
    this.instanceId = instanceId;
    return this;
  }

   /**
   * Get instanceId
   * @return instanceId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getInstanceId() {
    return instanceId;
  }


  public void setInstanceId(String instanceId) {
    this.instanceId = instanceId;
  }


  public Instance location(String location) {
    
    this.location = location;
    return this;
  }

   /**
   * Get location
   * @return location
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getLocation() {
    return location;
  }


  public void setLocation(String location) {
    this.location = location;
  }


  public Instance nUsers(BigDecimal nUsers) {
    
    this.nUsers = nUsers;
    return this;
  }

   /**
   * Get nUsers
   * minimum: 0
   * @return nUsers
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public BigDecimal getnUsers() {
    return nUsers;
  }


  public void setnUsers(BigDecimal nUsers) {
    this.nUsers = nUsers;
  }


  public Instance name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public Instance nonce(String nonce) {
    
    this.nonce = nonce;
    return this;
  }

   /**
   * Get nonce
   * @return nonce
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNonce() {
    return nonce;
  }


  public void setNonce(String nonce) {
    this.nonce = nonce;
  }


   /**
   * Get ownerId
   * @return ownerId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "usr_c1644b5b-3ca4-45b4-97c6-a2a0de70d469", required = true, value = "")

  public String getOwnerId() {
    return ownerId;
  }




  public Instance permanent(Boolean permanent) {
    
    this.permanent = permanent;
    return this;
  }

   /**
   * Get permanent
   * @return permanent
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getPermanent() {
    return permanent;
  }


  public void setPermanent(Boolean permanent) {
    this.permanent = permanent;
  }


  public Instance photonRegion(String photonRegion) {
    
    this.photonRegion = photonRegion;
    return this;
  }

   /**
   * Get photonRegion
   * @return photonRegion
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getPhotonRegion() {
    return photonRegion;
  }


  public void setPhotonRegion(String photonRegion) {
    this.photonRegion = photonRegion;
  }


  public Instance platforms(InstancePlatforms platforms) {
    
    this.platforms = platforms;
    return this;
  }

   /**
   * Get platforms
   * @return platforms
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public InstancePlatforms getPlatforms() {
    return platforms;
  }


  public void setPlatforms(InstancePlatforms platforms) {
    this.platforms = platforms;
  }


  public Instance region(String region) {
    
    this.region = region;
    return this;
  }

   /**
   * Get region
   * @return region
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getRegion() {
    return region;
  }


  public void setRegion(String region) {
    this.region = region;
  }


  public Instance shortName(String shortName) {
    
    this.shortName = shortName;
    return this;
  }

   /**
   * Get shortName
   * @return shortName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getShortName() {
    return shortName;
  }


  public void setShortName(String shortName) {
    this.shortName = shortName;
  }


  public Instance tags(List<String> tags) {
    
    this.tags = tags;
    return this;
  }

  public Instance addTagsItem(String tagsItem) {
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<String> getTags() {
    return tags;
  }


  public void setTags(List<String> tags) {
    this.tags = tags;
  }


  public Instance type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public Instance users(List<Object> users) {
    
    this.users = users;
    return this;
  }

  public Instance addUsersItem(Object usersItem) {
    if (this.users == null) {
      this.users = new ArrayList<Object>();
    }
    this.users.add(usersItem);
    return this;
  }

   /**
   * Always empty on non-existing instances, and non-present on existing instances.
   * @return users
   * @deprecated
  **/
  @Deprecated
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Always empty on non-existing instances, and non-present on existing instances.")

  public List<Object> getUsers() {
    return users;
  }


  public void setUsers(List<Object> users) {
    this.users = users;
  }


  public Instance world(Object world) {
    
    this.world = world;
    return this;
  }

   /**
   * Only present on non-existing instances, and only contains a very small subject of World object. Use World API instead.
   * @return world
   * @deprecated
  **/
  @Deprecated
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Only present on non-existing instances, and only contains a very small subject of World object. Use World API instead.")

  public Object getWorld() {
    return world;
  }


  public void setWorld(Object world) {
    this.world = world;
  }


  public Instance worldId(String worldId) {
    
    this.worldId = worldId;
    return this;
  }

   /**
   * Get worldId
   * @return worldId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "wrld_ba913a96-fac4-4048-a062-9aa5db092812", required = true, value = "")

  public String getWorldId() {
    return worldId;
  }


  public void setWorldId(String worldId) {
    this.worldId = worldId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Instance instance = (Instance) o;
    return Objects.equals(this.active, instance.active) &&
        Objects.equals(this.canRequestInvite, instance.canRequestInvite) &&
        Objects.equals(this.capacity, instance.capacity) &&
        Objects.equals(this.clientNumber, instance.clientNumber) &&
        Objects.equals(this.full, instance.full) &&
        Objects.equals(this.id, instance.id) &&
        Objects.equals(this.instanceId, instance.instanceId) &&
        Objects.equals(this.location, instance.location) &&
        Objects.equals(this.nUsers, instance.nUsers) &&
        Objects.equals(this.name, instance.name) &&
        Objects.equals(this.nonce, instance.nonce) &&
        Objects.equals(this.ownerId, instance.ownerId) &&
        Objects.equals(this.permanent, instance.permanent) &&
        Objects.equals(this.photonRegion, instance.photonRegion) &&
        Objects.equals(this.platforms, instance.platforms) &&
        Objects.equals(this.region, instance.region) &&
        Objects.equals(this.shortName, instance.shortName) &&
        Objects.equals(this.tags, instance.tags) &&
        Objects.equals(this.type, instance.type) &&
        Objects.equals(this.users, instance.users) &&
        Objects.equals(this.world, instance.world) &&
        Objects.equals(this.worldId, instance.worldId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, canRequestInvite, capacity, clientNumber, full, id, instanceId, location, nUsers, name, nonce, ownerId, permanent, photonRegion, platforms, region, shortName, tags, type, users, world, worldId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Instance {\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    canRequestInvite: ").append(toIndentedString(canRequestInvite)).append("\n");
    sb.append("    capacity: ").append(toIndentedString(capacity)).append("\n");
    sb.append("    clientNumber: ").append(toIndentedString(clientNumber)).append("\n");
    sb.append("    full: ").append(toIndentedString(full)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    nUsers: ").append(toIndentedString(nUsers)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nonce: ").append(toIndentedString(nonce)).append("\n");
    sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
    sb.append("    permanent: ").append(toIndentedString(permanent)).append("\n");
    sb.append("    photonRegion: ").append(toIndentedString(photonRegion)).append("\n");
    sb.append("    platforms: ").append(toIndentedString(platforms)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    shortName: ").append(toIndentedString(shortName)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
    sb.append("    world: ").append(toIndentedString(world)).append("\n");
    sb.append("    worldId: ").append(toIndentedString(worldId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

