package com.example.student.controller;

import com.example.student.dto.DepartmentRequest;
import com.example.student.dto.DepartmentResponse;
import com.example.student.service.DepartmentService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/departments")
public class DepartmentController {

    private final DepartmentService service;

    public DepartmentController(DepartmentService service) {
        this.service = service;
    }

    @PostMapping
    public DepartmentResponse create(@RequestBody @Valid DepartmentRequest req) {
        return service.create(req);
    }

    @GetMapping
    public List<DepartmentResponse> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public DepartmentResponse getById(@PathVariable Long id) {
        return service.getById(id);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id) {
        service.delete(id);
        return "Deleted successfully";
    }
}