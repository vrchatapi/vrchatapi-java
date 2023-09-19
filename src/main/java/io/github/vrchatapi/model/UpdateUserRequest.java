/*
 * VRChat API Documentation
 *
 * The version of the OpenAPI document: 1.13.0
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
import io.github.vrchatapi.model.UserStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import java.time.LocalDate;
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
 * UpdateUserRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UpdateUserRequest {
  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_BIRTHDAY = "birthday";
  @SerializedName(SERIALIZED_NAME_BIRTHDAY)
  private LocalDate birthday;

  public static final String SERIALIZED_NAME_ACCEPTED_T_O_S_VERSION = "acceptedTOSVersion";
  @SerializedName(SERIALIZED_NAME_ACCEPTED_T_O_S_VERSION)
  private BigDecimal acceptedTOSVersion;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<String> tags = null;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private UserStatus status = UserStatus.OFFLINE;

  public static final String SERIALIZED_NAME_STATUS_DESCRIPTION = "statusDescription";
  @SerializedName(SERIALIZED_NAME_STATUS_DESCRIPTION)
  private String statusDescription;

  public static final String SERIALIZED_NAME_BIO = "bio";
  @SerializedName(SERIALIZED_NAME_BIO)
  private String bio;

  public static final String SERIALIZED_NAME_BIO_LINKS = "bioLinks";
  @SerializedName(SERIALIZED_NAME_BIO_LINKS)
  private List<String> bioLinks = null;

  public static final String SERIALIZED_NAME_USER_ICON = "userIcon";
  @SerializedName(SERIALIZED_NAME_USER_ICON)
  private String userIcon;

  public UpdateUserRequest() {
  }

  public UpdateUserRequest email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    this.email = email;
  }


  public UpdateUserRequest birthday(LocalDate birthday) {
    
    this.birthday = birthday;
    return this;
  }

   /**
   * Get birthday
   * @return birthday
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LocalDate getBirthday() {
    return birthday;
  }


  public void setBirthday(LocalDate birthday) {
    this.birthday = birthday;
  }


  public UpdateUserRequest acceptedTOSVersion(BigDecimal acceptedTOSVersion) {
    
    this.acceptedTOSVersion = acceptedTOSVersion;
    return this;
  }

   /**
   * Get acceptedTOSVersion
   * @return acceptedTOSVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getAcceptedTOSVersion() {
    return acceptedTOSVersion;
  }


  public void setAcceptedTOSVersion(BigDecimal acceptedTOSVersion) {
    this.acceptedTOSVersion = acceptedTOSVersion;
  }


  public UpdateUserRequest tags(List<String> tags) {
    
    this.tags = tags;
    return this;
  }

  public UpdateUserRequest addTagsItem(String tagsItem) {
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


  public UpdateUserRequest status(UserStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UserStatus getStatus() {
    return status;
  }


  public void setStatus(UserStatus status) {
    this.status = status;
  }


  public UpdateUserRequest statusDescription(String statusDescription) {
    
    this.statusDescription = statusDescription;
    return this;
  }

   /**
   * Get statusDescription
   * @return statusDescription
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getStatusDescription() {
    return statusDescription;
  }


  public void setStatusDescription(String statusDescription) {
    this.statusDescription = statusDescription;
  }


  public UpdateUserRequest bio(String bio) {
    
    this.bio = bio;
    return this;
  }

   /**
   * Get bio
   * @return bio
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBio() {
    return bio;
  }


  public void setBio(String bio) {
    this.bio = bio;
  }


  public UpdateUserRequest bioLinks(List<String> bioLinks) {
    
    this.bioLinks = bioLinks;
    return this;
  }

  public UpdateUserRequest addBioLinksItem(String bioLinksItem) {
    if (this.bioLinks == null) {
      this.bioLinks = new ArrayList<>();
    }
    this.bioLinks.add(bioLinksItem);
    return this;
  }

   /**
   * Get bioLinks
   * @return bioLinks
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getBioLinks() {
    return bioLinks;
  }


  public void setBioLinks(List<String> bioLinks) {
    this.bioLinks = bioLinks;
  }


  public UpdateUserRequest userIcon(String userIcon) {
    
    this.userIcon = userIcon;
    return this;
  }

   /**
   * MUST be a valid VRChat /file/ url.
   * @return userIcon
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://api.vrchat.cloud/api/1/file/file_76dc2964-0ce8-41df-b2e7-8edf994fee31/1", value = "MUST be a valid VRChat /file/ url.")

  public String getUserIcon() {
    return userIcon;
  }


  public void setUserIcon(String userIcon) {
    this.userIcon = userIcon;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateUserRequest updateUserRequest = (UpdateUserRequest) o;
    return Objects.equals(this.email, updateUserRequest.email) &&
        Objects.equals(this.birthday, updateUserRequest.birthday) &&
        Objects.equals(this.acceptedTOSVersion, updateUserRequest.acceptedTOSVersion) &&
        Objects.equals(this.tags, updateUserRequest.tags) &&
        Objects.equals(this.status, updateUserRequest.status) &&
        Objects.equals(this.statusDescription, updateUserRequest.statusDescription) &&
        Objects.equals(this.bio, updateUserRequest.bio) &&
        Objects.equals(this.bioLinks, updateUserRequest.bioLinks) &&
        Objects.equals(this.userIcon, updateUserRequest.userIcon);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, birthday, acceptedTOSVersion, tags, status, statusDescription, bio, bioLinks, userIcon);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateUserRequest {\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    birthday: ").append(toIndentedString(birthday)).append("\n");
    sb.append("    acceptedTOSVersion: ").append(toIndentedString(acceptedTOSVersion)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusDescription: ").append(toIndentedString(statusDescription)).append("\n");
    sb.append("    bio: ").append(toIndentedString(bio)).append("\n");
    sb.append("    bioLinks: ").append(toIndentedString(bioLinks)).append("\n");
    sb.append("    userIcon: ").append(toIndentedString(userIcon)).append("\n");
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
    openapiFields.add("email");
    openapiFields.add("birthday");
    openapiFields.add("acceptedTOSVersion");
    openapiFields.add("tags");
    openapiFields.add("status");
    openapiFields.add("statusDescription");
    openapiFields.add("bio");
    openapiFields.add("bioLinks");
    openapiFields.add("userIcon");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UpdateUserRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!UpdateUserRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdateUserRequest is not found in the empty JSON string", UpdateUserRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!UpdateUserRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UpdateUserRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("email") != null && !jsonObj.get("email").isJsonNull()) && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("tags") != null && !jsonObj.get("tags").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `tags` to be an array in the JSON string but got `%s`", jsonObj.get("tags").toString()));
      }
      if ((jsonObj.get("statusDescription") != null && !jsonObj.get("statusDescription").isJsonNull()) && !jsonObj.get("statusDescription").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `statusDescription` to be a primitive type in the JSON string but got `%s`", jsonObj.get("statusDescription").toString()));
      }
      if ((jsonObj.get("bio") != null && !jsonObj.get("bio").isJsonNull()) && !jsonObj.get("bio").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bio` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bio").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("bioLinks") != null && !jsonObj.get("bioLinks").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `bioLinks` to be an array in the JSON string but got `%s`", jsonObj.get("bioLinks").toString()));
      }
      if ((jsonObj.get("userIcon") != null && !jsonObj.get("userIcon").isJsonNull()) && !jsonObj.get("userIcon").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `userIcon` to be a primitive type in the JSON string but got `%s`", jsonObj.get("userIcon").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdateUserRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateUserRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateUserRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateUserRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateUserRequest>() {
           @Override
           public void write(JsonWriter out, UpdateUserRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdateUserRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UpdateUserRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UpdateUserRequest
  * @throws IOException if the JSON string is invalid with respect to UpdateUserRequest
  */
  public static UpdateUserRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateUserRequest.class);
  }

 /**
  * Convert an instance of UpdateUserRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

