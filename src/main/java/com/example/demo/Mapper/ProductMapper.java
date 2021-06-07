package com.example.demo.Mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.example.demo.dto.ProductDTO;
import com.example.demo.entity.Product;

@Mapper
public interface ProductMapper {

	ProductMapper INSTANCE = Mappers.getMapper(ProductMapper.class);
	
	Product productDTOToProduct(ProductDTO productDTO);
	
	ProductDTO productToProductDTO(Product product);
	
	List<Product> productoDTOListToProductList(List<ProductDTO> productDTOList);
	
	List<ProductDTO> productListToProductDTOList(List<Product> productList);
}
