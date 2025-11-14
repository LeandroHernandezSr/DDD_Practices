package com.ddd.bicycle.rental.infrastructure.entrypoints.controllers.station;

import com.ddd.bicycle.rental.infrastructure.entrypoints.dtos.StationDto;
import com.ddd.bicycle.rental.infrastructure.entrypoints.handlers.StationHandler;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/station")
public class CreateStationController {

    private final StationHandler handler;

    public CreateStationController(@RequestBody StationHandler handler) {
        this.handler = handler;
    }

    @PostMapping("/create")
    public ResponseEntity<StationDto> create(StationDto stationDto){
        return this.handler.create(stationDto);
    }
}
