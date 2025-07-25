/*
 * VRChat API Documentation
 *
 * The version of the OpenAPI document: 1.20.1
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
import io.github.vrchatapi.model.FileStatus;
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
 * 
 */
@ApiModel(description = "")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class FileData {
  /**
   * Gets or Sets category
   */
  @JsonAdapter(CategoryEnum.Adapter.class)
  public enum CategoryEnum {
    MULTIPART("multipart"),
    
    QUEUED("queued"),
    
    SIMPLE("simple");

    private String value;

    CategoryEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CategoryEnum fromValue(String value) {
      for (CategoryEnum b : CategoryEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<CategoryEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CategoryEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CategoryEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return CategoryEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_CATEGORY = "category";
  @SerializedName(SERIALIZED_NAME_CATEGORY)
  private CategoryEnum category = CategoryEnum.QUEUED;

  public static final String SERIALIZED_NAME_FILE_NAME = "fileName";
  @SerializedName(SERIALIZED_NAME_FILE_NAME)
  private String fileName;

  public static final String SERIALIZED_NAME_MD5 = "md5";
  @SerializedName(SERIALIZED_NAME_MD5)
  private String md5;

  public static final String SERIALIZED_NAME_SIZE_IN_BYTES = "sizeInBytes";
  @SerializedName(SERIALIZED_NAME_SIZE_IN_BYTES)
  private Integer sizeInBytes;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private FileStatus status = FileStatus.WAITING;

  public static final String SERIALIZED_NAME_UPLOAD_ID = "uploadId";
  @SerializedName(SERIALIZED_NAME_UPLOAD_ID)
  private String uploadId = "";

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public FileData() {
  }

  public FileData category(CategoryEnum category) {
    
    this.category = category;
    return this;
  }

   /**
   * Get category
   * @return category
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public CategoryEnum getCategory() {
    return category;
  }


  public void setCategory(CategoryEnum category) {
    this.category = category;
  }


  public FileData fileName(String fileName) {
    
    this.fileName = fileName;
    return this;
  }

   /**
   * Get fileName
   * @return fileName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getFileName() {
    return fileName;
  }


  public void setFileName(String fileName) {
    this.fileName = fileName;
  }


  public FileData md5(String md5) {
    
    this.md5 = md5;
    return this;
  }

   /**
   * Get md5
   * @return md5
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMd5() {
    return md5;
  }


  public void setMd5(String md5) {
    this.md5 = md5;
  }


  public FileData sizeInBytes(Integer sizeInBytes) {
    
    this.sizeInBytes = sizeInBytes;
    return this;
  }

   /**
   * Get sizeInBytes
   * minimum: 0
   * @return sizeInBytes
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getSizeInBytes() {
    return sizeInBytes;
  }


  public void setSizeInBytes(Integer sizeInBytes) {
    this.sizeInBytes = sizeInBytes;
  }


  public FileData status(FileStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public FileStatus getStatus() {
    return status;
  }


  public void setStatus(FileStatus status) {
    this.status = status;
  }


  public FileData uploadId(String uploadId) {
    
    this.uploadId = uploadId;
    return this;
  }

   /**
   * Get uploadId
   * @return uploadId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getUploadId() {
    return uploadId;
  }


  public void setUploadId(String uploadId) {
    this.uploadId = uploadId;
  }


  public FileData url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileData fileData = (FileData) o;
    return Objects.equals(this.category, fileData.category) &&
        Objects.equals(this.fileName, fileData.fileName) &&
        Objects.equals(this.md5, fileData.md5) &&
        Objects.equals(this.sizeInBytes, fileData.sizeInBytes) &&
        Objects.equals(this.status, fileData.status) &&
        Objects.equals(this.uploadId, fileData.uploadId) &&
        Objects.equals(this.url, fileData.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(category, fileName, md5, sizeInBytes, status, uploadId, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileData {\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    md5: ").append(toIndentedString(md5)).append("\n");
    sb.append("    sizeInBytes: ").append(toIndentedString(sizeInBytes)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    uploadId: ").append(toIndentedString(uploadId)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
    openapiFields.add("category");
    openapiFields.add("fileName");
    openapiFields.add("md5");
    openapiFields.add("sizeInBytes");
    openapiFields.add("status");
    openapiFields.add("uploadId");
    openapiFields.add("url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("category");
    openapiRequiredFields.add("fileName");
    openapiRequiredFields.add("sizeInBytes");
    openapiRequiredFields.add("status");
    openapiRequiredFields.add("uploadId");
    openapiRequiredFields.add("url");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to FileData
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!FileData.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in FileData is not found in the empty JSON string", FileData.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!FileData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `FileData` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : FileData.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("category").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `category` to be a primitive type in the JSON string but got `%s`", jsonObj.get("category").toString()));
      }
      if (!jsonObj.get("fileName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fileName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fileName").toString()));
      }
      if ((jsonObj.get("md5") != null && !jsonObj.get("md5").isJsonNull()) && !jsonObj.get("md5").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `md5` to be a primitive type in the JSON string but got `%s`", jsonObj.get("md5").toString()));
      }
      if (!jsonObj.get("uploadId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uploadId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uploadId").toString()));
      }
      if (!jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FileData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FileData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FileData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FileData.class));

       return (TypeAdapter<T>) new TypeAdapter<FileData>() {
           @Override
           public void write(JsonWriter out, FileData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FileData read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FileData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FileData
  * @throws IOException if the JSON string is invalid with respect to FileData
  */
  public static FileData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FileData.class);
  }

 /**
  * Convert an instance of FileData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

