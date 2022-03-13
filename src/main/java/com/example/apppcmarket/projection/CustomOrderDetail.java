package com.example.apppcmarket.projection;

import com.example.apppcmarket.entity.Order;
import com.example.apppcmarket.entity.OrderDetail;
import com.example.apppcmarket.entity.Product;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = OrderDetail.class)

public interface CustomOrderDetail {

    Integer getId();
    Integer  getQuantity();
    Product getProduct();
    Order getOrder();
    /*
     private ;
    private ;
    @ManyToOne
    private ;
    @ManyToOne
    private ;
     */
}
