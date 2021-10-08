/*
 * VRChat API Documentation
 *
 * The version of the OpenAPI document: 1.4.2
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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * DynamicWorldRow
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DynamicWorldRow {
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


  public DynamicWorldRow index(Integer index) {
    
    this.index = index;
    return this;
  }

   /**
   * Get index
   * minimum: 0
   * @return index
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getIndex() {
    return index;
  }


  public void setIndex(Integer index) {
    this.index = index;
  }


  public DynamicWorldRow name(String name) {
    
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


  public DynamicWorldRow platform(String platform) {
    
    this.platform = platform;
    return this;
  }

   /**
   * Get platform
   * @return platform
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getPlatform() {
    return platform;
  }


  public void setPlatform(String platform) {
    this.platform = platform;
  }


  public DynamicWorldRow sortHeading(String sortHeading) {
    
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


  public DynamicWorldRow sortOrder(String sortOrder) {
    
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


  public DynamicWorldRow sortOwnership(String sortOwnership) {
    
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


  public DynamicWorldRow tag(String tag) {
    
    this.tag = tag;
    return this;
  }

   /**
   * Tag to filter worlds for this row. Not always present.
   * @return tag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Tag to filter worlds for this row. Not always present.")

  public String getTag() {
    return tag;
  }


  public void setTag(String tag) {
    this.tag = tag;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DynamicWorldRow dynamicWorldRow = (DynamicWorldRow) o;
    return Objects.equals(this.index, dynamicWorldRow.index) &&
        Objects.equals(this.name, dynamicWorldRow.name) &&
        Objects.equals(this.platform, dynamicWorldRow.platform) &&
        Objects.equals(this.sortHeading, dynamicWorldRow.sortHeading) &&
        Objects.equals(this.sortOrder, dynamicWorldRow.sortOrder) &&
        Objects.equals(this.sortOwnership, dynamicWorldRow.sortOwnership) &&
        Objects.equals(this.tag, dynamicWorldRow.tag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(index, name, platform, sortHeading, sortOrder, sortOwnership, tag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DynamicWorldRow {\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
    sb.append("    sortHeading: ").append(toIndentedString(sortHeading)).append("\n");
    sb.append("    sortOrder: ").append(toIndentedString(sortOrder)).append("\n");
    sb.append("    sortOwnership: ").append(toIndentedString(sortOwnership)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
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

