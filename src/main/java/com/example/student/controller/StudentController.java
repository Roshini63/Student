package com.example.student.controller;

import com.example.student.dto.StudentDTO;
import com.example.student.dto.StudentRequest;
import com.example.student.dto.StudentResponse;
import com.example.student.entity.Student;
import com.example.student.service.StudentService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    private final StudentService service;

    public StudentController(StudentService service) {
        this.service = service;
    }

    @GetMapping
    public List<StudentDTO> getAll() {
        return service.getAllStudents();
    }

    @PostMapping
    public StudentDTO create(@RequestBody @Valid StudentDTO dto) {
        return service.createStudent(dto);
    }

    @GetMapping("/{id}")
    public Student getById(@PathVariable Long id) {
        return service.getStudentById(id);
    }

    @PutMapping("/{id}")
    public Student update(@PathVariable Long id, @RequestBody Student student) {
        return service.updateStudent(id, student);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id) {
        service.deleteStudent(id);
        return "Deleted successfully";
    }

    @GetMapping("/department/{dept}")
    public List<Student> getByDepartment(@PathVariable String dept) {
        return service.getStudentsByDepartment(dept);
    }

    @GetMapping("/age/{age}")
    public List<Student> getByAge(@PathVariable int age) {
        return service.getStudentsByAge(age);
    }

    @GetMapping("/email/{email}")
    public Student getByEmail(@PathVariable String email) {
        return service.getStudentByEmail(email);
    }

    @GetMapping("/count/{dept}")
    public long countByDepartment(@PathVariable String dept) {
        return service.countStudentsByDepartment(dept);
    }

    @DeleteMapping("/all")
    public String deleteAll() {
        service.deleteAllStudents();
        return "All students deleted";
    }

    @PostMapping("/register")
    public StudentResponse register(@RequestBody @Valid StudentRequest request) {
        return service.registerStudent(request);
    }

    @PostMapping("/login")
    public StudentResponse login(
            @RequestParam String email,
            @RequestParam String password) {
        return service.login(email, password);
    }
}