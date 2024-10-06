package com.example.WebApp.service;

import com.example.WebApp.model.Product;
import com.example.WebApp.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    @Autowired
    ProductRepo repo;
     //List<Product> products;

//    ProductService(){
//        products = new ArrayList<>();
//        products.add(new Product(1, "Laptop", 3999.99));
//        products.add(new Product(2, "Desktop", 1879.99));
//        products.add(new Product(3, "Tablet", 2649.99));
//    }

    // Method to return the list of products
    public List<Product> getProducts() {
        return repo.findAll();
    }

    public Product getProductById(int prodId){
        return repo.findById(prodId).orElse(new Product());//orElse blank object
    }

    public void addProduct(Product prod){
        repo.save(prod);
    }

    public void updateProduct(Product prod){
        repo.save(prod);
    }

    public void deleteProduct(int prodId){
       repo.deleteById(prodId);
    }
}
