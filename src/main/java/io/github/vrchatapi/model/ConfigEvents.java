/*
 * VRChat API Documentation
 * ![VRChat API Banner](https://vrchatapi.github.io/assets/img/api_banner_1500x400.png)  # Welcome to the VRChat API  Before we begin, we would like to state this is a **COMMUNITY DRIVEN PROJECT**. This means that everything you read on here was written by the community itself and is **not** officially supported by VRChat. The documentation is provided \"AS IS\", and any action you take towards VRChat is completely your own responsibility.  The documentation and additional libraries SHALL ONLY be used for applications interacting with VRChat's API in accordance with their [Terms of Service](https://github.com/VRChatAPI), and MUST NOT be used for modifying the client, \"avatar ripping\", or other illegal activities. Malicious usage or spamming the API may result in account termination. Certain parts of the API are also more sensitive than others, for example moderation, so please read tread extra carefully and read the warnings when present.  ![Tupper Policy on API](https://i.imgur.com/yLlW7Ok.png)  Finally, use of the API using applications other than the approved methods (website, VRChat application, Unity SDK) is not officially supported. VRChat provides no guarantee or support for external applications using the API. Access to API endpoints may break **at any time, without notice**. Therefore, please **do not ping** VRChat Staff in the VRChat Discord if you are having API problems, as they do not provide API support. We will make a best effort in keeping this documentation and associated language libraries up to date, but things might be outdated or missing. If you find that something is no longer valid, please contact us on Discord or [create an issue](https://github.com/vrchatapi/specification/issues) and tell us so we can fix it.  # Getting Started  The VRChat API can be used to programmatically retrieve or update information regarding your profile, friends, avatars, worlds and more. The API consists of two parts, \"Photon\" which is only used in-game, and the \"Web API\" which is used by both the game and the website. This documentation focuses only on the Web API.  The API is designed around the REST ideology, providing semi-simple and usually predictable URIs to access and modify objects. Requests support standard HTTP methods like GET, PUT, POST, and DELETE and standard status codes. Response bodies are always UTF-8 encoded JSON objects, unless explicitly documented otherwise.  <div class=\"callout callout-error\">   <strong>🛑 Warning! Do not touch Photon!</strong><br>   Photon is only used by the in-game client and should <b>not</b> be touched. Doing so may result in permanent account termination. </div>  <div class=\"callout callout-info\">   <strong>ℹ️ API Key and Authentication</strong><br>   The API Key has always been the same and is currently <code>JlE5Jldo5Jibnk5O5hTx6XVqsJu4WJ26</code>.   Read <a href=\"#tag--authentication\">Authentication</a> for how to log in. </div>  # Using the API  For simply exploring what the API can do it is strongly recommended to download [Insomnia](https://insomnia.rest/download), a free and open-source API client that's great for sending requests to the API in an orderly fashion. Insomnia allows you to send data in the format that's required for VRChat's API. It is also possible to try out the API in your browser, by first logging in at [vrchat.com/home](https://vrchat.com/home/) and then going to [vrchat.com/api/1/auth/user](https://vrchat.com/api/1/auth/user), but the information will be much harder to work with.  For more permanent operation such as software development it is instead recommended to use one of the existing language SDKs. This community project maintains API libraries in several languages, which allows you to interact with the API with simple function calls rather than having to implement the HTTP protocol yourself. Most of these libraries are automatically generated from the API specification, sometimes with additional helpful wrapper code to make usage easier. This allows them to be almost automatically updated and expanded upon as soon as a new feature is introduced in the specification itself. The libraries can be found on [GitHub](https://github.com/vrchatapi) or following:  * [NodeJS (JavaScript)](https://www.npmjs.com/package/vrchat) * [Dart](https://pub.dev/packages/vrchat_dart) * [Rust](https://crates.io/crates/vrchatapi) * [C#](github.com/vrchatapi/vrchatapi-csharp) * [Python](https://github.com/vrchatapi/VRChatPython)  # Pagination  Most endpoints enforce pagination, meaning they will only return 10 entries by default, and never more than 100.<br> Using both the limit and offset parameters allows you to easily paginate through a large number of objects.  | Query Parameter | Type | Description | | ----------|--|------- | | `limit` | integer  | The number of objects to return. This value often defaults to 10. Highest limit is always 100.| | `offset` | integer  | A zero-based offset from the default object sorting.|  If a request returns fewer objects than the `limit` parameter, there are no more items available to return.  # Contribution  Do you want to get involved in the documentation effort? Do you want to help improve one of the language API libraries? This project is an [OPEN Open Source Project](https://openopensource.org)! This means that individuals making significant and valuable contributions are given commit-access to the project. It also means we are very open and welcoming of new people making contributions, unlike some more guarded open-source projects.  [![Discord](https://img.shields.io/static/v1?label=vrchatapi&message=discord&color=blueviolet&style=for-the-badge)](https://discord.gg/qjZE9C9fkB)
 *
 * The version of the OpenAPI document: 1.0.1
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
import java.math.BigDecimal;

/**
 * ConfigEvents
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-08-23T11:11:56.906580800+02:00[Europe/Stockholm]")
public class ConfigEvents {
  public static final String SERIALIZED_NAME_DISTANCE_CLOSE = "distanceClose";
  @SerializedName(SERIALIZED_NAME_DISTANCE_CLOSE)
  private BigDecimal distanceClose;

  public static final String SERIALIZED_NAME_DISTANCE_FACTOR = "distanceFactor";
  @SerializedName(SERIALIZED_NAME_DISTANCE_FACTOR)
  private BigDecimal distanceFactor;

  public static final String SERIALIZED_NAME_DISTANCE_FAR = "distanceFar";
  @SerializedName(SERIALIZED_NAME_DISTANCE_FAR)
  private BigDecimal distanceFar;

  public static final String SERIALIZED_NAME_GROUP_DISTANCE = "groupDistance";
  @SerializedName(SERIALIZED_NAME_GROUP_DISTANCE)
  private BigDecimal groupDistance;

  public static final String SERIALIZED_NAME_MAXIMUM_BUNCH_SIZE = "maximumBunchSize";
  @SerializedName(SERIALIZED_NAME_MAXIMUM_BUNCH_SIZE)
  private BigDecimal maximumBunchSize;

  public static final String SERIALIZED_NAME_NOT_VISIBLE_FACTOR = "notVisibleFactor";
  @SerializedName(SERIALIZED_NAME_NOT_VISIBLE_FACTOR)
  private BigDecimal notVisibleFactor;

  public static final String SERIALIZED_NAME_PLAYER_ORDER_BUCKET_SIZE = "playerOrderBucketSize";
  @SerializedName(SERIALIZED_NAME_PLAYER_ORDER_BUCKET_SIZE)
  private BigDecimal playerOrderBucketSize;

  public static final String SERIALIZED_NAME_PLAYER_ORDER_FACTOR = "playerOrderFactor";
  @SerializedName(SERIALIZED_NAME_PLAYER_ORDER_FACTOR)
  private BigDecimal playerOrderFactor;

  public static final String SERIALIZED_NAME_SLOW_UPDATE_FACTOR_THRESHOLD = "slowUpdateFactorThreshold";
  @SerializedName(SERIALIZED_NAME_SLOW_UPDATE_FACTOR_THRESHOLD)
  private BigDecimal slowUpdateFactorThreshold;

  public static final String SERIALIZED_NAME_VIEW_SEGMENT_LENGTH = "viewSegmentLength";
  @SerializedName(SERIALIZED_NAME_VIEW_SEGMENT_LENGTH)
  private BigDecimal viewSegmentLength;


   /**
   * Unknown
   * @return distanceClose
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Unknown")

  public BigDecimal getDistanceClose() {
    return distanceClose;
  }




   /**
   * Unknown
   * @return distanceFactor
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Unknown")

  public BigDecimal getDistanceFactor() {
    return distanceFactor;
  }




   /**
   * Unknown
   * @return distanceFar
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Unknown")

  public BigDecimal getDistanceFar() {
    return distanceFar;
  }




   /**
   * Unknown
   * @return groupDistance
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Unknown")

  public BigDecimal getGroupDistance() {
    return groupDistance;
  }




   /**
   * Unknown
   * @return maximumBunchSize
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Unknown")

  public BigDecimal getMaximumBunchSize() {
    return maximumBunchSize;
  }




   /**
   * Unknown
   * @return notVisibleFactor
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Unknown")

  public BigDecimal getNotVisibleFactor() {
    return notVisibleFactor;
  }




   /**
   * Unknown
   * @return playerOrderBucketSize
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Unknown")

  public BigDecimal getPlayerOrderBucketSize() {
    return playerOrderBucketSize;
  }




   /**
   * Unknown
   * @return playerOrderFactor
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Unknown")

  public BigDecimal getPlayerOrderFactor() {
    return playerOrderFactor;
  }




   /**
   * Unknown
   * @return slowUpdateFactorThreshold
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Unknown")

  public BigDecimal getSlowUpdateFactorThreshold() {
    return slowUpdateFactorThreshold;
  }




   /**
   * Unknown
   * @return viewSegmentLength
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Unknown")

  public BigDecimal getViewSegmentLength() {
    return viewSegmentLength;
  }




  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConfigEvents configEvents = (ConfigEvents) o;
    return Objects.equals(this.distanceClose, configEvents.distanceClose) &&
        Objects.equals(this.distanceFactor, configEvents.distanceFactor) &&
        Objects.equals(this.distanceFar, configEvents.distanceFar) &&
        Objects.equals(this.groupDistance, configEvents.groupDistance) &&
        Objects.equals(this.maximumBunchSize, configEvents.maximumBunchSize) &&
        Objects.equals(this.notVisibleFactor, configEvents.notVisibleFactor) &&
        Objects.equals(this.playerOrderBucketSize, configEvents.playerOrderBucketSize) &&
        Objects.equals(this.playerOrderFactor, configEvents.playerOrderFactor) &&
        Objects.equals(this.slowUpdateFactorThreshold, configEvents.slowUpdateFactorThreshold) &&
        Objects.equals(this.viewSegmentLength, configEvents.viewSegmentLength);
  }

  @Override
  public int hashCode() {
    return Objects.hash(distanceClose, distanceFactor, distanceFar, groupDistance, maximumBunchSize, notVisibleFactor, playerOrderBucketSize, playerOrderFactor, slowUpdateFactorThreshold, viewSegmentLength);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfigEvents {\n");
    sb.append("    distanceClose: ").append(toIndentedString(distanceClose)).append("\n");
    sb.append("    distanceFactor: ").append(toIndentedString(distanceFactor)).append("\n");
    sb.append("    distanceFar: ").append(toIndentedString(distanceFar)).append("\n");
    sb.append("    groupDistance: ").append(toIndentedString(groupDistance)).append("\n");
    sb.append("    maximumBunchSize: ").append(toIndentedString(maximumBunchSize)).append("\n");
    sb.append("    notVisibleFactor: ").append(toIndentedString(notVisibleFactor)).append("\n");
    sb.append("    playerOrderBucketSize: ").append(toIndentedString(playerOrderBucketSize)).append("\n");
    sb.append("    playerOrderFactor: ").append(toIndentedString(playerOrderFactor)).append("\n");
    sb.append("    slowUpdateFactorThreshold: ").append(toIndentedString(slowUpdateFactorThreshold)).append("\n");
    sb.append("    viewSegmentLength: ").append(toIndentedString(viewSegmentLength)).append("\n");
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

