package com.ddd.bicycle.rental.infrastructure.entrypoints.dtos;

public class RentRequestDto {
    private String userId;
    private String stationId;
    
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getStationId() {
        return stationId;
    }

    public void setStationId(String stationId) {
        this.stationId = stationId;
    }
    
}
