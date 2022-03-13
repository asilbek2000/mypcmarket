package com.example.apppcmarket.projection;

import com.example.apppcmarket.entity.Invoice;
import com.example.apppcmarket.entity.Payment;
import com.example.apppcmarket.entity.User;
import org.springframework.data.rest.core.config.Projection;

import java.sql.Timestamp;

@Projection(types = Payment.class)
public interface CustomPayment {


    Integer getId();
    Double getAmount();
    Timestamp getTimestamp();
    Invoice getInvoice();

}
