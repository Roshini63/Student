package com.example.student.dto;

import jakarta.validation.constraints.NotBlank;

public class CourseRequest {

    @NotBlank
    private String courseName;

    private String duration;
    private String trainer;

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getTrainer() {
        return trainer;
    }

    public void setTrainer(String trainer) {
        this.trainer = trainer;
    }
}