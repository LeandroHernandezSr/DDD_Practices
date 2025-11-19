package com.ddd.bicycle.rental.domain.model.services;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.ddd.bicycle.rental.domain.model.station.Station;
import com.ddd.bicycle.rental.domain.model.user.Bike;
import com.ddd.bicycle.rental.domain.model.user.User;

@Service
public class RentBikeService {
    public Map<String,Object> rent(Station station,User user){

        Map<String,Object>aggregations=new HashMap<>();

        if (user != null && user.getActive()){
           user.takeBike(new Bike(station.getStationId()));
           station.getTotalCapacity().aumentBikeCount();

           aggregations.put("user", user);
           aggregations.put("station", station);
        }

        return aggregations;
    }
}
