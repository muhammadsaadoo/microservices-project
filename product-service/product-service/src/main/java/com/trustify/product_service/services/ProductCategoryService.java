package com.trustify.product_service.services;


import com.trustify.product_service.entities.Product;
import com.trustify.product_service.entities.ProductCategory;
import com.trustify.product_service.repositories.ProductCategoryRepo;
import com.trustify.product_service.repositories.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductCategoryService {
    @Autowired
    private ProductCategoryRepo productCategoryRepo;

    public ResponseEntity<ProductCategory> addProductCategory(ProductCategory productCategory){
        try{
            ProductCategory productCategory1=productCategoryRepo.save(productCategory);
            return ResponseEntity.ok(productCategory1);
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.internalServerError().build();
        }


    }
//
//    public ResponseEntity<List<Product>> getProduct(long id) {
//        try {
//           List<Product> productList=productRepo.findByManufacturerId(id);
//           if(productList.isEmpty()){
//               return ResponseEntity.notFound().build();
//           }
//           return ResponseEntity.ok(productList);
//
//        } catch (Exception e) {
//            e.printStackTrace();
//            return ResponseEntity.internalServerError().build();
//        }
//
//
//    }

}
