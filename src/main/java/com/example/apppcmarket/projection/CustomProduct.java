package com.example.apppcmarket.projection;

import com.example.apppcmarket.entity.Attachment;
import com.example.apppcmarket.entity.Category;
import com.example.apppcmarket.entity.Product;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Product.class)

public interface CustomProduct {
    Integer getId();
     String getName();

     Category getCategory();
      String getDescription();
     Attachment getPhoto();
}
