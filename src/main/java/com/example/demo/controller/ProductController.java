package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.entity.Product;

@RequestMapping("/product")
public interface ProductController {

	@GetMapping("/findAll")
	public List<Product> findAllProduct();

	@PostMapping("/")
	public Product save(@RequestBody Product product);
}
