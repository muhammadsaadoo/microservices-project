package com.trustify.product_service.services;


import com.trustify.product_service.entities.Product;
import com.trustify.product_service.repositories.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    public ResponseEntity<List<Product>> getProduct(long id) {
        try {
           List<Product> productList=productRepo.findByManufacturerId(id);
           if(productList.isEmpty()){
               return ResponseEntity.notFound().build();
           }
           return ResponseEntity.ok(productList);

        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.internalServerError().build();
        }


    }

}
