package com.example.apppcmarket.projection;

import com.example.apppcmarket.entity.Attachment;
import com.example.apppcmarket.entity.AttachmentContent;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = AttachmentContent.class)

public interface CustomAttachmentContent {
    Integer getId();

     byte[] getBytes();

     Attachment getAttachment();

}
