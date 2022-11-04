/*
 * VRChat API Documentation
 *
 * The version of the OpenAPI document: 1.8.0
 * Contact: me@ariesclark.com
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

}

