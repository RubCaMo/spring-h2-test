package com.b2b.example.controller;

import com.b2b.example.entity.Product;
import com.b2b.example.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.xml.ws.Response;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductRepository _productRepository;

    @GetMapping("/")
    public List<Product> products(){
        System.out.println("PRODUCTS ALL");
        return (List<Product>) this._productRepository.findAll();
    }

    @RequestMapping(value = "/{name}", method = RequestMethod.GET)
    public ResponseEntity<Product> getProductByName(@PathVariable String name){
        Product product = _productRepository.findByName(name);
        if(product == null){
            return new ResponseEntity<Product>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<Product>(product, HttpStatus.OK);
    }

}
