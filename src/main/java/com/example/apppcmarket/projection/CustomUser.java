package com.example.apppcmarket.projection;

import com.example.apppcmarket.entity.User;
import org.springframework.data.rest.core.config.Projection;

import java.util.Set;
@Projection(types = User.class)

public interface CustomUser {
     Integer getId();
     String getFirstName();
     String getLastName();
     String getPhoneNumber();
    String getPassword();

}
