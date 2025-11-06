package com.ddd.bicycle.rental.domain.model.user;

import com.ddd.bicycle.rental.domain.model.StationId;

public class Bike {
    
    private final StationId stationId;

    public Bike(StationId stationId) {
        this.stationId = stationId;
    }

    public StationId getStationId() {
        return stationId;
    }
    
}
