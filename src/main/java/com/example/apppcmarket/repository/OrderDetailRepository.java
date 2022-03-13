package com.example.apppcmarket.repository;

import com.example.apppcmarket.entity.Invoice;
import com.example.apppcmarket.entity.OrderDetail;
import com.example.apppcmarket.projection.CustomInvoice;
import com.example.apppcmarket.projection.CustomOrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "orderDetail",collectionResourceRel = "list", excerptProjection =
        CustomOrderDetail.class)
public interface OrderDetailRepository extends JpaRepository<OrderDetail,Integer> {
}
