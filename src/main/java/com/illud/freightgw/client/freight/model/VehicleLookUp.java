package com.illud.freightgw.client.freight.model;


import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;

import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.validation.annotation.Validated;

import java.io.Serializable;
import java.util.Objects;

/**
 * A VehicleLookUp.
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-10-05T14:19:02.594+05:30[Asia/Calcutta]")

@Document(indexName = "vehiclelookup")
public class VehicleLookUp implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "max_weight")
    private Long maxWeight;

    @Lob
    @Column(name = "image")
    private byte[] image;

    @Column(name = "image_content_type")
    private String imageContentType;

    @Column(name = "length")
    private Double length;

    @Column(name = "width")
    private Double width;

    @Column(name = "height")
    private Double height;

    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public VehicleLookUp name(String name) {
        this.name = name;
        return this;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getMaxWeight() {
        return maxWeight;
    }

    public VehicleLookUp maxWeight(Long maxWeight) {
        this.maxWeight = maxWeight;
        return this;
    }

    public void setMaxWeight(Long maxWeight) {
        this.maxWeight = maxWeight;
    }

    public byte[] getImage() {
        return image;
    }

    public VehicleLookUp image(byte[] image) {
        this.image = image;
        return this;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public String getImageContentType() {
        return imageContentType;
    }

    public VehicleLookUp imageContentType(String imageContentType) {
        this.imageContentType = imageContentType;
        return this;
    }

    public void setImageContentType(String imageContentType) {
        this.imageContentType = imageContentType;
    }

    public Double getLength() {
        return length;
    }

    public VehicleLookUp length(Double length) {
        this.length = length;
        return this;
    }

    public void setLength(Double length) {
        this.length = length;
    }

    public Double getWidth() {
        return width;
    }

    public VehicleLookUp width(Double width) {
        this.width = width;
        return this;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getHeight() {
        return height;
    }

    public VehicleLookUp height(Double height) {
        this.height = height;
        return this;
    }

    public void setHeight(Double height) {
        this.height = height;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here, do not remove

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VehicleLookUp vehicleLookUp = (VehicleLookUp) o;
        if (vehicleLookUp.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), vehicleLookUp.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "VehicleLookUp{" +
            "id=" + getId() +
            ", name='" + getName() + "'" +
            ", maxWeight=" + getMaxWeight() +
            ", image='" + getImage() + "'" +
            ", imageContentType='" + getImageContentType() + "'" +
            ", length=" + getLength() +
            ", width=" + getWidth() +
            ", height=" + getHeight() +
            "}";
    }
}
