package com.trustify.manufacturer_service.services;

import com.trustify.manufacturer_service.entities.Manufacturer;
import com.trustify.manufacturer_service.repositories.ManufacturerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ManufacturerService {
    @Autowired
    private ManufacturerRepo manufacturerRepo;

    public ResponseEntity<Manufacturer> addManufacturer(Manufacturer newMAnufacturer){
        try{
            Manufacturer manufacturer=manufacturerRepo.save(newMAnufacturer);
            return ResponseEntity.ok(manufacturer);
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.internalServerError().build();
        }



    }
}
