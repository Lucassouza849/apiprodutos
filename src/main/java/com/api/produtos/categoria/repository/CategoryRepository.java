package com.api.produtos.categoria.repository;

import com.api.produtos.categoria.domain.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository  extends JpaRepository<Category, Integer> {


}
