package com.ddd.course.domain.model;

import java.util.UUID;

public class StudentId {
    
    private final UUID id;

    public StudentId(UUID id) {
        this.id = id;
    }

    public UUID getId() {
        return id;
    }

}
