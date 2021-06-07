package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.dto.ProductDTO;

@RequestMapping("/product")
public interface ProductController {

	@GetMapping("/findAll")
	public List<ProductDTO> findAllProduct();

	@PostMapping("/")
	public ProductDTO save(@RequestBody ProductDTO product);
}
