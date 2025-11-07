package com.ddd.bicycle.rental.application.user;

import org.springframework.stereotype.Component;

import com.ddd.bicycle.rental.domain.model.UserId;
import com.ddd.bicycle.rental.domain.model.user.User;
import com.ddd.bicycle.rental.domain.repository.UserRepository;

@Component
public class DeleteUserUseCaseImpl implements DeleteUserUseCase{

    private final UserRepository repository;

    public DeleteUserUseCaseImpl(UserRepository repository){
        this.repository=repository;
    }

    @Override
    public User apply(UserId userId) {
        return this.repository.deleteUser(userId);
    }

}
