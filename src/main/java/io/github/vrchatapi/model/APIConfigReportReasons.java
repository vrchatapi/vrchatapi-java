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
import io.github.vrchatapi.model.ReportReason;
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
 * Reasons available for reporting users
 */
@ApiModel(description = "Reasons available for reporting users")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class APIConfigReportReasons {
  public static final String SERIALIZED_NAME_BILLING = "billing";
  @SerializedName(SERIALIZED_NAME_BILLING)
  private ReportReason billing;

  public static final String SERIALIZED_NAME_BOTTING = "botting";
  @SerializedName(SERIALIZED_NAME_BOTTING)
  private ReportReason botting;

  public static final String SERIALIZED_NAME_CANCELLATION = "cancellation";
  @SerializedName(SERIALIZED_NAME_CANCELLATION)
  private ReportReason cancellation;

  public static final String SERIALIZED_NAME_COPYRIGHT = "copyright";
  @SerializedName(SERIALIZED_NAME_COPYRIGHT)
  private ReportReason copyright;

  public static final String SERIALIZED_NAME_FRAUD = "fraud";
  @SerializedName(SERIALIZED_NAME_FRAUD)
  private ReportReason fraud;

  public static final String SERIALIZED_NAME_GORE = "gore";
  @SerializedName(SERIALIZED_NAME_GORE)
  private ReportReason gore;

  public static final String SERIALIZED_NAME_HACKING = "hacking";
  @SerializedName(SERIALIZED_NAME_HACKING)
  private ReportReason hacking;

  public static final String SERIALIZED_NAME_HARASSING = "harassing";
  @SerializedName(SERIALIZED_NAME_HARASSING)
  private ReportReason harassing;

  public static final String SERIALIZED_NAME_HATEFUL = "hateful";
  @SerializedName(SERIALIZED_NAME_HATEFUL)
  private ReportReason hateful;

  public static final String SERIALIZED_NAME_IMPERSONATION = "impersonation";
  @SerializedName(SERIALIZED_NAME_IMPERSONATION)
  private ReportReason impersonation;

  public static final String SERIALIZED_NAME_INAPPROPRIATE = "inappropriate";
  @SerializedName(SERIALIZED_NAME_INAPPROPRIATE)
  private ReportReason inappropriate;

  public static final String SERIALIZED_NAME_LEAKING = "leaking";
  @SerializedName(SERIALIZED_NAME_LEAKING)
  private ReportReason leaking;

  public static final String SERIALIZED_NAME_MALICIOUS = "malicious";
  @SerializedName(SERIALIZED_NAME_MALICIOUS)
  private ReportReason malicious;

  public static final String SERIALIZED_NAME_MISSING = "missing";
  @SerializedName(SERIALIZED_NAME_MISSING)
  private ReportReason missing;

  public static final String SERIALIZED_NAME_NUDITY = "nudity";
  @SerializedName(SERIALIZED_NAME_NUDITY)
  private ReportReason nudity;

  public static final String SERIALIZED_NAME_RENEWAL = "renewal";
  @SerializedName(SERIALIZED_NAME_RENEWAL)
  private ReportReason renewal;

  public static final String SERIALIZED_NAME_SECURITY = "security";
  @SerializedName(SERIALIZED_NAME_SECURITY)
  private ReportReason security;

  public static final String SERIALIZED_NAME_SERVICE = "service";
  @SerializedName(SERIALIZED_NAME_SERVICE)
  private ReportReason service;

  public static final String SERIALIZED_NAME_SEXUAL = "sexual";
  @SerializedName(SERIALIZED_NAME_SEXUAL)
  private ReportReason sexual;

  public static final String SERIALIZED_NAME_TECHNICAL = "technical";
  @SerializedName(SERIALIZED_NAME_TECHNICAL)
  private ReportReason technical;

  public static final String SERIALIZED_NAME_THREATENING = "threatening";
  @SerializedName(SERIALIZED_NAME_THREATENING)
  private ReportReason threatening;

  public static final String SERIALIZED_NAME_VISUALS = "visuals";
  @SerializedName(SERIALIZED_NAME_VISUALS)
  private ReportReason visuals;

  public APIConfigReportReasons() {
  }

  public APIConfigReportReasons billing(ReportReason billing) {
    
    this.billing = billing;
    return this;
  }

   /**
   * Get billing
   * @return billing
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public ReportReason getBilling() {
    return billing;
  }


  public void setBilling(ReportReason billing) {
    this.billing = billing;
  }


  public APIConfigReportReasons botting(ReportReason botting) {
    
    this.botting = botting;
    return this;
  }

   /**
   * Get botting
   * @return botting
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public ReportReason getBotting() {
    return botting;
  }


  public void setBotting(ReportReason botting) {
    this.botting = botting;
  }


  public APIConfigReportReasons cancellation(ReportReason cancellation) {
    
    this.cancellation = cancellation;
    return this;
  }

   /**
   * Get cancellation
   * @return cancellation
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public ReportReason getCancellation() {
    return cancellation;
  }


  public void setCancellation(ReportReason cancellation) {
    this.cancellation = cancellation;
  }


  public APIConfigReportReasons copyright(ReportReason copyright) {
    
    this.copyright = copyright;
    return this;
  }

   /**
   * Get copyright
   * @return copyright
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ReportReason getCopyright() {
    return copyright;
  }


  public void setCopyright(ReportReason copyright) {
    this.copyright = copyright;
  }


  public APIConfigReportReasons fraud(ReportReason fraud) {
    
    this.fraud = fraud;
    return this;
  }

   /**
   * Get fraud
   * @return fraud
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ReportReason getFraud() {
    return fraud;
  }


  public void setFraud(ReportReason fraud) {
    this.fraud = fraud;
  }


  public APIConfigReportReasons gore(ReportReason gore) {
    
    this.gore = gore;
    return this;
  }

   /**
   * Get gore
   * @return gore
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public ReportReason getGore() {
    return gore;
  }


  public void setGore(ReportReason gore) {
    this.gore = gore;
  }


  public APIConfigReportReasons hacking(ReportReason hacking) {
    
    this.hacking = hacking;
    return this;
  }

   /**
   * Get hacking
   * @return hacking
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public ReportReason getHacking() {
    return hacking;
  }


  public void setHacking(ReportReason hacking) {
    this.hacking = hacking;
  }


  public APIConfigReportReasons harassing(ReportReason harassing) {
    
    this.harassing = harassing;
    return this;
  }

   /**
   * Get harassing
   * @return harassing
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public ReportReason getHarassing() {
    return harassing;
  }


  public void setHarassing(ReportReason harassing) {
    this.harassing = harassing;
  }


  public APIConfigReportReasons hateful(ReportReason hateful) {
    
    this.hateful = hateful;
    return this;
  }

   /**
   * Get hateful
   * @return hateful
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public ReportReason getHateful() {
    return hateful;
  }


  public void setHateful(ReportReason hateful) {
    this.hateful = hateful;
  }


  public APIConfigReportReasons impersonation(ReportReason impersonation) {
    
    this.impersonation = impersonation;
    return this;
  }

   /**
   * Get impersonation
   * @return impersonation
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public ReportReason getImpersonation() {
    return impersonation;
  }


  public void setImpersonation(ReportReason impersonation) {
    this.impersonation = impersonation;
  }


  public APIConfigReportReasons inappropriate(ReportReason inappropriate) {
    
    this.inappropriate = inappropriate;
    return this;
  }

   /**
   * Get inappropriate
   * @return inappropriate
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public ReportReason getInappropriate() {
    return inappropriate;
  }


  public void setInappropriate(ReportReason inappropriate) {
    this.inappropriate = inappropriate;
  }


  public APIConfigReportReasons leaking(ReportReason leaking) {
    
    this.leaking = leaking;
    return this;
  }

   /**
   * Get leaking
   * @return leaking
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public ReportReason getLeaking() {
    return leaking;
  }


  public void setLeaking(ReportReason leaking) {
    this.leaking = leaking;
  }


  public APIConfigReportReasons malicious(ReportReason malicious) {
    
    this.malicious = malicious;
    return this;
  }

   /**
   * Get malicious
   * @return malicious
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public ReportReason getMalicious() {
    return malicious;
  }


  public void setMalicious(ReportReason malicious) {
    this.malicious = malicious;
  }


  public APIConfigReportReasons missing(ReportReason missing) {
    
    this.missing = missing;
    return this;
  }

   /**
   * Get missing
   * @return missing
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public ReportReason getMissing() {
    return missing;
  }


  public void setMissing(ReportReason missing) {
    this.missing = missing;
  }


  public APIConfigReportReasons nudity(ReportReason nudity) {
    
    this.nudity = nudity;
    return this;
  }

   /**
   * Get nudity
   * @return nudity
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public ReportReason getNudity() {
    return nudity;
  }


  public void setNudity(ReportReason nudity) {
    this.nudity = nudity;
  }


  public APIConfigReportReasons renewal(ReportReason renewal) {
    
    this.renewal = renewal;
    return this;
  }

   /**
   * Get renewal
   * @return renewal
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public ReportReason getRenewal() {
    return renewal;
  }


  public void setRenewal(ReportReason renewal) {
    this.renewal = renewal;
  }


  public APIConfigReportReasons security(ReportReason security) {
    
    this.security = security;
    return this;
  }

   /**
   * Get security
   * @return security
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public ReportReason getSecurity() {
    return security;
  }


  public void setSecurity(ReportReason security) {
    this.security = security;
  }


  public APIConfigReportReasons service(ReportReason service) {
    
    this.service = service;
    return this;
  }

   /**
   * Get service
   * @return service
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public ReportReason getService() {
    return service;
  }


  public void setService(ReportReason service) {
    this.service = service;
  }


  public APIConfigReportReasons sexual(ReportReason sexual) {
    
    this.sexual = sexual;
    return this;
  }

   /**
   * Get sexual
   * @return sexual
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public ReportReason getSexual() {
    return sexual;
  }


  public void setSexual(ReportReason sexual) {
    this.sexual = sexual;
  }


  public APIConfigReportReasons technical(ReportReason technical) {
    
    this.technical = technical;
    return this;
  }

   /**
   * Get technical
   * @return technical
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ReportReason getTechnical() {
    return technical;
  }


  public void setTechnical(ReportReason technical) {
    this.technical = technical;
  }


  public APIConfigReportReasons threatening(ReportReason threatening) {
    
    this.threatening = threatening;
    return this;
  }

   /**
   * Get threatening
   * @return threatening
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public ReportReason getThreatening() {
    return threatening;
  }


  public void setThreatening(ReportReason threatening) {
    this.threatening = threatening;
  }


  public APIConfigReportReasons visuals(ReportReason visuals) {
    
    this.visuals = visuals;
    return this;
  }

   /**
   * Get visuals
   * @return visuals
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public ReportReason getVisuals() {
    return visuals;
  }


  public void setVisuals(ReportReason visuals) {
    this.visuals = visuals;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    APIConfigReportReasons apIConfigReportReasons = (APIConfigReportReasons) o;
    return Objects.equals(this.billing, apIConfigReportReasons.billing) &&
        Objects.equals(this.botting, apIConfigReportReasons.botting) &&
        Objects.equals(this.cancellation, apIConfigReportReasons.cancellation) &&
        Objects.equals(this.copyright, apIConfigReportReasons.copyright) &&
        Objects.equals(this.fraud, apIConfigReportReasons.fraud) &&
        Objects.equals(this.gore, apIConfigReportReasons.gore) &&
        Objects.equals(this.hacking, apIConfigReportReasons.hacking) &&
        Objects.equals(this.harassing, apIConfigReportReasons.harassing) &&
        Objects.equals(this.hateful, apIConfigReportReasons.hateful) &&
        Objects.equals(this.impersonation, apIConfigReportReasons.impersonation) &&
        Objects.equals(this.inappropriate, apIConfigReportReasons.inappropriate) &&
        Objects.equals(this.leaking, apIConfigReportReasons.leaking) &&
        Objects.equals(this.malicious, apIConfigReportReasons.malicious) &&
        Objects.equals(this.missing, apIConfigReportReasons.missing) &&
        Objects.equals(this.nudity, apIConfigReportReasons.nudity) &&
        Objects.equals(this.renewal, apIConfigReportReasons.renewal) &&
        Objects.equals(this.security, apIConfigReportReasons.security) &&
        Objects.equals(this.service, apIConfigReportReasons.service) &&
        Objects.equals(this.sexual, apIConfigReportReasons.sexual) &&
        Objects.equals(this.technical, apIConfigReportReasons.technical) &&
        Objects.equals(this.threatening, apIConfigReportReasons.threatening) &&
        Objects.equals(this.visuals, apIConfigReportReasons.visuals);
  }

  @Override
  public int hashCode() {
    return Objects.hash(billing, botting, cancellation, copyright, fraud, gore, hacking, harassing, hateful, impersonation, inappropriate, leaking, malicious, missing, nudity, renewal, security, service, sexual, technical, threatening, visuals);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class APIConfigReportReasons {\n");
    sb.append("    billing: ").append(toIndentedString(billing)).append("\n");
    sb.append("    botting: ").append(toIndentedString(botting)).append("\n");
    sb.append("    cancellation: ").append(toIndentedString(cancellation)).append("\n");
    sb.append("    copyright: ").append(toIndentedString(copyright)).append("\n");
    sb.append("    fraud: ").append(toIndentedString(fraud)).append("\n");
    sb.append("    gore: ").append(toIndentedString(gore)).append("\n");
    sb.append("    hacking: ").append(toIndentedString(hacking)).append("\n");
    sb.append("    harassing: ").append(toIndentedString(harassing)).append("\n");
    sb.append("    hateful: ").append(toIndentedString(hateful)).append("\n");
    sb.append("    impersonation: ").append(toIndentedString(impersonation)).append("\n");
    sb.append("    inappropriate: ").append(toIndentedString(inappropriate)).append("\n");
    sb.append("    leaking: ").append(toIndentedString(leaking)).append("\n");
    sb.append("    malicious: ").append(toIndentedString(malicious)).append("\n");
    sb.append("    missing: ").append(toIndentedString(missing)).append("\n");
    sb.append("    nudity: ").append(toIndentedString(nudity)).append("\n");
    sb.append("    renewal: ").append(toIndentedString(renewal)).append("\n");
    sb.append("    security: ").append(toIndentedString(security)).append("\n");
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
    sb.append("    sexual: ").append(toIndentedString(sexual)).append("\n");
    sb.append("    technical: ").append(toIndentedString(technical)).append("\n");
    sb.append("    threatening: ").append(toIndentedString(threatening)).append("\n");
    sb.append("    visuals: ").append(toIndentedString(visuals)).append("\n");
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
    openapiFields.add("billing");
    openapiFields.add("botting");
    openapiFields.add("cancellation");
    openapiFields.add("copyright");
    openapiFields.add("fraud");
    openapiFields.add("gore");
    openapiFields.add("hacking");
    openapiFields.add("harassing");
    openapiFields.add("hateful");
    openapiFields.add("impersonation");
    openapiFields.add("inappropriate");
    openapiFields.add("leaking");
    openapiFields.add("malicious");
    openapiFields.add("missing");
    openapiFields.add("nudity");
    openapiFields.add("renewal");
    openapiFields.add("security");
    openapiFields.add("service");
    openapiFields.add("sexual");
    openapiFields.add("technical");
    openapiFields.add("threatening");
    openapiFields.add("visuals");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("billing");
    openapiRequiredFields.add("botting");
    openapiRequiredFields.add("cancellation");
    openapiRequiredFields.add("gore");
    openapiRequiredFields.add("hacking");
    openapiRequiredFields.add("harassing");
    openapiRequiredFields.add("hateful");
    openapiRequiredFields.add("impersonation");
    openapiRequiredFields.add("inappropriate");
    openapiRequiredFields.add("leaking");
    openapiRequiredFields.add("malicious");
    openapiRequiredFields.add("missing");
    openapiRequiredFields.add("nudity");
    openapiRequiredFields.add("renewal");
    openapiRequiredFields.add("security");
    openapiRequiredFields.add("service");
    openapiRequiredFields.add("sexual");
    openapiRequiredFields.add("threatening");
    openapiRequiredFields.add("visuals");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to APIConfigReportReasons
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!APIConfigReportReasons.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in APIConfigReportReasons is not found in the empty JSON string", APIConfigReportReasons.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!APIConfigReportReasons.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `APIConfigReportReasons` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : APIConfigReportReasons.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the required field `billing`
      ReportReason.validateJsonObject(jsonObj.getAsJsonObject("billing"));
      // validate the required field `botting`
      ReportReason.validateJsonObject(jsonObj.getAsJsonObject("botting"));
      // validate the required field `cancellation`
      ReportReason.validateJsonObject(jsonObj.getAsJsonObject("cancellation"));
      // validate the optional field `copyright`
      if (jsonObj.get("copyright") != null && !jsonObj.get("copyright").isJsonNull()) {
        ReportReason.validateJsonObject(jsonObj.getAsJsonObject("copyright"));
      }
      // validate the optional field `fraud`
      if (jsonObj.get("fraud") != null && !jsonObj.get("fraud").isJsonNull()) {
        ReportReason.validateJsonObject(jsonObj.getAsJsonObject("fraud"));
      }
      // validate the required field `gore`
      ReportReason.validateJsonObject(jsonObj.getAsJsonObject("gore"));
      // validate the required field `hacking`
      ReportReason.validateJsonObject(jsonObj.getAsJsonObject("hacking"));
      // validate the required field `harassing`
      ReportReason.validateJsonObject(jsonObj.getAsJsonObject("harassing"));
      // validate the required field `hateful`
      ReportReason.validateJsonObject(jsonObj.getAsJsonObject("hateful"));
      // validate the required field `impersonation`
      ReportReason.validateJsonObject(jsonObj.getAsJsonObject("impersonation"));
      // validate the required field `inappropriate`
      ReportReason.validateJsonObject(jsonObj.getAsJsonObject("inappropriate"));
      // validate the required field `leaking`
      ReportReason.validateJsonObject(jsonObj.getAsJsonObject("leaking"));
      // validate the required field `malicious`
      ReportReason.validateJsonObject(jsonObj.getAsJsonObject("malicious"));
      // validate the required field `missing`
      ReportReason.validateJsonObject(jsonObj.getAsJsonObject("missing"));
      // validate the required field `nudity`
      ReportReason.validateJsonObject(jsonObj.getAsJsonObject("nudity"));
      // validate the required field `renewal`
      ReportReason.validateJsonObject(jsonObj.getAsJsonObject("renewal"));
      // validate the required field `security`
      ReportReason.validateJsonObject(jsonObj.getAsJsonObject("security"));
      // validate the required field `service`
      ReportReason.validateJsonObject(jsonObj.getAsJsonObject("service"));
      // validate the required field `sexual`
      ReportReason.validateJsonObject(jsonObj.getAsJsonObject("sexual"));
      // validate the optional field `technical`
      if (jsonObj.get("technical") != null && !jsonObj.get("technical").isJsonNull()) {
        ReportReason.validateJsonObject(jsonObj.getAsJsonObject("technical"));
      }
      // validate the required field `threatening`
      ReportReason.validateJsonObject(jsonObj.getAsJsonObject("threatening"));
      // validate the required field `visuals`
      ReportReason.validateJsonObject(jsonObj.getAsJsonObject("visuals"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!APIConfigReportReasons.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'APIConfigReportReasons' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<APIConfigReportReasons> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(APIConfigReportReasons.class));

       return (TypeAdapter<T>) new TypeAdapter<APIConfigReportReasons>() {
           @Override
           public void write(JsonWriter out, APIConfigReportReasons value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public APIConfigReportReasons read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of APIConfigReportReasons given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of APIConfigReportReasons
  * @throws IOException if the JSON string is invalid with respect to APIConfigReportReasons
  */
  public static APIConfigReportReasons fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, APIConfigReportReasons.class);
  }

 /**
  * Convert an instance of APIConfigReportReasons to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

