package com.ddd.bicycle.rental.domain.model.station;

import com.ddd.bicycle.rental.domain.model.StationId;

public class Station {
    
    private StationId stationId;
    private String name;
    private StationTotalCapacity totalCapacity;

    public Station(StationId stationId, String name, StationTotalCapacity totalCapacity) {
        this.stationId = stationId;
        this.name = name;
        this.totalCapacity = totalCapacity;
    }

    public StationId getStationId() {
        return stationId;
    }

    public String getName() {
        return name;
    }

    public StationTotalCapacity getTotalCapacity() {
        return totalCapacity;
    }
    
    public void releaseBike(){
        this.totalCapacity.reduceBikeCount();
    }

    public void receiveBike(){
        this.totalCapacity.aumentBikeCount();
    }
}
