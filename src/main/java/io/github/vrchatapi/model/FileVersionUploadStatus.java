/*
 * VRChat API Documentation
 *
 * The version of the OpenAPI document: 1.18.9
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
 * 
 */
@ApiModel(description = "")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class FileVersionUploadStatus {
  public static final String SERIALIZED_NAME_UPLOAD_ID = "uploadId";
  @SerializedName(SERIALIZED_NAME_UPLOAD_ID)
  private String uploadId;

  public static final String SERIALIZED_NAME_FILE_NAME = "fileName";
  @SerializedName(SERIALIZED_NAME_FILE_NAME)
  private String fileName;

  public static final String SERIALIZED_NAME_NEXT_PART_NUMBER = "nextPartNumber";
  @SerializedName(SERIALIZED_NAME_NEXT_PART_NUMBER)
  private Integer nextPartNumber;

  public static final String SERIALIZED_NAME_MAX_PARTS = "maxParts";
  @SerializedName(SERIALIZED_NAME_MAX_PARTS)
  private Integer maxParts;

  public static final String SERIALIZED_NAME_PARTS = "parts";
  @SerializedName(SERIALIZED_NAME_PARTS)
  private List<Object> parts = new ArrayList<>();

  public static final String SERIALIZED_NAME_ETAGS = "etags";
  @SerializedName(SERIALIZED_NAME_ETAGS)
  private List<Object> etags = new ArrayList<>();

  public FileVersionUploadStatus() {
  }

  public FileVersionUploadStatus uploadId(String uploadId) {
    
    this.uploadId = uploadId;
    return this;
  }

   /**
   * Get uploadId
   * @return uploadId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx_xxxxxxxxxxxxxxxxxxxxxxxx.xxxxxxx_xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx..xxxxxxxxxxxxxxxxxxxxxxx", required = true, value = "")

  public String getUploadId() {
    return uploadId;
  }


  public void setUploadId(String uploadId) {
    this.uploadId = uploadId;
  }


  public FileVersionUploadStatus fileName(String fileName) {
    
    this.fileName = fileName;
    return this;
  }

   /**
   * Get fileName
   * @return fileName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Avatar-MyAvatar-Un.file_00000000-0000-0000-0000-000000000000.1.unitypackage", required = true, value = "")

  public String getFileName() {
    return fileName;
  }


  public void setFileName(String fileName) {
    this.fileName = fileName;
  }


  public FileVersionUploadStatus nextPartNumber(Integer nextPartNumber) {
    
    this.nextPartNumber = nextPartNumber;
    return this;
  }

   /**
   * Get nextPartNumber
   * minimum: 0
   * @return nextPartNumber
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "0", required = true, value = "")

  public Integer getNextPartNumber() {
    return nextPartNumber;
  }


  public void setNextPartNumber(Integer nextPartNumber) {
    this.nextPartNumber = nextPartNumber;
  }


  public FileVersionUploadStatus maxParts(Integer maxParts) {
    
    this.maxParts = maxParts;
    return this;
  }

   /**
   * Get maxParts
   * minimum: 1
   * @return maxParts
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1000", required = true, value = "")

  public Integer getMaxParts() {
    return maxParts;
  }


  public void setMaxParts(Integer maxParts) {
    this.maxParts = maxParts;
  }


  public FileVersionUploadStatus parts(List<Object> parts) {
    
    this.parts = parts;
    return this;
  }

  public FileVersionUploadStatus addPartsItem(Object partsItem) {
    this.parts.add(partsItem);
    return this;
  }

   /**
   * Get parts
   * @return parts
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<Object> getParts() {
    return parts;
  }


  public void setParts(List<Object> parts) {
    this.parts = parts;
  }


  public FileVersionUploadStatus etags(List<Object> etags) {
    
    this.etags = etags;
    return this;
  }

  public FileVersionUploadStatus addEtagsItem(Object etagsItem) {
    this.etags.add(etagsItem);
    return this;
  }

   /**
   * Unknown
   * @return etags
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Unknown")

  public List<Object> getEtags() {
    return etags;
  }


  public void setEtags(List<Object> etags) {
    this.etags = etags;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileVersionUploadStatus fileVersionUploadStatus = (FileVersionUploadStatus) o;
    return Objects.equals(this.uploadId, fileVersionUploadStatus.uploadId) &&
        Objects.equals(this.fileName, fileVersionUploadStatus.fileName) &&
        Objects.equals(this.nextPartNumber, fileVersionUploadStatus.nextPartNumber) &&
        Objects.equals(this.maxParts, fileVersionUploadStatus.maxParts) &&
        Objects.equals(this.parts, fileVersionUploadStatus.parts) &&
        Objects.equals(this.etags, fileVersionUploadStatus.etags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uploadId, fileName, nextPartNumber, maxParts, parts, etags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileVersionUploadStatus {\n");
    sb.append("    uploadId: ").append(toIndentedString(uploadId)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    nextPartNumber: ").append(toIndentedString(nextPartNumber)).append("\n");
    sb.append("    maxParts: ").append(toIndentedString(maxParts)).append("\n");
    sb.append("    parts: ").append(toIndentedString(parts)).append("\n");
    sb.append("    etags: ").append(toIndentedString(etags)).append("\n");
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
    openapiFields.add("uploadId");
    openapiFields.add("fileName");
    openapiFields.add("nextPartNumber");
    openapiFields.add("maxParts");
    openapiFields.add("parts");
    openapiFields.add("etags");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("uploadId");
    openapiRequiredFields.add("fileName");
    openapiRequiredFields.add("nextPartNumber");
    openapiRequiredFields.add("maxParts");
    openapiRequiredFields.add("parts");
    openapiRequiredFields.add("etags");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to FileVersionUploadStatus
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!FileVersionUploadStatus.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in FileVersionUploadStatus is not found in the empty JSON string", FileVersionUploadStatus.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!FileVersionUploadStatus.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `FileVersionUploadStatus` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : FileVersionUploadStatus.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("uploadId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uploadId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uploadId").toString()));
      }
      if (!jsonObj.get("fileName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fileName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fileName").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("parts") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("parts").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `parts` to be an array in the JSON string but got `%s`", jsonObj.get("parts").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("etags") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("etags").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `etags` to be an array in the JSON string but got `%s`", jsonObj.get("etags").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FileVersionUploadStatus.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FileVersionUploadStatus' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FileVersionUploadStatus> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FileVersionUploadStatus.class));

       return (TypeAdapter<T>) new TypeAdapter<FileVersionUploadStatus>() {
           @Override
           public void write(JsonWriter out, FileVersionUploadStatus value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FileVersionUploadStatus read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FileVersionUploadStatus given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FileVersionUploadStatus
  * @throws IOException if the JSON string is invalid with respect to FileVersionUploadStatus
  */
  public static FileVersionUploadStatus fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FileVersionUploadStatus.class);
  }

 /**
  * Convert an instance of FileVersionUploadStatus to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

