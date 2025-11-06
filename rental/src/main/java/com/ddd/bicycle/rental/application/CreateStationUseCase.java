package com.ddd.bicycle.rental.application;

import com.ddd.bicycle.rental.domain.model.station.Station;

public interface CreateStationUseCase {
    Station apply(Station station);
}
