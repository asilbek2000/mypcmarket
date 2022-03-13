package com.example.apppcmarket.projection;

import com.example.apppcmarket.entity.Category;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Category.class)

public interface CustomCategory {
    Integer getId();
    String getName();
    boolean isActive();
}
