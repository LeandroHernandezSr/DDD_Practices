package com.ddd.bicycle.rental.infrastructure.entrypoints.controllers.station;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ddd.bicycle.rental.infrastructure.entrypoints.dtos.StationDto;
import com.ddd.bicycle.rental.infrastructure.entrypoints.handlers.StationHandler;

@RestController()
@RequestMapping("/station")
public class UpdateStationController {

    private final StationHandler handler;


    public UpdateStationController(StationHandler handler){
        this.handler=handler;
    }

    @PutMapping("/update")
    public ResponseEntity<StationDto>update(@RequestBody StationDto stationDto){
        return this.handler.update(stationDto);
    }

}
