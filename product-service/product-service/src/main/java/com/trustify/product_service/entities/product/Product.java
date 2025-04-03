package com.trustify.product_service.entities.product;
import com.trustify.product_service.entities.ProductCategory;
import com.trustify.product_service.entities.ProductImage;
import lombok.Data;

import java.util.List;


@Data
public class Product {

    private Long id;
    private String name;
    private String description;
    private Double price;
    private Long manufacturerId;
    private ProductCategory category=null;
    private List<ProductImage> images=null;
}

