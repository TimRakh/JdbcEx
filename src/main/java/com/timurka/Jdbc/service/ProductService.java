package com.timurka.Jdbc.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    public List<String> getProductName(String name) {
        return productRepository.getProductName(name);
    }
}