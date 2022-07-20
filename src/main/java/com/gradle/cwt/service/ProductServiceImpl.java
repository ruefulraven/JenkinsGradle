package com.gradle.cwt.service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.stereotype.Service;

import com.gradle.cwt.entity.Product;

@Service
public class ProductServiceImpl implements ProductService{

	@Override
	public List<Product> getAllProducts() {
		return getTempProducts();
	}
	
	public List<Product> getTempProducts(){
		return Stream.of(
			new Product(1, "Prod1", "Details1", 12.12),
			new Product(1, "Prod2", "Details2", 13.13)
				).collect(Collectors.toList());
	}

	
}
