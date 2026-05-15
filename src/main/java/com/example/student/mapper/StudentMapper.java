package com.example.student.mapper;

import com.example.student.dto.StudentDTO;
import com.example.student.entity.Student;

public class StudentMapper {

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

    public static Student toEntity(StudentDTO dto) {
        Student student = new Student();
        student.setName(dto.getName());
        student.setEmail(dto.getEmail());
        student.setPhone(dto.getPhone());
        student.setDepartment(dto.getDepartment());
        student.setAge(dto.getAge());
        student.setAddress(dto.getAddress());
        return student;
    }
}