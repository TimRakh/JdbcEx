package com.timurka.Jdbc.controller;

import com.timurka.Jdbc.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/products")

public class Controller {

    private final ProductService productService;

    @GetMapping("/fetch-product")
    public List<String> fetchProduct(@RequestParam(value = "name", required = false) String name) {
        return productService.getProductName(name);

    }

}
