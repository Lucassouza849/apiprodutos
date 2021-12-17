package com.api.produtos.category.service;

import com.api.produtos.category.domain.Category;
import com.api.produtos.category.repository.CategoryRepository;
import com.api.produtos.category.service.exception.CategoryNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public Optional<Category> search(Integer id){
        Optional<Category> categorySearch = categoryRepository.findById(id);
        if(categorySearch.isEmpty()){
            throw new CategoryNotFoundException("Objeto do id " + id + " não encontrado" + "tipo " + Category.class.getName());
        }
        return categorySearch;
    }

    
}
