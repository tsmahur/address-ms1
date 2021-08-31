package com.tsm.address.service;

import com.tsm.address.entity.Address;
import com.tsm.address.repository.AddressRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class AddressService {

        @Autowired
        private AddressRepository addressRepository;

        public Address saveAddress(Address address) {
            log.info("Inside saveAddress of AddressService");
            return addressRepository.save(address);
        }

        public Address findAddressById(Integer id) {
            log.info("Inside findAddressById of AddressService");
            return addressRepository.findById(id).orElseThrow(()->new RuntimeException("Address not found !!"));
        }
    }
