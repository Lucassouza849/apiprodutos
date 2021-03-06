package com.api.produtos.category.controller;

import com.api.produtos.category.domain.Category;
import com.api.produtos.category.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/categories")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Category>> find(@PathVariable  Integer id){

            Optional<Category> categoryFind = categoryService.search(id);
            return ResponseEntity.ok().body(categoryFind);
    }
}
