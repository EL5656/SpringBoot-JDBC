package com.example.SimpleWebApp.controller;

import com.example.SimpleWebApp.model.Product;
import com.example.SimpleWebApp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {
    ProductService service;

    ProductController(ProductService service){
        this.service = service;
    }

    @RequestMapping("/products")
    public List getProducts(){
        return service.getProducts();
    }

    @RequestMapping("/products/{prodId}")
    public Product getProductById(@PathVariable int prodId){
        return service.getProductById(prodId);
    }
}
