package com.trustify.product_service.services;


import com.trustify.product_service.entities.Product;
import com.trustify.product_service.repositories.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    @Autowired
    private ProductRepo productRepo;

    public ResponseEntity<Product> addProduct(Product newProduct){
        try{
            Product manufacturer=productRepo.save(newProduct);
            return ResponseEntity.ok(manufacturer);
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.internalServerError().build();
        }



    }
}
