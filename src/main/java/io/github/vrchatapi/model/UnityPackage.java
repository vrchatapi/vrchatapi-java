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
import org.threeten.bp.OffsetDateTime;

/**
 * UnityPackage
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UnityPackage {
  public static final String SERIALIZED_NAME_ASSET_URL = "assetUrl";
  @SerializedName(SERIALIZED_NAME_ASSET_URL)
  private String assetUrl;

  public static final String SERIALIZED_NAME_ASSET_URL_OBJECT = "assetUrlObject";
  @SerializedName(SERIALIZED_NAME_ASSET_URL_OBJECT)
  private Object assetUrlObject;

  public static final String SERIALIZED_NAME_ASSET_VERSION = "assetVersion";
  @SerializedName(SERIALIZED_NAME_ASSET_VERSION)
  private Integer assetVersion;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_PLATFORM = "platform";
  @SerializedName(SERIALIZED_NAME_PLATFORM)
  private String platform;

  public static final String SERIALIZED_NAME_PLUGIN_URL = "pluginUrl";
  @SerializedName(SERIALIZED_NAME_PLUGIN_URL)
  private String pluginUrl;

  public static final String SERIALIZED_NAME_PLUGIN_URL_OBJECT = "pluginUrlObject";
  @SerializedName(SERIALIZED_NAME_PLUGIN_URL_OBJECT)
  private Object pluginUrlObject;

  public static final String SERIALIZED_NAME_UNITY_SORT_NUMBER = "unitySortNumber";
  @SerializedName(SERIALIZED_NAME_UNITY_SORT_NUMBER)
  private Integer unitySortNumber;

  public static final String SERIALIZED_NAME_UNITY_VERSION = "unityVersion";
  @SerializedName(SERIALIZED_NAME_UNITY_VERSION)
  private String unityVersion = "5.3.4p1";


  public UnityPackage assetUrl(String assetUrl) {
    
    this.assetUrl = assetUrl;
    return this;
  }

   /**
   * Get assetUrl
   * @return assetUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAssetUrl() {
    return assetUrl;
  }


  public void setAssetUrl(String assetUrl) {
    this.assetUrl = assetUrl;
  }


  public UnityPackage assetUrlObject(Object assetUrlObject) {
    
    this.assetUrlObject = assetUrlObject;
    return this;
  }

   /**
   * Get assetUrlObject
   * @return assetUrlObject
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getAssetUrlObject() {
    return assetUrlObject;
  }


  public void setAssetUrlObject(Object assetUrlObject) {
    this.assetUrlObject = assetUrlObject;
  }


  public UnityPackage assetVersion(Integer assetVersion) {
    
    this.assetVersion = assetVersion;
    return this;
  }

   /**
   * Get assetVersion
   * minimum: 0
   * @return assetVersion
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getAssetVersion() {
    return assetVersion;
  }


  public void setAssetVersion(Integer assetVersion) {
    this.assetVersion = assetVersion;
  }


  public UnityPackage createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public UnityPackage id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "unp_52b12c39-4163-457d-a4a9-630e7aff1bff", required = true, value = "")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public UnityPackage platform(String platform) {
    
    this.platform = platform;
    return this;
  }

   /**
   * This can be &#x60;standalonewindows&#x60; or &#x60;android&#x60;, but can also pretty much be any random Unity verison such as &#x60;2019.2.4-801-Release&#x60; or &#x60;2019.2.2-772-Release&#x60; or even &#x60;unknownplatform&#x60;.
   * @return platform
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "standalonewindows", required = true, value = "This can be `standalonewindows` or `android`, but can also pretty much be any random Unity verison such as `2019.2.4-801-Release` or `2019.2.2-772-Release` or even `unknownplatform`.")

  public String getPlatform() {
    return platform;
  }


  public void setPlatform(String platform) {
    this.platform = platform;
  }


  public UnityPackage pluginUrl(String pluginUrl) {
    
    this.pluginUrl = pluginUrl;
    return this;
  }

   /**
   * Get pluginUrl
   * @return pluginUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPluginUrl() {
    return pluginUrl;
  }


  public void setPluginUrl(String pluginUrl) {
    this.pluginUrl = pluginUrl;
  }


  public UnityPackage pluginUrlObject(Object pluginUrlObject) {
    
    this.pluginUrlObject = pluginUrlObject;
    return this;
  }

   /**
   * Get pluginUrlObject
   * @return pluginUrlObject
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getPluginUrlObject() {
    return pluginUrlObject;
  }


  public void setPluginUrlObject(Object pluginUrlObject) {
    this.pluginUrlObject = pluginUrlObject;
  }


  public UnityPackage unitySortNumber(Integer unitySortNumber) {
    
    this.unitySortNumber = unitySortNumber;
    return this;
  }

   /**
   * Get unitySortNumber
   * minimum: 0
   * @return unitySortNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getUnitySortNumber() {
    return unitySortNumber;
  }


  public void setUnitySortNumber(Integer unitySortNumber) {
    this.unitySortNumber = unitySortNumber;
  }


  public UnityPackage unityVersion(String unityVersion) {
    
    this.unityVersion = unityVersion;
    return this;
  }

   /**
   * Get unityVersion
   * @return unityVersion
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "2018.4.12f1", required = true, value = "")

  public String getUnityVersion() {
    return unityVersion;
  }


  public void setUnityVersion(String unityVersion) {
    this.unityVersion = unityVersion;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UnityPackage unityPackage = (UnityPackage) o;
    return Objects.equals(this.assetUrl, unityPackage.assetUrl) &&
        Objects.equals(this.assetUrlObject, unityPackage.assetUrlObject) &&
        Objects.equals(this.assetVersion, unityPackage.assetVersion) &&
        Objects.equals(this.createdAt, unityPackage.createdAt) &&
        Objects.equals(this.id, unityPackage.id) &&
        Objects.equals(this.platform, unityPackage.platform) &&
        Objects.equals(this.pluginUrl, unityPackage.pluginUrl) &&
        Objects.equals(this.pluginUrlObject, unityPackage.pluginUrlObject) &&
        Objects.equals(this.unitySortNumber, unityPackage.unitySortNumber) &&
        Objects.equals(this.unityVersion, unityPackage.unityVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetUrl, assetUrlObject, assetVersion, createdAt, id, platform, pluginUrl, pluginUrlObject, unitySortNumber, unityVersion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UnityPackage {\n");
    sb.append("    assetUrl: ").append(toIndentedString(assetUrl)).append("\n");
    sb.append("    assetUrlObject: ").append(toIndentedString(assetUrlObject)).append("\n");
    sb.append("    assetVersion: ").append(toIndentedString(assetVersion)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
    sb.append("    pluginUrl: ").append(toIndentedString(pluginUrl)).append("\n");
    sb.append("    pluginUrlObject: ").append(toIndentedString(pluginUrlObject)).append("\n");
    sb.append("    unitySortNumber: ").append(toIndentedString(unitySortNumber)).append("\n");
    sb.append("    unityVersion: ").append(toIndentedString(unityVersion)).append("\n");
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

