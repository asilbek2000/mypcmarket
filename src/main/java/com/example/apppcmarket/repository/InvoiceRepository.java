package com.example.apppcmarket.repository;

import com.example.apppcmarket.entity.Invoice;
import com.example.apppcmarket.entity.Product;
import com.example.apppcmarket.projection.CustomInvoice;
import com.example.apppcmarket.projection.CustomProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "invoice",collectionResourceRel = "list", excerptProjection =
        CustomInvoice.class)
public interface InvoiceRepository extends JpaRepository<Invoice,Integer> {
}
