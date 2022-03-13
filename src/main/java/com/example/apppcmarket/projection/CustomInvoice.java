package com.example.apppcmarket.projection;

import com.example.apppcmarket.entity.Category;
import com.example.apppcmarket.entity.Invoice;
import com.example.apppcmarket.entity.Order;
import org.springframework.data.rest.core.config.Projection;

import java.sql.Date;

@Projection(types = Invoice.class)

public interface CustomInvoice {

    Integer getId();
    Order getOrder();
    Double getAmount();
    Date getIssued();
    Date getDue();
    /*
    private
    @OneToOne
    private ;
    private Double amount;
    private Date issued;
    private Date due;
     */
}
