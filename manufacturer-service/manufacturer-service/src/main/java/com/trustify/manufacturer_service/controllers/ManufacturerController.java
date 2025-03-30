package com.trustify.manufacturer_service.controllers;


import com.trustify.manufacturer_service.entities.Manufacturer;
import com.trustify.manufacturer_service.services.ManufacturerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/manufacturer-service")
public class ManufacturerController {

    @Autowired
    private ManufacturerService manufacturerService;

    @PostMapping
    public ResponseEntity<?> addManufacturer(@RequestBody Manufacturer manufacturerdata){

        System.out.println(manufacturerdata);
        return manufacturerService.addManufacturer(manufacturerdata);



    }

}
