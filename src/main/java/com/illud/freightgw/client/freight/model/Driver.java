package com.illud.freightgw.client.freight.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Driver
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-10-05T14:19:02.594+05:30[Asia/Calcutta]")
@Document(indexName = "driver")
public class Driver   {
  @JsonProperty("driverIdpCode")
  private String driverIdpCode = null;

  @JsonProperty("email")
  private String email = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("phoneNumber")
  private Long phoneNumber = null;

  public Driver driverIdpCode(String driverIdpCode) {
    this.driverIdpCode = driverIdpCode;
    return this;
  }

  /**
   * Get driverIdpCode
   * @return driverIdpCode
  **/
  @ApiModelProperty(value = "")


  public String getDriverIdpCode() {
    return driverIdpCode;
  }

  public void setDriverIdpCode(String driverIdpCode) {
    this.driverIdpCode = driverIdpCode;
  }

  public Driver email(String email) {
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

  public Driver id(Long id) {
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

  public Driver name(String name) {
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

  public Driver phoneNumber(Long phoneNumber) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Driver driver = (Driver) o;
    return Objects.equals(this.driverIdpCode, driver.driverIdpCode) &&
        Objects.equals(this.email, driver.email) &&
        Objects.equals(this.id, driver.id) &&
        Objects.equals(this.name, driver.name) &&
        Objects.equals(this.phoneNumber, driver.phoneNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(driverIdpCode, email, id, name, phoneNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Driver {\n");
    
    sb.append("    driverIdpCode: ").append(toIndentedString(driverIdpCode)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
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

