package com.trustify.product_service.controllers;



import com.trustify.product_service.entities.Product;
import com.trustify.product_service.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping
    public ResponseEntity<?> addMProduct(@RequestBody Product product){

        System.out.println(product);
        return productService.addProduct(product);



    }

    @GetMapping("/{id}")
    public ResponseEntity<List<Product>> getProductByManufacturerId(@PathVariable("id") long id){


        System.out.println("api call.....................");
        return productService.getProduct(id);



    }

}
