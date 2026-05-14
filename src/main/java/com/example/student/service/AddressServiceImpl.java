package com.example.student.service;

import com.example.student.entity.Address;
import com.example.student.repository.AddressRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressServiceImpl implements AddressService {

    private final AddressRepository repo;

    public AddressServiceImpl(AddressRepository repo) {
        this.repo = repo;
    }

    @Override
    public Address createAddress(Address address) {
        return repo.save(address);
    }

    @Override
    public List<Address> getAllAddresses() {
        return repo.findAll();
    }
}