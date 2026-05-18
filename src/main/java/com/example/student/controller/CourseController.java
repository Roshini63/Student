package com.example.student.controller;

import com.example.student.dto.CourseRequest;
import com.example.student.dto.CourseResponse;
import com.example.student.service.CourseService;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/courses")
public class CourseController {

    private final CourseService service;

    public CourseController(CourseService service) {
        this.service = service;
    }

    @PostMapping
    public CourseResponse create(@RequestBody @Valid CourseRequest request) {
        return service.createCourse(request);
    }

    @GetMapping
    public List<CourseResponse> getAll() {
        return service.getAllCourses();
    }

    @GetMapping("/{id}")
    public CourseResponse getById(@PathVariable Long id) {
        return service.getCourseById(id);
    }

    @PutMapping("/{id}")
    public CourseResponse update(
            @PathVariable Long id,
            @RequestBody CourseRequest request) {
        return service.updateCourse(id, request);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id) {
        service.deleteCourse(id);
        return "Course deleted successfully";
    }
}