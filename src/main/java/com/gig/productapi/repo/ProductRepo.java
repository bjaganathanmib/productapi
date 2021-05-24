package com.gig.productapi.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gig.productapi.model.Product;

public interface ProductRepo extends JpaRepository<Product, Long>{

	Product findByName(String name);

}
