package com.ddd.bicycle.rental.infrastructure.entrypoints.controllers.user;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ddd.bicycle.rental.infrastructure.entrypoints.dtos.ReturnBikeDto;
import com.ddd.bicycle.rental.infrastructure.entrypoints.handlers.UserHandler;

@RestController
@RequestMapping("/user")
public class ReturnBikeController {

    private final UserHandler userHandler;

    public ReturnBikeController(UserHandler userHandler){
        this.userHandler=userHandler;
    }

    @PostMapping("/return-bike")
    public ResponseEntity<Void>returnBike(@RequestBody ReturnBikeDto returnBikeDto){
        this.userHandler.returnBike(returnBikeDto.userId(), returnBikeDto.stationId());
        return ResponseEntity.ok().build();
    }
}
