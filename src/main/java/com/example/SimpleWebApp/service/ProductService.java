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

    public void addProduct(Product prod){
        products.add(prod);
    }

    public int getProductIndex(int prodId) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getProdId() == prodId) {
                return i;
            }
        }
        return -1;
    }

    public void updateProduct(Product prod){
        int prodId = prod.getProdId();
        int index = getProductIndex(prodId);
        if(index!=-1){
            products.set(index, prod);
        }
//        for(int i=0;i<products.size();i++){
//            if(products.get(i).getProdId()==prod.getProdId()){
//                products.set(i,prod);
//            }
//        }
    }

    public void deleteProduct(int prodId){
        int index = getProductIndex(prodId);
        if(index!=-1){
            products.remove(index);
        }
    }
}
