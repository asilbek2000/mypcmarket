package com.example.apppcmarket.repository;

import com.example.apppcmarket.entity.Product;
import com.example.apppcmarket.projection.CustomProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "product",collectionResourceRel = "list", excerptProjection =
        CustomProduct.class)
public interface ProductRepository extends JpaRepository<Product,Integer> {
}
