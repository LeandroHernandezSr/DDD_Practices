package com.ddd.bicycle.rental.domain.ports.in.station;

import com.ddd.bicycle.rental.domain.model.StationId;

public interface DeleteStationUseCase {
    void apply(StationId stationId);
}
