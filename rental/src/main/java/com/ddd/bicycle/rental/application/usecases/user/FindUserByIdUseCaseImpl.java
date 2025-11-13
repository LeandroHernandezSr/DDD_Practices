package com.ddd.bicycle.rental.application.usecases.user;

import com.ddd.bicycle.rental.domain.ports.in.user.FindUserByIdUseCase;
import org.springframework.stereotype.Component;

import com.ddd.bicycle.rental.domain.model.UserId;
import com.ddd.bicycle.rental.domain.model.user.User;
import com.ddd.bicycle.rental.domain.ports.out.UserRepository;

@Component
public class FindUserByIdUseCaseImpl implements FindUserByIdUseCase {

    private final UserRepository repository;

    public FindUserByIdUseCaseImpl(UserRepository repository){
        this.repository=repository;
    }

    @Override
    public User apply(UserId userId) {
        return this.repository.findById(userId);
    }

}
