package com.example.apppcmarket.repository;

import com.example.apppcmarket.entity.Order;
import com.example.apppcmarket.projection.CustomOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "order",collectionResourceRel = "list", excerptProjection =
        CustomOrder.class)
public interface OrderRepository extends JpaRepository<Order,Integer> {
}
