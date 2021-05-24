package com.gig.productapi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gig.productapi.model.Product;
import com.gig.productapi.repo.ProductRepo;

@RestController
@RequestMapping("/productapi")
public class ProductController {

	@Autowired
	ProductRepo productRepo;
	
	@RequestMapping(value="/product", method=RequestMethod.POST)
	public Product createProduct(@RequestBody Product product) {
		return productRepo.save(product);
	}
	
	@RequestMapping(value="/product/{name}" , method = RequestMethod.GET)
	public Product getProduct(@PathVariable("name")  String name) {
		return productRepo.findByName(name);
	}
}
