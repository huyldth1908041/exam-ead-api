package com.t1908e.examead.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String prodName;
    private String Description;
    private Date dateOfManf;
    private double price;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "product", cascade = CascadeType.ALL)
    private Set<Sale> sales;

    public Product(String prodName, String description, Date dateOfManf, double price) {
        this.prodName = prodName;
        Description = description;
        this.dateOfManf = dateOfManf;
        this.price = price;
    }

    public void addSale(Sale sale) {
        if(this.sales == null) {
            this.sales = new HashSet<>();
        }
        this.sales.add(sale);
    }

}
