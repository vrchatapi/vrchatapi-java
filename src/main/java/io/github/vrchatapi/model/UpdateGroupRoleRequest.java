/*
 * VRChat API Documentation
 *
 * The version of the OpenAPI document: 1.18.1
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
 * UpdateGroupRoleRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UpdateGroupRoleRequest {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_IS_SELF_ASSIGNABLE = "isSelfAssignable";
  @SerializedName(SERIALIZED_NAME_IS_SELF_ASSIGNABLE)
  private Boolean isSelfAssignable = false;

  public static final String SERIALIZED_NAME_PERMISSIONS = "permissions";
  @SerializedName(SERIALIZED_NAME_PERMISSIONS)
  private List<String> permissions = null;

  public static final String SERIALIZED_NAME_ORDER = "order";
  @SerializedName(SERIALIZED_NAME_ORDER)
  private Integer order;

  public UpdateGroupRoleRequest() {
  }

  public UpdateGroupRoleRequest name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public UpdateGroupRoleRequest description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public UpdateGroupRoleRequest isSelfAssignable(Boolean isSelfAssignable) {
    
    this.isSelfAssignable = isSelfAssignable;
    return this;
  }

   /**
   * Get isSelfAssignable
   * @return isSelfAssignable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsSelfAssignable() {
    return isSelfAssignable;
  }


  public void setIsSelfAssignable(Boolean isSelfAssignable) {
    this.isSelfAssignable = isSelfAssignable;
  }


  public UpdateGroupRoleRequest permissions(List<String> permissions) {
    
    this.permissions = permissions;
    return this;
  }

  public UpdateGroupRoleRequest addPermissionsItem(String permissionsItem) {
    if (this.permissions == null) {
      this.permissions = new ArrayList<>();
    }
    this.permissions.add(permissionsItem);
    return this;
  }

   /**
   * Get permissions
   * @return permissions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getPermissions() {
    return permissions;
  }


  public void setPermissions(List<String> permissions) {
    this.permissions = permissions;
  }


  public UpdateGroupRoleRequest order(Integer order) {
    
    this.order = order;
    return this;
  }

   /**
   * Get order
   * @return order
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getOrder() {
    return order;
  }


  public void setOrder(Integer order) {
    this.order = order;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateGroupRoleRequest updateGroupRoleRequest = (UpdateGroupRoleRequest) o;
    return Objects.equals(this.name, updateGroupRoleRequest.name) &&
        Objects.equals(this.description, updateGroupRoleRequest.description) &&
        Objects.equals(this.isSelfAssignable, updateGroupRoleRequest.isSelfAssignable) &&
        Objects.equals(this.permissions, updateGroupRoleRequest.permissions) &&
        Objects.equals(this.order, updateGroupRoleRequest.order);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, isSelfAssignable, permissions, order);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateGroupRoleRequest {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    isSelfAssignable: ").append(toIndentedString(isSelfAssignable)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("description");
    openapiFields.add("isSelfAssignable");
    openapiFields.add("permissions");
    openapiFields.add("order");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UpdateGroupRoleRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!UpdateGroupRoleRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdateGroupRoleRequest is not found in the empty JSON string", UpdateGroupRoleRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!UpdateGroupRoleRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UpdateGroupRoleRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("permissions") != null && !jsonObj.get("permissions").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `permissions` to be an array in the JSON string but got `%s`", jsonObj.get("permissions").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdateGroupRoleRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateGroupRoleRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateGroupRoleRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateGroupRoleRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateGroupRoleRequest>() {
           @Override
           public void write(JsonWriter out, UpdateGroupRoleRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdateGroupRoleRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UpdateGroupRoleRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UpdateGroupRoleRequest
  * @throws IOException if the JSON string is invalid with respect to UpdateGroupRoleRequest
  */
  public static UpdateGroupRoleRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateGroupRoleRequest.class);
  }

 /**
  * Convert an instance of UpdateGroupRoleRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

