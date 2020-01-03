package com.cassandra.cassandraDemo.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cassandra.cassandraDemo.Dao.ProductDao;
import com.cassandra.cassandraDemo.Enity.ProductEnity;

@Service
public class ProductService {
	
	@Autowired
	ProductDao productDao;

	public ProductEnity saveProduct(ProductEnity productEnity) {
		return productDao.saveProduct(productEnity);
	}

	public List<ProductEnity> getAllProducts() {
		return productDao.getAllProducts();
	}

	public ProductEnity getProductById(int id) {

		return productDao.getProductById(id);
	}

	public ProductEnity getProductByName(String name) {
		return productDao.getProductByName(name);
	}

	public List<ProductEnity> getProductsBetweenCreationDates(LocalDateTime startDate, LocalDateTime endDate) {
		return productDao.getProductsBetweenCreationDates(startDate, endDate);
	}
	
//	public EmployeeEnity saveEmployee(EmployeeEnity employeeEnity) {
//		return employeeDao.saveEmployee(employeeEnity);
//	}
//
	
//	public List<EmployeeEnity> getAllEmployees() {
//		return employeeDao.getAllEmployees();
//	}
//
//	public EmployeeEnity getEmployeeById(int id) {
//		return employeeDao.getEmployeeById(id);
//	}
//
//	public EmployeeEnity getEmployeeByName(String name) {
//		return employeeDao.getEmployeeByName(name);
//	}

}
