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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * InstancePlatforms
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InstancePlatforms {
  public static final String SERIALIZED_NAME_ANDROID = "android";
  @SerializedName(SERIALIZED_NAME_ANDROID)
  private Integer android;

  public static final String SERIALIZED_NAME_STANDALONEWINDOWS = "standalonewindows";
  @SerializedName(SERIALIZED_NAME_STANDALONEWINDOWS)
  private Integer standalonewindows;


  public InstancePlatforms android(Integer android) {
    
    this.android = android;
    return this;
  }

   /**
   * Get android
   * minimum: 0
   * @return android
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1", required = true, value = "")

  public Integer getAndroid() {
    return android;
  }


  public void setAndroid(Integer android) {
    this.android = android;
  }


  public InstancePlatforms standalonewindows(Integer standalonewindows) {
    
    this.standalonewindows = standalonewindows;
    return this;
  }

   /**
   * Get standalonewindows
   * minimum: 0
   * @return standalonewindows
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "5", required = true, value = "")

  public Integer getStandalonewindows() {
    return standalonewindows;
  }


  public void setStandalonewindows(Integer standalonewindows) {
    this.standalonewindows = standalonewindows;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InstancePlatforms instancePlatforms = (InstancePlatforms) o;
    return Objects.equals(this.android, instancePlatforms.android) &&
        Objects.equals(this.standalonewindows, instancePlatforms.standalonewindows);
  }

  @Override
  public int hashCode() {
    return Objects.hash(android, standalonewindows);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstancePlatforms {\n");
    sb.append("    android: ").append(toIndentedString(android)).append("\n");
    sb.append("    standalonewindows: ").append(toIndentedString(standalonewindows)).append("\n");
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

