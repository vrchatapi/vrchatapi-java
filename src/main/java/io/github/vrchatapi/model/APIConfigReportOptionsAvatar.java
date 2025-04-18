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


package io.github.vrchatapi.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
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
 * APIConfigReportOptionsAvatar
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class APIConfigReportOptionsAvatar {
  public static final String SERIALIZED_NAME_AVATAR = "avatar";
  @SerializedName(SERIALIZED_NAME_AVATAR)
  private List<String> avatar = null;

  public static final String SERIALIZED_NAME_AVATARPAGE = "avatarpage";
  @SerializedName(SERIALIZED_NAME_AVATARPAGE)
  private List<String> avatarpage = null;

  public static final String SERIALIZED_NAME_WARNINGS = "warnings";
  @SerializedName(SERIALIZED_NAME_WARNINGS)
  private List<String> warnings = null;

  public APIConfigReportOptionsAvatar() {
  }

  public APIConfigReportOptionsAvatar avatar(List<String> avatar) {
    
    this.avatar = avatar;
    return this;
  }

  public APIConfigReportOptionsAvatar addAvatarItem(String avatarItem) {
    if (this.avatar == null) {
      this.avatar = new ArrayList<>();
    }
    this.avatar.add(avatarItem);
    return this;
  }

   /**
   * Get avatar
   * @return avatar
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getAvatar() {
    return avatar;
  }


  public void setAvatar(List<String> avatar) {
    this.avatar = avatar;
  }


  public APIConfigReportOptionsAvatar avatarpage(List<String> avatarpage) {
    
    this.avatarpage = avatarpage;
    return this;
  }

  public APIConfigReportOptionsAvatar addAvatarpageItem(String avatarpageItem) {
    if (this.avatarpage == null) {
      this.avatarpage = new ArrayList<>();
    }
    this.avatarpage.add(avatarpageItem);
    return this;
  }

   /**
   * Get avatarpage
   * @return avatarpage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getAvatarpage() {
    return avatarpage;
  }


  public void setAvatarpage(List<String> avatarpage) {
    this.avatarpage = avatarpage;
  }


  public APIConfigReportOptionsAvatar warnings(List<String> warnings) {
    
    this.warnings = warnings;
    return this;
  }

  public APIConfigReportOptionsAvatar addWarningsItem(String warningsItem) {
    if (this.warnings == null) {
      this.warnings = new ArrayList<>();
    }
    this.warnings.add(warningsItem);
    return this;
  }

   /**
   * Get warnings
   * @return warnings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getWarnings() {
    return warnings;
  }


  public void setWarnings(List<String> warnings) {
    this.warnings = warnings;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    APIConfigReportOptionsAvatar apIConfigReportOptionsAvatar = (APIConfigReportOptionsAvatar) o;
    return Objects.equals(this.avatar, apIConfigReportOptionsAvatar.avatar) &&
        Objects.equals(this.avatarpage, apIConfigReportOptionsAvatar.avatarpage) &&
        Objects.equals(this.warnings, apIConfigReportOptionsAvatar.warnings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(avatar, avatarpage, warnings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class APIConfigReportOptionsAvatar {\n");
    sb.append("    avatar: ").append(toIndentedString(avatar)).append("\n");
    sb.append("    avatarpage: ").append(toIndentedString(avatarpage)).append("\n");
    sb.append("    warnings: ").append(toIndentedString(warnings)).append("\n");
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
    openapiFields.add("avatar");
    openapiFields.add("avatarpage");
    openapiFields.add("warnings");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to APIConfigReportOptionsAvatar
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!APIConfigReportOptionsAvatar.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in APIConfigReportOptionsAvatar is not found in the empty JSON string", APIConfigReportOptionsAvatar.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!APIConfigReportOptionsAvatar.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `APIConfigReportOptionsAvatar` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("avatar") != null && !jsonObj.get("avatar").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `avatar` to be an array in the JSON string but got `%s`", jsonObj.get("avatar").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("avatarpage") != null && !jsonObj.get("avatarpage").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `avatarpage` to be an array in the JSON string but got `%s`", jsonObj.get("avatarpage").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("warnings") != null && !jsonObj.get("warnings").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `warnings` to be an array in the JSON string but got `%s`", jsonObj.get("warnings").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!APIConfigReportOptionsAvatar.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'APIConfigReportOptionsAvatar' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<APIConfigReportOptionsAvatar> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(APIConfigReportOptionsAvatar.class));

       return (TypeAdapter<T>) new TypeAdapter<APIConfigReportOptionsAvatar>() {
           @Override
           public void write(JsonWriter out, APIConfigReportOptionsAvatar value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public APIConfigReportOptionsAvatar read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of APIConfigReportOptionsAvatar given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of APIConfigReportOptionsAvatar
  * @throws IOException if the JSON string is invalid with respect to APIConfigReportOptionsAvatar
  */
  public static APIConfigReportOptionsAvatar fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, APIConfigReportOptionsAvatar.class);
  }

 /**
  * Convert an instance of APIConfigReportOptionsAvatar to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

