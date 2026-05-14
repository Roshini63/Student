package com.example.student.repository;

import com.example.student.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {
    List<Student> findByDepartment(String department);

    List<Student> findByAgeGreaterThan(int age);

    Student findByEmail(String email);
}