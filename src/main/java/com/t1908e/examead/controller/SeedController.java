package com.t1908e.examead.controller;

import com.t1908e.examead.entity.Product;
import com.t1908e.examead.entity.Sale;
import com.t1908e.examead.repository.ProductRepository;
import com.t1908e.examead.repository.SaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@CrossOrigin
@RestController
@RequestMapping("/api/seed")
public class SeedController {
    @Autowired
    ProductRepository productRepository;

    @Autowired
    SaleRepository saleRepository;

    @RequestMapping(method = RequestMethod.GET)
    public String runSeed() {
        //reset
        productRepository.deleteAll();
        //add  records
        Product product1 = new Product("computer", "gaming computer", new Date(), 200.00);
        product1.addSale(new Sale(1, "huy", new Date(), product1));
        productRepository.save(product1);

        Product product2 = new Product("mouse", "gaming mouse", new Date(), 100.00);
        product1.addSale(new Sale(2, "huydz", new Date(), product2));
        productRepository.save(product2);

        Product product3 = new Product("keyboard", "gaming keyboard", new Date(), 500.00);
        product1.addSale(new Sale(3, "huan", new Date(), product3));
        productRepository.save(product3);

        Product product4 = new Product("cpu", "gaming cpu", new Date(), 900.00);
        product1.addSale(new Sale(5, "huong", new Date(), product4));
        productRepository.save(product4);

        Product product5 = new Product("fan", "gaming fan", new Date(), 700.00);
        product1.addSale(new Sale(4, "hung", new Date(), product5));
        productRepository.save(product5);

        return "ok";

    }
}
