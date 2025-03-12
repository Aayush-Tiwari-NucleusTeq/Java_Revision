package dev.work.prac.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.work.prac.entities.Product;
import dev.work.prac.repository.ProductRepository;
import dev.work.prac.services.ProductService;

@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	private ProductRepository productRepository;

	@Override
	public List<Product> getAllProducts() {
		return this.productRepository.findAll();
	}

}
