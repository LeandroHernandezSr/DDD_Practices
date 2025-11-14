package com.ddd.bicycle.rental.infrastructure.entrypoints.controllers.user;

import com.ddd.bicycle.rental.infrastructure.entrypoints.dtos.UserDto;
import com.ddd.bicycle.rental.infrastructure.entrypoints.handlers.UserHandler;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class CreateUserController {

    private final UserHandler handler;

    public CreateUserController(UserHandler handler) {
        this.handler = handler;
    }

    @PostMapping("/create")
    public ResponseEntity<UserDto>create(@RequestBody UserDto userDto){
        return this.handler.createUser(userDto);
    }

}
