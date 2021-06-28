package com.t1908e.examead.dto;

import com.t1908e.examead.entity.Sale;
import lombok.*;

import java.util.Date;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class SaleDTO {
    private int siNo;
    private int salesmanId;
    private String salesmanName;
    private Date dos;
    private String productName;

    public SaleDTO(Sale sale) {
        this.dos = sale.getDos();
        this.productName = sale.getProduct().getProdName();
        this.siNo = sale.getSiNo();
        this.salesmanName = sale.getSalesmanName();
        this.salesmanId = sale.getSalesmanId();
    }
}
