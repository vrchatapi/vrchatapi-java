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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

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
 * DynamicContentRow
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DynamicContentRow {
  public static final String SERIALIZED_NAME_INDEX = "index";
  @SerializedName(SERIALIZED_NAME_INDEX)
  private Integer index;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PLATFORM = "platform";
  @SerializedName(SERIALIZED_NAME_PLATFORM)
  private String platform;

  public static final String SERIALIZED_NAME_SORT_HEADING = "sortHeading";
  @SerializedName(SERIALIZED_NAME_SORT_HEADING)
  private String sortHeading;

  public static final String SERIALIZED_NAME_SORT_ORDER = "sortOrder";
  @SerializedName(SERIALIZED_NAME_SORT_ORDER)
  private String sortOrder;

  public static final String SERIALIZED_NAME_SORT_OWNERSHIP = "sortOwnership";
  @SerializedName(SERIALIZED_NAME_SORT_OWNERSHIP)
  private String sortOwnership;

  public static final String SERIALIZED_NAME_TAG = "tag";
  @SerializedName(SERIALIZED_NAME_TAG)
  private String tag;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public DynamicContentRow() {
  }

  public DynamicContentRow index(Integer index) {
    
    this.index = index;
    return this;
  }

   /**
   * Get index
   * minimum: 0
   * @return index
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getIndex() {
    return index;
  }


  public void setIndex(Integer index) {
    this.index = index;
  }


  public DynamicContentRow name(String name) {
    
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


  public DynamicContentRow platform(String platform) {
    
    this.platform = platform;
    return this;
  }

   /**
   * Usually \&quot;ThisPlatformSupported\&quot;, but can also be other values such as \&quot;all\&quot; or platform specific identifiers.
   * @return platform
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Usually \"ThisPlatformSupported\", but can also be other values such as \"all\" or platform specific identifiers.")

  public String getPlatform() {
    return platform;
  }


  public void setPlatform(String platform) {
    this.platform = platform;
  }


  public DynamicContentRow sortHeading(String sortHeading) {
    
    this.sortHeading = sortHeading;
    return this;
  }

   /**
   * Get sortHeading
   * @return sortHeading
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getSortHeading() {
    return sortHeading;
  }


  public void setSortHeading(String sortHeading) {
    this.sortHeading = sortHeading;
  }


  public DynamicContentRow sortOrder(String sortOrder) {
    
    this.sortOrder = sortOrder;
    return this;
  }

   /**
   * Get sortOrder
   * @return sortOrder
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getSortOrder() {
    return sortOrder;
  }


  public void setSortOrder(String sortOrder) {
    this.sortOrder = sortOrder;
  }


  public DynamicContentRow sortOwnership(String sortOwnership) {
    
    this.sortOwnership = sortOwnership;
    return this;
  }

   /**
   * Get sortOwnership
   * @return sortOwnership
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getSortOwnership() {
    return sortOwnership;
  }


  public void setSortOwnership(String sortOwnership) {
    this.sortOwnership = sortOwnership;
  }


  public DynamicContentRow tag(String tag) {
    
    this.tag = tag;
    return this;
  }

   /**
   * Tag to filter content for this row.
   * @return tag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Tag to filter content for this row.")

  public String getTag() {
    return tag;
  }


  public void setTag(String tag) {
    this.tag = tag;
  }


  public DynamicContentRow type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Type is not present if it is a world.
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "avatar", value = "Type is not present if it is a world.")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DynamicContentRow dynamicContentRow = (DynamicContentRow) o;
    return Objects.equals(this.index, dynamicContentRow.index) &&
        Objects.equals(this.name, dynamicContentRow.name) &&
        Objects.equals(this.platform, dynamicContentRow.platform) &&
        Objects.equals(this.sortHeading, dynamicContentRow.sortHeading) &&
        Objects.equals(this.sortOrder, dynamicContentRow.sortOrder) &&
        Objects.equals(this.sortOwnership, dynamicContentRow.sortOwnership) &&
        Objects.equals(this.tag, dynamicContentRow.tag) &&
        Objects.equals(this.type, dynamicContentRow.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(index, name, platform, sortHeading, sortOrder, sortOwnership, tag, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DynamicContentRow {\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
    sb.append("    sortHeading: ").append(toIndentedString(sortHeading)).append("\n");
    sb.append("    sortOrder: ").append(toIndentedString(sortOrder)).append("\n");
    sb.append("    sortOwnership: ").append(toIndentedString(sortOwnership)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
    openapiFields.add("index");
    openapiFields.add("name");
    openapiFields.add("platform");
    openapiFields.add("sortHeading");
    openapiFields.add("sortOrder");
    openapiFields.add("sortOwnership");
    openapiFields.add("tag");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("platform");
    openapiRequiredFields.add("sortHeading");
    openapiRequiredFields.add("sortOrder");
    openapiRequiredFields.add("sortOwnership");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to DynamicContentRow
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!DynamicContentRow.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DynamicContentRow is not found in the empty JSON string", DynamicContentRow.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!DynamicContentRow.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DynamicContentRow` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : DynamicContentRow.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("platform").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `platform` to be a primitive type in the JSON string but got `%s`", jsonObj.get("platform").toString()));
      }
      if (!jsonObj.get("sortHeading").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sortHeading` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sortHeading").toString()));
      }
      if (!jsonObj.get("sortOrder").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sortOrder` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sortOrder").toString()));
      }
      if (!jsonObj.get("sortOwnership").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sortOwnership` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sortOwnership").toString()));
      }
      if ((jsonObj.get("tag") != null && !jsonObj.get("tag").isJsonNull()) && !jsonObj.get("tag").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tag` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tag").toString()));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DynamicContentRow.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DynamicContentRow' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DynamicContentRow> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DynamicContentRow.class));

       return (TypeAdapter<T>) new TypeAdapter<DynamicContentRow>() {
           @Override
           public void write(JsonWriter out, DynamicContentRow value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DynamicContentRow read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DynamicContentRow given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DynamicContentRow
  * @throws IOException if the JSON string is invalid with respect to DynamicContentRow
  */
  public static DynamicContentRow fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DynamicContentRow.class);
  }

 /**
  * Convert an instance of DynamicContentRow to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

