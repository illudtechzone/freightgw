package com.illud.freightgw.client.freight.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.illud.freightgw.client.freight.model.Pricing;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * FulldayPricing
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-11-06T12:13:58.879+05:30[Asia/Calcutta]")
@Document (indexName="fulldaypricing")
public class FulldayPricing   {
  @JsonProperty("endLimitInHour")
  private Double endLimitInHour = null;

  @JsonProperty("endLimitInKms")
  private Double endLimitInKms = null;

  @JsonProperty("id")
  private Long id = null;

  /**
   * Gets or Sets limitStatus
   */
  public enum LimitStatusEnum {
    BETWEEN("BETWEEN"),
    
    ABOVE("ABOVE");

    private String value;

    LimitStatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static LimitStatusEnum fromValue(String text) {
      for (LimitStatusEnum b : LimitStatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("limitStatus")
  private LimitStatusEnum limitStatus = null;

  @JsonProperty("pricing")
  private Pricing pricing = null;

  @JsonProperty("ratePerKm")
  private Double ratePerKm = null;

  @JsonProperty("ratePerMinsAboveLimit")
  private Double ratePerMinsAboveLimit = null;

  @JsonProperty("startLimitInHour")
  private Double startLimitInHour = null;

  @JsonProperty("startLimitInKms")
  private Double startLimitInKms = null;

  public FulldayPricing endLimitInHour(Double endLimitInHour) {
    this.endLimitInHour = endLimitInHour;
    return this;
  }

  /**
   * Get endLimitInHour
   * @return endLimitInHour
  **/
  @ApiModelProperty(value = "")


  public Double getEndLimitInHour() {
    return endLimitInHour;
  }

  public void setEndLimitInHour(Double endLimitInHour) {
    this.endLimitInHour = endLimitInHour;
  }

  public FulldayPricing endLimitInKms(Double endLimitInKms) {
    this.endLimitInKms = endLimitInKms;
    return this;
  }

  /**
   * Get endLimitInKms
   * @return endLimitInKms
  **/
  @ApiModelProperty(value = "")


  public Double getEndLimitInKms() {
    return endLimitInKms;
  }

  public void setEndLimitInKms(Double endLimitInKms) {
    this.endLimitInKms = endLimitInKms;
  }

  public FulldayPricing id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public FulldayPricing limitStatus(LimitStatusEnum limitStatus) {
    this.limitStatus = limitStatus;
    return this;
  }

  /**
   * Get limitStatus
   * @return limitStatus
  **/
  @ApiModelProperty(value = "")


  public LimitStatusEnum getLimitStatus() {
    return limitStatus;
  }

  public void setLimitStatus(LimitStatusEnum limitStatus) {
    this.limitStatus = limitStatus;
  }

  public FulldayPricing pricing(Pricing pricing) {
    this.pricing = pricing;
    return this;
  }

  /**
   * Get pricing
   * @return pricing
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Pricing getPricing() {
    return pricing;
  }

  public void setPricing(Pricing pricing) {
    this.pricing = pricing;
  }

  public FulldayPricing ratePerKm(Double ratePerKm) {
    this.ratePerKm = ratePerKm;
    return this;
  }

  /**
   * Get ratePerKm
   * @return ratePerKm
  **/
  @ApiModelProperty(value = "")


  public Double getRatePerKm() {
    return ratePerKm;
  }

  public void setRatePerKm(Double ratePerKm) {
    this.ratePerKm = ratePerKm;
  }

  public FulldayPricing ratePerMinsAboveLimit(Double ratePerMinsAboveLimit) {
    this.ratePerMinsAboveLimit = ratePerMinsAboveLimit;
    return this;
  }

  /**
   * Get ratePerMinsAboveLimit
   * @return ratePerMinsAboveLimit
  **/
  @ApiModelProperty(value = "")


  public Double getRatePerMinsAboveLimit() {
    return ratePerMinsAboveLimit;
  }

  public void setRatePerMinsAboveLimit(Double ratePerMinsAboveLimit) {
    this.ratePerMinsAboveLimit = ratePerMinsAboveLimit;
  }

  public FulldayPricing startLimitInHour(Double startLimitInHour) {
    this.startLimitInHour = startLimitInHour;
    return this;
  }

  /**
   * Get startLimitInHour
   * @return startLimitInHour
  **/
  @ApiModelProperty(value = "")


  public Double getStartLimitInHour() {
    return startLimitInHour;
  }

  public void setStartLimitInHour(Double startLimitInHour) {
    this.startLimitInHour = startLimitInHour;
  }

  public FulldayPricing startLimitInKms(Double startLimitInKms) {
    this.startLimitInKms = startLimitInKms;
    return this;
  }

  /**
   * Get startLimitInKms
   * @return startLimitInKms
  **/
  @ApiModelProperty(value = "")


  public Double getStartLimitInKms() {
    return startLimitInKms;
  }

  public void setStartLimitInKms(Double startLimitInKms) {
    this.startLimitInKms = startLimitInKms;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FulldayPricing fulldayPricing = (FulldayPricing) o;
    return Objects.equals(this.endLimitInHour, fulldayPricing.endLimitInHour) &&
        Objects.equals(this.endLimitInKms, fulldayPricing.endLimitInKms) &&
        Objects.equals(this.id, fulldayPricing.id) &&
        Objects.equals(this.limitStatus, fulldayPricing.limitStatus) &&
        Objects.equals(this.pricing, fulldayPricing.pricing) &&
        Objects.equals(this.ratePerKm, fulldayPricing.ratePerKm) &&
        Objects.equals(this.ratePerMinsAboveLimit, fulldayPricing.ratePerMinsAboveLimit) &&
        Objects.equals(this.startLimitInHour, fulldayPricing.startLimitInHour) &&
        Objects.equals(this.startLimitInKms, fulldayPricing.startLimitInKms);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endLimitInHour, endLimitInKms, id, limitStatus, pricing, ratePerKm, ratePerMinsAboveLimit, startLimitInHour, startLimitInKms);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FulldayPricing {\n");
    
    sb.append("    endLimitInHour: ").append(toIndentedString(endLimitInHour)).append("\n");
    sb.append("    endLimitInKms: ").append(toIndentedString(endLimitInKms)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    limitStatus: ").append(toIndentedString(limitStatus)).append("\n");
    sb.append("    pricing: ").append(toIndentedString(pricing)).append("\n");
    sb.append("    ratePerKm: ").append(toIndentedString(ratePerKm)).append("\n");
    sb.append("    ratePerMinsAboveLimit: ").append(toIndentedString(ratePerMinsAboveLimit)).append("\n");
    sb.append("    startLimitInHour: ").append(toIndentedString(startLimitInHour)).append("\n");
    sb.append("    startLimitInKms: ").append(toIndentedString(startLimitInKms)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

