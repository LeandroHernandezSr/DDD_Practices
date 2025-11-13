package com.ddd.bicycle.rental.application.usecases.user;

import com.ddd.bicycle.rental.domain.ports.in.user.DeleteUserUseCase;
import org.springframework.stereotype.Component;

import com.ddd.bicycle.rental.domain.model.UserId;
import com.ddd.bicycle.rental.domain.ports.out.UserRepository;

@Component
public class DeleteUserUseCaseImpl implements DeleteUserUseCase {

    private final UserRepository repository;

    public DeleteUserUseCaseImpl(UserRepository repository){
        this.repository=repository;
    }

    @Override
    public void apply(UserId userId) {
        this.repository.deleteUser(userId);
    }

}
