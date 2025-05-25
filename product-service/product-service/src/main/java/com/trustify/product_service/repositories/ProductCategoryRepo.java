package com.trustify.product_service.repositories;



import com.trustify.product_service.entities.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductCategoryRepo extends JpaRepository<ProductCategory,Long> {

//    List<Product> findByManufacturerId(Long manufacturerId);

}
