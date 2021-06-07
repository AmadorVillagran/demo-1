package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Mapper.IProductMapper;
import com.example.demo.dto.ProductDTO;
import com.example.demo.entity.Product;
import com.example.demo.repository.IProductRespository;

@Service
public class ProductService {

	@Autowired
	private IProductRespository productRepository;

	public List<ProductDTO> findAll() {
		return IProductMapper.INSTANCE.productListToProductDTOList(productRepository.findAll());
	}

	public ProductDTO save(ProductDTO productDTO) {
		Product product = IProductMapper.INSTANCE.productDTOToProduct(productDTO);
		return IProductMapper.INSTANCE.productToProductDTO(productRepository.save(product));
	}
}
