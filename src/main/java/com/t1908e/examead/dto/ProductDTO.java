package com.t1908e.examead.dto;

import com.t1908e.examead.entity.Product;
import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ProductDTO {
    private int id;
    private String prodName;
    private String Description;
    private Date dateOfManf;
    private double price;
    public ProductDTO(Product product) {
        this.id = product.getId();
        this.dateOfManf = product.getDateOfManf();
        this.price = product.getPrice();
        this.prodName= product.getProdName();
        this.Description = product.getDescription();
    }
}
