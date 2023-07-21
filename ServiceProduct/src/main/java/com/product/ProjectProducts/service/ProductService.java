package com.product.ProjectProducts.service;

import com.product.ProjectProducts.dtos.ProductRequestDto;
import com.product.ProjectProducts.dtos.ProductResponseDto;
import com.product.ProjectProducts.entity.Product;
import com.product.ProjectProducts.repository.ProductRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Slf4j
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public void saveProduct(ProductRequestDto dto) {
        Product product = Product.builder()
                .name(dto.getName())
                .description(dto.getDescription())
                .price(dto.getPrice())
                .build();
        repository.save(product);
        log.info("Product {}: Save with exit!", product.getId());
    }

    public List<ProductResponseDto> getAllProducts() {
        List<Product> products = repository.findAll();
        return products.stream().map(this::mapToProductResponse).collect(Collectors.toList());
    }

    private ProductResponseDto mapToProductResponse(Product product) {
        return ProductResponseDto.builder()
                .id(product.getId())
                .name(product.getName())
                .description(product.getDescription())
                .price(product.getPrice())
                .build();
    }
}
