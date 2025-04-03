package com.trustify.manufacturer_service.entities.product;
import jakarta.persistence.*;
import lombok.Data;

@Data
public class ProductCategory {
    private Long id;
    private String name;
}

