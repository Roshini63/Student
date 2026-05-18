package com.example.student.mapper;

import com.example.student.dto.*;
import com.example.student.entity.Department;

public class DepartmentMapper {

    public static Department toEntity(DepartmentRequest req) {
        Department d = new Department();
        d.setName(req.getName());
        d.setHead(req.getHead());
        return d;
    }

    public static DepartmentResponse toResponse(Department d) {
        DepartmentResponse res = new DepartmentResponse();
        res.setId(d.getId());
        res.setName(d.getName());
        res.setHead(d.getHead());
        return res;
    }
}
