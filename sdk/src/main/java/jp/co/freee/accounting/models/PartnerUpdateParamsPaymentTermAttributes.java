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
 * PartnerUpdateParamsPaymentTermAttributes
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PartnerUpdateParamsPaymentTermAttributes {
  public static final String SERIALIZED_NAME_ADDITIONAL_MONTHS = "additional_months";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_MONTHS)
  private Integer additionalMonths;

  public static final String SERIALIZED_NAME_CUTOFF_DAY = "cutoff_day";
  @SerializedName(SERIALIZED_NAME_CUTOFF_DAY)
  private Integer cutoffDay;

  public static final String SERIALIZED_NAME_FIXED_DAY = "fixed_day";
  @SerializedName(SERIALIZED_NAME_FIXED_DAY)
  private Integer fixedDay;

  public PartnerUpdateParamsPaymentTermAttributes() { 
  }

  public PartnerUpdateParamsPaymentTermAttributes additionalMonths(Integer additionalMonths) {
    
    this.additionalMonths = additionalMonths;
    return this;
  }

   /**
   * 支払月
   * minimum: 1
   * maximum: 6
   * @return additionalMonths
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "支払月")

  public Integer getAdditionalMonths() {
    return additionalMonths;
  }


  public void setAdditionalMonths(Integer additionalMonths) {
    this.additionalMonths = additionalMonths;
  }


  public PartnerUpdateParamsPaymentTermAttributes cutoffDay(Integer cutoffDay) {
    
    this.cutoffDay = cutoffDay;
    return this;
  }

   /**
   * 締め日（29, 30, 31日の末日を指定する場合は、32を指定してください。）
   * minimum: 1
   * maximum: 32
   * @return cutoffDay
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "15", value = "締め日（29, 30, 31日の末日を指定する場合は、32を指定してください。）")

  public Integer getCutoffDay() {
    return cutoffDay;
  }


  public void setCutoffDay(Integer cutoffDay) {
    this.cutoffDay = cutoffDay;
  }


  public PartnerUpdateParamsPaymentTermAttributes fixedDay(Integer fixedDay) {
    
    this.fixedDay = fixedDay;
    return this;
  }

   /**
   * 支払日（29, 30, 31日の末日を指定する場合は、32を指定してください。）
   * minimum: 1
   * maximum: 32
   * @return fixedDay
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "32", value = "支払日（29, 30, 31日の末日を指定する場合は、32を指定してください。）")

  public Integer getFixedDay() {
    return fixedDay;
  }


  public void setFixedDay(Integer fixedDay) {
    this.fixedDay = fixedDay;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PartnerUpdateParamsPaymentTermAttributes partnerUpdateParamsPaymentTermAttributes = (PartnerUpdateParamsPaymentTermAttributes) o;
    return Objects.equals(this.additionalMonths, partnerUpdateParamsPaymentTermAttributes.additionalMonths) &&
        Objects.equals(this.cutoffDay, partnerUpdateParamsPaymentTermAttributes.cutoffDay) &&
        Objects.equals(this.fixedDay, partnerUpdateParamsPaymentTermAttributes.fixedDay);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalMonths, cutoffDay, fixedDay);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PartnerUpdateParamsPaymentTermAttributes {\n");
    sb.append("    additionalMonths: ").append(toIndentedString(additionalMonths)).append("\n");
    sb.append("    cutoffDay: ").append(toIndentedString(cutoffDay)).append("\n");
    sb.append("    fixedDay: ").append(toIndentedString(fixedDay)).append("\n");
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

