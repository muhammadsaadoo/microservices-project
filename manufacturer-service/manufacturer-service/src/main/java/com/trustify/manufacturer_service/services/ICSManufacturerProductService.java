package com.trustify.manufacturer_service.services;

import com.trustify.manufacturer_service.clients.ProductClient;
import com.trustify.manufacturer_service.dto.ManufacturerProductDto;
import com.trustify.manufacturer_service.entities.Manufacturer;
import com.trustify.manufacturer_service.entities.product.Product;
import com.trustify.manufacturer_service.repositories.ManufacturerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class ICSManufacturerProductService {
    public ICSManufacturerProductService(ProductClient productClient) {
        this.productClient = productClient;
    }

    @Autowired
    private ManufacturerRepo manufacturerRepo;

    @Autowired
    private ManufacturerService manufacturerService;

    @Autowired
    private  RestTemplate restTemplate;

    private ProductClient productClient;


    public ResponseEntity<?> getManufacturerDetails(long id) {
        ResponseEntity<Manufacturer> manufacturerResponse = manufacturerService.getManufacturer(id);

        if (manufacturerResponse.getStatusCode() != HttpStatus.OK) {
            return ResponseEntity.status(manufacturerResponse.getStatusCode()).build();
        }

        Manufacturer manufacturer = manufacturerResponse.getBody();
        if (manufacturer == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Manufacturer not found");
        }

//        String productServiceUrl = "http://PRODUCT-SERVICE:8082/product-service/get-product-by-manufacturer-id/" + id;
//        ResponseEntity<Product[]> productResponse = restTemplate.getForEntity(productServiceUrl, Product[].class);
        ResponseEntity<Product[]> productResponse =productClient.getProduct(id);
        if (productResponse.getStatusCode() != HttpStatus.OK || productResponse.getBody() == null) {
            return ResponseEntity.status(productResponse.getStatusCode()).body("Product not found");
        }

        Product[] products = productResponse.getBody();
        ManufacturerProductDto response = new ManufacturerProductDto(manufacturer, Arrays.asList(products));

        return ResponseEntity.ok(response);
    }


}
