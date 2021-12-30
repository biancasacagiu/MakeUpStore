package com.example.springcrud.controller;

import com.example.springcrud.model.Product;
import com.example.springcrud.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("api")
public class ProductController {
    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/products")
    public List<Product> getAllProducts(){
        return productRepository.findAll();
    }

    @GetMapping("/products/{id}")
    public Product getProductById(@PathVariable("id") long id) {
        List<Product> products = productRepository.findAll();
        for(Product u: products){
            if(u.getProduct_id() == id){
                return u;
            }
        }
        return null;
    }

    @PostMapping("/products")
    public Product createProduct(@RequestBody Product entity) {
        return productRepository.save(entity);
    }

    @PutMapping("/products/{id}")
    public Product updateUser(@PathVariable("id") long id, @RequestBody Product u){
        Product product = getProductById(id);
        if(u.getAge() != 0) {
            product.setAge(u.getAge());
        }
        if(u.getBrand() != null) {
            product.setBrand(u.getBrand());
        }
        if(u.getCategory() != null) {
            product.setCategory(u.getCategory());
        }
        if(u.getDescription() != null) {
            product.setDescription(u.getDescription());
        }
        if(u.getImg() != null) {
            product.setImg(u.getImg());
        }
        if(u.getQuantity() != 0) {
            product.setQuantity(u.getQuantity());
        }
        if(u.getName() != null) {
            product.setName(u.getName());
        }
        if(u.getPrice() != 0) {
            product.setPrice(u.getPrice());
        }
        if(u.getModel() != null) {
            product.setModel(u.getModel());
        }
        return productRepository.save(product);
    }

    @DeleteMapping("/products/{id}")
    public void deleteProduct(@PathVariable("id") long id){
        productRepository.delete(getProductById(id));
    }
}
