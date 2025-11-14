package com.ddd.bicycle.rental.infrastructure.entrypoints.controllers.station;

import com.ddd.bicycle.rental.domain.model.StationId;
import com.ddd.bicycle.rental.infrastructure.entrypoints.dtos.StationDto;
import com.ddd.bicycle.rental.infrastructure.entrypoints.handlers.StationHandler;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/station")
public class FindStationByIdController {

    private final StationHandler handler;

    public FindStationByIdController(StationHandler handler) {
        this.handler = handler;
    }

    @PostMapping("/get-station")
    public ResponseEntity<StationDto> findStationById(@RequestBody String stationId) {
        return handler.findById(new StationId(UUID.fromString(stationId)));
    }
}
