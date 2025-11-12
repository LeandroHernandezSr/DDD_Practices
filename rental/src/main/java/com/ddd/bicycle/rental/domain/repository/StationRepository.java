package com.ddd.bicycle.rental.domain.repository;

import com.ddd.bicycle.rental.domain.model.StationId;
import com.ddd.bicycle.rental.domain.model.station.Station;

import java.util.Optional;

public interface StationRepository {
    Optional<Station> findById(StationId stationId);
    Optional<Station> create(Station station);
    Optional<Station> update(Station station);
    void delete(StationId stationId);
}
