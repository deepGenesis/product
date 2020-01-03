package com.cassandra.cassandraDemo.Controllers;

import java.time.LocalDateTime;
import java.util.List;
import javax.ws.rs.QueryParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cassandra.cassandraDemo.Enity.ProductEnity;
import com.cassandra.cassandraDemo.service.ProductService;

@RestController
public class DemoController {
	
	@Autowired
	ProductService productService;
	
    @RequestMapping(value="/saveProduct" , method = RequestMethod.POST)
      public ProductEnity saveProduct(@RequestBody ProductEnity productEnity) {
	  return productService.saveProduct(productEnity);
}
    
    @RequestMapping(value = "/getAllProduts", method = RequestMethod.GET)
    public List<ProductEnity> getAllProducts(){
    	return productService.getAllProducts();
    }
    
    @RequestMapping(value = "/getProductById", method = RequestMethod.GET)
    public ProductEnity getProductById(@QueryParam(value = "") int id){
    	return productService.getProductById(id);
    }
    
    @RequestMapping(value = "/getProductByName", method = RequestMethod.GET)
    public ProductEnity getProductByName(@QueryParam(value = "") String name){
    	return productService.getProductByName(name);
    }
    
    @RequestMapping(value = "/getProductsBetweenCreationDates", method = RequestMethod.GET)
    public List<ProductEnity> getProductsBetweenCreationDates(@QueryParam(value = "")  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime startDate, @QueryParam(value = "endDate")
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime endDate){
    	return productService.getProductsBetweenCreationDates(startDate, endDate);
    }
    
    
}
