package com.gradle.cwt.entity;

import com.gradle.cwt.dto.ProductDTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor
public class Product {

	private Integer id;
	private String productName;
	private String productdetails;
	private double productPrice;
	
	
	public Product(ProductDTO dto) {
		this.id = dto.getId();
		this.productName = dto.getProductName();
		this.productdetails = dto.getProductdetails();
		this.productPrice = dto.getProductPrice();
	}
	
}
