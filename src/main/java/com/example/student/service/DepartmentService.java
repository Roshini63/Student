package com.example.student.service;

import com.example.student.dto.DepartmentRequest;
import com.example.student.dto.DepartmentResponse;

import java.util.List;

public interface DepartmentService {

    DepartmentResponse create(DepartmentRequest request);

    List<DepartmentResponse> getAll();

    DepartmentResponse getById(Long id);

    void delete(Long id);
}
