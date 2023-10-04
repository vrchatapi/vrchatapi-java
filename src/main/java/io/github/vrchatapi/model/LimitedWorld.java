/*
 * VRChat API Documentation
 *
 * The version of the OpenAPI document: 1.15.0
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
import io.github.vrchatapi.model.LimitedUnityPackage;
import io.github.vrchatapi.model.ReleaseStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
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
 * 
 */
@ApiModel(description = "")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class LimitedWorld {
  public static final String SERIALIZED_NAME_AUTHOR_ID = "authorId";
  @SerializedName(SERIALIZED_NAME_AUTHOR_ID)
  private String authorId;

  public static final String SERIALIZED_NAME_AUTHOR_NAME = "authorName";
  @SerializedName(SERIALIZED_NAME_AUTHOR_NAME)
  private String authorName;

  public static final String SERIALIZED_NAME_CAPACITY = "capacity";
  @SerializedName(SERIALIZED_NAME_CAPACITY)
  private Integer capacity;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_FAVORITES = "favorites";
  @SerializedName(SERIALIZED_NAME_FAVORITES)
  private Integer favorites = 0;

  public static final String SERIALIZED_NAME_HEAT = "heat";
  @SerializedName(SERIALIZED_NAME_HEAT)
  private Integer heat = 0;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_IMAGE_URL = "imageUrl";
  @SerializedName(SERIALIZED_NAME_IMAGE_URL)
  private String imageUrl;

  public static final String SERIALIZED_NAME_LABS_PUBLICATION_DATE = "labsPublicationDate";
  @SerializedName(SERIALIZED_NAME_LABS_PUBLICATION_DATE)
  private String labsPublicationDate;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_OCCUPANTS = "occupants";
  @SerializedName(SERIALIZED_NAME_OCCUPANTS)
  private Integer occupants = 0;

  public static final String SERIALIZED_NAME_ORGANIZATION = "organization";
  @SerializedName(SERIALIZED_NAME_ORGANIZATION)
  private String organization = "vrchat";

  public static final String SERIALIZED_NAME_POPULARITY = "popularity";
  @SerializedName(SERIALIZED_NAME_POPULARITY)
  private Integer popularity = 0;

  public static final String SERIALIZED_NAME_PUBLICATION_DATE = "publicationDate";
  @SerializedName(SERIALIZED_NAME_PUBLICATION_DATE)
  private String publicationDate;

  public static final String SERIALIZED_NAME_RELEASE_STATUS = "releaseStatus";
  @SerializedName(SERIALIZED_NAME_RELEASE_STATUS)
  private ReleaseStatus releaseStatus = ReleaseStatus.PUBLIC;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<String> tags = new ArrayList<>();

  public static final String SERIALIZED_NAME_THUMBNAIL_IMAGE_URL = "thumbnailImageUrl";
  @SerializedName(SERIALIZED_NAME_THUMBNAIL_IMAGE_URL)
  private String thumbnailImageUrl;

  public static final String SERIALIZED_NAME_UNITY_PACKAGES = "unityPackages";
  @SerializedName(SERIALIZED_NAME_UNITY_PACKAGES)
  private List<LimitedUnityPackage> unityPackages = new ArrayList<>();

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public LimitedWorld() {
  }

  public LimitedWorld authorId(String authorId) {
    
    this.authorId = authorId;
    return this;
  }

   /**
   * A users unique ID, usually in the form of &#x60;usr_c1644b5b-3ca4-45b4-97c6-a2a0de70d469&#x60;. Legacy players can have old IDs in the form of &#x60;8JoV9XEdpo&#x60;. The ID can never be changed.
   * @return authorId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "usr_c1644b5b-3ca4-45b4-97c6-a2a0de70d469", required = true, value = "A users unique ID, usually in the form of `usr_c1644b5b-3ca4-45b4-97c6-a2a0de70d469`. Legacy players can have old IDs in the form of `8JoV9XEdpo`. The ID can never be changed.")

  public String getAuthorId() {
    return authorId;
  }


  public void setAuthorId(String authorId) {
    this.authorId = authorId;
  }


  public LimitedWorld authorName(String authorName) {
    
    this.authorName = authorName;
    return this;
  }

   /**
   * Get authorName
   * @return authorName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getAuthorName() {
    return authorName;
  }


  public void setAuthorName(String authorName) {
    this.authorName = authorName;
  }


  public LimitedWorld capacity(Integer capacity) {
    
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
  @ApiModelProperty(example = "8", required = true, value = "")

  public Integer getCapacity() {
    return capacity;
  }


  public void setCapacity(Integer capacity) {
    this.capacity = capacity;
  }


  public LimitedWorld createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public LimitedWorld favorites(Integer favorites) {
    
    this.favorites = favorites;
    return this;
  }

   /**
   * Get favorites
   * minimum: 0
   * @return favorites
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "12024", required = true, value = "")

  public Integer getFavorites() {
    return favorites;
  }


  public void setFavorites(Integer favorites) {
    this.favorites = favorites;
  }


  public LimitedWorld heat(Integer heat) {
    
    this.heat = heat;
    return this;
  }

   /**
   * Get heat
   * minimum: 0
   * @return heat
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "5", required = true, value = "")

  public Integer getHeat() {
    return heat;
  }


  public void setHeat(Integer heat) {
    this.heat = heat;
  }


  public LimitedWorld id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * WorldID be \&quot;offline\&quot; on User profiles if you are not friends with that user.
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "wrld_ba913a96-fac4-4048-a062-9aa5db092812", required = true, value = "WorldID be \"offline\" on User profiles if you are not friends with that user.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public LimitedWorld imageUrl(String imageUrl) {
    
    this.imageUrl = imageUrl;
    return this;
  }

   /**
   * Get imageUrl
   * @return imageUrl
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getImageUrl() {
    return imageUrl;
  }


  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }


  public LimitedWorld labsPublicationDate(String labsPublicationDate) {
    
    this.labsPublicationDate = labsPublicationDate;
    return this;
  }

   /**
   * Get labsPublicationDate
   * @return labsPublicationDate
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "none", required = true, value = "")

  public String getLabsPublicationDate() {
    return labsPublicationDate;
  }


  public void setLabsPublicationDate(String labsPublicationDate) {
    this.labsPublicationDate = labsPublicationDate;
  }


  public LimitedWorld name(String name) {
    
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


  public LimitedWorld occupants(Integer occupants) {
    
    this.occupants = occupants;
    return this;
  }

   /**
   * Get occupants
   * minimum: 0
   * @return occupants
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "47", required = true, value = "")

  public Integer getOccupants() {
    return occupants;
  }


  public void setOccupants(Integer occupants) {
    this.occupants = occupants;
  }


  public LimitedWorld organization(String organization) {
    
    this.organization = organization;
    return this;
  }

   /**
   * Get organization
   * @return organization
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getOrganization() {
    return organization;
  }


  public void setOrganization(String organization) {
    this.organization = organization;
  }


  public LimitedWorld popularity(Integer popularity) {
    
    this.popularity = popularity;
    return this;
  }

   /**
   * Get popularity
   * minimum: 0
   * @return popularity
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "8", required = true, value = "")

  public Integer getPopularity() {
    return popularity;
  }


  public void setPopularity(Integer popularity) {
    this.popularity = popularity;
  }


  public LimitedWorld publicationDate(String publicationDate) {
    
    this.publicationDate = publicationDate;
    return this;
  }

   /**
   * Get publicationDate
   * @return publicationDate
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "none", required = true, value = "")

  public String getPublicationDate() {
    return publicationDate;
  }


  public void setPublicationDate(String publicationDate) {
    this.publicationDate = publicationDate;
  }


  public LimitedWorld releaseStatus(ReleaseStatus releaseStatus) {
    
    this.releaseStatus = releaseStatus;
    return this;
  }

   /**
   * Get releaseStatus
   * @return releaseStatus
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public ReleaseStatus getReleaseStatus() {
    return releaseStatus;
  }


  public void setReleaseStatus(ReleaseStatus releaseStatus) {
    this.releaseStatus = releaseStatus;
  }


  public LimitedWorld tags(List<String> tags) {
    
    this.tags = tags;
    return this;
  }

  public LimitedWorld addTagsItem(String tagsItem) {
    this.tags.add(tagsItem);
    return this;
  }

   /**
   *  
   * @return tags
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = " ")

  public List<String> getTags() {
    return tags;
  }


  public void setTags(List<String> tags) {
    this.tags = tags;
  }


  public LimitedWorld thumbnailImageUrl(String thumbnailImageUrl) {
    
    this.thumbnailImageUrl = thumbnailImageUrl;
    return this;
  }

   /**
   * Get thumbnailImageUrl
   * @return thumbnailImageUrl
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getThumbnailImageUrl() {
    return thumbnailImageUrl;
  }


  public void setThumbnailImageUrl(String thumbnailImageUrl) {
    this.thumbnailImageUrl = thumbnailImageUrl;
  }


  public LimitedWorld unityPackages(List<LimitedUnityPackage> unityPackages) {
    
    this.unityPackages = unityPackages;
    return this;
  }

  public LimitedWorld addUnityPackagesItem(LimitedUnityPackage unityPackagesItem) {
    this.unityPackages.add(unityPackagesItem);
    return this;
  }

   /**
   *  
   * @return unityPackages
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = " ")

  public List<LimitedUnityPackage> getUnityPackages() {
    return unityPackages;
  }


  public void setUnityPackages(List<LimitedUnityPackage> unityPackages) {
    this.unityPackages = unityPackages;
  }


  public LimitedWorld updatedAt(OffsetDateTime updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LimitedWorld limitedWorld = (LimitedWorld) o;
    return Objects.equals(this.authorId, limitedWorld.authorId) &&
        Objects.equals(this.authorName, limitedWorld.authorName) &&
        Objects.equals(this.capacity, limitedWorld.capacity) &&
        Objects.equals(this.createdAt, limitedWorld.createdAt) &&
        Objects.equals(this.favorites, limitedWorld.favorites) &&
        Objects.equals(this.heat, limitedWorld.heat) &&
        Objects.equals(this.id, limitedWorld.id) &&
        Objects.equals(this.imageUrl, limitedWorld.imageUrl) &&
        Objects.equals(this.labsPublicationDate, limitedWorld.labsPublicationDate) &&
        Objects.equals(this.name, limitedWorld.name) &&
        Objects.equals(this.occupants, limitedWorld.occupants) &&
        Objects.equals(this.organization, limitedWorld.organization) &&
        Objects.equals(this.popularity, limitedWorld.popularity) &&
        Objects.equals(this.publicationDate, limitedWorld.publicationDate) &&
        Objects.equals(this.releaseStatus, limitedWorld.releaseStatus) &&
        Objects.equals(this.tags, limitedWorld.tags) &&
        Objects.equals(this.thumbnailImageUrl, limitedWorld.thumbnailImageUrl) &&
        Objects.equals(this.unityPackages, limitedWorld.unityPackages) &&
        Objects.equals(this.updatedAt, limitedWorld.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authorId, authorName, capacity, createdAt, favorites, heat, id, imageUrl, labsPublicationDate, name, occupants, organization, popularity, publicationDate, releaseStatus, tags, thumbnailImageUrl, unityPackages, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LimitedWorld {\n");
    sb.append("    authorId: ").append(toIndentedString(authorId)).append("\n");
    sb.append("    authorName: ").append(toIndentedString(authorName)).append("\n");
    sb.append("    capacity: ").append(toIndentedString(capacity)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    favorites: ").append(toIndentedString(favorites)).append("\n");
    sb.append("    heat: ").append(toIndentedString(heat)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
    sb.append("    labsPublicationDate: ").append(toIndentedString(labsPublicationDate)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    occupants: ").append(toIndentedString(occupants)).append("\n");
    sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
    sb.append("    popularity: ").append(toIndentedString(popularity)).append("\n");
    sb.append("    publicationDate: ").append(toIndentedString(publicationDate)).append("\n");
    sb.append("    releaseStatus: ").append(toIndentedString(releaseStatus)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    thumbnailImageUrl: ").append(toIndentedString(thumbnailImageUrl)).append("\n");
    sb.append("    unityPackages: ").append(toIndentedString(unityPackages)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
    openapiFields.add("authorId");
    openapiFields.add("authorName");
    openapiFields.add("capacity");
    openapiFields.add("created_at");
    openapiFields.add("favorites");
    openapiFields.add("heat");
    openapiFields.add("id");
    openapiFields.add("imageUrl");
    openapiFields.add("labsPublicationDate");
    openapiFields.add("name");
    openapiFields.add("occupants");
    openapiFields.add("organization");
    openapiFields.add("popularity");
    openapiFields.add("publicationDate");
    openapiFields.add("releaseStatus");
    openapiFields.add("tags");
    openapiFields.add("thumbnailImageUrl");
    openapiFields.add("unityPackages");
    openapiFields.add("updated_at");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("authorId");
    openapiRequiredFields.add("authorName");
    openapiRequiredFields.add("capacity");
    openapiRequiredFields.add("created_at");
    openapiRequiredFields.add("favorites");
    openapiRequiredFields.add("heat");
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("imageUrl");
    openapiRequiredFields.add("labsPublicationDate");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("occupants");
    openapiRequiredFields.add("organization");
    openapiRequiredFields.add("popularity");
    openapiRequiredFields.add("publicationDate");
    openapiRequiredFields.add("releaseStatus");
    openapiRequiredFields.add("tags");
    openapiRequiredFields.add("thumbnailImageUrl");
    openapiRequiredFields.add("unityPackages");
    openapiRequiredFields.add("updated_at");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to LimitedWorld
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!LimitedWorld.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in LimitedWorld is not found in the empty JSON string", LimitedWorld.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!LimitedWorld.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `LimitedWorld` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : LimitedWorld.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("authorId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `authorId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("authorId").toString()));
      }
      if (!jsonObj.get("authorName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `authorName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("authorName").toString()));
      }
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("imageUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `imageUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("imageUrl").toString()));
      }
      if (!jsonObj.get("labsPublicationDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `labsPublicationDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("labsPublicationDate").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("organization").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `organization` to be a primitive type in the JSON string but got `%s`", jsonObj.get("organization").toString()));
      }
      if (!jsonObj.get("publicationDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `publicationDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("publicationDate").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("tags") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("tags").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `tags` to be an array in the JSON string but got `%s`", jsonObj.get("tags").toString()));
      }
      if (!jsonObj.get("thumbnailImageUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `thumbnailImageUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("thumbnailImageUrl").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("unityPackages").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `unityPackages` to be an array in the JSON string but got `%s`", jsonObj.get("unityPackages").toString()));
      }

      JsonArray jsonArrayunityPackages = jsonObj.getAsJsonArray("unityPackages");
      // validate the required field `unityPackages` (array)
      for (int i = 0; i < jsonArrayunityPackages.size(); i++) {
        LimitedUnityPackage.validateJsonObject(jsonArrayunityPackages.get(i).getAsJsonObject());
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LimitedWorld.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LimitedWorld' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LimitedWorld> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LimitedWorld.class));

       return (TypeAdapter<T>) new TypeAdapter<LimitedWorld>() {
           @Override
           public void write(JsonWriter out, LimitedWorld value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LimitedWorld read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of LimitedWorld given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LimitedWorld
  * @throws IOException if the JSON string is invalid with respect to LimitedWorld
  */
  public static LimitedWorld fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LimitedWorld.class);
  }

 /**
  * Convert an instance of LimitedWorld to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

