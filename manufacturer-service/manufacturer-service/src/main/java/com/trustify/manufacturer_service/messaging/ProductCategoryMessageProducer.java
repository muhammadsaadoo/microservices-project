package com.trustify.manufacturer_service.messaging;

import com.trustify.manufacturer_service.entities.product.ProductCategory;
import jakarta.annotation.PostConstruct;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductCategoryMessageProducer {

    @Autowired
    private final RabbitTemplate rabbitTemplate;

    public ProductCategoryMessageProducer(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    @PostConstruct
    public void sendMessage(){
        ProductCategory productCategory=new ProductCategory();
        productCategory.setId(1L);
        productCategory.setName("laptop");
        rabbitTemplate.convertAndSend("productCategoryQueue",productCategory);

    }
}
