package com.ddd.bicycle.rental.domain.ports.in.station;

import com.ddd.bicycle.rental.domain.model.station.Station;

import java.util.Optional;

public interface UpdateStationUseCase {
    Optional<Station> apply(Station station);
}
