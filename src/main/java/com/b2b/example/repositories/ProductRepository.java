package com.b2b.example.repositories;

import com.b2b.example.entity.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Integer> {
    Product findByName(String name);
}
