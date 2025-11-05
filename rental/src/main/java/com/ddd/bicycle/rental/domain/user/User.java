package com.ddd.bicycle.rental.domain.user;

import com.ddd.bicycle.rental.domain.UserId;

public class User {

    private final UserId userId;
    private String name;
    private Boolean active;
    private HasBike hasBike;

    public User(String name,UserId userId,Boolean active){
        if (name == null) throw new IllegalArgumentException("The name cannot be null");
        if (userId == null) throw new IllegalArgumentException("The userId cannot be null");
        if (active == null) throw new IllegalArgumentException("The variable active cannot be null");

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

    public HasBike getHasBike() {
        return hasBike;
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
        return this.hasBike != null;
    }

    public void takeBike(HasBike hasBike){
        if (userAlreadyHasABike()) throw new IllegalArgumentException("The user already has a bike");
        if (getActive().equals(false)) throw new IllegalArgumentException("The user isnt active");
        this.hasBike=hasBike;
    }

    public void returnBike(){
        if (!userAlreadyHasABike()) throw new IllegalArgumentException("The user has returned the bike");
        this.hasBike=null;
    }
}
