/*
 * e-KYC API
 * e-KYC API , GST verification suite
 *
 * The version of the OpenAPI document: v1
 * Contact: gautam@balajimariline.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * UidiaRequestBody
 */
@JsonPropertyOrder({
  UidiaRequestBody.JSON_PROPERTY_UNIQUE_ID,
  UidiaRequestBody.JSON_PROPERTY_UID
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-08-02T01:38:15.284014500+05:30[Asia/Calcutta]")
public class UidiaRequestBody {
  public static final String JSON_PROPERTY_UNIQUE_ID = "uniqueId";
  private String uniqueId;

  public static final String JSON_PROPERTY_UID = "uid";
  private String uid;

  public UidiaRequestBody() {
  }

  public UidiaRequestBody uniqueId(String uniqueId) {
    
    this.uniqueId = uniqueId;
    return this;
  }

   /**
   * Get uniqueId
   * @return uniqueId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UNIQUE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUniqueId() {
    return uniqueId;
  }


  @JsonProperty(JSON_PROPERTY_UNIQUE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUniqueId(String uniqueId) {
    this.uniqueId = uniqueId;
  }


  public UidiaRequestBody uid(String uid) {
    
    this.uid = uid;
    return this;
  }

   /**
   * Get uid
   * @return uid
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUid() {
    return uid;
  }


  @JsonProperty(JSON_PROPERTY_UID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUid(String uid) {
    this.uid = uid;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UidiaRequestBody uidiaRequestBody = (UidiaRequestBody) o;
    return Objects.equals(this.uniqueId, uidiaRequestBody.uniqueId) &&
        Objects.equals(this.uid, uidiaRequestBody.uid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uniqueId, uid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UidiaRequestBody {\n");
    sb.append("    uniqueId: ").append(toIndentedString(uniqueId)).append("\n");
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
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

