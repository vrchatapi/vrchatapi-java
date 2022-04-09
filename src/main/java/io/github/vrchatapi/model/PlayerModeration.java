/*
 * VRChat API Documentation
 *
 * The version of the OpenAPI document: 1.6.10
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
import io.github.vrchatapi.model.PlayerModerationType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;

/**
 * PlayerModeration
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PlayerModeration {
  public static final String SERIALIZED_NAME_CREATED = "created";
  @SerializedName(SERIALIZED_NAME_CREATED)
  private OffsetDateTime created;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_SOURCE_DISPLAY_NAME = "sourceDisplayName";
  @SerializedName(SERIALIZED_NAME_SOURCE_DISPLAY_NAME)
  private String sourceDisplayName;

  public static final String SERIALIZED_NAME_SOURCE_USER_ID = "sourceUserId";
  @SerializedName(SERIALIZED_NAME_SOURCE_USER_ID)
  private String sourceUserId;

  public static final String SERIALIZED_NAME_TARGET_DISPLAY_NAME = "targetDisplayName";
  @SerializedName(SERIALIZED_NAME_TARGET_DISPLAY_NAME)
  private String targetDisplayName;

  public static final String SERIALIZED_NAME_TARGET_USER_ID = "targetUserId";
  @SerializedName(SERIALIZED_NAME_TARGET_USER_ID)
  private String targetUserId;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private PlayerModerationType type = PlayerModerationType.SHOWAVATAR;


  public PlayerModeration created(OffsetDateTime created) {
    
    this.created = created;
    return this;
  }

   /**
   * Get created
   * @return created
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public OffsetDateTime getCreated() {
    return created;
  }


  public void setCreated(OffsetDateTime created) {
    this.created = created;
  }


  public PlayerModeration id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "pmod_25551a8d-6f5d-430a-88d3-9c0ce08b5244", required = true, value = "")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public PlayerModeration sourceDisplayName(String sourceDisplayName) {
    
    this.sourceDisplayName = sourceDisplayName;
    return this;
  }

   /**
   * Get sourceDisplayName
   * @return sourceDisplayName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getSourceDisplayName() {
    return sourceDisplayName;
  }


  public void setSourceDisplayName(String sourceDisplayName) {
    this.sourceDisplayName = sourceDisplayName;
  }


  public PlayerModeration sourceUserId(String sourceUserId) {
    
    this.sourceUserId = sourceUserId;
    return this;
  }

   /**
   * A users unique ID, usually in the form of &#x60;usr_c1644b5b-3ca4-45b4-97c6-a2a0de70d469&#x60;. Legacy players can have old IDs in the form of &#x60;8JoV9XEdpo&#x60;. The ID can never be changed.
   * @return sourceUserId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "usr_c1644b5b-3ca4-45b4-97c6-a2a0de70d469", required = true, value = "A users unique ID, usually in the form of `usr_c1644b5b-3ca4-45b4-97c6-a2a0de70d469`. Legacy players can have old IDs in the form of `8JoV9XEdpo`. The ID can never be changed.")

  public String getSourceUserId() {
    return sourceUserId;
  }


  public void setSourceUserId(String sourceUserId) {
    this.sourceUserId = sourceUserId;
  }


  public PlayerModeration targetDisplayName(String targetDisplayName) {
    
    this.targetDisplayName = targetDisplayName;
    return this;
  }

   /**
   * Get targetDisplayName
   * @return targetDisplayName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getTargetDisplayName() {
    return targetDisplayName;
  }


  public void setTargetDisplayName(String targetDisplayName) {
    this.targetDisplayName = targetDisplayName;
  }


  public PlayerModeration targetUserId(String targetUserId) {
    
    this.targetUserId = targetUserId;
    return this;
  }

   /**
   * A users unique ID, usually in the form of &#x60;usr_c1644b5b-3ca4-45b4-97c6-a2a0de70d469&#x60;. Legacy players can have old IDs in the form of &#x60;8JoV9XEdpo&#x60;. The ID can never be changed.
   * @return targetUserId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "usr_c1644b5b-3ca4-45b4-97c6-a2a0de70d469", required = true, value = "A users unique ID, usually in the form of `usr_c1644b5b-3ca4-45b4-97c6-a2a0de70d469`. Legacy players can have old IDs in the form of `8JoV9XEdpo`. The ID can never be changed.")

  public String getTargetUserId() {
    return targetUserId;
  }


  public void setTargetUserId(String targetUserId) {
    this.targetUserId = targetUserId;
  }


  public PlayerModeration type(PlayerModerationType type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public PlayerModerationType getType() {
    return type;
  }


  public void setType(PlayerModerationType type) {
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
    PlayerModeration playerModeration = (PlayerModeration) o;
    return Objects.equals(this.created, playerModeration.created) &&
        Objects.equals(this.id, playerModeration.id) &&
        Objects.equals(this.sourceDisplayName, playerModeration.sourceDisplayName) &&
        Objects.equals(this.sourceUserId, playerModeration.sourceUserId) &&
        Objects.equals(this.targetDisplayName, playerModeration.targetDisplayName) &&
        Objects.equals(this.targetUserId, playerModeration.targetUserId) &&
        Objects.equals(this.type, playerModeration.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(created, id, sourceDisplayName, sourceUserId, targetDisplayName, targetUserId, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlayerModeration {\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    sourceDisplayName: ").append(toIndentedString(sourceDisplayName)).append("\n");
    sb.append("    sourceUserId: ").append(toIndentedString(sourceUserId)).append("\n");
    sb.append("    targetDisplayName: ").append(toIndentedString(targetDisplayName)).append("\n");
    sb.append("    targetUserId: ").append(toIndentedString(targetUserId)).append("\n");
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

}

