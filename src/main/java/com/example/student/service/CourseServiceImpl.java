

package com.example.student.service;

import com.example.student.dto.CourseRequest;
import com.example.student.dto.CourseResponse;
import com.example.student.entity.Course;
import com.example.student.mapper.CourseMapper;
import com.example.student.repository.CourseRepository;
import com.example.student.exception.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {

    private final CourseRepository repo;

    public CourseServiceImpl(CourseRepository repo) {
        this.repo = repo;
    }

    @Override
    public CourseResponse createCourse(CourseRequest request) {
        Course course = CourseMapper.toEntity(request);
        return CourseMapper.toResponse(repo.save(course));
    }

    @Override
    public List<CourseResponse> getAllCourses() {
        return repo.findAll()
                .stream()
                .map(CourseMapper::toResponse)
                .toList();
    }

    @Override
    public CourseResponse getCourseById(Long id) {
        Course c = repo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Course not found"));
        return CourseMapper.toResponse(c);
    }

    @Override
    public CourseResponse updateCourse(Long id, CourseRequest request) {
        Course c = repo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Course not found"));

        c.setCourseName(request.getCourseName());
        c.setDuration(request.getDuration());
        c.setTrainer(request.getTrainer());

        return CourseMapper.toResponse(repo.save(c));
    }

    @Override
    public void deleteCourse(Long id) {
        Course c = repo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Course not found"));
        repo.delete(c);
    }
}