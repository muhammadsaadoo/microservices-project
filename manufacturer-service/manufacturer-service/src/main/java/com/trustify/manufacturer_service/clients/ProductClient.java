package com.trustify.manufacturer_service.clients;

import com.trustify.manufacturer_service.entities.product.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="product-service")
public interface ProductClient {

    @GetMapping("/products/{id}")
    ResponseEntity<Product[]> getProduct(@PathVariable("id") long id);
}
