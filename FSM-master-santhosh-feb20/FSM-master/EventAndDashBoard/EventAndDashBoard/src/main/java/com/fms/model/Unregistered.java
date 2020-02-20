package com.fms.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;

import org.springframework.data.relational.core.mapping.Table;
import org.springframework.validation.annotation.Validated;

import javax.persistence.Entity;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Unregistered
 */
@Validated
@Entity
@Table("unregistered")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-02-17T11:13:43.196+05:30[Asia/Calcutta]")
public class Unregistered   {
  @JsonProperty("event_id")
  private Integer eventId = null;

  @JsonProperty("event_name")
  private String eventName = null;

  @JsonProperty("bname")
  private String bname = null;

  @JsonProperty("base_location")
  private String baseLocation = null;

  @JsonProperty("event_date")
  private LocalDate eventDate = null;

  @JsonProperty("empid")
  private String empid = null;

  public Unregistered eventId(Integer eventId) {
    this.eventId = eventId;
    return this;
  }

  /**
   * Get eventId
   * @return eventId
  **/
  @ApiModelProperty(value = "")
  
    public Integer getEventId() {
    return eventId;
  }

  public void setEventId(Integer eventId) {
    this.eventId = eventId;
  }

  public Unregistered eventName(String eventName) {
    this.eventName = eventName;
    return this;
  }

  /**
   * Get eventName
   * @return eventName
  **/
  @ApiModelProperty(value = "")
  
    public String getEventName() {
    return eventName;
  }

  public void setEventName(String eventName) {
    this.eventName = eventName;
  }

  public Unregistered bname(String bname) {
    this.bname = bname;
    return this;
  }

  /**
   * Get bname
   * @return bname
  **/
  @ApiModelProperty(value = "")
  
    public String getBname() {
    return bname;
  }

  public void setBname(String bname) {
    this.bname = bname;
  }

  public Unregistered baseLocation(String baseLocation) {
    this.baseLocation = baseLocation;
    return this;
  }

  /**
   * Get baseLocation
   * @return baseLocation
  **/
  @ApiModelProperty(value = "")
  
    public String getBaseLocation() {
    return baseLocation;
  }

  public void setBaseLocation(String baseLocation) {
    this.baseLocation = baseLocation;
  }

  public Unregistered eventDate(LocalDate eventDate) {
    this.eventDate = eventDate;
    return this;
  }

  /**
   * Get eventDate
   * @return eventDate
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public LocalDate getEventDate() {
    return eventDate;
  }

  public void setEventDate(LocalDate eventDate) {
    this.eventDate = eventDate;
  }

  public Unregistered empid(String empid) {
    this.empid = empid;
    return this;
  }

  /**
   * Get empid
   * @return empid
  **/
  @ApiModelProperty(value = "")
  
    public String getEmpid() {
    return empid;
  }

  public void setEmpid(String empid) {
    this.empid = empid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Unregistered unregistered = (Unregistered) o;
    return Objects.equals(this.eventId, unregistered.eventId) &&
        Objects.equals(this.eventName, unregistered.eventName) &&
        Objects.equals(this.bname, unregistered.bname) &&
        Objects.equals(this.baseLocation, unregistered.baseLocation) &&
        Objects.equals(this.eventDate, unregistered.eventDate) &&
        Objects.equals(this.empid, unregistered.empid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventId, eventName, bname, baseLocation, eventDate, empid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Unregistered {\n");
    
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
    sb.append("    eventName: ").append(toIndentedString(eventName)).append("\n");
    sb.append("    bname: ").append(toIndentedString(bname)).append("\n");
    sb.append("    baseLocation: ").append(toIndentedString(baseLocation)).append("\n");
    sb.append("    eventDate: ").append(toIndentedString(eventDate)).append("\n");
    sb.append("    empid: ").append(toIndentedString(empid)).append("\n");
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
