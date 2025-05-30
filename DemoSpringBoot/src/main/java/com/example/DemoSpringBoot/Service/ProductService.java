package com.example.DemoSpringBoot.Service;

import com.example.DemoSpringBoot.Entity.Product;
import com.example.DemoSpringBoot.Repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepo productRepo;

    public Product saveProduct(Product product){
        Product savedProduct1=  productRepo.save(product);
        return  savedProduct1;
    }
    public void deleteById(int id){
        productRepo.deleteById(id);
    }

    public List<Product> findAllProduct() {
        return productRepo.findAll();
    }
}
