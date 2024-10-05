package com.example.SimpleWebApp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    @RequestMapping("/product")
    public String getProducts(){
        return "Hello world";
    }
}
