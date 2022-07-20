package com.gradle.cwt.controller;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gradle.cwt.entity.Product;
import com.gradle.cwt.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	ProductService service;
	
	@GetMapping("/getAllProducts")
	public List<Product> getAllProducts(){
		return service.getAllProducts();
	}
}
