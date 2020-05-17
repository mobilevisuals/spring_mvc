package com.example.productsdb.service;

import java.util.List;

import com.example.productsdb.domain.Product;
import com.example.productsdb.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProductService {

	private ProductRepository repo;

	@Autowired
	public ProductService(ProductRepository repo) {
		this.repo = repo;
	}

	public List<Product> listAll() {
		return repo.findAll();
	}

	@Transactional
	public void save(Product product) {
		repo.save(product);
	}
	
	public Product get(long id) {
		return repo.findById(id).get();
	}

	@Transactional
	public void delete(long id) {
		repo.deleteById(id);
	}
}
