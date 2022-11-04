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
import java.math.BigDecimal;

/**
 * TransactionAgreement
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TransactionAgreement {
  public static final String SERIALIZED_NAME_AGREEMENT_ID = "agreementId";
  @SerializedName(SERIALIZED_NAME_AGREEMENT_ID)
  private String agreementId;

  public static final String SERIALIZED_NAME_ITEM_ID = "itemId";
  @SerializedName(SERIALIZED_NAME_ITEM_ID)
  private BigDecimal itemId;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_PERIOD = "period";
  @SerializedName(SERIALIZED_NAME_PERIOD)
  private String period;

  public static final String SERIALIZED_NAME_FREQUENCY = "frequency";
  @SerializedName(SERIALIZED_NAME_FREQUENCY)
  private BigDecimal frequency;

  public static final String SERIALIZED_NAME_BILLING_TYPE = "billingType";
  @SerializedName(SERIALIZED_NAME_BILLING_TYPE)
  private String billingType;

  public static final String SERIALIZED_NAME_START_DATE = "startDate";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private String startDate;

  public static final String SERIALIZED_NAME_END_DATE = "endDate";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private String endDate;

  public static final String SERIALIZED_NAME_RECURRING_AMT = "recurringAmt";
  @SerializedName(SERIALIZED_NAME_RECURRING_AMT)
  private BigDecimal recurringAmt;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private String currency;

  public static final String SERIALIZED_NAME_TIME_CREATED = "timeCreated";
  @SerializedName(SERIALIZED_NAME_TIME_CREATED)
  private String timeCreated;

  public static final String SERIALIZED_NAME_NEXT_PAYMENT = "nextPayment";
  @SerializedName(SERIALIZED_NAME_NEXT_PAYMENT)
  private String nextPayment;

  public static final String SERIALIZED_NAME_LAST_PAYMENT = "lastPayment";
  @SerializedName(SERIALIZED_NAME_LAST_PAYMENT)
  private String lastPayment;

  public static final String SERIALIZED_NAME_LAST_AMOUNT = "lastAmount";
  @SerializedName(SERIALIZED_NAME_LAST_AMOUNT)
  private BigDecimal lastAmount;

  public static final String SERIALIZED_NAME_LAST_AMOUNT_VAT = "lastAmountVat";
  @SerializedName(SERIALIZED_NAME_LAST_AMOUNT_VAT)
  private BigDecimal lastAmountVat;

  public static final String SERIALIZED_NAME_OUTSTANDING = "outstanding";
  @SerializedName(SERIALIZED_NAME_OUTSTANDING)
  private BigDecimal outstanding;

  public static final String SERIALIZED_NAME_FAILED_ATTEMPTS = "failedAttempts";
  @SerializedName(SERIALIZED_NAME_FAILED_ATTEMPTS)
  private BigDecimal failedAttempts;


  public TransactionAgreement agreementId(String agreementId) {
    
    this.agreementId = agreementId;
    return this;
  }

   /**
   * Get agreementId
   * @return agreementId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getAgreementId() {
    return agreementId;
  }


  public void setAgreementId(String agreementId) {
    this.agreementId = agreementId;
  }


  public TransactionAgreement itemId(BigDecimal itemId) {
    
    this.itemId = itemId;
    return this;
  }

   /**
   * Get itemId
   * @return itemId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public BigDecimal getItemId() {
    return itemId;
  }


  public void setItemId(BigDecimal itemId) {
    this.itemId = itemId;
  }


  public TransactionAgreement status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * This is NOT TransactionStatus, but whatever Steam return.
   * @return status
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "This is NOT TransactionStatus, but whatever Steam return.")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public TransactionAgreement period(String period) {
    
    this.period = period;
    return this;
  }

   /**
   * Get period
   * @return period
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getPeriod() {
    return period;
  }


  public void setPeriod(String period) {
    this.period = period;
  }


  public TransactionAgreement frequency(BigDecimal frequency) {
    
    this.frequency = frequency;
    return this;
  }

   /**
   * Get frequency
   * @return frequency
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public BigDecimal getFrequency() {
    return frequency;
  }


  public void setFrequency(BigDecimal frequency) {
    this.frequency = frequency;
  }


  public TransactionAgreement billingType(String billingType) {
    
    this.billingType = billingType;
    return this;
  }

   /**
   * Get billingType
   * @return billingType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getBillingType() {
    return billingType;
  }


  public void setBillingType(String billingType) {
    this.billingType = billingType;
  }


  public TransactionAgreement startDate(String startDate) {
    
    this.startDate = startDate;
    return this;
  }

   /**
   * Get startDate
   * @return startDate
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getStartDate() {
    return startDate;
  }


  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }


  public TransactionAgreement endDate(String endDate) {
    
    this.endDate = endDate;
    return this;
  }

   /**
   * Get endDate
   * @return endDate
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getEndDate() {
    return endDate;
  }


  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }


  public TransactionAgreement recurringAmt(BigDecimal recurringAmt) {
    
    this.recurringAmt = recurringAmt;
    return this;
  }

   /**
   * Get recurringAmt
   * @return recurringAmt
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public BigDecimal getRecurringAmt() {
    return recurringAmt;
  }


  public void setRecurringAmt(BigDecimal recurringAmt) {
    this.recurringAmt = recurringAmt;
  }


  public TransactionAgreement currency(String currency) {
    
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getCurrency() {
    return currency;
  }


  public void setCurrency(String currency) {
    this.currency = currency;
  }


  public TransactionAgreement timeCreated(String timeCreated) {
    
    this.timeCreated = timeCreated;
    return this;
  }

   /**
   * Get timeCreated
   * @return timeCreated
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getTimeCreated() {
    return timeCreated;
  }


  public void setTimeCreated(String timeCreated) {
    this.timeCreated = timeCreated;
  }


  public TransactionAgreement nextPayment(String nextPayment) {
    
    this.nextPayment = nextPayment;
    return this;
  }

   /**
   * Get nextPayment
   * @return nextPayment
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getNextPayment() {
    return nextPayment;
  }


  public void setNextPayment(String nextPayment) {
    this.nextPayment = nextPayment;
  }


  public TransactionAgreement lastPayment(String lastPayment) {
    
    this.lastPayment = lastPayment;
    return this;
  }

   /**
   * Get lastPayment
   * @return lastPayment
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getLastPayment() {
    return lastPayment;
  }


  public void setLastPayment(String lastPayment) {
    this.lastPayment = lastPayment;
  }


  public TransactionAgreement lastAmount(BigDecimal lastAmount) {
    
    this.lastAmount = lastAmount;
    return this;
  }

   /**
   * Get lastAmount
   * @return lastAmount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public BigDecimal getLastAmount() {
    return lastAmount;
  }


  public void setLastAmount(BigDecimal lastAmount) {
    this.lastAmount = lastAmount;
  }


  public TransactionAgreement lastAmountVat(BigDecimal lastAmountVat) {
    
    this.lastAmountVat = lastAmountVat;
    return this;
  }

   /**
   * Get lastAmountVat
   * @return lastAmountVat
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public BigDecimal getLastAmountVat() {
    return lastAmountVat;
  }


  public void setLastAmountVat(BigDecimal lastAmountVat) {
    this.lastAmountVat = lastAmountVat;
  }


  public TransactionAgreement outstanding(BigDecimal outstanding) {
    
    this.outstanding = outstanding;
    return this;
  }

   /**
   * Get outstanding
   * @return outstanding
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public BigDecimal getOutstanding() {
    return outstanding;
  }


  public void setOutstanding(BigDecimal outstanding) {
    this.outstanding = outstanding;
  }


  public TransactionAgreement failedAttempts(BigDecimal failedAttempts) {
    
    this.failedAttempts = failedAttempts;
    return this;
  }

   /**
   * Get failedAttempts
   * @return failedAttempts
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public BigDecimal getFailedAttempts() {
    return failedAttempts;
  }


  public void setFailedAttempts(BigDecimal failedAttempts) {
    this.failedAttempts = failedAttempts;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionAgreement transactionAgreement = (TransactionAgreement) o;
    return Objects.equals(this.agreementId, transactionAgreement.agreementId) &&
        Objects.equals(this.itemId, transactionAgreement.itemId) &&
        Objects.equals(this.status, transactionAgreement.status) &&
        Objects.equals(this.period, transactionAgreement.period) &&
        Objects.equals(this.frequency, transactionAgreement.frequency) &&
        Objects.equals(this.billingType, transactionAgreement.billingType) &&
        Objects.equals(this.startDate, transactionAgreement.startDate) &&
        Objects.equals(this.endDate, transactionAgreement.endDate) &&
        Objects.equals(this.recurringAmt, transactionAgreement.recurringAmt) &&
        Objects.equals(this.currency, transactionAgreement.currency) &&
        Objects.equals(this.timeCreated, transactionAgreement.timeCreated) &&
        Objects.equals(this.nextPayment, transactionAgreement.nextPayment) &&
        Objects.equals(this.lastPayment, transactionAgreement.lastPayment) &&
        Objects.equals(this.lastAmount, transactionAgreement.lastAmount) &&
        Objects.equals(this.lastAmountVat, transactionAgreement.lastAmountVat) &&
        Objects.equals(this.outstanding, transactionAgreement.outstanding) &&
        Objects.equals(this.failedAttempts, transactionAgreement.failedAttempts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agreementId, itemId, status, period, frequency, billingType, startDate, endDate, recurringAmt, currency, timeCreated, nextPayment, lastPayment, lastAmount, lastAmountVat, outstanding, failedAttempts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionAgreement {\n");
    sb.append("    agreementId: ").append(toIndentedString(agreementId)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
    sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
    sb.append("    billingType: ").append(toIndentedString(billingType)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    recurringAmt: ").append(toIndentedString(recurringAmt)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    timeCreated: ").append(toIndentedString(timeCreated)).append("\n");
    sb.append("    nextPayment: ").append(toIndentedString(nextPayment)).append("\n");
    sb.append("    lastPayment: ").append(toIndentedString(lastPayment)).append("\n");
    sb.append("    lastAmount: ").append(toIndentedString(lastAmount)).append("\n");
    sb.append("    lastAmountVat: ").append(toIndentedString(lastAmountVat)).append("\n");
    sb.append("    outstanding: ").append(toIndentedString(outstanding)).append("\n");
    sb.append("    failedAttempts: ").append(toIndentedString(failedAttempts)).append("\n");
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

