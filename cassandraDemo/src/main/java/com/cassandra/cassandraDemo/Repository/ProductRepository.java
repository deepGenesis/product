package com.cassandra.cassandraDemo.Repository;

import java.time.LocalDateTime;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cassandra.cassandraDemo.Enity.ProductEnity;

@Repository

public interface ProductRepository extends CrudRepository<ProductEnity, Integer> {

	ProductEnity findByName(String name);

	public List<ProductEnity> findAllByCreationDateBetween(LocalDateTime startDate, LocalDateTime endDate);
}
