/*
 * VRChat API Documentation
 *
 * The version of the OpenAPI document: 1.20.1
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
 * Group-related constants
 */
@ApiModel(description = "Group-related constants")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class APIConfigConstantsGROUPS {
  public static final String SERIALIZED_NAME_C_A_P_A_C_I_T_Y = "CAPACITY";
  @SerializedName(SERIALIZED_NAME_C_A_P_A_C_I_T_Y)
  private Integer CAPACITY = 100000;

  public static final String SERIALIZED_NAME_G_R_O_U_P_T_R_A_N_S_F_E_R_R_E_Q_U_I_R_E_M_E_N_T_S = "GROUP_TRANSFER_REQUIREMENTS";
  @SerializedName(SERIALIZED_NAME_G_R_O_U_P_T_R_A_N_S_F_E_R_R_E_Q_U_I_R_E_M_E_N_T_S)
  private List<String> GROUP_TRANSFER_REQUIREMENTS = null;

  public static final String SERIALIZED_NAME_M_A_X_I_N_V_I_T_E_S_R_E_Q_U_E_S_T_S = "MAX_INVITES_REQUESTS";
  @SerializedName(SERIALIZED_NAME_M_A_X_I_N_V_I_T_E_S_R_E_Q_U_E_S_T_S)
  private Integer MAX_INVITES_REQUESTS = 50;

  public static final String SERIALIZED_NAME_M_A_X_J_O_I_N_E_D = "MAX_JOINED";
  @SerializedName(SERIALIZED_NAME_M_A_X_J_O_I_N_E_D)
  private Integer MAX_JOINED = 100;

  public static final String SERIALIZED_NAME_M_A_X_J_O_I_N_E_D_P_L_U_S = "MAX_JOINED_PLUS";
  @SerializedName(SERIALIZED_NAME_M_A_X_J_O_I_N_E_D_P_L_U_S)
  private Integer MAX_JOINED_PLUS = 200;

  public static final String SERIALIZED_NAME_M_A_X_L_A_N_G_U_A_G_E_S = "MAX_LANGUAGES";
  @SerializedName(SERIALIZED_NAME_M_A_X_L_A_N_G_U_A_G_E_S)
  private Integer MAX_LANGUAGES = 10;

  public static final String SERIALIZED_NAME_M_A_X_L_I_N_K_S = "MAX_LINKS";
  @SerializedName(SERIALIZED_NAME_M_A_X_L_I_N_K_S)
  private Integer MAX_LINKS = 3;

  public static final String SERIALIZED_NAME_M_A_X_M_A_N_A_G_E_M_E_N_T_R_O_L_E_S = "MAX_MANAGEMENT_ROLES";
  @SerializedName(SERIALIZED_NAME_M_A_X_M_A_N_A_G_E_M_E_N_T_R_O_L_E_S)
  private Integer MAX_MANAGEMENT_ROLES = 5;

  public static final String SERIALIZED_NAME_M_A_X_O_W_N_E_D = "MAX_OWNED";
  @SerializedName(SERIALIZED_NAME_M_A_X_O_W_N_E_D)
  private Integer MAX_OWNED = 5;

  public static final String SERIALIZED_NAME_M_A_X_R_O_L_E_S = "MAX_ROLES";
  @SerializedName(SERIALIZED_NAME_M_A_X_R_O_L_E_S)
  private Integer MAX_ROLES = 50;

  public APIConfigConstantsGROUPS() {
  }

  public APIConfigConstantsGROUPS CAPACITY(Integer CAPACITY) {
    
    this.CAPACITY = CAPACITY;
    return this;
  }

   /**
   * Maximum group capacity
   * @return CAPACITY
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Maximum group capacity")

  public Integer getCAPACITY() {
    return CAPACITY;
  }


  public void setCAPACITY(Integer CAPACITY) {
    this.CAPACITY = CAPACITY;
  }


  public APIConfigConstantsGROUPS GROUP_TRANSFER_REQUIREMENTS(List<String> GROUP_TRANSFER_REQUIREMENTS) {
    
    this.GROUP_TRANSFER_REQUIREMENTS = GROUP_TRANSFER_REQUIREMENTS;
    return this;
  }

  public APIConfigConstantsGROUPS addGROUPTRANSFERREQUIREMENTSItem(String GROUP_TRANSFER_REQUIREMENTSItem) {
    if (this.GROUP_TRANSFER_REQUIREMENTS == null) {
      this.GROUP_TRANSFER_REQUIREMENTS = new ArrayList<>();
    }
    this.GROUP_TRANSFER_REQUIREMENTS.add(GROUP_TRANSFER_REQUIREMENTSItem);
    return this;
  }

   /**
   * Requirements for transferring group ownership
   * @return GROUP_TRANSFER_REQUIREMENTS
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Requirements for transferring group ownership")

  public List<String> getGROUPTRANSFERREQUIREMENTS() {
    return GROUP_TRANSFER_REQUIREMENTS;
  }


  public void setGROUPTRANSFERREQUIREMENTS(List<String> GROUP_TRANSFER_REQUIREMENTS) {
    this.GROUP_TRANSFER_REQUIREMENTS = GROUP_TRANSFER_REQUIREMENTS;
  }


  public APIConfigConstantsGROUPS MAX_INVITES_REQUESTS(Integer MAX_INVITES_REQUESTS) {
    
    this.MAX_INVITES_REQUESTS = MAX_INVITES_REQUESTS;
    return this;
  }

   /**
   * Maximum number of invite requests
   * @return MAX_INVITES_REQUESTS
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Maximum number of invite requests")

  public Integer getMAXINVITESREQUESTS() {
    return MAX_INVITES_REQUESTS;
  }


  public void setMAXINVITESREQUESTS(Integer MAX_INVITES_REQUESTS) {
    this.MAX_INVITES_REQUESTS = MAX_INVITES_REQUESTS;
  }


  public APIConfigConstantsGROUPS MAX_JOINED(Integer MAX_JOINED) {
    
    this.MAX_JOINED = MAX_JOINED;
    return this;
  }

   /**
   * Maximum number of joined groups
   * @return MAX_JOINED
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Maximum number of joined groups")

  public Integer getMAXJOINED() {
    return MAX_JOINED;
  }


  public void setMAXJOINED(Integer MAX_JOINED) {
    this.MAX_JOINED = MAX_JOINED;
  }


  public APIConfigConstantsGROUPS MAX_JOINED_PLUS(Integer MAX_JOINED_PLUS) {
    
    this.MAX_JOINED_PLUS = MAX_JOINED_PLUS;
    return this;
  }

   /**
   * Maximum number of joined groups for VRChat Plus members
   * @return MAX_JOINED_PLUS
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Maximum number of joined groups for VRChat Plus members")

  public Integer getMAXJOINEDPLUS() {
    return MAX_JOINED_PLUS;
  }


  public void setMAXJOINEDPLUS(Integer MAX_JOINED_PLUS) {
    this.MAX_JOINED_PLUS = MAX_JOINED_PLUS;
  }


  public APIConfigConstantsGROUPS MAX_LANGUAGES(Integer MAX_LANGUAGES) {
    
    this.MAX_LANGUAGES = MAX_LANGUAGES;
    return this;
  }

   /**
   * Maximum number of supported languages
   * @return MAX_LANGUAGES
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Maximum number of supported languages")

  public Integer getMAXLANGUAGES() {
    return MAX_LANGUAGES;
  }


  public void setMAXLANGUAGES(Integer MAX_LANGUAGES) {
    this.MAX_LANGUAGES = MAX_LANGUAGES;
  }


  public APIConfigConstantsGROUPS MAX_LINKS(Integer MAX_LINKS) {
    
    this.MAX_LINKS = MAX_LINKS;
    return this;
  }

   /**
   * Maximum number of group links
   * @return MAX_LINKS
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Maximum number of group links")

  public Integer getMAXLINKS() {
    return MAX_LINKS;
  }


  public void setMAXLINKS(Integer MAX_LINKS) {
    this.MAX_LINKS = MAX_LINKS;
  }


  public APIConfigConstantsGROUPS MAX_MANAGEMENT_ROLES(Integer MAX_MANAGEMENT_ROLES) {
    
    this.MAX_MANAGEMENT_ROLES = MAX_MANAGEMENT_ROLES;
    return this;
  }

   /**
   * Maximum number of management roles in a group
   * @return MAX_MANAGEMENT_ROLES
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Maximum number of management roles in a group")

  public Integer getMAXMANAGEMENTROLES() {
    return MAX_MANAGEMENT_ROLES;
  }


  public void setMAXMANAGEMENTROLES(Integer MAX_MANAGEMENT_ROLES) {
    this.MAX_MANAGEMENT_ROLES = MAX_MANAGEMENT_ROLES;
  }


  public APIConfigConstantsGROUPS MAX_OWNED(Integer MAX_OWNED) {
    
    this.MAX_OWNED = MAX_OWNED;
    return this;
  }

   /**
   * Maximum number of groups a user can own
   * @return MAX_OWNED
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Maximum number of groups a user can own")

  public Integer getMAXOWNED() {
    return MAX_OWNED;
  }


  public void setMAXOWNED(Integer MAX_OWNED) {
    this.MAX_OWNED = MAX_OWNED;
  }


  public APIConfigConstantsGROUPS MAX_ROLES(Integer MAX_ROLES) {
    
    this.MAX_ROLES = MAX_ROLES;
    return this;
  }

   /**
   * Maximum number of roles in a group
   * @return MAX_ROLES
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Maximum number of roles in a group")

  public Integer getMAXROLES() {
    return MAX_ROLES;
  }


  public void setMAXROLES(Integer MAX_ROLES) {
    this.MAX_ROLES = MAX_ROLES;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    APIConfigConstantsGROUPS apIConfigConstantsGROUPS = (APIConfigConstantsGROUPS) o;
    return Objects.equals(this.CAPACITY, apIConfigConstantsGROUPS.CAPACITY) &&
        Objects.equals(this.GROUP_TRANSFER_REQUIREMENTS, apIConfigConstantsGROUPS.GROUP_TRANSFER_REQUIREMENTS) &&
        Objects.equals(this.MAX_INVITES_REQUESTS, apIConfigConstantsGROUPS.MAX_INVITES_REQUESTS) &&
        Objects.equals(this.MAX_JOINED, apIConfigConstantsGROUPS.MAX_JOINED) &&
        Objects.equals(this.MAX_JOINED_PLUS, apIConfigConstantsGROUPS.MAX_JOINED_PLUS) &&
        Objects.equals(this.MAX_LANGUAGES, apIConfigConstantsGROUPS.MAX_LANGUAGES) &&
        Objects.equals(this.MAX_LINKS, apIConfigConstantsGROUPS.MAX_LINKS) &&
        Objects.equals(this.MAX_MANAGEMENT_ROLES, apIConfigConstantsGROUPS.MAX_MANAGEMENT_ROLES) &&
        Objects.equals(this.MAX_OWNED, apIConfigConstantsGROUPS.MAX_OWNED) &&
        Objects.equals(this.MAX_ROLES, apIConfigConstantsGROUPS.MAX_ROLES);
  }

  @Override
  public int hashCode() {
    return Objects.hash(CAPACITY, GROUP_TRANSFER_REQUIREMENTS, MAX_INVITES_REQUESTS, MAX_JOINED, MAX_JOINED_PLUS, MAX_LANGUAGES, MAX_LINKS, MAX_MANAGEMENT_ROLES, MAX_OWNED, MAX_ROLES);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class APIConfigConstantsGROUPS {\n");
    sb.append("    CAPACITY: ").append(toIndentedString(CAPACITY)).append("\n");
    sb.append("    GROUP_TRANSFER_REQUIREMENTS: ").append(toIndentedString(GROUP_TRANSFER_REQUIREMENTS)).append("\n");
    sb.append("    MAX_INVITES_REQUESTS: ").append(toIndentedString(MAX_INVITES_REQUESTS)).append("\n");
    sb.append("    MAX_JOINED: ").append(toIndentedString(MAX_JOINED)).append("\n");
    sb.append("    MAX_JOINED_PLUS: ").append(toIndentedString(MAX_JOINED_PLUS)).append("\n");
    sb.append("    MAX_LANGUAGES: ").append(toIndentedString(MAX_LANGUAGES)).append("\n");
    sb.append("    MAX_LINKS: ").append(toIndentedString(MAX_LINKS)).append("\n");
    sb.append("    MAX_MANAGEMENT_ROLES: ").append(toIndentedString(MAX_MANAGEMENT_ROLES)).append("\n");
    sb.append("    MAX_OWNED: ").append(toIndentedString(MAX_OWNED)).append("\n");
    sb.append("    MAX_ROLES: ").append(toIndentedString(MAX_ROLES)).append("\n");
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
    openapiFields.add("CAPACITY");
    openapiFields.add("GROUP_TRANSFER_REQUIREMENTS");
    openapiFields.add("MAX_INVITES_REQUESTS");
    openapiFields.add("MAX_JOINED");
    openapiFields.add("MAX_JOINED_PLUS");
    openapiFields.add("MAX_LANGUAGES");
    openapiFields.add("MAX_LINKS");
    openapiFields.add("MAX_MANAGEMENT_ROLES");
    openapiFields.add("MAX_OWNED");
    openapiFields.add("MAX_ROLES");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to APIConfigConstantsGROUPS
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!APIConfigConstantsGROUPS.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in APIConfigConstantsGROUPS is not found in the empty JSON string", APIConfigConstantsGROUPS.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!APIConfigConstantsGROUPS.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `APIConfigConstantsGROUPS` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("GROUP_TRANSFER_REQUIREMENTS") != null && !jsonObj.get("GROUP_TRANSFER_REQUIREMENTS").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `GROUP_TRANSFER_REQUIREMENTS` to be an array in the JSON string but got `%s`", jsonObj.get("GROUP_TRANSFER_REQUIREMENTS").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!APIConfigConstantsGROUPS.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'APIConfigConstantsGROUPS' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<APIConfigConstantsGROUPS> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(APIConfigConstantsGROUPS.class));

       return (TypeAdapter<T>) new TypeAdapter<APIConfigConstantsGROUPS>() {
           @Override
           public void write(JsonWriter out, APIConfigConstantsGROUPS value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public APIConfigConstantsGROUPS read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of APIConfigConstantsGROUPS given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of APIConfigConstantsGROUPS
  * @throws IOException if the JSON string is invalid with respect to APIConfigConstantsGROUPS
  */
  public static APIConfigConstantsGROUPS fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, APIConfigConstantsGROUPS.class);
  }

 /**
  * Convert an instance of APIConfigConstantsGROUPS to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

