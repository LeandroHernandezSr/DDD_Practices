package com.ddd.bicycle.rental.infrastructure.entrypoints.handlers;

import com.ddd.bicycle.rental.domain.model.StationId;
import com.ddd.bicycle.rental.domain.ports.in.station.CreateStationUseCase;
import com.ddd.bicycle.rental.domain.ports.in.station.DeleteStationUseCase;
import com.ddd.bicycle.rental.domain.ports.in.station.FindStationByIdUseCase;
import com.ddd.bicycle.rental.domain.ports.in.station.UpdateStationUseCase;
import com.ddd.bicycle.rental.infrastructure.entrypoints.dtos.StationDto;
import com.ddd.bicycle.rental.infrastructure.utils.StationMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class StationHandler {

    private final StationMapper mapper;

    private final CreateStationUseCase createStationUseCase;
    private final DeleteStationUseCase deleteStationUseCase;
    private final FindStationByIdUseCase findStationByIdUseCase;
    private final UpdateStationUseCase updateStationUseCase;

    public StationHandler(StationMapper mapper, CreateStationUseCase createStationUseCase, DeleteStationUseCase deleteStationUseCase, FindStationByIdUseCase findStationByIdUseCase, UpdateStationUseCase updateStationUseCase) {
        this.mapper = mapper;
        this.createStationUseCase = createStationUseCase;
        this.deleteStationUseCase = deleteStationUseCase;
        this.findStationByIdUseCase = findStationByIdUseCase;
        this.updateStationUseCase = updateStationUseCase;
    }

    public ResponseEntity<StationDto>create(StationDto stationDto) {
        return ResponseEntity.ok(this.createStationUseCase.apply(mapper.dtoToModel(stationDto)).map(mapper::modelToDto).orElseThrow(()->new RuntimeException("Failed to create station")));
    }


    public ResponseEntity<StationDto> update(StationDto stationDto) {
        return ResponseEntity.ok(updateStationUseCase.apply(mapper.dtoToModel(stationDto)).map(mapper::modelToDto).orElseThrow(()->new RuntimeException("Failed to update station")));
    }

    public ResponseEntity<Void> delete(StationId stationId) {
        this.deleteStationUseCase.apply(stationId);
        return ResponseEntity.ok().build();
    }

    public ResponseEntity<StationDto> findById(StationId stationId) {
        return ResponseEntity.ok(findStationByIdUseCase.apply(stationId).map(mapper::modelToDto).orElseThrow(()->new RuntimeException("Failed to find station")));
    }

}
