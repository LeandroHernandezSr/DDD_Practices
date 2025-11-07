package com.ddd.bicycle.rental.application.station;

import com.ddd.bicycle.rental.domain.model.station.Station;

public interface UpdateStationUseCase {
    Station apply(Station station);
}
