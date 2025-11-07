package com.ddd.bicycle.rental.application.station;

import com.ddd.bicycle.rental.domain.model.StationId;
import com.ddd.bicycle.rental.domain.model.station.Station;

public interface FindStationByIdUseCase {
    Station apply(StationId stationId);
}
