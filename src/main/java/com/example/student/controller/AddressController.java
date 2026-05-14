package com.example.student.controller;

import com.example.student.entity.Address;
import com.example.student.service.AddressService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/address")
public class AddressController {

    private final AddressService service;

    public AddressController(AddressService service) {
        this.service = service;
    }

    @PostMapping
    public Address create(@RequestBody Address address) {
        return service.createAddress(address);
    }

    @GetMapping
    public List<Address> getAll() {
        return service.getAllAddresses();
    }
}

