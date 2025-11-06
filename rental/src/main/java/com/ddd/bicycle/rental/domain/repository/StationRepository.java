package com.ddd.bicycle.rental.domain.repository;

import com.ddd.bicycle.rental.domain.model.StationId;
import com.ddd.bicycle.rental.domain.model.station.Station;

public interface StationRepository {
    Station findById(StationId stationId);
    Station create(Station station);
    Station update(Station station);
    Station delete(StationId stationId);
}
