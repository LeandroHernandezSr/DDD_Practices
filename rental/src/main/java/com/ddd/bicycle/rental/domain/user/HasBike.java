package com.ddd.bicycle.rental.domain.user;

import com.ddd.bicycle.rental.domain.StationId;

public class HasBike {
    
    private StationId stationId;
    private Boolean active;

    public HasBike(StationId stationId, Boolean active) {
        this.stationId = stationId;
        this.active = active;
    }

    public StationId getStationId() {
        return stationId;
    }

    public Boolean getActive() {
        return active;
    }


    
}
