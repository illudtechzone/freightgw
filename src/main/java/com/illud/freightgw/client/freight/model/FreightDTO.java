package com.illud.freightgw.client.freight.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * FreightDTO
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-09-20T11:29:20.373+05:30[Asia/Calcutta]")

public class FreightDTO   {
  /**
   * Gets or Sets acceptedStatus
   */
  public enum AcceptedStatusEnum {
    START("START"),
    
    COMPLETE("COMPLETE"),
    
    NOT_STARTED("NOT_STARTED");

    private String value;

    AcceptedStatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static AcceptedStatusEnum fromValue(String text) {
      for (AcceptedStatusEnum b : AcceptedStatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("acceptedStatus")
  private AcceptedStatusEnum acceptedStatus = null;

  @JsonProperty("amount")
  private Long amount = null;

  @JsonProperty("companyId")
  private String companyId = null;

  @JsonProperty("createdTime")
  private OffsetDateTime createdTime = null;

  @JsonProperty("customerId")
  private String customerId = null;

  @JsonProperty("destinationAddress")
  private String destinationAddress = null;

  @JsonProperty("destinationGeopoint")
  private String destinationGeopoint = null;

  @JsonProperty("destinationPlaceId")
  private String destinationPlaceId = null;

  @JsonProperty("destionationTime")
  private OffsetDateTime destionationTime = null;

  @JsonProperty("distance")
  private Long distance = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("pickupAddress")
  private String pickupAddress = null;

  @JsonProperty("pickupGeopoint")
  private String pickupGeopoint = null;

  @JsonProperty("pickupPlaceId")
  private String pickupPlaceId = null;

  /**
   * Gets or Sets requestedStatus
   */
  public enum RequestedStatusEnum {
    REQUEST("REQUEST"),
    
    CONFIRM("CONFIRM"),
    
    REJECT("REJECT");

    private String value;

    RequestedStatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static RequestedStatusEnum fromValue(String text) {
      for (RequestedStatusEnum b : RequestedStatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("requestedStatus")
  private RequestedStatusEnum requestedStatus = null;

  @JsonProperty("startTime")
  private OffsetDateTime startTime = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("vehicleId")
  private String vehicleId = null;

  public FreightDTO acceptedStatus(AcceptedStatusEnum acceptedStatus) {
    this.acceptedStatus = acceptedStatus;
    return this;
  }

  /**
   * Get acceptedStatus
   * @return acceptedStatus
  **/
  @ApiModelProperty(value = "")


  public AcceptedStatusEnum getAcceptedStatus() {
    return acceptedStatus;
  }

  public void setAcceptedStatus(AcceptedStatusEnum acceptedStatus) {
    this.acceptedStatus = acceptedStatus;
  }

  public FreightDTO amount(Long amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Get amount
   * @return amount
  **/
  @ApiModelProperty(value = "")


  public Long getAmount() {
    return amount;
  }

  public void setAmount(Long amount) {
    this.amount = amount;
  }

  public FreightDTO companyId(String companyId) {
    this.companyId = companyId;
    return this;
  }

  /**
   * Get companyId
   * @return companyId
  **/
  @ApiModelProperty(value = "")


  public String getCompanyId() {
    return companyId;
  }

  public void setCompanyId(String companyId) {
    this.companyId = companyId;
  }

  public FreightDTO createdTime(OffsetDateTime createdTime) {
    this.createdTime = createdTime;
    return this;
  }

  /**
   * Get createdTime
   * @return createdTime
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getCreatedTime() {
    return createdTime;
  }

  public void setCreatedTime(OffsetDateTime createdTime) {
    this.createdTime = createdTime;
  }

  public FreightDTO customerId(String customerId) {
    this.customerId = customerId;
    return this;
  }

  /**
   * Get customerId
   * @return customerId
  **/
  @ApiModelProperty(value = "")


  public String getCustomerId() {
    return customerId;
  }

  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }

  public FreightDTO destinationAddress(String destinationAddress) {
    this.destinationAddress = destinationAddress;
    return this;
  }

  /**
   * Get destinationAddress
   * @return destinationAddress
  **/
  @ApiModelProperty(value = "")


  public String getDestinationAddress() {
    return destinationAddress;
  }

  public void setDestinationAddress(String destinationAddress) {
    this.destinationAddress = destinationAddress;
  }

  public FreightDTO destinationGeopoint(String destinationGeopoint) {
    this.destinationGeopoint = destinationGeopoint;
    return this;
  }

  /**
   * Get destinationGeopoint
   * @return destinationGeopoint
  **/
  @ApiModelProperty(value = "")


  public String getDestinationGeopoint() {
    return destinationGeopoint;
  }

  public void setDestinationGeopoint(String destinationGeopoint) {
    this.destinationGeopoint = destinationGeopoint;
  }

  public FreightDTO destinationPlaceId(String destinationPlaceId) {
    this.destinationPlaceId = destinationPlaceId;
    return this;
  }

  /**
   * Get destinationPlaceId
   * @return destinationPlaceId
  **/
  @ApiModelProperty(value = "")


  public String getDestinationPlaceId() {
    return destinationPlaceId;
  }

  public void setDestinationPlaceId(String destinationPlaceId) {
    this.destinationPlaceId = destinationPlaceId;
  }

  public FreightDTO destionationTime(OffsetDateTime destionationTime) {
    this.destionationTime = destionationTime;
    return this;
  }

  /**
   * Get destionationTime
   * @return destionationTime
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getDestionationTime() {
    return destionationTime;
  }

  public void setDestionationTime(OffsetDateTime destionationTime) {
    this.destionationTime = destionationTime;
  }

  public FreightDTO distance(Long distance) {
    this.distance = distance;
    return this;
  }

  /**
   * Get distance
   * @return distance
  **/
  @ApiModelProperty(value = "")


  public Long getDistance() {
    return distance;
  }

  public void setDistance(Long distance) {
    this.distance = distance;
  }

  public FreightDTO id(Long id) {
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

  public FreightDTO pickupAddress(String pickupAddress) {
    this.pickupAddress = pickupAddress;
    return this;
  }

  /**
   * Get pickupAddress
   * @return pickupAddress
  **/
  @ApiModelProperty(value = "")


  public String getPickupAddress() {
    return pickupAddress;
  }

  public void setPickupAddress(String pickupAddress) {
    this.pickupAddress = pickupAddress;
  }

  public FreightDTO pickupGeopoint(String pickupGeopoint) {
    this.pickupGeopoint = pickupGeopoint;
    return this;
  }

  /**
   * Get pickupGeopoint
   * @return pickupGeopoint
  **/
  @ApiModelProperty(value = "")


  public String getPickupGeopoint() {
    return pickupGeopoint;
  }

  public void setPickupGeopoint(String pickupGeopoint) {
    this.pickupGeopoint = pickupGeopoint;
  }

  public FreightDTO pickupPlaceId(String pickupPlaceId) {
    this.pickupPlaceId = pickupPlaceId;
    return this;
  }

  /**
   * Get pickupPlaceId
   * @return pickupPlaceId
  **/
  @ApiModelProperty(value = "")


  public String getPickupPlaceId() {
    return pickupPlaceId;
  }

  public void setPickupPlaceId(String pickupPlaceId) {
    this.pickupPlaceId = pickupPlaceId;
  }

  public FreightDTO requestedStatus(RequestedStatusEnum requestedStatus) {
    this.requestedStatus = requestedStatus;
    return this;
  }

  /**
   * Get requestedStatus
   * @return requestedStatus
  **/
  @ApiModelProperty(value = "")


  public RequestedStatusEnum getRequestedStatus() {
    return requestedStatus;
  }

  public void setRequestedStatus(RequestedStatusEnum requestedStatus) {
    this.requestedStatus = requestedStatus;
  }

  public FreightDTO startTime(OffsetDateTime startTime) {
    this.startTime = startTime;
    return this;
  }

  /**
   * Get startTime
   * @return startTime
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getStartTime() {
    return startTime;
  }

  public void setStartTime(OffsetDateTime startTime) {
    this.startTime = startTime;
  }

  public FreightDTO type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public FreightDTO vehicleId(String vehicleId) {
    this.vehicleId = vehicleId;
    return this;
  }

  /**
   * Get vehicleId
   * @return vehicleId
  **/
  @ApiModelProperty(value = "")


  public String getVehicleId() {
    return vehicleId;
  }

  public void setVehicleId(String vehicleId) {
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
    FreightDTO freightDTO = (FreightDTO) o;
    return Objects.equals(this.acceptedStatus, freightDTO.acceptedStatus) &&
        Objects.equals(this.amount, freightDTO.amount) &&
        Objects.equals(this.companyId, freightDTO.companyId) &&
        Objects.equals(this.createdTime, freightDTO.createdTime) &&
        Objects.equals(this.customerId, freightDTO.customerId) &&
        Objects.equals(this.destinationAddress, freightDTO.destinationAddress) &&
        Objects.equals(this.destinationGeopoint, freightDTO.destinationGeopoint) &&
        Objects.equals(this.destinationPlaceId, freightDTO.destinationPlaceId) &&
        Objects.equals(this.destionationTime, freightDTO.destionationTime) &&
        Objects.equals(this.distance, freightDTO.distance) &&
        Objects.equals(this.id, freightDTO.id) &&
        Objects.equals(this.pickupAddress, freightDTO.pickupAddress) &&
        Objects.equals(this.pickupGeopoint, freightDTO.pickupGeopoint) &&
        Objects.equals(this.pickupPlaceId, freightDTO.pickupPlaceId) &&
        Objects.equals(this.requestedStatus, freightDTO.requestedStatus) &&
        Objects.equals(this.startTime, freightDTO.startTime) &&
        Objects.equals(this.type, freightDTO.type) &&
        Objects.equals(this.vehicleId, freightDTO.vehicleId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acceptedStatus, amount, companyId, createdTime, customerId, destinationAddress, destinationGeopoint, destinationPlaceId, destionationTime, distance, id, pickupAddress, pickupGeopoint, pickupPlaceId, requestedStatus, startTime, type, vehicleId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FreightDTO {\n");
    
    sb.append("    acceptedStatus: ").append(toIndentedString(acceptedStatus)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    destinationAddress: ").append(toIndentedString(destinationAddress)).append("\n");
    sb.append("    destinationGeopoint: ").append(toIndentedString(destinationGeopoint)).append("\n");
    sb.append("    destinationPlaceId: ").append(toIndentedString(destinationPlaceId)).append("\n");
    sb.append("    destionationTime: ").append(toIndentedString(destionationTime)).append("\n");
    sb.append("    distance: ").append(toIndentedString(distance)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    pickupAddress: ").append(toIndentedString(pickupAddress)).append("\n");
    sb.append("    pickupGeopoint: ").append(toIndentedString(pickupGeopoint)).append("\n");
    sb.append("    pickupPlaceId: ").append(toIndentedString(pickupPlaceId)).append("\n");
    sb.append("    requestedStatus: ").append(toIndentedString(requestedStatus)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

