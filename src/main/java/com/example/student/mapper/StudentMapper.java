package com.example.student.mapper;

import com.example.student.dto.StudentDTO;
import com.example.student.dto.StudentRequest;
import com.example.student.dto.StudentResponse;
import com.example.student.entity.Student;

public class StudentMapper {

    public static Student toEntity(StudentRequest req) {
        Student student = new Student();
        student.setName(req.getName());
        student.setEmail(req.getEmail());
        student.setPhone(req.getPhone());
        student.setDepartment(req.getDepartment());
        student.setAge(req.getAge());
        student.setAddress(req.getAddress());
        student.setPassword(req.getPassword());
        return student;
    }

    public static Student toEntity(StudentDTO dto) {
        Student student = new Student();
        student.setId(dto.getId()); // useful for update
        student.setName(dto.getName());
        student.setEmail(dto.getEmail());
        student.setPhone(dto.getPhone());
        student.setDepartment(dto.getDepartment());
        student.setAge(dto.getAge());
        student.setAddress(dto.getAddress());
        return student;
    }

    public static StudentDTO toDTO(Student student) {
        StudentDTO dto = new StudentDTO();
        dto.setId(student.getId());
        dto.setName(student.getName());
        dto.setEmail(student.getEmail());
        dto.setPhone(student.getPhone());
        dto.setDepartment(student.getDepartment());
        dto.setAge(student.getAge());
        dto.setAddress(student.getAddress());
        return dto;
    }

    public static StudentResponse toResponse(Student student) {
        StudentResponse res = new StudentResponse();
        res.setId(student.getId());
        res.setName(student.getName());
        res.setEmail(student.getEmail());
        res.setDepartment(student.getDepartment());
        res.setAge(student.getAge());
        return res;
    }
}