package com.ddd.bicycle.rental.infrastructure.adapters.repositories;

import com.ddd.bicycle.rental.domain.model.StationId;
import com.ddd.bicycle.rental.domain.model.station.Station;
import com.ddd.bicycle.rental.domain.repository.StationRepository;
import com.ddd.bicycle.rental.infrastructure.adapters.repositories.jpa.StationJpaRepository;

import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class StationRepositoryImpl implements StationRepository {

    private final StationJpaRepository repository;

    public StationRepositoryImpl(StationJpaRepository repository){
        this.repository=repository;
    }

    @Override
    public Optional<Station> findById(StationId stationId) {
        return null;
    }

    @Override
    public Optional<Station> create(Station station) {
        return null;
    }

    @Override
    public Optional<Station> update(Station station) {
        return null;
    }

    @Override
    public void delete(StationId stationId) {

    }
}
