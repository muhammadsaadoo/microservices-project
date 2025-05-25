package com.trustify.product_service.messaging;

import com.trustify.product_service.entities.Product;
import com.trustify.product_service.entities.ProductCategory;
import com.trustify.product_service.services.ProductCategoryService;
import com.trustify.product_service.services.ProductService;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductCategoryConsumer {
    @Autowired
    private ProductCategoryService productCategoryService;

    @RabbitListener(queues = "productCategoryQueue")
    public void consumeMessage(ProductCategory productCategory){
        try{
            System.out.println(productCategory);
//            productCategoryService.addProductCategory(productCategory);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }



    }
}
