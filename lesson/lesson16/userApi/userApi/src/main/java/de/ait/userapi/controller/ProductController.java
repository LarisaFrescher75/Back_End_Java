package de.ait.userapi.controller;

import de.ait.userapi.dto.ProductRequestDto;
import de.ait.userapi.dto.ProductResponseDto;
import de.ait.userapi.service.ProductService;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ProductController {
    private final ProductService service;

    @GetMapping("/users")
    public List<ProductResponseDto> getProducts(){
        return service.getAllProducts();
    }

    @GetMapping("/users/{id}")
    public ProductResponseDto getById(@PathVariable(name = "id") Long productId){
        return service.getProductById(productId);
    }

    @PostMapping("/users")
    public ProductResponseDto addProduct(@RequestBody ProductRequestDto dto){
        return service.addProduct(dto);
    }



}

