package com.illud.freightgw.client.freight.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.illud.freightgw.client.freight.model.Company;
import com.illud.freightgw.client.freight.model.Driver;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Vehicle
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-10-05T14:19:02.594+05:30[Asia/Calcutta]")
@Document(indexName = "vehicle")
public class Vehicle   {
  @JsonProperty("company")
  private Company company = null;

  @JsonProperty("currentLocationGeopoint")
  private String currentLocationGeopoint = null;

  @JsonProperty("driver")
  private Driver driver = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("occupied")
  private Boolean occupied = null;

  @JsonProperty("registerNo")
  private String registerNo = null;

  @JsonProperty("vehicleLookupId")
  private Long vehicleLookupId = null;

  public Vehicle company(Company company) {
    this.company = company;
    return this;
  }

  /**
   * Get company
   * @return company
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Company getCompany() {
    return company;
  }

  public void setCompany(Company company) {
    this.company = company;
  }

  public Vehicle currentLocationGeopoint(String currentLocationGeopoint) {
    this.currentLocationGeopoint = currentLocationGeopoint;
    return this;
  }

  /**
   * Get currentLocationGeopoint
   * @return currentLocationGeopoint
  **/
  @ApiModelProperty(value = "")


  public String getCurrentLocationGeopoint() {
    return currentLocationGeopoint;
  }

  public void setCurrentLocationGeopoint(String currentLocationGeopoint) {
    this.currentLocationGeopoint = currentLocationGeopoint;
  }

  public Vehicle driver(Driver driver) {
    this.driver = driver;
    return this;
  }

  /**
   * Get driver
   * @return driver
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Driver getDriver() {
    return driver;
  }

  public void setDriver(Driver driver) {
    this.driver = driver;
  }

  public Vehicle id(Long id) {
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

  public Vehicle occupied(Boolean occupied) {
    this.occupied = occupied;
    return this;
  }

  /**
   * Get occupied
   * @return occupied
  **/
  @ApiModelProperty(value = "")


  public Boolean isOccupied() {
    return occupied;
  }

  public void setOccupied(Boolean occupied) {
    this.occupied = occupied;
  }

  public Vehicle registerNo(String registerNo) {
    this.registerNo = registerNo;
    return this;
  }

  /**
   * Get registerNo
   * @return registerNo
  **/
  @ApiModelProperty(value = "")


  public String getRegisterNo() {
    return registerNo;
  }

  public void setRegisterNo(String registerNo) {
    this.registerNo = registerNo;
  }

  public Vehicle vehicleLookupId(Long vehicleLookupId) {
    this.vehicleLookupId = vehicleLookupId;
    return this;
  }

  /**
   * Get vehicleLookupId
   * @return vehicleLookupId
  **/
  @ApiModelProperty(value = "")


  public Long getVehicleLookupId() {
    return vehicleLookupId;
  }

  public void setVehicleLookupId(Long vehicleLookupId) {
    this.vehicleLookupId = vehicleLookupId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Vehicle vehicle = (Vehicle) o;
    return Objects.equals(this.company, vehicle.company) &&
        Objects.equals(this.currentLocationGeopoint, vehicle.currentLocationGeopoint) &&
        Objects.equals(this.driver, vehicle.driver) &&
        Objects.equals(this.id, vehicle.id) &&
        Objects.equals(this.occupied, vehicle.occupied) &&
        Objects.equals(this.registerNo, vehicle.registerNo) &&
        Objects.equals(this.vehicleLookupId, vehicle.vehicleLookupId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(company, currentLocationGeopoint, driver, id, occupied, registerNo, vehicleLookupId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Vehicle {\n");
    
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
    sb.append("    currentLocationGeopoint: ").append(toIndentedString(currentLocationGeopoint)).append("\n");
    sb.append("    driver: ").append(toIndentedString(driver)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    occupied: ").append(toIndentedString(occupied)).append("\n");
    sb.append("    registerNo: ").append(toIndentedString(registerNo)).append("\n");
    sb.append("    vehicleLookupId: ").append(toIndentedString(vehicleLookupId)).append("\n");
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

