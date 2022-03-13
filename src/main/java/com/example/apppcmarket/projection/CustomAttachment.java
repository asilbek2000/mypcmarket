package com.example.apppcmarket.projection;

import com.example.apppcmarket.entity.Attachment;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Attachment.class)

public interface CustomAttachment {
    Integer getId();
    String getName();
    String getContentType();
     long getSize();

}
