package com.trustify.product_service.controllers;



import com.trustify.product_service.entities.Product;
import com.trustify.product_service.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product-service")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping
    public ResponseEntity<?> addMProduct(@RequestBody Product product){

        System.out.println(product);
        return productService.addProduct(product);



    }

    @GetMapping("/get-product-by-manufacturer-id/{id}")
    public ResponseEntity<List<Product>> getProductByManufacturerId(@PathVariable("id") long id){


        return productService.getProduct(id);



    }

}
