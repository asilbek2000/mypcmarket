package com.example.apppcmarket.repository;

import com.example.apppcmarket.entity.User;
import com.example.apppcmarket.projection.CustomUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "users",collectionResourceRel = "list", excerptProjection =
        CustomUser.class)
public interface UserRepository extends JpaRepository<User,Integer> {
}
