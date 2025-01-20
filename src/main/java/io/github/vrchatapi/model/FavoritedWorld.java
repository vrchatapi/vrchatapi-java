/*
 * VRChat API Documentation
 *
 * The version of the OpenAPI document: 1.18.9
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
import io.github.vrchatapi.model.ReleaseStatus;
import io.github.vrchatapi.model.UnityPackage;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
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
 * 
 */
@ApiModel(description = "")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class FavoritedWorld {
  public static final String SERIALIZED_NAME_AUTHOR_ID = "authorId";
  @SerializedName(SERIALIZED_NAME_AUTHOR_ID)
  private String authorId;

  public static final String SERIALIZED_NAME_AUTHOR_NAME = "authorName";
  @SerializedName(SERIALIZED_NAME_AUTHOR_NAME)
  private String authorName;

  public static final String SERIALIZED_NAME_CAPACITY = "capacity";
  @SerializedName(SERIALIZED_NAME_CAPACITY)
  private Integer capacity;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_RECOMMENDED_CAPACITY = "recommendedCapacity";
  @SerializedName(SERIALIZED_NAME_RECOMMENDED_CAPACITY)
  private Integer recommendedCapacity;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_FAVORITES = "favorites";
  @SerializedName(SERIALIZED_NAME_FAVORITES)
  private Integer favorites = 0;

  public static final String SERIALIZED_NAME_FAVORITE_GROUP = "favoriteGroup";
  @SerializedName(SERIALIZED_NAME_FAVORITE_GROUP)
  private String favoriteGroup;

  public static final String SERIALIZED_NAME_FAVORITE_ID = "favoriteId";
  @SerializedName(SERIALIZED_NAME_FAVORITE_ID)
  private String favoriteId;

  public static final String SERIALIZED_NAME_FEATURED = "featured";
  @SerializedName(SERIALIZED_NAME_FEATURED)
  private Boolean featured = false;

  public static final String SERIALIZED_NAME_VISITS = "visits";
  @SerializedName(SERIALIZED_NAME_VISITS)
  private Integer visits = 0;

  public static final String SERIALIZED_NAME_HEAT = "heat";
  @SerializedName(SERIALIZED_NAME_HEAT)
  private Integer heat = 0;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_IMAGE_URL = "imageUrl";
  @SerializedName(SERIALIZED_NAME_IMAGE_URL)
  private String imageUrl;

  public static final String SERIALIZED_NAME_LABS_PUBLICATION_DATE = "labsPublicationDate";
  @SerializedName(SERIALIZED_NAME_LABS_PUBLICATION_DATE)
  private String labsPublicationDate;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_OCCUPANTS = "occupants";
  @SerializedName(SERIALIZED_NAME_OCCUPANTS)
  private Integer occupants = 0;

  public static final String SERIALIZED_NAME_ORGANIZATION = "organization";
  @SerializedName(SERIALIZED_NAME_ORGANIZATION)
  private String organization = "vrchat";

  public static final String SERIALIZED_NAME_POPULARITY = "popularity";
  @SerializedName(SERIALIZED_NAME_POPULARITY)
  private Integer popularity = 0;

  public static final String SERIALIZED_NAME_PREVIEW_YOUTUBE_ID = "previewYoutubeId";
  @SerializedName(SERIALIZED_NAME_PREVIEW_YOUTUBE_ID)
  private String previewYoutubeId;

  public static final String SERIALIZED_NAME_PUBLICATION_DATE = "publicationDate";
  @SerializedName(SERIALIZED_NAME_PUBLICATION_DATE)
  private String publicationDate;

  public static final String SERIALIZED_NAME_RELEASE_STATUS = "releaseStatus";
  @SerializedName(SERIALIZED_NAME_RELEASE_STATUS)
  private ReleaseStatus releaseStatus = ReleaseStatus.PUBLIC;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<String> tags = new ArrayList<>();

  public static final String SERIALIZED_NAME_THUMBNAIL_IMAGE_URL = "thumbnailImageUrl";
  @SerializedName(SERIALIZED_NAME_THUMBNAIL_IMAGE_URL)
  private String thumbnailImageUrl;

  public static final String SERIALIZED_NAME_UNITY_PACKAGES = "unityPackages";
  @SerializedName(SERIALIZED_NAME_UNITY_PACKAGES)
  private List<UnityPackage> unityPackages = new ArrayList<>();

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public static final String SERIALIZED_NAME_URL_LIST = "urlList";
  @SerializedName(SERIALIZED_NAME_URL_LIST)
  private List<String> urlList = new ArrayList<>();

  public static final String SERIALIZED_NAME_UDON_PRODUCTS = "udonProducts";
  @SerializedName(SERIALIZED_NAME_UDON_PRODUCTS)
  private List<String> udonProducts = null;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private Integer version;

  public FavoritedWorld() {
  }

  public FavoritedWorld authorId(String authorId) {
    
    this.authorId = authorId;
    return this;
  }

   /**
   * A users unique ID, usually in the form of &#x60;usr_c1644b5b-3ca4-45b4-97c6-a2a0de70d469&#x60;. Legacy players can have old IDs in the form of &#x60;8JoV9XEdpo&#x60;. The ID can never be changed.
   * @return authorId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "usr_c1644b5b-3ca4-45b4-97c6-a2a0de70d469", required = true, value = "A users unique ID, usually in the form of `usr_c1644b5b-3ca4-45b4-97c6-a2a0de70d469`. Legacy players can have old IDs in the form of `8JoV9XEdpo`. The ID can never be changed.")

  public String getAuthorId() {
    return authorId;
  }


  public void setAuthorId(String authorId) {
    this.authorId = authorId;
  }


  public FavoritedWorld authorName(String authorName) {
    
    this.authorName = authorName;
    return this;
  }

   /**
   * Get authorName
   * @return authorName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getAuthorName() {
    return authorName;
  }


  public void setAuthorName(String authorName) {
    this.authorName = authorName;
  }


  public FavoritedWorld capacity(Integer capacity) {
    
    this.capacity = capacity;
    return this;
  }

   /**
   * Get capacity
   * @return capacity
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "8", required = true, value = "")

  public Integer getCapacity() {
    return capacity;
  }


  public void setCapacity(Integer capacity) {
    this.capacity = capacity;
  }


  public FavoritedWorld description(String description) {
    
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


  public FavoritedWorld recommendedCapacity(Integer recommendedCapacity) {
    
    this.recommendedCapacity = recommendedCapacity;
    return this;
  }

   /**
   * Get recommendedCapacity
   * @return recommendedCapacity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "16", value = "")

  public Integer getRecommendedCapacity() {
    return recommendedCapacity;
  }


  public void setRecommendedCapacity(Integer recommendedCapacity) {
    this.recommendedCapacity = recommendedCapacity;
  }


  public FavoritedWorld createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public FavoritedWorld favorites(Integer favorites) {
    
    this.favorites = favorites;
    return this;
  }

   /**
   * Get favorites
   * minimum: 0
   * @return favorites
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "12024", required = true, value = "")

  public Integer getFavorites() {
    return favorites;
  }


  public void setFavorites(Integer favorites) {
    this.favorites = favorites;
  }


  public FavoritedWorld favoriteGroup(String favoriteGroup) {
    
    this.favoriteGroup = favoriteGroup;
    return this;
  }

   /**
   * Get favoriteGroup
   * @return favoriteGroup
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getFavoriteGroup() {
    return favoriteGroup;
  }


  public void setFavoriteGroup(String favoriteGroup) {
    this.favoriteGroup = favoriteGroup;
  }


  public FavoritedWorld favoriteId(String favoriteId) {
    
    this.favoriteId = favoriteId;
    return this;
  }

   /**
   * Get favoriteId
   * @return favoriteId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "fvrt_9568d189-8776-44a5-a8c8-defc981e44de", required = true, value = "")

  public String getFavoriteId() {
    return favoriteId;
  }


  public void setFavoriteId(String favoriteId) {
    this.favoriteId = favoriteId;
  }


  public FavoritedWorld featured(Boolean featured) {
    
    this.featured = featured;
    return this;
  }

   /**
   * Get featured
   * @return featured
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getFeatured() {
    return featured;
  }


  public void setFeatured(Boolean featured) {
    this.featured = featured;
  }


  public FavoritedWorld visits(Integer visits) {
    
    this.visits = visits;
    return this;
  }

   /**
   * Get visits
   * minimum: 0
   * @return visits
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "9988675", value = "")

  public Integer getVisits() {
    return visits;
  }


  public void setVisits(Integer visits) {
    this.visits = visits;
  }


  public FavoritedWorld heat(Integer heat) {
    
    this.heat = heat;
    return this;
  }

   /**
   * Get heat
   * minimum: 0
   * @return heat
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "5", required = true, value = "")

  public Integer getHeat() {
    return heat;
  }


  public void setHeat(Integer heat) {
    this.heat = heat;
  }


  public FavoritedWorld id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * WorldID be \&quot;offline\&quot; on User profiles if you are not friends with that user.
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "wrld_ba913a96-fac4-4048-a062-9aa5db092812", required = true, value = "WorldID be \"offline\" on User profiles if you are not friends with that user.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public FavoritedWorld imageUrl(String imageUrl) {
    
    this.imageUrl = imageUrl;
    return this;
  }

   /**
   * Get imageUrl
   * @return imageUrl
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getImageUrl() {
    return imageUrl;
  }


  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }


  public FavoritedWorld labsPublicationDate(String labsPublicationDate) {
    
    this.labsPublicationDate = labsPublicationDate;
    return this;
  }

   /**
   * Get labsPublicationDate
   * @return labsPublicationDate
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "none", required = true, value = "")

  public String getLabsPublicationDate() {
    return labsPublicationDate;
  }


  public void setLabsPublicationDate(String labsPublicationDate) {
    this.labsPublicationDate = labsPublicationDate;
  }


  public FavoritedWorld name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public FavoritedWorld occupants(Integer occupants) {
    
    this.occupants = occupants;
    return this;
  }

   /**
   * Get occupants
   * minimum: 0
   * @return occupants
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "47", required = true, value = "")

  public Integer getOccupants() {
    return occupants;
  }


  public void setOccupants(Integer occupants) {
    this.occupants = occupants;
  }


  public FavoritedWorld organization(String organization) {
    
    this.organization = organization;
    return this;
  }

   /**
   * Get organization
   * @return organization
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getOrganization() {
    return organization;
  }


  public void setOrganization(String organization) {
    this.organization = organization;
  }


  public FavoritedWorld popularity(Integer popularity) {
    
    this.popularity = popularity;
    return this;
  }

   /**
   * Get popularity
   * minimum: 0
   * @return popularity
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "8", required = true, value = "")

  public Integer getPopularity() {
    return popularity;
  }


  public void setPopularity(Integer popularity) {
    this.popularity = popularity;
  }


  public FavoritedWorld previewYoutubeId(String previewYoutubeId) {
    
    this.previewYoutubeId = previewYoutubeId;
    return this;
  }

   /**
   * Get previewYoutubeId
   * @return previewYoutubeId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPreviewYoutubeId() {
    return previewYoutubeId;
  }


  public void setPreviewYoutubeId(String previewYoutubeId) {
    this.previewYoutubeId = previewYoutubeId;
  }


  public FavoritedWorld publicationDate(String publicationDate) {
    
    this.publicationDate = publicationDate;
    return this;
  }

   /**
   * Get publicationDate
   * @return publicationDate
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "none", required = true, value = "")

  public String getPublicationDate() {
    return publicationDate;
  }


  public void setPublicationDate(String publicationDate) {
    this.publicationDate = publicationDate;
  }


  public FavoritedWorld releaseStatus(ReleaseStatus releaseStatus) {
    
    this.releaseStatus = releaseStatus;
    return this;
  }

   /**
   * Get releaseStatus
   * @return releaseStatus
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public ReleaseStatus getReleaseStatus() {
    return releaseStatus;
  }


  public void setReleaseStatus(ReleaseStatus releaseStatus) {
    this.releaseStatus = releaseStatus;
  }


  public FavoritedWorld tags(List<String> tags) {
    
    this.tags = tags;
    return this;
  }

  public FavoritedWorld addTagsItem(String tagsItem) {
    this.tags.add(tagsItem);
    return this;
  }

   /**
   *  
   * @return tags
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = " ")

  public List<String> getTags() {
    return tags;
  }


  public void setTags(List<String> tags) {
    this.tags = tags;
  }


  public FavoritedWorld thumbnailImageUrl(String thumbnailImageUrl) {
    
    this.thumbnailImageUrl = thumbnailImageUrl;
    return this;
  }

   /**
   * Get thumbnailImageUrl
   * @return thumbnailImageUrl
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getThumbnailImageUrl() {
    return thumbnailImageUrl;
  }


  public void setThumbnailImageUrl(String thumbnailImageUrl) {
    this.thumbnailImageUrl = thumbnailImageUrl;
  }


  public FavoritedWorld unityPackages(List<UnityPackage> unityPackages) {
    
    this.unityPackages = unityPackages;
    return this;
  }

  public FavoritedWorld addUnityPackagesItem(UnityPackage unityPackagesItem) {
    this.unityPackages.add(unityPackagesItem);
    return this;
  }

   /**
   *  
   * @return unityPackages
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = " ")

  public List<UnityPackage> getUnityPackages() {
    return unityPackages;
  }


  public void setUnityPackages(List<UnityPackage> unityPackages) {
    this.unityPackages = unityPackages;
  }


  public FavoritedWorld updatedAt(OffsetDateTime updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  public FavoritedWorld urlList(List<String> urlList) {
    
    this.urlList = urlList;
    return this;
  }

  public FavoritedWorld addUrlListItem(String urlListItem) {
    this.urlList.add(urlListItem);
    return this;
  }

   /**
   * Get urlList
   * @return urlList
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<String> getUrlList() {
    return urlList;
  }


  public void setUrlList(List<String> urlList) {
    this.urlList = urlList;
  }


  public FavoritedWorld udonProducts(List<String> udonProducts) {
    
    this.udonProducts = udonProducts;
    return this;
  }

  public FavoritedWorld addUdonProductsItem(String udonProductsItem) {
    if (this.udonProducts == null) {
      this.udonProducts = new ArrayList<>();
    }
    this.udonProducts.add(udonProductsItem);
    return this;
  }

   /**
   * Get udonProducts
   * @return udonProducts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getUdonProducts() {
    return udonProducts;
  }


  public void setUdonProducts(List<String> udonProducts) {
    this.udonProducts = udonProducts;
  }


  public FavoritedWorld version(Integer version) {
    
    this.version = version;
    return this;
  }

   /**
   * Get version
   * minimum: 1
   * @return version
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getVersion() {
    return version;
  }


  public void setVersion(Integer version) {
    this.version = version;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FavoritedWorld favoritedWorld = (FavoritedWorld) o;
    return Objects.equals(this.authorId, favoritedWorld.authorId) &&
        Objects.equals(this.authorName, favoritedWorld.authorName) &&
        Objects.equals(this.capacity, favoritedWorld.capacity) &&
        Objects.equals(this.description, favoritedWorld.description) &&
        Objects.equals(this.recommendedCapacity, favoritedWorld.recommendedCapacity) &&
        Objects.equals(this.createdAt, favoritedWorld.createdAt) &&
        Objects.equals(this.favorites, favoritedWorld.favorites) &&
        Objects.equals(this.favoriteGroup, favoritedWorld.favoriteGroup) &&
        Objects.equals(this.favoriteId, favoritedWorld.favoriteId) &&
        Objects.equals(this.featured, favoritedWorld.featured) &&
        Objects.equals(this.visits, favoritedWorld.visits) &&
        Objects.equals(this.heat, favoritedWorld.heat) &&
        Objects.equals(this.id, favoritedWorld.id) &&
        Objects.equals(this.imageUrl, favoritedWorld.imageUrl) &&
        Objects.equals(this.labsPublicationDate, favoritedWorld.labsPublicationDate) &&
        Objects.equals(this.name, favoritedWorld.name) &&
        Objects.equals(this.occupants, favoritedWorld.occupants) &&
        Objects.equals(this.organization, favoritedWorld.organization) &&
        Objects.equals(this.popularity, favoritedWorld.popularity) &&
        Objects.equals(this.previewYoutubeId, favoritedWorld.previewYoutubeId) &&
        Objects.equals(this.publicationDate, favoritedWorld.publicationDate) &&
        Objects.equals(this.releaseStatus, favoritedWorld.releaseStatus) &&
        Objects.equals(this.tags, favoritedWorld.tags) &&
        Objects.equals(this.thumbnailImageUrl, favoritedWorld.thumbnailImageUrl) &&
        Objects.equals(this.unityPackages, favoritedWorld.unityPackages) &&
        Objects.equals(this.updatedAt, favoritedWorld.updatedAt) &&
        Objects.equals(this.urlList, favoritedWorld.urlList) &&
        Objects.equals(this.udonProducts, favoritedWorld.udonProducts) &&
        Objects.equals(this.version, favoritedWorld.version);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(authorId, authorName, capacity, description, recommendedCapacity, createdAt, favorites, favoriteGroup, favoriteId, featured, visits, heat, id, imageUrl, labsPublicationDate, name, occupants, organization, popularity, previewYoutubeId, publicationDate, releaseStatus, tags, thumbnailImageUrl, unityPackages, updatedAt, urlList, udonProducts, version);
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
    sb.append("class FavoritedWorld {\n");
    sb.append("    authorId: ").append(toIndentedString(authorId)).append("\n");
    sb.append("    authorName: ").append(toIndentedString(authorName)).append("\n");
    sb.append("    capacity: ").append(toIndentedString(capacity)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    recommendedCapacity: ").append(toIndentedString(recommendedCapacity)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    favorites: ").append(toIndentedString(favorites)).append("\n");
    sb.append("    favoriteGroup: ").append(toIndentedString(favoriteGroup)).append("\n");
    sb.append("    favoriteId: ").append(toIndentedString(favoriteId)).append("\n");
    sb.append("    featured: ").append(toIndentedString(featured)).append("\n");
    sb.append("    visits: ").append(toIndentedString(visits)).append("\n");
    sb.append("    heat: ").append(toIndentedString(heat)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
    sb.append("    labsPublicationDate: ").append(toIndentedString(labsPublicationDate)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    occupants: ").append(toIndentedString(occupants)).append("\n");
    sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
    sb.append("    popularity: ").append(toIndentedString(popularity)).append("\n");
    sb.append("    previewYoutubeId: ").append(toIndentedString(previewYoutubeId)).append("\n");
    sb.append("    publicationDate: ").append(toIndentedString(publicationDate)).append("\n");
    sb.append("    releaseStatus: ").append(toIndentedString(releaseStatus)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    thumbnailImageUrl: ").append(toIndentedString(thumbnailImageUrl)).append("\n");
    sb.append("    unityPackages: ").append(toIndentedString(unityPackages)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    urlList: ").append(toIndentedString(urlList)).append("\n");
    sb.append("    udonProducts: ").append(toIndentedString(udonProducts)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
    openapiFields.add("authorId");
    openapiFields.add("authorName");
    openapiFields.add("capacity");
    openapiFields.add("description");
    openapiFields.add("recommendedCapacity");
    openapiFields.add("created_at");
    openapiFields.add("favorites");
    openapiFields.add("favoriteGroup");
    openapiFields.add("favoriteId");
    openapiFields.add("featured");
    openapiFields.add("visits");
    openapiFields.add("heat");
    openapiFields.add("id");
    openapiFields.add("imageUrl");
    openapiFields.add("labsPublicationDate");
    openapiFields.add("name");
    openapiFields.add("occupants");
    openapiFields.add("organization");
    openapiFields.add("popularity");
    openapiFields.add("previewYoutubeId");
    openapiFields.add("publicationDate");
    openapiFields.add("releaseStatus");
    openapiFields.add("tags");
    openapiFields.add("thumbnailImageUrl");
    openapiFields.add("unityPackages");
    openapiFields.add("updated_at");
    openapiFields.add("urlList");
    openapiFields.add("udonProducts");
    openapiFields.add("version");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("authorId");
    openapiRequiredFields.add("authorName");
    openapiRequiredFields.add("capacity");
    openapiRequiredFields.add("description");
    openapiRequiredFields.add("created_at");
    openapiRequiredFields.add("favorites");
    openapiRequiredFields.add("favoriteGroup");
    openapiRequiredFields.add("favoriteId");
    openapiRequiredFields.add("featured");
    openapiRequiredFields.add("heat");
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("imageUrl");
    openapiRequiredFields.add("labsPublicationDate");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("occupants");
    openapiRequiredFields.add("organization");
    openapiRequiredFields.add("popularity");
    openapiRequiredFields.add("publicationDate");
    openapiRequiredFields.add("releaseStatus");
    openapiRequiredFields.add("tags");
    openapiRequiredFields.add("thumbnailImageUrl");
    openapiRequiredFields.add("unityPackages");
    openapiRequiredFields.add("updated_at");
    openapiRequiredFields.add("urlList");
    openapiRequiredFields.add("version");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to FavoritedWorld
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!FavoritedWorld.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in FavoritedWorld is not found in the empty JSON string", FavoritedWorld.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!FavoritedWorld.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `FavoritedWorld` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : FavoritedWorld.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("authorId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `authorId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("authorId").toString()));
      }
      if (!jsonObj.get("authorName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `authorName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("authorName").toString()));
      }
      if (!jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if (!jsonObj.get("favoriteGroup").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `favoriteGroup` to be a primitive type in the JSON string but got `%s`", jsonObj.get("favoriteGroup").toString()));
      }
      if (!jsonObj.get("favoriteId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `favoriteId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("favoriteId").toString()));
      }
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("imageUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `imageUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("imageUrl").toString()));
      }
      if (!jsonObj.get("labsPublicationDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `labsPublicationDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("labsPublicationDate").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("organization").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `organization` to be a primitive type in the JSON string but got `%s`", jsonObj.get("organization").toString()));
      }
      if ((jsonObj.get("previewYoutubeId") != null && !jsonObj.get("previewYoutubeId").isJsonNull()) && !jsonObj.get("previewYoutubeId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `previewYoutubeId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("previewYoutubeId").toString()));
      }
      if (!jsonObj.get("publicationDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `publicationDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("publicationDate").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("tags") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("tags").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `tags` to be an array in the JSON string but got `%s`", jsonObj.get("tags").toString()));
      }
      if (!jsonObj.get("thumbnailImageUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `thumbnailImageUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("thumbnailImageUrl").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("unityPackages").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `unityPackages` to be an array in the JSON string but got `%s`", jsonObj.get("unityPackages").toString()));
      }

      JsonArray jsonArrayunityPackages = jsonObj.getAsJsonArray("unityPackages");
      // validate the required field `unityPackages` (array)
      for (int i = 0; i < jsonArrayunityPackages.size(); i++) {
        UnityPackage.validateJsonObject(jsonArrayunityPackages.get(i).getAsJsonObject());
      };
      // ensure the required json array is present
      if (jsonObj.get("urlList") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("urlList").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `urlList` to be an array in the JSON string but got `%s`", jsonObj.get("urlList").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("udonProducts") != null && !jsonObj.get("udonProducts").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `udonProducts` to be an array in the JSON string but got `%s`", jsonObj.get("udonProducts").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FavoritedWorld.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FavoritedWorld' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FavoritedWorld> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FavoritedWorld.class));

       return (TypeAdapter<T>) new TypeAdapter<FavoritedWorld>() {
           @Override
           public void write(JsonWriter out, FavoritedWorld value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FavoritedWorld read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FavoritedWorld given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FavoritedWorld
  * @throws IOException if the JSON string is invalid with respect to FavoritedWorld
  */
  public static FavoritedWorld fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FavoritedWorld.class);
  }

 /**
  * Convert an instance of FavoritedWorld to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

