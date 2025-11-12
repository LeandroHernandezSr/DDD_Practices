package com.ddd.bicycle.rental.application.station;

import org.springframework.stereotype.Component;

import com.ddd.bicycle.rental.domain.model.station.Station;
import com.ddd.bicycle.rental.domain.repository.StationRepository;

import java.util.Optional;

@Component
public class UpdateStationUseCaseImpl implements UpdateStationUseCase{

    private final StationRepository stationRepository;

    public UpdateStationUseCaseImpl(StationRepository stationRepository) {
        this.stationRepository = stationRepository;
    }

    @Override
    public Optional<Station> apply(Station station) {
       return stationRepository.update(station);
    }

}
