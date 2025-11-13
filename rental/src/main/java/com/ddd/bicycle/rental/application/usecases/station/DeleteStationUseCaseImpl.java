package com.ddd.bicycle.rental.application.usecases.station;

import com.ddd.bicycle.rental.domain.model.StationId;
import com.ddd.bicycle.rental.domain.ports.in.station.DeleteStationUseCase;
import com.ddd.bicycle.rental.domain.ports.out.StationRepository;
import org.springframework.stereotype.Component;

@Component
public class DeleteStationUseCaseImpl implements DeleteStationUseCase {

    private final StationRepository repository;

    public DeleteStationUseCaseImpl(StationRepository repository) {
        this.repository = repository;
    }

    @Override
    public void apply(StationId stationId) {
        repository.delete(stationId);
    }
}
