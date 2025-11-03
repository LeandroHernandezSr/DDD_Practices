package com.ddd.course.domain.model;

import java.util.UUID;

public class CourseId {

    private UUID id;

    public CourseId(UUID id) {
        if (id  == null) throw new IllegalStateException("The id cannot be null");
        this.id = id;
    }

    public UUID getId() {
        return id;
    }

}
