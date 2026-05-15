package com.example.student.service;

import com.example.student.dto.StudentDTO;
import com.example.student.dto.StudentRequest;
import com.example.student.dto.StudentResponse;
import com.example.student.entity.Student;

import java.util.List;

public interface StudentService {
    Student createStudent(Student student);
//    List<Student> getAllStudents();
    Student getStudentById(Long id);
    Student updateStudent(Long id, Student student);
    void deleteStudent(Long id);

    List<Student> getStudentsByDepartment(String department);
    List<Student> getStudentsByAge(int age);

    Student getStudentByEmail(String email);
    long countStudentsByDepartment(String department);
    void deleteAllStudents();

    List<StudentDTO> getAllStudents();
    StudentDTO createStudent(StudentDTO studentDTO);


    StudentResponse registerStudent(StudentRequest request);

    StudentResponse login(String email, String password);


}