package com.tsm.address.controller;

import com.tsm.address.entity.Address;
import com.tsm.address.service.AddressService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/address")
@Slf4j
public class AddressController {

        @Autowired
        private AddressService addressService;

        @PostMapping
        public Address saveAddress(@RequestBody Address address) {
            log.info("Inside saveAddress method of AddressController");
            return  addressService.saveAddress(address);
        }

        @GetMapping("/{id}")
        public Address findDAddressById(@PathVariable Integer id) {
            log.info("Inside findDAddressById method of AddressController");
            return addressService.findAddressById(id);
        }

    }
