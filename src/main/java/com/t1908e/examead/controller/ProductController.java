package com.t1908e.examead.controller;

import com.t1908e.examead.dto.ProductDTO;
import com.t1908e.examead.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@CrossOrigin
@RestController
@RequestMapping("/api/products")
public class ProductController {
    @Autowired
    private ProductRepository productRepository;
    @RequestMapping(method = RequestMethod.GET)
    public List<ProductDTO> getList() {
        return productRepository.findAll().stream().map(item -> new ProductDTO(item)).collect(Collectors.toList());
    }
}
