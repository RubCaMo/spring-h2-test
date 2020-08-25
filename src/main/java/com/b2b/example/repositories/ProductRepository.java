package com.b2b.example.repositories;

import com.b2b.example.entity.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface ProductRepository extends CrudRepository<Product, Integer> {
    //Endpoint: http://localhost:8080/api/v1/products/search/findByName?name=Product1
    Product findByName(@Param("name") String name);
}
