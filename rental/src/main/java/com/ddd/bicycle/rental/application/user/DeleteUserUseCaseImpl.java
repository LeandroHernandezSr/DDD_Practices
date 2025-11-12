package com.ddd.bicycle.rental.application.user;

import org.springframework.stereotype.Component;

import com.ddd.bicycle.rental.domain.model.UserId;
import com.ddd.bicycle.rental.domain.model.user.User;
import com.ddd.bicycle.rental.domain.repository.UserRepository;

import java.util.Optional;

@Component
public class DeleteUserUseCaseImpl implements DeleteUserUseCase{

    private final UserRepository repository;

    public DeleteUserUseCaseImpl(UserRepository repository){
        this.repository=repository;
    }

    @Override
    public void apply(UserId userId) {
        this.repository.deleteUser(userId);
    }

}
