package com.ddd.bicycle.rental.application.usecases.user;

import com.ddd.bicycle.rental.domain.model.StationId;
import com.ddd.bicycle.rental.domain.model.UserId;
import com.ddd.bicycle.rental.domain.model.services.RentBikeService;
import com.ddd.bicycle.rental.domain.model.station.Station;
import com.ddd.bicycle.rental.domain.model.user.User;
import com.ddd.bicycle.rental.domain.ports.in.user.RentBikeUseCase;
import com.ddd.bicycle.rental.domain.ports.out.StationRepository;
import com.ddd.bicycle.rental.domain.ports.out.UserRepository;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.UUID;

@Component
public class RentBikeUseCaseImpl implements RentBikeUseCase {

    private final UserRepository userRepository;
    private final StationRepository stationRepository;
    private final RentBikeService service;

    public RentBikeUseCaseImpl(UserRepository userRepository, StationRepository stationRepository, RentBikeService service) {
        this.userRepository = userRepository;
        this.stationRepository = stationRepository;
        this.service = service;
    }

    @Override
    public void apply(String stationId, String userId) {
        if (stationId == null) throw new IllegalArgumentException("StationId cannot be null");
        if (userId == null) throw new IllegalArgumentException("UserId cannot be null");

        var user=userRepository.findById(new UserId(UUID.fromString(userId)));
        var station=stationRepository.findById(new StationId(UUID.fromString(stationId))).get();

        Map<String,Object>rentMap=service.rent(station, user);

        userRepository.updateUser((User) rentMap.get("user"));
        stationRepository.update((Station) rentMap.get("station"));
    }

}
