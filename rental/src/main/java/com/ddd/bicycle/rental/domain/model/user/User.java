package com.ddd.bicycle.rental.domain.model.user;

import com.ddd.bicycle.rental.domain.model.UserId;

public class User {

    private final UserId userId;
    private final String name;
    private Boolean active;
    private Bike bike;

    public User(String name,UserId userId,Boolean active){
        if (name == null) throw new IllegalArgumentException("The name cannot be null");
    
        this.userId=userId;
        this.name=name;
        this.active=active;
    }

    public UserId getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public Boolean getActive() {
        return active;
    }

    public Bike getHasBike() {
        return bike;
    }

    public void activeUser(){
        if (this.active==Boolean.TRUE) throw new IllegalArgumentException("The user has already active");
        this.active=true;
    }

    public void desactiveUser(){
        if (this.active==Boolean.FALSE) throw new IllegalArgumentException("The user has already desactivated");
        this.active=false;
    }

    private boolean userAlreadyHasABike(){
        return this.bike != null;
    }

    public void takeBike(Bike bike){
        if (userAlreadyHasABike()) throw new IllegalArgumentException("The user already has a bike");
        if (getActive().equals(false)) throw new IllegalArgumentException("The user isnt active");
        this.bike = bike;
    }

    public void returnBike(){
        if (!userAlreadyHasABike()) throw new IllegalArgumentException("The user has returned the bike");
        this.bike =null;
    }
}
