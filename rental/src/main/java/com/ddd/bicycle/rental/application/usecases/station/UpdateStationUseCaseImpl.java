package com.ddd.bicycle.rental.application.usecases.station;

import com.ddd.bicycle.rental.domain.ports.in.station.UpdateStationUseCase;
import org.springframework.stereotype.Component;

import com.ddd.bicycle.rental.domain.model.station.Station;
import com.ddd.bicycle.rental.domain.ports.out.StationRepository;

import java.util.Optional;

@Component
public class UpdateStationUseCaseImpl implements UpdateStationUseCase {

    private final StationRepository stationRepository;

    public UpdateStationUseCaseImpl(StationRepository stationRepository) {
        this.stationRepository = stationRepository;
    }

    @Override
    public Optional<Station> apply(Station station) {
       return stationRepository.update(station);
    }

}
