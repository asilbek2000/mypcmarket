package com.example.apppcmarket.repository;

import com.example.apppcmarket.entity.Payment;
import com.example.apppcmarket.entity.Product;
import com.example.apppcmarket.projection.CustomPayment;
import com.example.apppcmarket.projection.CustomProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "payment",collectionResourceRel = "list", excerptProjection =
        CustomPayment.class)
public interface PaymentRepository extends JpaRepository<Payment,Integer> {
}
