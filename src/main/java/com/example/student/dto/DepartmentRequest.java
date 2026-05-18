package com.example.student.dto;

import jakarta.validation.constraints.NotBlank;

public class DepartmentRequest {

    @NotBlank
    private String name;

    private String head;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }
}