package com.example.apppcmarket.repository;

import com.example.apppcmarket.entity.Category;
import com.example.apppcmarket.projection.CustomCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "category",collectionResourceRel = "list", excerptProjection =
        CustomCategory.class)
public interface CategoryRepository extends JpaRepository<Category,Integer> {
}
