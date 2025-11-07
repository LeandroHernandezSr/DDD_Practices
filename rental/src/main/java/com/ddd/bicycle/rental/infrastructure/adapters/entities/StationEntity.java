package com.ddd.bicycle.rental.infrastructure.adapters.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class StationEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String stationName;
    private Integer totalCapacity;
    private Integer curentBikeCount;

    public StationEntity(Long id, String stationName, Integer totalCapacity, Integer curentBikeCount) {
        this.id = id;
        this.stationName = stationName;
        this.totalCapacity = totalCapacity;
        this.curentBikeCount = curentBikeCount;
    }

    public StationEntity() {
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
