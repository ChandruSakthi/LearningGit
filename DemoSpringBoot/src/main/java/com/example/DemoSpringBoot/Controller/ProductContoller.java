package com.example.DemoSpringBoot.Controller;

import com.example.DemoSpringBoot.Entity.Product;
import com.example.DemoSpringBoot.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductContoller {

    @Autowired
    private ProductService productService;

    @PostMapping("/product")
    public Product saveProduct(@RequestBody Product product) {
        return productService.saveProduct(product);
    }

    @DeleteMapping("/product/{id}")
    public void delete(@PathVariable int id) {
        productService.deleteById(id);
    }

    @GetMapping("/product")
    public List<Product> getAll() {
        return productService.findAllProduct();
    }



}
