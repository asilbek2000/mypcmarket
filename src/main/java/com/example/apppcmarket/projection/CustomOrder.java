package com.example.apppcmarket.projection;

import com.example.apppcmarket.entity.Invoice;
import com.example.apppcmarket.entity.Order;
import com.example.apppcmarket.entity.User;
import org.springframework.data.rest.core.config.Projection;

import java.sql.Date;

@Projection(types = Order.class)

public interface CustomOrder {

    Integer getId();
    Date getOrderDate();
    User getUser();
    /*
     private ;
    private Date orderDate;
    @ManyToOne
    private User user;
     */
}
