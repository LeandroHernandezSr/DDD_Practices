package com.ddd.bicycle.rental.infrastructure.entrypoints.controllers.user;

import com.ddd.bicycle.rental.infrastructure.entrypoints.dtos.UserDto;
import com.ddd.bicycle.rental.infrastructure.entrypoints.handlers.UserHandler;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class FindUserByIdController {
    private final UserHandler handler;

    public FindUserByIdController(UserHandler handler) {
        this.handler = handler;
    }

    public ResponseEntity<UserDto>findById(@RequestBody String userId){
        return this.handler.findUserById(userId);
    }
}
