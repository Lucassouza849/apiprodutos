package com.api.produtos;

import com.api.produtos.categoria.domain.Category;
import com.api.produtos.categoria.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class ProdutosApplication implements CommandLineRunner {

	@Autowired
	private CategoryRepository categoryRepository;

	public static void main(String[] args) {
		SpringApplication.run(ProdutosApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Category cat1 = new Category(null, "escritório");
		Category cat2 = new Category(null, "informática");

		categoryRepository.saveAll(Arrays.asList(cat1, cat2));
	}
}
