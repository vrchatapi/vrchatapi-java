/*
 * VRChat API Documentation
 *
 * The version of the OpenAPI document: 1.19.2
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
 * FavoriteGroupLimits
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class FavoriteGroupLimits {
  public static final String SERIALIZED_NAME_AVATAR = "avatar";
  @SerializedName(SERIALIZED_NAME_AVATAR)
  private Integer avatar;

  public static final String SERIALIZED_NAME_FRIEND = "friend";
  @SerializedName(SERIALIZED_NAME_FRIEND)
  private Integer friend;

  public static final String SERIALIZED_NAME_WORLD = "world";
  @SerializedName(SERIALIZED_NAME_WORLD)
  private Integer world;

  public FavoriteGroupLimits() {
  }

  public FavoriteGroupLimits avatar(Integer avatar) {
    
    this.avatar = avatar;
    return this;
  }

   /**
   * Get avatar
   * @return avatar
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getAvatar() {
    return avatar;
  }


  public void setAvatar(Integer avatar) {
    this.avatar = avatar;
  }


  public FavoriteGroupLimits friend(Integer friend) {
    
    this.friend = friend;
    return this;
  }

   /**
   * Get friend
   * @return friend
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getFriend() {
    return friend;
  }


  public void setFriend(Integer friend) {
    this.friend = friend;
  }


  public FavoriteGroupLimits world(Integer world) {
    
    this.world = world;
    return this;
  }

   /**
   * Get world
   * @return world
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getWorld() {
    return world;
  }


  public void setWorld(Integer world) {
    this.world = world;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FavoriteGroupLimits favoriteGroupLimits = (FavoriteGroupLimits) o;
    return Objects.equals(this.avatar, favoriteGroupLimits.avatar) &&
        Objects.equals(this.friend, favoriteGroupLimits.friend) &&
        Objects.equals(this.world, favoriteGroupLimits.world);
  }

  @Override
  public int hashCode() {
    return Objects.hash(avatar, friend, world);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FavoriteGroupLimits {\n");
    sb.append("    avatar: ").append(toIndentedString(avatar)).append("\n");
    sb.append("    friend: ").append(toIndentedString(friend)).append("\n");
    sb.append("    world: ").append(toIndentedString(world)).append("\n");
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
    openapiFields.add("avatar");
    openapiFields.add("friend");
    openapiFields.add("world");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("avatar");
    openapiRequiredFields.add("friend");
    openapiRequiredFields.add("world");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to FavoriteGroupLimits
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!FavoriteGroupLimits.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in FavoriteGroupLimits is not found in the empty JSON string", FavoriteGroupLimits.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!FavoriteGroupLimits.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `FavoriteGroupLimits` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : FavoriteGroupLimits.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FavoriteGroupLimits.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FavoriteGroupLimits' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FavoriteGroupLimits> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FavoriteGroupLimits.class));

       return (TypeAdapter<T>) new TypeAdapter<FavoriteGroupLimits>() {
           @Override
           public void write(JsonWriter out, FavoriteGroupLimits value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FavoriteGroupLimits read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FavoriteGroupLimits given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FavoriteGroupLimits
  * @throws IOException if the JSON string is invalid with respect to FavoriteGroupLimits
  */
  public static FavoriteGroupLimits fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FavoriteGroupLimits.class);
  }

 /**
  * Convert an instance of FavoriteGroupLimits to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

