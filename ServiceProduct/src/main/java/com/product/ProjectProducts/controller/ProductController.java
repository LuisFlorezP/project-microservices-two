package com.product.ProjectProducts.controller;

import com.product.ProjectProducts.dtos.ProductRequestDto;
import com.product.ProjectProducts.dtos.ProductResponseDto;
import com.product.ProjectProducts.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/productsUdemy")
public class ProductController {

    @Autowired
    private ProductService service;

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public void saveProduct(@RequestBody ProductRequestDto dto) {
        service.saveProduct(dto);
    }

    @PostMapping("/products")
    @ResponseStatus(HttpStatus.OK)
    public List<ProductResponseDto> getAllProducts() {
        return service.getAllProducts();
    }
}
