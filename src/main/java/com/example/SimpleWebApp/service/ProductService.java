package com.example.SimpleWebApp.service;

import com.example.SimpleWebApp.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    // Dummy product list
     List<Product> products;

    ProductService(){
        products = new ArrayList<>();
        products.add(new Product(1, "Laptop", 3999.99));
        products.add(new Product(2, "Desktop", 1879.99));
        products.add(new Product(3, "Tablet", 2649.99));
    }

    // Method to return the list of products
    public List<Product> getProducts() {
        return products; // Return the product list instead of null
    }

    public Product getProductById(int prodId){
        for (Product product : products) {
            if (product.getProdId() == prodId) {
                return product;
            }
        }
        // If not found
        return null;
    }
}
