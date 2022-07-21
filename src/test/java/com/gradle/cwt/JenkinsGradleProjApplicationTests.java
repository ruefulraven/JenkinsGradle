package com.gradle.cwt;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import com.gradle.cwt.entity.Product;
import com.gradle.cwt.service.ProductService;
import com.gradle.cwt.service.ProductServiceImpl;

@SpringBootTest
class JenkinsGradleProjApplicationTests {
	@Autowired
	private ProductService service;
	
	
	@Test
	void contextLoads() {
	}
	
	@Test
	public void returnProject() {
		List<Product> procutList = service.getAllProducts();
		procutList = null;
		Assert.isNull(procutList, "Object must be null");
		//procutList = service.getAllProducts();
		Assert.isTrue(procutList.size() > 0, "Size must be less than 0");
		System.out.println("You have reached First Task");
	}

}
