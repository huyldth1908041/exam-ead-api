package com.t1908e.examead.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Date;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Sale {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int siNo;
    private int salesmanId;
    private String salesmanName;
    private Date dos;

    public Sale(int salesmanId, String salesmanName, Date dos) {
        this.salesmanId = salesmanId;
        this.salesmanName = salesmanName;
        this.dos = dos;
    }

    public Sale(int salesmanId, String salesmanName, Date dos, Product product) {
        this.salesmanId = salesmanId;
        this.salesmanName = salesmanName;
        this.dos = dos;
        this.product = product;
    }

    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    @JoinColumn(name = "prodId")
    private Product product;
    @Column(insertable = false, updatable = false)
    private int prodId;
}
