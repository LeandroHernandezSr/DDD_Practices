package com.ddd.bicycle.rental.application.usecases.user;

import org.springframework.stereotype.Component;

import com.ddd.bicycle.rental.domain.model.StationId;
import com.ddd.bicycle.rental.domain.model.UserId;
import com.ddd.bicycle.rental.domain.model.services.ReturnBikeService;
import com.ddd.bicycle.rental.domain.model.station.Station;
import com.ddd.bicycle.rental.domain.model.user.User;
import com.ddd.bicycle.rental.domain.ports.in.user.ReturnBikeUseCase;
import com.ddd.bicycle.rental.domain.ports.out.StationRepository;
import com.ddd.bicycle.rental.domain.ports.out.UserRepository;

@Component
public class ReturnBikeUseCaseImpl implements ReturnBikeUseCase{

    private final ReturnBikeService service;
    private final UserRepository userRepository;
    private final StationRepository stationRepository;


    public ReturnBikeUseCaseImpl(ReturnBikeService service,UserRepository userRepository,StationRepository stationRepository){
        this.service=service;
        this.userRepository=userRepository;
        this.stationRepository=stationRepository;
    }

    @Override
    public void apply(UserId user, StationId station) {
        User userFinded=userRepository.findById(user);
        Station stationFinded=stationRepository.findById(station).get();

        if (userFinded != null && stationFinded != null){
            var returnMap=this.service.returnBike(userFinded,stationFinded);

            this.userRepository.updateUser((User)returnMap.get("user"));
            this.stationRepository.update((Station) returnMap.get("station"));
        }
    }

}
