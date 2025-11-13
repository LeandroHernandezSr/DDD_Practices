package com.ddd.bicycle.rental.application.usecases.station;

import com.ddd.bicycle.rental.domain.model.station.Station;
import com.ddd.bicycle.rental.domain.ports.in.station.CreateStationUseCase;
import com.ddd.bicycle.rental.domain.ports.out.StationRepository;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class CreateStationUseCaseImpl implements CreateStationUseCase {

    private final StationRepository repository;

    public CreateStationUseCaseImpl(StationRepository repository) {
        this.repository = repository;
    }

    @Override
    public Optional<Station> apply(Station station) {
        return repository.create(station);
    }
}
