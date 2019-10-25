package com.illud.freightgw.client.freight.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.illud.freightgw.client.freight.model.Driver;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Date;

import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * DriverDocument
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-10-25T10:41:54.345+05:30[Asia/Calcutta]")
@Document (indexName="driverdocument")
public class DriverDocument   {
  @JsonProperty("document")
  private byte[] document = null;

  @JsonProperty("documentContentType")
  private String documentContentType = null;

  @JsonProperty("documentType")
  private String documentType = null;

  @JsonProperty("driver")
  private Driver driver = null;

  @JsonProperty("expiryDate")
  private LocalDate expiryDate = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("isExpired")
  private Boolean isExpired = null;

  @JsonProperty("uploadTime")
  private OffsetDateTime uploadTime = null;

  @JsonProperty("validataionStartDate")
  private LocalDate validataionStartDate = null;

  public DriverDocument document(byte[] document) {
    this.document = document;
    return this;
  }

  /**
   * Get document
   * @return document
  **/
  @ApiModelProperty(value = "")

@Pattern(regexp="^(?:[A-Za-z0-9+/]{4})*(?:[A-Za-z0-9+/]{2}==|[A-Za-z0-9+/]{3}=)?$") 
  public byte[] getDocument() {
    return document;
  }

  public void setDocument(byte[] document) {
    this.document = document;
  }

  public DriverDocument documentContentType(String documentContentType) {
    this.documentContentType = documentContentType;
    return this;
  }

  /**
   * Get documentContentType
   * @return documentContentType
  **/
  @ApiModelProperty(value = "")


  public String getDocumentContentType() {
    return documentContentType;
  }

  public void setDocumentContentType(String documentContentType) {
    this.documentContentType = documentContentType;
  }

  public DriverDocument documentType(String documentType) {
    this.documentType = documentType;
    return this;
  }

  /**
   * Get documentType
   * @return documentType
  **/
  @ApiModelProperty(value = "")


  public String getDocumentType() {
    return documentType;
  }

  public void setDocumentType(String documentType) {
    this.documentType = documentType;
  }

  public DriverDocument driver(Driver driver) {
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

  public DriverDocument expiryDate(LocalDate expiryDate) {
    this.expiryDate = expiryDate;
    return this;
  }

  /**
   * Get expiryDate
   * @return expiryDate
  **/
  @ApiModelProperty(value = "")

  @Valid

  public LocalDate getExpiryDate() {
    return expiryDate;
  }

  public void setExpiryDate(LocalDate expiryDate) {
    this.expiryDate = expiryDate;
  }

  public DriverDocument id(Long id) {
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

  public DriverDocument isExpired(Boolean isExpired) {
    this.isExpired = isExpired;
    return this;
  }

  /**
   * Get isExpired
   * @return isExpired
  **/
  @ApiModelProperty(value = "")


  public Boolean isIsExpired() {
    return isExpired;
  }

  public void setIsExpired(Boolean isExpired) {
    this.isExpired = isExpired;
  }

  public DriverDocument uploadTime(OffsetDateTime uploadTime) {
    this.uploadTime = uploadTime;
    return this;
  }

  /**
   * Get uploadTime
   * @return uploadTime
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getUploadTime() {
    return uploadTime;
  }

  public void setUploadTime(OffsetDateTime uploadTime) {
    this.uploadTime = uploadTime;
  }

  public DriverDocument validataionStartDate(LocalDate validataionStartDate) {
    this.validataionStartDate = validataionStartDate;
    return this;
  }

  /**
   * Get validataionStartDate
   * @return validataionStartDate
  **/
  @ApiModelProperty(value = "")

  @Valid

  public LocalDate getValidataionStartDate() {
    return validataionStartDate;
  }

  public void setValidataionStartDate(LocalDate validataionStartDate) {
    this.validataionStartDate = validataionStartDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DriverDocument driverDocument = (DriverDocument) o;
    return Objects.equals(this.document, driverDocument.document) &&
        Objects.equals(this.documentContentType, driverDocument.documentContentType) &&
        Objects.equals(this.documentType, driverDocument.documentType) &&
        Objects.equals(this.driver, driverDocument.driver) &&
        Objects.equals(this.expiryDate, driverDocument.expiryDate) &&
        Objects.equals(this.id, driverDocument.id) &&
        Objects.equals(this.isExpired, driverDocument.isExpired) &&
        Objects.equals(this.uploadTime, driverDocument.uploadTime) &&
        Objects.equals(this.validataionStartDate, driverDocument.validataionStartDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(document, documentContentType, documentType, driver, expiryDate, id, isExpired, uploadTime, validataionStartDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DriverDocument {\n");
    
    sb.append("    document: ").append(toIndentedString(document)).append("\n");
    sb.append("    documentContentType: ").append(toIndentedString(documentContentType)).append("\n");
    sb.append("    documentType: ").append(toIndentedString(documentType)).append("\n");
    sb.append("    driver: ").append(toIndentedString(driver)).append("\n");
    sb.append("    expiryDate: ").append(toIndentedString(expiryDate)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isExpired: ").append(toIndentedString(isExpired)).append("\n");
    sb.append("    uploadTime: ").append(toIndentedString(uploadTime)).append("\n");
    sb.append("    validataionStartDate: ").append(toIndentedString(validataionStartDate)).append("\n");
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

