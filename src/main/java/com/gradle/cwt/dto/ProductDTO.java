package com.gradle.cwt.dto;

import com.gradle.cwt.entity.Product;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor
public class ProductDTO {

	private Integer id;
	private String productName;
	private String productdetails;
	private double productPrice;
	
	public ProductDTO(Product product) {
		this.id = product.getId();
		this.productName = product.getProductName();
		this.productdetails = product.getProductdetails();
		this.productPrice = product.getProductPrice();
	}
}
