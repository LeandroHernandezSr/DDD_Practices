package com.ddd.bicycle.rental.infrastructure.entrypoints.controllers.station;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ddd.bicycle.rental.infrastructure.entrypoints.handlers.StationHandler;

@RestController
@RequestMapping("/station")
public class DeleteStationController {

    private final StationHandler handler;

    public DeleteStationController(StationHandler handler){
        this.handler=handler;
    }

    public ResponseEntity<Void>delete(@RequestBody String id){
        return this.handler.delete(id);
    }

}
