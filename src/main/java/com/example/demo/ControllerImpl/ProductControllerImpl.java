package com.example.demo.ControllerImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.controller.ProductController;
import com.example.demo.entity.Product;
import com.example.demo.service.ProductService;

@RestController
public class ProductControllerImpl implements ProductController {

	@Autowired
	private ProductService productService;

	@Override
	public List<Product> findAllProduct() {
		return productService.findAll();
	}

	@Override
	public Product save(Product product) {
		return productService.save(product);
	}
}
