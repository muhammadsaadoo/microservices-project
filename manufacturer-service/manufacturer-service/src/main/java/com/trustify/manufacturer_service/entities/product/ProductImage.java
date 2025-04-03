package com.trustify.manufacturer_service.entities.product;
import jakarta.persistence.*;
import lombok.Data;

@Data
public class ProductImage {
    private Long id;
    private String imageUrl;
    private Product product;
}

