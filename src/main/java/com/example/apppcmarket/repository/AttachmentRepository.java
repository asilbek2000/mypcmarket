package com.example.apppcmarket.repository;

import com.example.apppcmarket.entity.Attachment;
import com.example.apppcmarket.projection.CustomAttachment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "attachment",collectionResourceRel = "list",
        excerptProjection =
                CustomAttachment.class)
public interface AttachmentRepository extends JpaRepository<Attachment,Integer> {
}
