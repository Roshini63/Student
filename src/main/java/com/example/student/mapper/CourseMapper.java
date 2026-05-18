package com.example.student.mapper;

import com.example.student.dto.CourseRequest;
import com.example.student.dto.CourseResponse;
import com.example.student.entity.Course;

public class CourseMapper {

    public static Course toEntity(CourseRequest req) {
        Course c = new Course();
        c.setCourseName(req.getCourseName());
        c.setDuration(req.getDuration());
        c.setTrainer(req.getTrainer());
        return c;
    }

    public static CourseResponse toResponse(Course c) {
        CourseResponse res = new CourseResponse();
        res.setId(c.getId());
        res.setCourseName(c.getCourseName());
        res.setDuration(c.getDuration());
        res.setTrainer(c.getTrainer());
        return res;
    }
}