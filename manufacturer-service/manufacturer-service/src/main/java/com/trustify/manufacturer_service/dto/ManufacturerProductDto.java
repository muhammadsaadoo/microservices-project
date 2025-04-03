package com.trustify.manufacturer_service.dto;

import com.trustify.manufacturer_service.entities.Manufacturer;
import com.trustify.manufacturer_service.entities.product.Product;
import lombok.Data;

import java.util.List;

@Data
public class ManufacturerProductDto {
    private Manufacturer manufacturer;
    private List<Product> product;

    public ManufacturerProductDto(Manufacturer manufacturer, List<Product> product) {
        this.manufacturer=manufacturer;
        this.product=product;
    }
}
