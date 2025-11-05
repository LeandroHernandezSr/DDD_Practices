package com.ddd.bicycle.rental.domain.user;

import com.ddd.bicycle.rental.domain.StationId;

public class HasBike {
    
    private final StationId stationId;

    public HasBike(StationId stationId) {
        this.stationId = stationId;
    }

    public StationId getStationId() {
        return stationId;
    }
    
}
