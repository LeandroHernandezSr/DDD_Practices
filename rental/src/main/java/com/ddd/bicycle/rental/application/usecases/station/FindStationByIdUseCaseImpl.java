package com.ddd.bicycle.rental.application.usecases.station;

import com.ddd.bicycle.rental.domain.model.StationId;
import com.ddd.bicycle.rental.domain.model.station.Station;
import com.ddd.bicycle.rental.domain.ports.in.station.FindStationByIdUseCase;
import com.ddd.bicycle.rental.domain.ports.out.StationRepository;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class FindStationByIdUseCaseImpl implements FindStationByIdUseCase {


    private final StationRepository stationRepository;

    public FindStationByIdUseCaseImpl(StationRepository stationRepository) {
        this.stationRepository = stationRepository;
    }

    @Override
    public Optional<Station> apply(StationId stationId) {
        return stationRepository.findById(stationId);
    }
}
