package com.ddd.bicycle.rental.infrastructure.adapters.repositories;

import com.ddd.bicycle.rental.domain.model.StationId;
import com.ddd.bicycle.rental.domain.model.station.Station;
import com.ddd.bicycle.rental.domain.repository.StationRepository;
import org.springframework.stereotype.Repository;

@Repository
public class StationRepositoryImpl implements StationRepository {
    @Override
    public Station findById(StationId stationId) {
        return null;
    }

    @Override
    public Station create(Station station) {
        return null;
    }

    @Override
    public Station update(Station station) {
        return null;
    }

    @Override
    public Station delete(StationId stationId) {
        return null;
    }
}
