package com.api.produtos.categoria.service;

import com.api.produtos.categoria.domain.Category;
import com.api.produtos.categoria.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public Optional<Category> search(Integer id){
        Optional<Category> categorySearch = categoryRepository.findById(id);
        return categorySearch;
    }

    
}
