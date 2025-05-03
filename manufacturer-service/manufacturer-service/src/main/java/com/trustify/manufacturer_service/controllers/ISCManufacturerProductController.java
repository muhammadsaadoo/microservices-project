package com.trustify.manufacturer_service.controllers;


import com.trustify.manufacturer_service.services.ICSManufacturerProductService;
import com.trustify.manufacturer_service.services.ManufacturerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/manufacturer/manufacturer-details")
public class ISCManufacturerProductController {

    @Autowired
    private ManufacturerService manufacturerService;

    @Autowired
    private ICSManufacturerProductService icsManufacturerProductService;

    //we use inter service communication betweeen Manufacturer and product
    @GetMapping("/manufacturer-id/{id}")
    public ResponseEntity<?> getManufacturerDetails(@PathVariable("id") long manufacturerId){
        return icsManufacturerProductService.getManufacturerDetails(manufacturerId);

    }

}
