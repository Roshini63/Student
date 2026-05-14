package com.example.student.service;


import com.example.student.entity.Address;

import java.util.List;

public interface AddressService {

    Address createAddress(Address address);
    List<Address> getAllAddresses();
}

