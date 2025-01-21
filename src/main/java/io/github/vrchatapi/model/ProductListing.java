/*
 * VRChat API Documentation
 *
 * The version of the OpenAPI document: 1.19.0
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
import io.github.vrchatapi.model.Product;
import io.github.vrchatapi.model.ProductListingType;
import io.github.vrchatapi.model.ProductListingVariant;
import io.github.vrchatapi.model.ProductType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
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
 * ProductListing
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ProductListing {
  public static final String SERIALIZED_NAME_ACTIVE = "active";
  @SerializedName(SERIALIZED_NAME_ACTIVE)
  private Boolean active;

  public static final String SERIALIZED_NAME_ARCHIVED = "archived";
  @SerializedName(SERIALIZED_NAME_ARCHIVED)
  private Boolean archived;

  public static final String SERIALIZED_NAME_BUYER_REFUNDABLE = "buyerRefundable";
  @SerializedName(SERIALIZED_NAME_BUYER_REFUNDABLE)
  private Boolean buyerRefundable;

  public static final String SERIALIZED_NAME_CREATED = "created";
  @SerializedName(SERIALIZED_NAME_CREATED)
  private OffsetDateTime created;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_DISPLAY_NAME = "displayName";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;

  public static final String SERIALIZED_NAME_DURATION = "duration";
  @SerializedName(SERIALIZED_NAME_DURATION)
  private Integer duration;

  public static final String SERIALIZED_NAME_DURATION_TYPE = "durationType";
  @SerializedName(SERIALIZED_NAME_DURATION_TYPE)
  private String durationType;

  public static final String SERIALIZED_NAME_GROUP_ICON = "groupIcon";
  @SerializedName(SERIALIZED_NAME_GROUP_ICON)
  private String groupIcon;

  public static final String SERIALIZED_NAME_GROUP_ID = "groupId";
  @SerializedName(SERIALIZED_NAME_GROUP_ID)
  private String groupId;

  public static final String SERIALIZED_NAME_GROUP_NAME = "groupName";
  @SerializedName(SERIALIZED_NAME_GROUP_NAME)
  private String groupName;

  public static final String SERIALIZED_NAME_HYDRATED_PRODUCTS = "hydratedProducts";
  @SerializedName(SERIALIZED_NAME_HYDRATED_PRODUCTS)
  private List<Product> hydratedProducts = null;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_IMAGE_ID = "imageId";
  @SerializedName(SERIALIZED_NAME_IMAGE_ID)
  private String imageId;

  public static final String SERIALIZED_NAME_INSTANT = "instant";
  @SerializedName(SERIALIZED_NAME_INSTANT)
  private Boolean instant;

  public static final String SERIALIZED_NAME_LISTING_TYPE = "listingType";
  @SerializedName(SERIALIZED_NAME_LISTING_TYPE)
  private ProductListingType listingType = ProductListingType.SUBSCRIPTION;

  public static final String SERIALIZED_NAME_LISTING_VARIANTS = "listingVariants";
  @SerializedName(SERIALIZED_NAME_LISTING_VARIANTS)
  private List<ProductListingVariant> listingVariants = new ArrayList<>();

  public static final String SERIALIZED_NAME_PERMANENT = "permanent";
  @SerializedName(SERIALIZED_NAME_PERMANENT)
  private Boolean permanent;

  public static final String SERIALIZED_NAME_PRICE_TOKENS = "priceTokens";
  @SerializedName(SERIALIZED_NAME_PRICE_TOKENS)
  private Integer priceTokens;

  public static final String SERIALIZED_NAME_PRODUCT_IDS = "productIds";
  @SerializedName(SERIALIZED_NAME_PRODUCT_IDS)
  private List<String> productIds = new ArrayList<>();

  public static final String SERIALIZED_NAME_PRODUCT_TYPE = "productType";
  @SerializedName(SERIALIZED_NAME_PRODUCT_TYPE)
  private ProductType productType = ProductType.UDON;

  public static final String SERIALIZED_NAME_PRODUCTS = "products";
  @SerializedName(SERIALIZED_NAME_PRODUCTS)
  private List<Object> products = new ArrayList<>();

  public static final String SERIALIZED_NAME_QUANTIFIABLE = "quantifiable";
  @SerializedName(SERIALIZED_NAME_QUANTIFIABLE)
  private Boolean quantifiable;

  public static final String SERIALIZED_NAME_RECURRABLE = "recurrable";
  @SerializedName(SERIALIZED_NAME_RECURRABLE)
  private Boolean recurrable;

  public static final String SERIALIZED_NAME_REFUNDABLE = "refundable";
  @SerializedName(SERIALIZED_NAME_REFUNDABLE)
  private Boolean refundable;

  public static final String SERIALIZED_NAME_SELLER_DISPLAY_NAME = "sellerDisplayName";
  @SerializedName(SERIALIZED_NAME_SELLER_DISPLAY_NAME)
  private String sellerDisplayName;

  public static final String SERIALIZED_NAME_SELLER_ID = "sellerId";
  @SerializedName(SERIALIZED_NAME_SELLER_ID)
  private String sellerId;

  public static final String SERIALIZED_NAME_STACKABLE = "stackable";
  @SerializedName(SERIALIZED_NAME_STACKABLE)
  private Boolean stackable;

  public static final String SERIALIZED_NAME_STORE_IDS = "storeIds";
  @SerializedName(SERIALIZED_NAME_STORE_IDS)
  private List<String> storeIds = new ArrayList<>();

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<String> tags = new ArrayList<>();

  public static final String SERIALIZED_NAME_UPDATED = "updated";
  @SerializedName(SERIALIZED_NAME_UPDATED)
  private OffsetDateTime updated;

  public ProductListing() {
  }

  public ProductListing active(Boolean active) {
    
    this.active = active;
    return this;
  }

   /**
   * Get active
   * @return active
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getActive() {
    return active;
  }


  public void setActive(Boolean active) {
    this.active = active;
  }


  public ProductListing archived(Boolean archived) {
    
    this.archived = archived;
    return this;
  }

   /**
   * Get archived
   * @return archived
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getArchived() {
    return archived;
  }


  public void setArchived(Boolean archived) {
    this.archived = archived;
  }


  public ProductListing buyerRefundable(Boolean buyerRefundable) {
    
    this.buyerRefundable = buyerRefundable;
    return this;
  }

   /**
   * Get buyerRefundable
   * @return buyerRefundable
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getBuyerRefundable() {
    return buyerRefundable;
  }


  public void setBuyerRefundable(Boolean buyerRefundable) {
    this.buyerRefundable = buyerRefundable;
  }


  public ProductListing created(OffsetDateTime created) {
    
    this.created = created;
    return this;
  }

   /**
   * Get created
   * @return created
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public OffsetDateTime getCreated() {
    return created;
  }


  public void setCreated(OffsetDateTime created) {
    this.created = created;
  }


  public ProductListing description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public ProductListing displayName(String displayName) {
    
    this.displayName = displayName;
    return this;
  }

   /**
   * Get displayName
   * @return displayName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getDisplayName() {
    return displayName;
  }


  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  public ProductListing duration(Integer duration) {
    
    this.duration = duration;
    return this;
  }

   /**
   * Get duration
   * @return duration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getDuration() {
    return duration;
  }


  public void setDuration(Integer duration) {
    this.duration = duration;
  }


  public ProductListing durationType(String durationType) {
    
    this.durationType = durationType;
    return this;
  }

   /**
   * Get durationType
   * @return durationType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDurationType() {
    return durationType;
  }


  public void setDurationType(String durationType) {
    this.durationType = durationType;
  }


  public ProductListing groupIcon(String groupIcon) {
    
    this.groupIcon = groupIcon;
    return this;
  }

   /**
   * Get groupIcon
   * @return groupIcon
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "file_ce35d830-e20a-4df0-a6d4-5aaef4508044", required = true, value = "")

  public String getGroupIcon() {
    return groupIcon;
  }


  public void setGroupIcon(String groupIcon) {
    this.groupIcon = groupIcon;
  }


  public ProductListing groupId(String groupId) {
    
    this.groupId = groupId;
    return this;
  }

   /**
   * Get groupId
   * @return groupId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "grp_71a7ff59-112c-4e78-a990-c7cc650776e5", required = true, value = "")

  public String getGroupId() {
    return groupId;
  }


  public void setGroupId(String groupId) {
    this.groupId = groupId;
  }


  public ProductListing groupName(String groupName) {
    
    this.groupName = groupName;
    return this;
  }

   /**
   * Get groupName
   * @return groupName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getGroupName() {
    return groupName;
  }


  public void setGroupName(String groupName) {
    this.groupName = groupName;
  }


  public ProductListing hydratedProducts(List<Product> hydratedProducts) {
    
    this.hydratedProducts = hydratedProducts;
    return this;
  }

  public ProductListing addHydratedProductsItem(Product hydratedProductsItem) {
    if (this.hydratedProducts == null) {
      this.hydratedProducts = new ArrayList<>();
    }
    this.hydratedProducts.add(hydratedProductsItem);
    return this;
  }

   /**
   * Get hydratedProducts
   * @return hydratedProducts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Product> getHydratedProducts() {
    return hydratedProducts;
  }


  public void setHydratedProducts(List<Product> hydratedProducts) {
    this.hydratedProducts = hydratedProducts;
  }


  public ProductListing id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "prod_bfbc2315-247a-44d7-bfea-5237f8d56cb4", required = true, value = "")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public ProductListing imageId(String imageId) {
    
    this.imageId = imageId;
    return this;
  }

   /**
   * Get imageId
   * @return imageId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "file_ce35d830-e20a-4df0-a6d4-5aaef4508044", required = true, value = "")

  public String getImageId() {
    return imageId;
  }


  public void setImageId(String imageId) {
    this.imageId = imageId;
  }


  public ProductListing instant(Boolean instant) {
    
    this.instant = instant;
    return this;
  }

   /**
   * Get instant
   * @return instant
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getInstant() {
    return instant;
  }


  public void setInstant(Boolean instant) {
    this.instant = instant;
  }


  public ProductListing listingType(ProductListingType listingType) {
    
    this.listingType = listingType;
    return this;
  }

   /**
   * Get listingType
   * @return listingType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public ProductListingType getListingType() {
    return listingType;
  }


  public void setListingType(ProductListingType listingType) {
    this.listingType = listingType;
  }


  public ProductListing listingVariants(List<ProductListingVariant> listingVariants) {
    
    this.listingVariants = listingVariants;
    return this;
  }

  public ProductListing addListingVariantsItem(ProductListingVariant listingVariantsItem) {
    this.listingVariants.add(listingVariantsItem);
    return this;
  }

   /**
   * Get listingVariants
   * @return listingVariants
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<ProductListingVariant> getListingVariants() {
    return listingVariants;
  }


  public void setListingVariants(List<ProductListingVariant> listingVariants) {
    this.listingVariants = listingVariants;
  }


  public ProductListing permanent(Boolean permanent) {
    
    this.permanent = permanent;
    return this;
  }

   /**
   * Get permanent
   * @return permanent
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getPermanent() {
    return permanent;
  }


  public void setPermanent(Boolean permanent) {
    this.permanent = permanent;
  }


  public ProductListing priceTokens(Integer priceTokens) {
    
    this.priceTokens = priceTokens;
    return this;
  }

   /**
   * Get priceTokens
   * @return priceTokens
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getPriceTokens() {
    return priceTokens;
  }


  public void setPriceTokens(Integer priceTokens) {
    this.priceTokens = priceTokens;
  }


  public ProductListing productIds(List<String> productIds) {
    
    this.productIds = productIds;
    return this;
  }

  public ProductListing addProductIdsItem(String productIdsItem) {
    this.productIds.add(productIdsItem);
    return this;
  }

   /**
   * Get productIds
   * @return productIds
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<String> getProductIds() {
    return productIds;
  }


  public void setProductIds(List<String> productIds) {
    this.productIds = productIds;
  }


  public ProductListing productType(ProductType productType) {
    
    this.productType = productType;
    return this;
  }

   /**
   * Get productType
   * @return productType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public ProductType getProductType() {
    return productType;
  }


  public void setProductType(ProductType productType) {
    this.productType = productType;
  }


  public ProductListing products(List<Object> products) {
    
    this.products = products;
    return this;
  }

  public ProductListing addProductsItem(Object productsItem) {
    this.products.add(productsItem);
    return this;
  }

   /**
   * Get products
   * @return products
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<Object> getProducts() {
    return products;
  }


  public void setProducts(List<Object> products) {
    this.products = products;
  }


  public ProductListing quantifiable(Boolean quantifiable) {
    
    this.quantifiable = quantifiable;
    return this;
  }

   /**
   * Get quantifiable
   * @return quantifiable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getQuantifiable() {
    return quantifiable;
  }


  public void setQuantifiable(Boolean quantifiable) {
    this.quantifiable = quantifiable;
  }


  public ProductListing recurrable(Boolean recurrable) {
    
    this.recurrable = recurrable;
    return this;
  }

   /**
   * Get recurrable
   * @return recurrable
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getRecurrable() {
    return recurrable;
  }


  public void setRecurrable(Boolean recurrable) {
    this.recurrable = recurrable;
  }


  public ProductListing refundable(Boolean refundable) {
    
    this.refundable = refundable;
    return this;
  }

   /**
   * Get refundable
   * @return refundable
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getRefundable() {
    return refundable;
  }


  public void setRefundable(Boolean refundable) {
    this.refundable = refundable;
  }


  public ProductListing sellerDisplayName(String sellerDisplayName) {
    
    this.sellerDisplayName = sellerDisplayName;
    return this;
  }

   /**
   * Get sellerDisplayName
   * @return sellerDisplayName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getSellerDisplayName() {
    return sellerDisplayName;
  }


  public void setSellerDisplayName(String sellerDisplayName) {
    this.sellerDisplayName = sellerDisplayName;
  }


  public ProductListing sellerId(String sellerId) {
    
    this.sellerId = sellerId;
    return this;
  }

   /**
   * Get sellerId
   * @return sellerId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getSellerId() {
    return sellerId;
  }


  public void setSellerId(String sellerId) {
    this.sellerId = sellerId;
  }


  public ProductListing stackable(Boolean stackable) {
    
    this.stackable = stackable;
    return this;
  }

   /**
   * Get stackable
   * @return stackable
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getStackable() {
    return stackable;
  }


  public void setStackable(Boolean stackable) {
    this.stackable = stackable;
  }


  public ProductListing storeIds(List<String> storeIds) {
    
    this.storeIds = storeIds;
    return this;
  }

  public ProductListing addStoreIdsItem(String storeIdsItem) {
    this.storeIds.add(storeIdsItem);
    return this;
  }

   /**
   * Get storeIds
   * @return storeIds
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<String> getStoreIds() {
    return storeIds;
  }


  public void setStoreIds(List<String> storeIds) {
    this.storeIds = storeIds;
  }


  public ProductListing tags(List<String> tags) {
    
    this.tags = tags;
    return this;
  }

  public ProductListing addTagsItem(String tagsItem) {
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<String> getTags() {
    return tags;
  }


  public void setTags(List<String> tags) {
    this.tags = tags;
  }


  public ProductListing updated(OffsetDateTime updated) {
    
    this.updated = updated;
    return this;
  }

   /**
   * Get updated
   * @return updated
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public OffsetDateTime getUpdated() {
    return updated;
  }


  public void setUpdated(OffsetDateTime updated) {
    this.updated = updated;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductListing productListing = (ProductListing) o;
    return Objects.equals(this.active, productListing.active) &&
        Objects.equals(this.archived, productListing.archived) &&
        Objects.equals(this.buyerRefundable, productListing.buyerRefundable) &&
        Objects.equals(this.created, productListing.created) &&
        Objects.equals(this.description, productListing.description) &&
        Objects.equals(this.displayName, productListing.displayName) &&
        Objects.equals(this.duration, productListing.duration) &&
        Objects.equals(this.durationType, productListing.durationType) &&
        Objects.equals(this.groupIcon, productListing.groupIcon) &&
        Objects.equals(this.groupId, productListing.groupId) &&
        Objects.equals(this.groupName, productListing.groupName) &&
        Objects.equals(this.hydratedProducts, productListing.hydratedProducts) &&
        Objects.equals(this.id, productListing.id) &&
        Objects.equals(this.imageId, productListing.imageId) &&
        Objects.equals(this.instant, productListing.instant) &&
        Objects.equals(this.listingType, productListing.listingType) &&
        Objects.equals(this.listingVariants, productListing.listingVariants) &&
        Objects.equals(this.permanent, productListing.permanent) &&
        Objects.equals(this.priceTokens, productListing.priceTokens) &&
        Objects.equals(this.productIds, productListing.productIds) &&
        Objects.equals(this.productType, productListing.productType) &&
        Objects.equals(this.products, productListing.products) &&
        Objects.equals(this.quantifiable, productListing.quantifiable) &&
        Objects.equals(this.recurrable, productListing.recurrable) &&
        Objects.equals(this.refundable, productListing.refundable) &&
        Objects.equals(this.sellerDisplayName, productListing.sellerDisplayName) &&
        Objects.equals(this.sellerId, productListing.sellerId) &&
        Objects.equals(this.stackable, productListing.stackable) &&
        Objects.equals(this.storeIds, productListing.storeIds) &&
        Objects.equals(this.tags, productListing.tags) &&
        Objects.equals(this.updated, productListing.updated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, archived, buyerRefundable, created, description, displayName, duration, durationType, groupIcon, groupId, groupName, hydratedProducts, id, imageId, instant, listingType, listingVariants, permanent, priceTokens, productIds, productType, products, quantifiable, recurrable, refundable, sellerDisplayName, sellerId, stackable, storeIds, tags, updated);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductListing {\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    archived: ").append(toIndentedString(archived)).append("\n");
    sb.append("    buyerRefundable: ").append(toIndentedString(buyerRefundable)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    durationType: ").append(toIndentedString(durationType)).append("\n");
    sb.append("    groupIcon: ").append(toIndentedString(groupIcon)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
    sb.append("    hydratedProducts: ").append(toIndentedString(hydratedProducts)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    imageId: ").append(toIndentedString(imageId)).append("\n");
    sb.append("    instant: ").append(toIndentedString(instant)).append("\n");
    sb.append("    listingType: ").append(toIndentedString(listingType)).append("\n");
    sb.append("    listingVariants: ").append(toIndentedString(listingVariants)).append("\n");
    sb.append("    permanent: ").append(toIndentedString(permanent)).append("\n");
    sb.append("    priceTokens: ").append(toIndentedString(priceTokens)).append("\n");
    sb.append("    productIds: ").append(toIndentedString(productIds)).append("\n");
    sb.append("    productType: ").append(toIndentedString(productType)).append("\n");
    sb.append("    products: ").append(toIndentedString(products)).append("\n");
    sb.append("    quantifiable: ").append(toIndentedString(quantifiable)).append("\n");
    sb.append("    recurrable: ").append(toIndentedString(recurrable)).append("\n");
    sb.append("    refundable: ").append(toIndentedString(refundable)).append("\n");
    sb.append("    sellerDisplayName: ").append(toIndentedString(sellerDisplayName)).append("\n");
    sb.append("    sellerId: ").append(toIndentedString(sellerId)).append("\n");
    sb.append("    stackable: ").append(toIndentedString(stackable)).append("\n");
    sb.append("    storeIds: ").append(toIndentedString(storeIds)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
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
    openapiFields.add("active");
    openapiFields.add("archived");
    openapiFields.add("buyerRefundable");
    openapiFields.add("created");
    openapiFields.add("description");
    openapiFields.add("displayName");
    openapiFields.add("duration");
    openapiFields.add("durationType");
    openapiFields.add("groupIcon");
    openapiFields.add("groupId");
    openapiFields.add("groupName");
    openapiFields.add("hydratedProducts");
    openapiFields.add("id");
    openapiFields.add("imageId");
    openapiFields.add("instant");
    openapiFields.add("listingType");
    openapiFields.add("listingVariants");
    openapiFields.add("permanent");
    openapiFields.add("priceTokens");
    openapiFields.add("productIds");
    openapiFields.add("productType");
    openapiFields.add("products");
    openapiFields.add("quantifiable");
    openapiFields.add("recurrable");
    openapiFields.add("refundable");
    openapiFields.add("sellerDisplayName");
    openapiFields.add("sellerId");
    openapiFields.add("stackable");
    openapiFields.add("storeIds");
    openapiFields.add("tags");
    openapiFields.add("updated");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("active");
    openapiRequiredFields.add("archived");
    openapiRequiredFields.add("buyerRefundable");
    openapiRequiredFields.add("created");
    openapiRequiredFields.add("description");
    openapiRequiredFields.add("displayName");
    openapiRequiredFields.add("groupIcon");
    openapiRequiredFields.add("groupId");
    openapiRequiredFields.add("groupName");
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("imageId");
    openapiRequiredFields.add("instant");
    openapiRequiredFields.add("listingType");
    openapiRequiredFields.add("listingVariants");
    openapiRequiredFields.add("permanent");
    openapiRequiredFields.add("priceTokens");
    openapiRequiredFields.add("productIds");
    openapiRequiredFields.add("productType");
    openapiRequiredFields.add("products");
    openapiRequiredFields.add("recurrable");
    openapiRequiredFields.add("refundable");
    openapiRequiredFields.add("sellerDisplayName");
    openapiRequiredFields.add("sellerId");
    openapiRequiredFields.add("stackable");
    openapiRequiredFields.add("storeIds");
    openapiRequiredFields.add("tags");
    openapiRequiredFields.add("updated");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ProductListing
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ProductListing.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ProductListing is not found in the empty JSON string", ProductListing.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ProductListing.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ProductListing` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ProductListing.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if (!jsonObj.get("displayName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `displayName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("displayName").toString()));
      }
      if ((jsonObj.get("durationType") != null && !jsonObj.get("durationType").isJsonNull()) && !jsonObj.get("durationType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `durationType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("durationType").toString()));
      }
      if (!jsonObj.get("groupIcon").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `groupIcon` to be a primitive type in the JSON string but got `%s`", jsonObj.get("groupIcon").toString()));
      }
      if (!jsonObj.get("groupId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `groupId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("groupId").toString()));
      }
      if (!jsonObj.get("groupName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `groupName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("groupName").toString()));
      }
      if (jsonObj.get("hydratedProducts") != null && !jsonObj.get("hydratedProducts").isJsonNull()) {
        JsonArray jsonArrayhydratedProducts = jsonObj.getAsJsonArray("hydratedProducts");
        if (jsonArrayhydratedProducts != null) {
          // ensure the json data is an array
          if (!jsonObj.get("hydratedProducts").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `hydratedProducts` to be an array in the JSON string but got `%s`", jsonObj.get("hydratedProducts").toString()));
          }

          // validate the optional field `hydratedProducts` (array)
          for (int i = 0; i < jsonArrayhydratedProducts.size(); i++) {
            Product.validateJsonObject(jsonArrayhydratedProducts.get(i).getAsJsonObject());
          };
        }
      }
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("imageId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `imageId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("imageId").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("listingVariants").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `listingVariants` to be an array in the JSON string but got `%s`", jsonObj.get("listingVariants").toString()));
      }

      JsonArray jsonArraylistingVariants = jsonObj.getAsJsonArray("listingVariants");
      // validate the required field `listingVariants` (array)
      for (int i = 0; i < jsonArraylistingVariants.size(); i++) {
        ProductListingVariant.validateJsonObject(jsonArraylistingVariants.get(i).getAsJsonObject());
      };
      // ensure the required json array is present
      if (jsonObj.get("productIds") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("productIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `productIds` to be an array in the JSON string but got `%s`", jsonObj.get("productIds").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("products") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("products").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `products` to be an array in the JSON string but got `%s`", jsonObj.get("products").toString()));
      }
      if (!jsonObj.get("sellerDisplayName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sellerDisplayName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sellerDisplayName").toString()));
      }
      if (!jsonObj.get("sellerId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sellerId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sellerId").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("storeIds") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("storeIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `storeIds` to be an array in the JSON string but got `%s`", jsonObj.get("storeIds").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("tags") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("tags").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `tags` to be an array in the JSON string but got `%s`", jsonObj.get("tags").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProductListing.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProductListing' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProductListing> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProductListing.class));

       return (TypeAdapter<T>) new TypeAdapter<ProductListing>() {
           @Override
           public void write(JsonWriter out, ProductListing value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ProductListing read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ProductListing given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ProductListing
  * @throws IOException if the JSON string is invalid with respect to ProductListing
  */
  public static ProductListing fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProductListing.class);
  }

 /**
  * Convert an instance of ProductListing to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

