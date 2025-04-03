package com.trustify.manufacturer_service.controllers;


import com.trustify.manufacturer_service.entities.Manufacturer;
import com.trustify.manufacturer_service.services.ManufacturerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/get-manufacturer-by-id/{id}")
    public ResponseEntity<Manufacturer> getManufacturer(@PathVariable("id") long id){

        return manufacturerService.getManufacturer(id);


    }

}
