/*
 * VRChat API Documentation
 *
 * The version of the OpenAPI document: 1.15.0
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
import org.openapitools.jackson.nullable.JsonNullable;

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
 * CreateGroupGalleryRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateGroupGalleryRequest {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_MEMBERS_ONLY = "membersOnly";
  @SerializedName(SERIALIZED_NAME_MEMBERS_ONLY)
  private Boolean membersOnly = false;

  public static final String SERIALIZED_NAME_ROLE_IDS_TO_VIEW = "roleIdsToView";
  @SerializedName(SERIALIZED_NAME_ROLE_IDS_TO_VIEW)
  private List<String> roleIdsToView = null;

  public static final String SERIALIZED_NAME_ROLE_IDS_TO_SUBMIT = "roleIdsToSubmit";
  @SerializedName(SERIALIZED_NAME_ROLE_IDS_TO_SUBMIT)
  private List<String> roleIdsToSubmit = null;

  public static final String SERIALIZED_NAME_ROLE_IDS_TO_AUTO_APPROVE = "roleIdsToAutoApprove";
  @SerializedName(SERIALIZED_NAME_ROLE_IDS_TO_AUTO_APPROVE)
  private List<String> roleIdsToAutoApprove = null;

  public static final String SERIALIZED_NAME_ROLE_IDS_TO_MANAGE = "roleIdsToManage";
  @SerializedName(SERIALIZED_NAME_ROLE_IDS_TO_MANAGE)
  private List<String> roleIdsToManage = null;

  public CreateGroupGalleryRequest() {
  }

  public CreateGroupGalleryRequest name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of the gallery.
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Example Gallery", required = true, value = "Name of the gallery.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public CreateGroupGalleryRequest description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Description of the gallery.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Example Description", value = "Description of the gallery.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public CreateGroupGalleryRequest membersOnly(Boolean membersOnly) {
    
    this.membersOnly = membersOnly;
    return this;
  }

   /**
   * Whether the gallery is members only.
   * @return membersOnly
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "Whether the gallery is members only.")

  public Boolean getMembersOnly() {
    return membersOnly;
  }


  public void setMembersOnly(Boolean membersOnly) {
    this.membersOnly = membersOnly;
  }


  public CreateGroupGalleryRequest roleIdsToView(List<String> roleIdsToView) {
    
    this.roleIdsToView = roleIdsToView;
    return this;
  }

  public CreateGroupGalleryRequest addRoleIdsToViewItem(String roleIdsToViewItem) {
    if (this.roleIdsToView == null) {
      this.roleIdsToView = new ArrayList<>();
    }
    this.roleIdsToView.add(roleIdsToViewItem);
    return this;
  }

   /**
   *  
   * @return roleIdsToView
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = " ")

  public List<String> getRoleIdsToView() {
    return roleIdsToView;
  }


  public void setRoleIdsToView(List<String> roleIdsToView) {
    this.roleIdsToView = roleIdsToView;
  }


  public CreateGroupGalleryRequest roleIdsToSubmit(List<String> roleIdsToSubmit) {
    
    this.roleIdsToSubmit = roleIdsToSubmit;
    return this;
  }

  public CreateGroupGalleryRequest addRoleIdsToSubmitItem(String roleIdsToSubmitItem) {
    if (this.roleIdsToSubmit == null) {
      this.roleIdsToSubmit = new ArrayList<>();
    }
    this.roleIdsToSubmit.add(roleIdsToSubmitItem);
    return this;
  }

   /**
   *  
   * @return roleIdsToSubmit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = " ")

  public List<String> getRoleIdsToSubmit() {
    return roleIdsToSubmit;
  }


  public void setRoleIdsToSubmit(List<String> roleIdsToSubmit) {
    this.roleIdsToSubmit = roleIdsToSubmit;
  }


  public CreateGroupGalleryRequest roleIdsToAutoApprove(List<String> roleIdsToAutoApprove) {
    
    this.roleIdsToAutoApprove = roleIdsToAutoApprove;
    return this;
  }

  public CreateGroupGalleryRequest addRoleIdsToAutoApproveItem(String roleIdsToAutoApproveItem) {
    if (this.roleIdsToAutoApprove == null) {
      this.roleIdsToAutoApprove = new ArrayList<>();
    }
    this.roleIdsToAutoApprove.add(roleIdsToAutoApproveItem);
    return this;
  }

   /**
   *  
   * @return roleIdsToAutoApprove
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = " ")

  public List<String> getRoleIdsToAutoApprove() {
    return roleIdsToAutoApprove;
  }


  public void setRoleIdsToAutoApprove(List<String> roleIdsToAutoApprove) {
    this.roleIdsToAutoApprove = roleIdsToAutoApprove;
  }


  public CreateGroupGalleryRequest roleIdsToManage(List<String> roleIdsToManage) {
    
    this.roleIdsToManage = roleIdsToManage;
    return this;
  }

  public CreateGroupGalleryRequest addRoleIdsToManageItem(String roleIdsToManageItem) {
    if (this.roleIdsToManage == null) {
      this.roleIdsToManage = new ArrayList<>();
    }
    this.roleIdsToManage.add(roleIdsToManageItem);
    return this;
  }

   /**
   *  
   * @return roleIdsToManage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = " ")

  public List<String> getRoleIdsToManage() {
    return roleIdsToManage;
  }


  public void setRoleIdsToManage(List<String> roleIdsToManage) {
    this.roleIdsToManage = roleIdsToManage;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateGroupGalleryRequest createGroupGalleryRequest = (CreateGroupGalleryRequest) o;
    return Objects.equals(this.name, createGroupGalleryRequest.name) &&
        Objects.equals(this.description, createGroupGalleryRequest.description) &&
        Objects.equals(this.membersOnly, createGroupGalleryRequest.membersOnly) &&
        Objects.equals(this.roleIdsToView, createGroupGalleryRequest.roleIdsToView) &&
        Objects.equals(this.roleIdsToSubmit, createGroupGalleryRequest.roleIdsToSubmit) &&
        Objects.equals(this.roleIdsToAutoApprove, createGroupGalleryRequest.roleIdsToAutoApprove) &&
        Objects.equals(this.roleIdsToManage, createGroupGalleryRequest.roleIdsToManage);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, membersOnly, roleIdsToView, roleIdsToSubmit, roleIdsToAutoApprove, roleIdsToManage);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateGroupGalleryRequest {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    membersOnly: ").append(toIndentedString(membersOnly)).append("\n");
    sb.append("    roleIdsToView: ").append(toIndentedString(roleIdsToView)).append("\n");
    sb.append("    roleIdsToSubmit: ").append(toIndentedString(roleIdsToSubmit)).append("\n");
    sb.append("    roleIdsToAutoApprove: ").append(toIndentedString(roleIdsToAutoApprove)).append("\n");
    sb.append("    roleIdsToManage: ").append(toIndentedString(roleIdsToManage)).append("\n");
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
    openapiFields.add("membersOnly");
    openapiFields.add("roleIdsToView");
    openapiFields.add("roleIdsToSubmit");
    openapiFields.add("roleIdsToAutoApprove");
    openapiFields.add("roleIdsToManage");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CreateGroupGalleryRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CreateGroupGalleryRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateGroupGalleryRequest is not found in the empty JSON string", CreateGroupGalleryRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CreateGroupGalleryRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateGroupGalleryRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateGroupGalleryRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("roleIdsToView") != null && !jsonObj.get("roleIdsToView").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `roleIdsToView` to be an array in the JSON string but got `%s`", jsonObj.get("roleIdsToView").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("roleIdsToSubmit") != null && !jsonObj.get("roleIdsToSubmit").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `roleIdsToSubmit` to be an array in the JSON string but got `%s`", jsonObj.get("roleIdsToSubmit").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("roleIdsToAutoApprove") != null && !jsonObj.get("roleIdsToAutoApprove").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `roleIdsToAutoApprove` to be an array in the JSON string but got `%s`", jsonObj.get("roleIdsToAutoApprove").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("roleIdsToManage") != null && !jsonObj.get("roleIdsToManage").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `roleIdsToManage` to be an array in the JSON string but got `%s`", jsonObj.get("roleIdsToManage").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateGroupGalleryRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateGroupGalleryRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateGroupGalleryRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateGroupGalleryRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateGroupGalleryRequest>() {
           @Override
           public void write(JsonWriter out, CreateGroupGalleryRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateGroupGalleryRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateGroupGalleryRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateGroupGalleryRequest
  * @throws IOException if the JSON string is invalid with respect to CreateGroupGalleryRequest
  */
  public static CreateGroupGalleryRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateGroupGalleryRequest.class);
  }

 /**
  * Convert an instance of CreateGroupGalleryRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

