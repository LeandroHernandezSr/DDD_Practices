package com.ddd.bicycle.rental.infrastructure.entrypoints.controllers.user;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ddd.bicycle.rental.infrastructure.entrypoints.dtos.RentRequestDto;
import com.ddd.bicycle.rental.infrastructure.entrypoints.handlers.UserHandler;

@RestController
@RequestMapping("/user")
public class RentBikeController {

    private final UserHandler handler;

    public RentBikeController(UserHandler handler){
        this.handler=handler;
    }

    @PostMapping("/rent-bike")
    public ResponseEntity<Void> rent(@RequestBody RentRequestDto dto){
        handler.rentBike(dto.getUserId(), dto.getStationId());
        return ResponseEntity.ok().build();
    }
}
