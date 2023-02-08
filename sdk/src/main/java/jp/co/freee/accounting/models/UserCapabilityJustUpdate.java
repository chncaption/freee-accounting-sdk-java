/*
 * freee API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.freee.accounting.models;

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

/**
 * UserCapabilityJustUpdate
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UserCapabilityJustUpdate {
  public static final String SERIALIZED_NAME_UPDATE = "update";
  @SerializedName(SERIALIZED_NAME_UPDATE)
  private Boolean update;

  public UserCapabilityJustUpdate() { 
  }

  public UserCapabilityJustUpdate update(Boolean update) {
    
    this.update = update;
    return this;
  }

   /**
   * 更新
   * @return update
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "更新")

  public Boolean getUpdate() {
    return update;
  }


  public void setUpdate(Boolean update) {
    this.update = update;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserCapabilityJustUpdate userCapabilityJustUpdate = (UserCapabilityJustUpdate) o;
    return Objects.equals(this.update, userCapabilityJustUpdate.update);
  }

  @Override
  public int hashCode() {
    return Objects.hash(update);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserCapabilityJustUpdate {\n");
    sb.append("    update: ").append(toIndentedString(update)).append("\n");
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

