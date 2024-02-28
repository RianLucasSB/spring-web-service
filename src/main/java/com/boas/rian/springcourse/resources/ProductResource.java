package com.boas.rian.springcourse.resources;

import com.boas.rian.springcourse.entities.Product;
import com.boas.rian.springcourse.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductResource {

    ProductService productService;

    @Autowired
    public ProductResource(ProductService productService){
        this.productService = productService;
    }
    @GetMapping
    public ResponseEntity<List<Product>> findAll(){
        List<Product> products = productService.findAll();

        return ResponseEntity.ok().body(products);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Product> findById(@PathVariable Long id){
        Product product = productService.findById(id);

        return ResponseEntity.ok().body(product);
    }
}
