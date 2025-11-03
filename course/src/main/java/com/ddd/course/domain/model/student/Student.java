package com.ddd.course.domain.model.student;

import java.util.ArrayList;
import java.util.List;

import com.ddd.course.domain.model.StudentId;

public class Student {

    private final StudentId id;
    private final String name;
    private final String email;
    private final List<EnrolledCourse> enrolledCourses = new ArrayList<>();

    public Student(StudentId id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public StudentId getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public List<EnrolledCourse> getEnrolledCourses() {
        return List.copyOf(enrolledCourses);
    }

    private boolean validateLimitCourses() {
        return this.enrolledCourses.size() < 5;
    }

    private boolean isEnrolled(EnrolledCourse course) {
        return this.enrolledCourses
                .stream()
                .anyMatch(c -> c.getId().equals(course.getId()));
    }

    public void addCourse(EnrolledCourse course) {
        
        if (!validateLimitCourses()) throw new IllegalStateException("The limit of courses has reached");
        if (isEnrolled(course)) throw new IllegalStateException("You're already enrolled");
        
        this.enrolledCourses.add(course);
        
    }

    public void completeCourse(EnrolledCourse course){
        if(isEnrolled(course)){
            this.enrolledCourses
            .forEach(c->{
                if(c.getId().equals(course.getId())){
                    c.setCurseCompleted();
                }
            });
        }
    }
}
