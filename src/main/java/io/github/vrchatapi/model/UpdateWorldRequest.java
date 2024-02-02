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


package io.github.vrchatapi.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.github.vrchatapi.model.ReleaseStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import io.github.vrchatapi.JSON;

/**
 * UpdateWorldRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UpdateWorldRequest {
  public static final String SERIALIZED_NAME_ASSET_URL = "assetUrl";
  @SerializedName(SERIALIZED_NAME_ASSET_URL)
  private String assetUrl;

  public static final String SERIALIZED_NAME_ASSET_VERSION = "assetVersion";
  @SerializedName(SERIALIZED_NAME_ASSET_VERSION)
  private String assetVersion;

  public static final String SERIALIZED_NAME_AUTHOR_ID = "authorId";
  @SerializedName(SERIALIZED_NAME_AUTHOR_ID)
  private String authorId;

  public static final String SERIALIZED_NAME_AUTHOR_NAME = "authorName";
  @SerializedName(SERIALIZED_NAME_AUTHOR_NAME)
  private String authorName;

  public static final String SERIALIZED_NAME_CAPACITY = "capacity";
  @SerializedName(SERIALIZED_NAME_CAPACITY)
  private Integer capacity;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_IMAGE_URL = "imageUrl";
  @SerializedName(SERIALIZED_NAME_IMAGE_URL)
  private String imageUrl;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PLATFORM = "platform";
  @SerializedName(SERIALIZED_NAME_PLATFORM)
  private String platform;

  public static final String SERIALIZED_NAME_RELEASE_STATUS = "releaseStatus";
  @SerializedName(SERIALIZED_NAME_RELEASE_STATUS)
  private ReleaseStatus releaseStatus = ReleaseStatus.PUBLIC;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<String> tags = null;

  public static final String SERIALIZED_NAME_UNITY_PACKAGE_URL = "unityPackageUrl";
  @SerializedName(SERIALIZED_NAME_UNITY_PACKAGE_URL)
  private String unityPackageUrl;

  public static final String SERIALIZED_NAME_UNITY_VERSION = "unityVersion";
  @SerializedName(SERIALIZED_NAME_UNITY_VERSION)
  private String unityVersion = "5.3.4p1";

  public UpdateWorldRequest() {
  }

  public UpdateWorldRequest assetUrl(String assetUrl) {
    
    this.assetUrl = assetUrl;
    return this;
  }

   /**
   * Get assetUrl
   * @return assetUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAssetUrl() {
    return assetUrl;
  }


  public void setAssetUrl(String assetUrl) {
    this.assetUrl = assetUrl;
  }


  public UpdateWorldRequest assetVersion(String assetVersion) {
    
    this.assetVersion = assetVersion;
    return this;
  }

   /**
   * Get assetVersion
   * @return assetVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAssetVersion() {
    return assetVersion;
  }


  public void setAssetVersion(String assetVersion) {
    this.assetVersion = assetVersion;
  }


  public UpdateWorldRequest authorId(String authorId) {
    
    this.authorId = authorId;
    return this;
  }

   /**
   * A users unique ID, usually in the form of &#x60;usr_c1644b5b-3ca4-45b4-97c6-a2a0de70d469&#x60;. Legacy players can have old IDs in the form of &#x60;8JoV9XEdpo&#x60;. The ID can never be changed.
   * @return authorId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "usr_c1644b5b-3ca4-45b4-97c6-a2a0de70d469", value = "A users unique ID, usually in the form of `usr_c1644b5b-3ca4-45b4-97c6-a2a0de70d469`. Legacy players can have old IDs in the form of `8JoV9XEdpo`. The ID can never be changed.")

  public String getAuthorId() {
    return authorId;
  }


  public void setAuthorId(String authorId) {
    this.authorId = authorId;
  }


  public UpdateWorldRequest authorName(String authorName) {
    
    this.authorName = authorName;
    return this;
  }

   /**
   * Get authorName
   * @return authorName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAuthorName() {
    return authorName;
  }


  public void setAuthorName(String authorName) {
    this.authorName = authorName;
  }


  public UpdateWorldRequest capacity(Integer capacity) {
    
    this.capacity = capacity;
    return this;
  }

   /**
   * Get capacity
   * minimum: 0
   * maximum: 40
   * @return capacity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "8", value = "")

  public Integer getCapacity() {
    return capacity;
  }


  public void setCapacity(Integer capacity) {
    this.capacity = capacity;
  }


  public UpdateWorldRequest description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public UpdateWorldRequest imageUrl(String imageUrl) {
    
    this.imageUrl = imageUrl;
    return this;
  }

   /**
   * Get imageUrl
   * @return imageUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getImageUrl() {
    return imageUrl;
  }


  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }


  public UpdateWorldRequest name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public UpdateWorldRequest platform(String platform) {
    
    this.platform = platform;
    return this;
  }

   /**
   * This can be &#x60;standalonewindows&#x60; or &#x60;android&#x60;, but can also pretty much be any random Unity verison such as &#x60;2019.2.4-801-Release&#x60; or &#x60;2019.2.2-772-Release&#x60; or even &#x60;unknownplatform&#x60;.
   * @return platform
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "standalonewindows", value = "This can be `standalonewindows` or `android`, but can also pretty much be any random Unity verison such as `2019.2.4-801-Release` or `2019.2.2-772-Release` or even `unknownplatform`.")

  public String getPlatform() {
    return platform;
  }


  public void setPlatform(String platform) {
    this.platform = platform;
  }


  public UpdateWorldRequest releaseStatus(ReleaseStatus releaseStatus) {
    
    this.releaseStatus = releaseStatus;
    return this;
  }

   /**
   * Get releaseStatus
   * @return releaseStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ReleaseStatus getReleaseStatus() {
    return releaseStatus;
  }


  public void setReleaseStatus(ReleaseStatus releaseStatus) {
    this.releaseStatus = releaseStatus;
  }


  public UpdateWorldRequest tags(List<String> tags) {
    
    this.tags = tags;
    return this;
  }

  public UpdateWorldRequest addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   *  
   * @return tags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = " ")

  public List<String> getTags() {
    return tags;
  }


  public void setTags(List<String> tags) {
    this.tags = tags;
  }


  public UpdateWorldRequest unityPackageUrl(String unityPackageUrl) {
    
    this.unityPackageUrl = unityPackageUrl;
    return this;
  }

   /**
   * Get unityPackageUrl
   * @return unityPackageUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUnityPackageUrl() {
    return unityPackageUrl;
  }


  public void setUnityPackageUrl(String unityPackageUrl) {
    this.unityPackageUrl = unityPackageUrl;
  }


  public UpdateWorldRequest unityVersion(String unityVersion) {
    
    this.unityVersion = unityVersion;
    return this;
  }

   /**
   * Get unityVersion
   * @return unityVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2018.4.20f1", value = "")

  public String getUnityVersion() {
    return unityVersion;
  }


  public void setUnityVersion(String unityVersion) {
    this.unityVersion = unityVersion;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateWorldRequest updateWorldRequest = (UpdateWorldRequest) o;
    return Objects.equals(this.assetUrl, updateWorldRequest.assetUrl) &&
        Objects.equals(this.assetVersion, updateWorldRequest.assetVersion) &&
        Objects.equals(this.authorId, updateWorldRequest.authorId) &&
        Objects.equals(this.authorName, updateWorldRequest.authorName) &&
        Objects.equals(this.capacity, updateWorldRequest.capacity) &&
        Objects.equals(this.description, updateWorldRequest.description) &&
        Objects.equals(this.imageUrl, updateWorldRequest.imageUrl) &&
        Objects.equals(this.name, updateWorldRequest.name) &&
        Objects.equals(this.platform, updateWorldRequest.platform) &&
        Objects.equals(this.releaseStatus, updateWorldRequest.releaseStatus) &&
        Objects.equals(this.tags, updateWorldRequest.tags) &&
        Objects.equals(this.unityPackageUrl, updateWorldRequest.unityPackageUrl) &&
        Objects.equals(this.unityVersion, updateWorldRequest.unityVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetUrl, assetVersion, authorId, authorName, capacity, description, imageUrl, name, platform, releaseStatus, tags, unityPackageUrl, unityVersion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateWorldRequest {\n");
    sb.append("    assetUrl: ").append(toIndentedString(assetUrl)).append("\n");
    sb.append("    assetVersion: ").append(toIndentedString(assetVersion)).append("\n");
    sb.append("    authorId: ").append(toIndentedString(authorId)).append("\n");
    sb.append("    authorName: ").append(toIndentedString(authorName)).append("\n");
    sb.append("    capacity: ").append(toIndentedString(capacity)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
    sb.append("    releaseStatus: ").append(toIndentedString(releaseStatus)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    unityPackageUrl: ").append(toIndentedString(unityPackageUrl)).append("\n");
    sb.append("    unityVersion: ").append(toIndentedString(unityVersion)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("assetUrl");
    openapiFields.add("assetVersion");
    openapiFields.add("authorId");
    openapiFields.add("authorName");
    openapiFields.add("capacity");
    openapiFields.add("description");
    openapiFields.add("imageUrl");
    openapiFields.add("name");
    openapiFields.add("platform");
    openapiFields.add("releaseStatus");
    openapiFields.add("tags");
    openapiFields.add("unityPackageUrl");
    openapiFields.add("unityVersion");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UpdateWorldRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!UpdateWorldRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdateWorldRequest is not found in the empty JSON string", UpdateWorldRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!UpdateWorldRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UpdateWorldRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("assetUrl") != null && !jsonObj.get("assetUrl").isJsonNull()) && !jsonObj.get("assetUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `assetUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("assetUrl").toString()));
      }
      if ((jsonObj.get("assetVersion") != null && !jsonObj.get("assetVersion").isJsonNull()) && !jsonObj.get("assetVersion").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `assetVersion` to be a primitive type in the JSON string but got `%s`", jsonObj.get("assetVersion").toString()));
      }
      if ((jsonObj.get("authorId") != null && !jsonObj.get("authorId").isJsonNull()) && !jsonObj.get("authorId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `authorId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("authorId").toString()));
      }
      if ((jsonObj.get("authorName") != null && !jsonObj.get("authorName").isJsonNull()) && !jsonObj.get("authorName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `authorName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("authorName").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("imageUrl") != null && !jsonObj.get("imageUrl").isJsonNull()) && !jsonObj.get("imageUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `imageUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("imageUrl").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("platform") != null && !jsonObj.get("platform").isJsonNull()) && !jsonObj.get("platform").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `platform` to be a primitive type in the JSON string but got `%s`", jsonObj.get("platform").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("tags") != null && !jsonObj.get("tags").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `tags` to be an array in the JSON string but got `%s`", jsonObj.get("tags").toString()));
      }
      if ((jsonObj.get("unityPackageUrl") != null && !jsonObj.get("unityPackageUrl").isJsonNull()) && !jsonObj.get("unityPackageUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `unityPackageUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("unityPackageUrl").toString()));
      }
      if ((jsonObj.get("unityVersion") != null && !jsonObj.get("unityVersion").isJsonNull()) && !jsonObj.get("unityVersion").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `unityVersion` to be a primitive type in the JSON string but got `%s`", jsonObj.get("unityVersion").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdateWorldRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateWorldRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateWorldRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateWorldRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateWorldRequest>() {
           @Override
           public void write(JsonWriter out, UpdateWorldRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdateWorldRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UpdateWorldRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UpdateWorldRequest
  * @throws IOException if the JSON string is invalid with respect to UpdateWorldRequest
  */
  public static UpdateWorldRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateWorldRequest.class);
  }

 /**
  * Convert an instance of UpdateWorldRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

