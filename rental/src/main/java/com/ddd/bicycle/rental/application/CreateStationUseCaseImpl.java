package com.ddd.bicycle.rental.application;

import com.ddd.bicycle.rental.domain.model.station.Station;
import com.ddd.bicycle.rental.domain.repository.StationRepository;
import org.springframework.stereotype.Component;

@Component
public class CreateStationUseCaseImpl implements CreateStationUseCase {

    private final StationRepository repository;

    public CreateStationUseCaseImpl(StationRepository repository) {
        this.repository = repository;
    }

    @Override
    public Station apply(Station station) {
        return repository.create(station);
    }
}
