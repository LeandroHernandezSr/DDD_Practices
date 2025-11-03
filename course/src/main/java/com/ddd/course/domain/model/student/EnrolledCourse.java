package com.ddd.course.domain.model.student;

import com.ddd.course.domain.model.CourseId;

public class EnrolledCourse {
    
    private final CourseId id;
    private final String name;
    private EnrolledCurseState state;


    public EnrolledCourse(CourseId id ,String name) {
        this.id = id;
        this.name=name;
        this.state=EnrolledCurseState.ACTIVE;
    }

    public String getName() {
        return name;
    }

    public CourseId getId(){
        return this.id;
    }

    public EnrolledCurseState getState() {
        return state;
    }

    public void setCurseCompleted(){
        this.state=EnrolledCurseState.COMPLETE;
    }
}
