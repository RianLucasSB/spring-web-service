package com.boas.rian.springcourse.resources;

import com.boas.rian.springcourse.entities.Category;
import com.boas.rian.springcourse.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/categories")
public class CategoryResource {

    CategoryService categoryService;

    @Autowired
    public CategoryResource(CategoryService categoryService){
        this.categoryService = categoryService;
    }
    @GetMapping
    public ResponseEntity<List<Category>> findAll(){
        List<Category> categorys = categoryService.findAll();

        return ResponseEntity.ok().body(categorys);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Category> findById(@PathVariable Long id){
        Category category = categoryService.findById(id);

        return ResponseEntity.ok().body(category);
    }
}
