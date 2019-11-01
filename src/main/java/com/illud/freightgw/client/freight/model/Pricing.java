package com.illud.freightgw.client.freight.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.illud.freightgw.client.freight.model.FulldayPricing;
import com.illud.freightgw.client.freight.model.NormalPricing;
import com.illud.freightgw.client.freight.model.VehicleLookUp;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Pricing
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-11-01T16:09:11.113+05:30[Asia/Calcutta]")

public class Pricing   {
  @JsonProperty("additionalDescription")
  private String additionalDescription = null;

  @JsonProperty("basicRate")
  private Double basicRate = null;

  @JsonProperty("freeWaitingInMins")
  private Long freeWaitingInMins = null;

  @JsonProperty("fulldayPricings")
  @Valid
  private List<FulldayPricing> fulldayPricings = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("nightSurchargeInMins")
  private Double nightSurchargeInMins = null;

  @JsonProperty("normalPricings")
  @Valid
  private List<NormalPricing> normalPricings = null;

  /**
   * Gets or Sets ratePlan
   */
  public enum RatePlanEnum {
    NORMAL("NORMAL"),
    
    FULL_DAY("FULL_DAY");

    private String value;

    RatePlanEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static RatePlanEnum fromValue(String text) {
      for (RatePlanEnum b : RatePlanEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("ratePlan")
  private RatePlanEnum ratePlan = null;

  @JsonProperty("vehicles")
  @Valid
  private List<VehicleLookUp> vehicles = null;

  @JsonProperty("waitingChargeInMins")
  private Double waitingChargeInMins = null;

  public Pricing additionalDescription(String additionalDescription) {
    this.additionalDescription = additionalDescription;
    return this;
  }

  /**
   * Get additionalDescription
   * @return additionalDescription
  **/
  @ApiModelProperty(value = "")


  public String getAdditionalDescription() {
    return additionalDescription;
  }

  public void setAdditionalDescription(String additionalDescription) {
    this.additionalDescription = additionalDescription;
  }

  public Pricing basicRate(Double basicRate) {
    this.basicRate = basicRate;
    return this;
  }

  /**
   * Get basicRate
   * @return basicRate
  **/
  @ApiModelProperty(value = "")


  public Double getBasicRate() {
    return basicRate;
  }

  public void setBasicRate(Double basicRate) {
    this.basicRate = basicRate;
  }

  public Pricing freeWaitingInMins(Long freeWaitingInMins) {
    this.freeWaitingInMins = freeWaitingInMins;
    return this;
  }

  /**
   * Get freeWaitingInMins
   * @return freeWaitingInMins
  **/
  @ApiModelProperty(value = "")


  public Long getFreeWaitingInMins() {
    return freeWaitingInMins;
  }

  public void setFreeWaitingInMins(Long freeWaitingInMins) {
    this.freeWaitingInMins = freeWaitingInMins;
  }

  public Pricing fulldayPricings(List<FulldayPricing> fulldayPricings) {
    this.fulldayPricings = fulldayPricings;
    return this;
  }

  public Pricing addFulldayPricingsItem(FulldayPricing fulldayPricingsItem) {
    if (this.fulldayPricings == null) {
      this.fulldayPricings = new ArrayList<FulldayPricing>();
    }
    this.fulldayPricings.add(fulldayPricingsItem);
    return this;
  }

  /**
   * Get fulldayPricings
   * @return fulldayPricings
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<FulldayPricing> getFulldayPricings() {
    return fulldayPricings;
  }

  public void setFulldayPricings(List<FulldayPricing> fulldayPricings) {
    this.fulldayPricings = fulldayPricings;
  }

  public Pricing id(Long id) {
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

  public Pricing nightSurchargeInMins(Double nightSurchargeInMins) {
    this.nightSurchargeInMins = nightSurchargeInMins;
    return this;
  }

  /**
   * Get nightSurchargeInMins
   * @return nightSurchargeInMins
  **/
  @ApiModelProperty(value = "")


  public Double getNightSurchargeInMins() {
    return nightSurchargeInMins;
  }

  public void setNightSurchargeInMins(Double nightSurchargeInMins) {
    this.nightSurchargeInMins = nightSurchargeInMins;
  }

  public Pricing normalPricings(List<NormalPricing> normalPricings) {
    this.normalPricings = normalPricings;
    return this;
  }

  public Pricing addNormalPricingsItem(NormalPricing normalPricingsItem) {
    if (this.normalPricings == null) {
      this.normalPricings = new ArrayList<NormalPricing>();
    }
    this.normalPricings.add(normalPricingsItem);
    return this;
  }

  /**
   * Get normalPricings
   * @return normalPricings
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<NormalPricing> getNormalPricings() {
    return normalPricings;
  }

  public void setNormalPricings(List<NormalPricing> normalPricings) {
    this.normalPricings = normalPricings;
  }

  public Pricing ratePlan(RatePlanEnum ratePlan) {
    this.ratePlan = ratePlan;
    return this;
  }

  /**
   * Get ratePlan
   * @return ratePlan
  **/
  @ApiModelProperty(value = "")


  public RatePlanEnum getRatePlan() {
    return ratePlan;
  }

  public void setRatePlan(RatePlanEnum ratePlan) {
    this.ratePlan = ratePlan;
  }

  public Pricing vehicles(List<VehicleLookUp> vehicles) {
    this.vehicles = vehicles;
    return this;
  }

  public Pricing addVehiclesItem(VehicleLookUp vehiclesItem) {
    if (this.vehicles == null) {
      this.vehicles = new ArrayList<VehicleLookUp>();
    }
    this.vehicles.add(vehiclesItem);
    return this;
  }

  /**
   * Get vehicles
   * @return vehicles
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<VehicleLookUp> getVehicles() {
    return vehicles;
  }

  public void setVehicles(List<VehicleLookUp> vehicles) {
    this.vehicles = vehicles;
  }

  public Pricing waitingChargeInMins(Double waitingChargeInMins) {
    this.waitingChargeInMins = waitingChargeInMins;
    return this;
  }

  /**
   * Get waitingChargeInMins
   * @return waitingChargeInMins
  **/
  @ApiModelProperty(value = "")


  public Double getWaitingChargeInMins() {
    return waitingChargeInMins;
  }

  public void setWaitingChargeInMins(Double waitingChargeInMins) {
    this.waitingChargeInMins = waitingChargeInMins;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Pricing pricing = (Pricing) o;
    return Objects.equals(this.additionalDescription, pricing.additionalDescription) &&
        Objects.equals(this.basicRate, pricing.basicRate) &&
        Objects.equals(this.freeWaitingInMins, pricing.freeWaitingInMins) &&
        Objects.equals(this.fulldayPricings, pricing.fulldayPricings) &&
        Objects.equals(this.id, pricing.id) &&
        Objects.equals(this.nightSurchargeInMins, pricing.nightSurchargeInMins) &&
        Objects.equals(this.normalPricings, pricing.normalPricings) &&
        Objects.equals(this.ratePlan, pricing.ratePlan) &&
        Objects.equals(this.vehicles, pricing.vehicles) &&
        Objects.equals(this.waitingChargeInMins, pricing.waitingChargeInMins);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalDescription, basicRate, freeWaitingInMins, fulldayPricings, id, nightSurchargeInMins, normalPricings, ratePlan, vehicles, waitingChargeInMins);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Pricing {\n");
    
    sb.append("    additionalDescription: ").append(toIndentedString(additionalDescription)).append("\n");
    sb.append("    basicRate: ").append(toIndentedString(basicRate)).append("\n");
    sb.append("    freeWaitingInMins: ").append(toIndentedString(freeWaitingInMins)).append("\n");
    sb.append("    fulldayPricings: ").append(toIndentedString(fulldayPricings)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    nightSurchargeInMins: ").append(toIndentedString(nightSurchargeInMins)).append("\n");
    sb.append("    normalPricings: ").append(toIndentedString(normalPricings)).append("\n");
    sb.append("    ratePlan: ").append(toIndentedString(ratePlan)).append("\n");
    sb.append("    vehicles: ").append(toIndentedString(vehicles)).append("\n");
    sb.append("    waitingChargeInMins: ").append(toIndentedString(waitingChargeInMins)).append("\n");
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

