package com.example.student.dto;

import jakarta.validation.constraints.*;

public class StudentDTO {


        private Long id;

        @NotBlank
        private String name;

        @Email
        private String email;

        @NotBlank
        private String phone;

        @NotBlank
        private String department;

        @Min(18)
        private int age;

        private String address;


    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }

    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }
}