package com.illud.freightgw.client.freight.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.illud.freightgw.client.freight.model.Vehicle;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Company
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-09-19T15:07:50.741+05:30[Asia/Calcutta]")

public class Company   {
  @JsonProperty("address")
  private String address = null;

  @JsonProperty("email")
  private String email = null;

  @JsonProperty("iDPCode")
  private String iDPCode = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("locationAddress")
  private String locationAddress = null;

  @JsonProperty("locationGeopoint")
  private String locationGeopoint = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("phoneNumber")
  private Long phoneNumber = null;

  @JsonProperty("vehicles")
  @Valid
  private List<Vehicle> vehicles = null;

  public Company address(String address) {
    this.address = address;
    return this;
  }

  /**
   * Get address
   * @return address
  **/
  @ApiModelProperty(value = "")


  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public Company email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Get email
   * @return email
  **/
  @ApiModelProperty(value = "")


  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Company iDPCode(String iDPCode) {
    this.iDPCode = iDPCode;
    return this;
  }

  /**
   * Get iDPCode
   * @return iDPCode
  **/
  @ApiModelProperty(value = "")


  public String getIDPCode() {
    return iDPCode;
  }

  public void setIDPCode(String iDPCode) {
    this.iDPCode = iDPCode;
  }

  public Company id(Long id) {
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

  public Company locationAddress(String locationAddress) {
    this.locationAddress = locationAddress;
    return this;
  }

  /**
   * Get locationAddress
   * @return locationAddress
  **/
  @ApiModelProperty(value = "")


  public String getLocationAddress() {
    return locationAddress;
  }

  public void setLocationAddress(String locationAddress) {
    this.locationAddress = locationAddress;
  }

  public Company locationGeopoint(String locationGeopoint) {
    this.locationGeopoint = locationGeopoint;
    return this;
  }

  /**
   * Get locationGeopoint
   * @return locationGeopoint
  **/
  @ApiModelProperty(value = "")


  public String getLocationGeopoint() {
    return locationGeopoint;
  }

  public void setLocationGeopoint(String locationGeopoint) {
    this.locationGeopoint = locationGeopoint;
  }

  public Company name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Company phoneNumber(Long phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

  /**
   * Get phoneNumber
   * @return phoneNumber
  **/
  @ApiModelProperty(value = "")


  public Long getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(Long phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public Company vehicles(List<Vehicle> vehicles) {
    this.vehicles = vehicles;
    return this;
  }

  public Company addVehiclesItem(Vehicle vehiclesItem) {
    if (this.vehicles == null) {
      this.vehicles = new ArrayList<Vehicle>();
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

  public List<Vehicle> getVehicles() {
    return vehicles;
  }

  public void setVehicles(List<Vehicle> vehicles) {
    this.vehicles = vehicles;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Company company = (Company) o;
    return Objects.equals(this.address, company.address) &&
        Objects.equals(this.email, company.email) &&
        Objects.equals(this.iDPCode, company.iDPCode) &&
        Objects.equals(this.id, company.id) &&
        Objects.equals(this.locationAddress, company.locationAddress) &&
        Objects.equals(this.locationGeopoint, company.locationGeopoint) &&
        Objects.equals(this.name, company.name) &&
        Objects.equals(this.phoneNumber, company.phoneNumber) &&
        Objects.equals(this.vehicles, company.vehicles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, email, iDPCode, id, locationAddress, locationGeopoint, name, phoneNumber, vehicles);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Company {\n");
    
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    iDPCode: ").append(toIndentedString(iDPCode)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    locationAddress: ").append(toIndentedString(locationAddress)).append("\n");
    sb.append("    locationGeopoint: ").append(toIndentedString(locationGeopoint)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    vehicles: ").append(toIndentedString(vehicles)).append("\n");
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

