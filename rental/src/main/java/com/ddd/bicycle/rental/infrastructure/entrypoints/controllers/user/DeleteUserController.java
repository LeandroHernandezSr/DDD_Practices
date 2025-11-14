package com.ddd.bicycle.rental.infrastructure.entrypoints.controllers.user;

import com.ddd.bicycle.rental.infrastructure.entrypoints.handlers.UserHandler;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class DeleteUserController {

    private final UserHandler  userHandler;

    public DeleteUserController(UserHandler userHandler) {
        this.userHandler = userHandler;
    }

    @DeleteMapping("/delete")
    public ResponseEntity<String>delete(@RequestBody String userId) {
        return this.userHandler.delete(userId);
    }
}
