package com.example.student.service;

import com.example.student.dto.CourseRequest;
import com.example.student.dto.CourseResponse;
import com.example.student.entity.Course;

import java.util.List;

public interface CourseService {
//    Course createCourse(Course course);
//    List<Course> getAllCourses();

    CourseResponse createCourse(CourseRequest request);

    List<CourseResponse> getAllCourses();

    CourseResponse getCourseById(Long id);

    CourseResponse updateCourse(Long id, CourseRequest request);

    void deleteCourse(Long id);

}
