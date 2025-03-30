package com.trustify.manufacturer_service.repositories;


import com.trustify.manufacturer_service.entities.Manufacturer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ManufacturerRepo extends JpaRepository<Manufacturer,Long> {

    Optional<Manufacturer> findByEmail(String email);
}
