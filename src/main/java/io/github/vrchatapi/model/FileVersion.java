/*
 * VRChat API Documentation
 *
 * The version of the OpenAPI document: 1.6.8
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
import io.github.vrchatapi.model.FileData;
import io.github.vrchatapi.model.FileStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;

/**
 * FileVersion
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class FileVersion {
  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_DELETED = "deleted";
  @SerializedName(SERIALIZED_NAME_DELETED)
  private Boolean deleted = true;

  public static final String SERIALIZED_NAME_DELTA = "delta";
  @SerializedName(SERIALIZED_NAME_DELTA)
  private FileData delta;

  public static final String SERIALIZED_NAME_FILE = "file";
  @SerializedName(SERIALIZED_NAME_FILE)
  private FileData file;

  public static final String SERIALIZED_NAME_SIGNATURE = "signature";
  @SerializedName(SERIALIZED_NAME_SIGNATURE)
  private FileData signature;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private FileStatus status = FileStatus.WAITING;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private Integer version = 0;


  public FileVersion createdAt(OffsetDateTime createdAt) {
    
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


  public FileVersion deleted(Boolean deleted) {
    
    this.deleted = deleted;
    return this;
  }

   /**
   * Usually only present if &#x60;true&#x60;
   * @return deleted
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Usually only present if `true`")

  public Boolean getDeleted() {
    return deleted;
  }


  public void setDeleted(Boolean deleted) {
    this.deleted = deleted;
  }


  public FileVersion delta(FileData delta) {
    
    this.delta = delta;
    return this;
  }

   /**
   * Get delta
   * @return delta
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public FileData getDelta() {
    return delta;
  }


  public void setDelta(FileData delta) {
    this.delta = delta;
  }


  public FileVersion file(FileData file) {
    
    this.file = file;
    return this;
  }

   /**
   * Get file
   * @return file
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public FileData getFile() {
    return file;
  }


  public void setFile(FileData file) {
    this.file = file;
  }


  public FileVersion signature(FileData signature) {
    
    this.signature = signature;
    return this;
  }

   /**
   * Get signature
   * @return signature
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public FileData getSignature() {
    return signature;
  }


  public void setSignature(FileData signature) {
    this.signature = signature;
  }


  public FileVersion status(FileStatus status) {
    
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


  public FileVersion version(Integer version) {
    
    this.version = version;
    return this;
  }

   /**
   * Incremental version counter, can only be increased.
   * minimum: 0
   * @return version
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Incremental version counter, can only be increased.")

  public Integer getVersion() {
    return version;
  }


  public void setVersion(Integer version) {
    this.version = version;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileVersion fileVersion = (FileVersion) o;
    return Objects.equals(this.createdAt, fileVersion.createdAt) &&
        Objects.equals(this.deleted, fileVersion.deleted) &&
        Objects.equals(this.delta, fileVersion.delta) &&
        Objects.equals(this.file, fileVersion.file) &&
        Objects.equals(this.signature, fileVersion.signature) &&
        Objects.equals(this.status, fileVersion.status) &&
        Objects.equals(this.version, fileVersion.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, deleted, delta, file, signature, status, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileVersion {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
    sb.append("    delta: ").append(toIndentedString(delta)).append("\n");
    sb.append("    file: ").append(toIndentedString(file)).append("\n");
    sb.append("    signature: ").append(toIndentedString(signature)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

