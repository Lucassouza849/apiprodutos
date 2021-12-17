package com.api.produtos;

import com.api.produtos.category.domain.Category;
import com.api.produtos.category.repository.CategoryRepository;
import com.api.produtos.products.domain.Products;
import com.api.produtos.products.repository.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class ProdutosApplication{
	public static void main(String[] args) {
		SpringApplication.run(ProdutosApplication.class, args);
	}
}
