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
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets MIMEType
 */
@JsonAdapter(MIMEType.Adapter.class)
public enum MIMEType {
  
  IMAGE_JPEG("image/jpeg"),
  
  IMAGE_JPG("image/jpg"),
  
  IMAGE_PNG("image/png"),
  
  IMAGE_WEBP("image/webp"),
  
  IMAGE_GIF("image/gif"),
  
  IMAGE_BMP("image/bmp"),
  
  IMAGE_SVG_XML("image/svg＋xml"),
  
  IMAGE_TIFF("image/tiff"),
  
  APPLICATION_X_AVATAR("application/x-avatar"),
  
  APPLICATION_X_WORLD("application/x-world"),
  
  APPLICATION_GZIP("application/gzip"),
  
  APPLICATION_X_RSYNC_SIGNATURE("application/x-rsync-signature"),
  
  APPLICATION_X_RSYNC_DELTA("application/x-rsync-delta"),
  
  APPLICATION_OCTET_STREAM("application/octet-stream");

  private String value;

  MIMEType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static MIMEType fromValue(String value) {
    for (MIMEType b : MIMEType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<MIMEType> {
    @Override
    public void write(final JsonWriter jsonWriter, final MIMEType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public MIMEType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return MIMEType.fromValue(value);
    }
  }
}

