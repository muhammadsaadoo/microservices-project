package com.trustify.manufacturer_service.services;

import com.trustify.manufacturer_service.entities.Manufacturer;
import com.trustify.manufacturer_service.repositories.ManufacturerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ManufacturerService {
    @Autowired
    private ManufacturerRepo manufacturerRepo;

    public ResponseEntity<Manufacturer> addManufacturer(Manufacturer newMAnufacturer) {
        try {
            Manufacturer manufacturer = manufacturerRepo.save(newMAnufacturer);
            return ResponseEntity.ok(manufacturer);
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.internalServerError().build();
        }


    }

    public ResponseEntity<Manufacturer> getManufacturer(long id) {
        try {
            Optional<Manufacturer> manufacturer = manufacturerRepo.findById(id);
            return manufacturer.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.internalServerError().build();
        }


    }
}

