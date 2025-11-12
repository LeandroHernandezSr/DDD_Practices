package com.ddd.bicycle.rental.application.station;

import com.ddd.bicycle.rental.domain.model.StationId;
import com.ddd.bicycle.rental.domain.repository.StationRepository;
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
