package com.cassandra.cassandraDemo.Dao;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cassandra.cassandraDemo.Enity.ProductEnity;
import com.cassandra.cassandraDemo.Repository.ProductRepository;

@Component
public class ProductDao {
	
	@Autowired
	ProductRepository productRepository;

	public ProductEnity saveProduct(ProductEnity productEnity) {
		return productRepository.save(productEnity);
	}
	
	public List<ProductEnity> getAllProducts() {
		return (List<ProductEnity>) productRepository.findAll();
	}

	public ProductEnity getProductById(int id) {
		return productRepository.findById(id).get();
	}

	public ProductEnity getProductByName(String name) {
		return productRepository.findByName(name);
	}

	public List<ProductEnity> getProductsBetweenCreationDates(LocalDateTime startDate, LocalDateTime endDate) {
		return productRepository.findAllByCreationDateBetween(startDate, endDate);
	}
}
