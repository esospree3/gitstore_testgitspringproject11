package com.git.test.example11.gitTest11.controller;

import com.git.test.example11.gitTest11.model.Product;
import com.git.test.example11.gitTest11.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    public ProductService productService;

    @PostMapping("/addproducts")
    public List<Product> addProducts(@RequestBody List<Product> products) {
        return productService.addProducts(products);
    }

    @PostMapping("/addproduct")
    public Product addProducts(@RequestBody  Product product) {
        return productService.addProduct(product);
    }

    @GetMapping("/getproducts")
    public List<Product> addProducts() {
        return productService.getProducts();
    }



}
