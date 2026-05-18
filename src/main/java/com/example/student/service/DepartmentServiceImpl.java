package com.example.student.service;

import com.example.student.dto.DepartmentRequest;
import com.example.student.dto.DepartmentResponse;
import com.example.student.entity.Department;
import com.example.student.exception.ResourceNotFoundException;
import com.example.student.mapper.DepartmentMapper;
import com.example.student.repository.DepartmentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    private final DepartmentRepository repo;

    public DepartmentServiceImpl(DepartmentRepository repo) {
        this.repo = repo;
    }

    public DepartmentResponse create(DepartmentRequest request) {
        return DepartmentMapper.toResponse(repo.save(
                DepartmentMapper.toEntity(request)
        ));
    }

    public List<DepartmentResponse> getAll() {
        return repo.findAll()
                .stream()
                .map(DepartmentMapper::toResponse)
                .toList();
    }

    public DepartmentResponse getById(Long id) {
        Department d = repo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Department not found"));
        return DepartmentMapper.toResponse(d);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
}