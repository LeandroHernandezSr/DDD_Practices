package com.ddd.bicycle.rental.domain.model.services;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.ddd.bicycle.rental.domain.model.station.Station;
import com.ddd.bicycle.rental.domain.model.user.User;

@Service
public class ReturnBikeService {
    public Map<String,Object>returnBike(User user,Station station){
        user.returnBike();
        station.getTotalCapacity().reduceBikeCount();
        Map<String,Object>result=new HashMap<>();
        result.put("user", user);
        result.put("station", station);
        return result;
    }
}
