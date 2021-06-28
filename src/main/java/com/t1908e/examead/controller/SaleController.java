package com.t1908e.examead.controller;

import com.t1908e.examead.dto.SaleDTO;
import com.t1908e.examead.repository.SaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@CrossOrigin
@RestController
@RequestMapping("/api/sales")
public class SaleController {
    @Autowired
    private SaleRepository saleRepository;
    @RequestMapping(method = RequestMethod.GET)
    public List<SaleDTO> getList() {
        return saleRepository.findAll().stream().map(item -> new SaleDTO(item)).collect(Collectors.toList());
    }
}
