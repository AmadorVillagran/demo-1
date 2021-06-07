package com.example.demo.ControllerImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.controller.IProductController;
import com.example.demo.dto.ProductDTO;
import com.example.demo.service.ProductService;

@RestController
public class ProductControllerImpl implements IProductController {

	@Autowired
	private ProductService productService;

	@Override
	public List<ProductDTO> findAllProduct() {
		return productService.findAll();
	}

	@Override
	public ProductDTO save(ProductDTO productDTO) {
		return productService.save(productDTO);
	}
}
