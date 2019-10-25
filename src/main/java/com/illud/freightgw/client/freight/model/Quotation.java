package com.illud.freightgw.client.freight.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Quotation
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-10-25T10:41:54.345+05:30[Asia/Calcutta]")

public class Quotation   {
  @JsonProperty("amount")
  private Double amount = null;

  @JsonProperty("companyId")
  private Long companyId = null;

  @JsonProperty("deliveryDate")
  private LocalDate deliveryDate = null;

  @JsonProperty("freightId")
  private Long freightId = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("vehicleId")
  private Long vehicleId = null;

  public Quotation amount(Double amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Get amount
   * @return amount
  **/
  @ApiModelProperty(value = "")


  public Double getAmount() {
    return amount;
  }

  public void setAmount(Double amount) {
    this.amount = amount;
  }

  public Quotation companyId(Long companyId) {
    this.companyId = companyId;
    return this;
  }

  /**
   * Get companyId
   * @return companyId
  **/
  @ApiModelProperty(value = "")


  public Long getCompanyId() {
    return companyId;
  }

  public void setCompanyId(Long companyId) {
    this.companyId = companyId;
  }

  public Quotation deliveryDate(LocalDate deliveryDate) {
    this.deliveryDate = deliveryDate;
    return this;
  }

  /**
   * Get deliveryDate
   * @return deliveryDate
  **/
  @ApiModelProperty(value = "")

  @Valid

  public LocalDate getDeliveryDate() {
    return deliveryDate;
  }

  public void setDeliveryDate(LocalDate deliveryDate) {
    this.deliveryDate = deliveryDate;
  }

  public Quotation freightId(Long freightId) {
    this.freightId = freightId;
    return this;
  }

  /**
   * Get freightId
   * @return freightId
  **/
  @ApiModelProperty(value = "")


  public Long getFreightId() {
    return freightId;
  }

  public void setFreightId(Long freightId) {
    this.freightId = freightId;
  }

  public Quotation id(Long id) {
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

  public Quotation vehicleId(Long vehicleId) {
    this.vehicleId = vehicleId;
    return this;
  }

  /**
   * Get vehicleId
   * @return vehicleId
  **/
  @ApiModelProperty(value = "")


  public Long getVehicleId() {
    return vehicleId;
  }

  public void setVehicleId(Long vehicleId) {
    this.vehicleId = vehicleId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Quotation quotation = (Quotation) o;
    return Objects.equals(this.amount, quotation.amount) &&
        Objects.equals(this.companyId, quotation.companyId) &&
        Objects.equals(this.deliveryDate, quotation.deliveryDate) &&
        Objects.equals(this.freightId, quotation.freightId) &&
        Objects.equals(this.id, quotation.id) &&
        Objects.equals(this.vehicleId, quotation.vehicleId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, companyId, deliveryDate, freightId, id, vehicleId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Quotation {\n");
    
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
    sb.append("    deliveryDate: ").append(toIndentedString(deliveryDate)).append("\n");
    sb.append("    freightId: ").append(toIndentedString(freightId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    vehicleId: ").append(toIndentedString(vehicleId)).append("\n");
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

