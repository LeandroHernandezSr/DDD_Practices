package com.ddd.bicycle.rental.infrastructure.adapters.repositories;

import com.ddd.bicycle.rental.domain.model.StationId;
import com.ddd.bicycle.rental.domain.model.station.Station;
import com.ddd.bicycle.rental.domain.ports.out.StationRepository;
import com.ddd.bicycle.rental.infrastructure.adapters.repositories.jpa.StationJpaRepository;

import com.ddd.bicycle.rental.infrastructure.utils.StationMapper;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class StationRepositoryImpl implements StationRepository {

    private final StationJpaRepository repository;
    private final StationMapper mapper;

    public StationRepositoryImpl(StationJpaRepository repository, StationMapper mapper){
        this.repository=repository;
        this.mapper = mapper;
    }

    @Override
    public Optional<Station> findById(StationId stationId) {
        return this.repository.findById(stationId.getId().toString())
                .map(mapper::entityToModel);
    }

    @Override
    public Optional<Station> create(Station station) {
        return Optional.of(station)
                .map(mapper::modelToEntity)
                .map(repository::save)
                .map(mapper::entityToModel);
    }

    @Override
    public Optional<Station> update(Station station) {
        return Optional.of(station)
                .map(mapper::modelToEntity)
                .map(repository::save)
                .map(mapper::entityToModel);
    }

    @Override
    public void delete(StationId stationId) {
        this.repository.deleteById(stationId.getId().toString());
    }
}
