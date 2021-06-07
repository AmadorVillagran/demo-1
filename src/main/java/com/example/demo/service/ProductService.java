package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Mapper.ProductMapper;
import com.example.demo.dto.ProductDTO;
import com.example.demo.entity.Product;
import com.example.demo.repository.IProductRespository;

@Service
public class ProductService {

	@Autowired
	private IProductRespository productRepository;

	public List<ProductDTO> findAll() {
		return ProductMapper.INSTANCE.productListToProductDTOList(productRepository.findAll());
	}

	public ProductDTO save(ProductDTO product) {
		Product prd = ProductMapper.INSTANCE.productDTOToProduct(product);
		return ProductMapper.INSTANCE.productToProductDTO(productRepository.save(prd));
	}
}
