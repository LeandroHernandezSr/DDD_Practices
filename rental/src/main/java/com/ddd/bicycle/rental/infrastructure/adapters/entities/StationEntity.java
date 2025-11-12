package com.ddd.bicycle.rental.infrastructure.adapters.entities;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
public class StationEntity {
    @Id
    private String id;
    private String stationName;
    private Integer totalCapacity;
    private Integer curentBikeCount;

    public StationEntity(String id, String stationName, Integer totalCapacity, Integer curentBikeCount) {
        this.id = id;
        this.stationName = stationName;
        this.totalCapacity = totalCapacity;
        this.curentBikeCount = curentBikeCount;
    }

    public StationEntity() {
    }

    @PrePersist
    public void generateId() {
        if (this.id == null) {
            this.id = UUID.randomUUID().toString();
        }
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    public Integer getTotalCapacity() {
        return totalCapacity;
    }

    public void setTotalCapacity(Integer totalCapacity) {
        this.totalCapacity = totalCapacity;
    }

    public Integer getCurentBikeCount() {
        return curentBikeCount;
    }

    public void setCurentBikeCount(Integer curentBikeCount) {
        this.curentBikeCount = curentBikeCount;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
