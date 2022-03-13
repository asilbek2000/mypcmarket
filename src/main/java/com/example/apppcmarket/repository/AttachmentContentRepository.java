package com.example.apppcmarket.repository;

import com.example.apppcmarket.entity.AttachmentContent;
import com.example.apppcmarket.projection.CustomAttachmentContent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "attachmentcontent",collectionResourceRel = "list",
        excerptProjection =
        CustomAttachmentContent.class)
public interface AttachmentContentRepository extends JpaRepository<AttachmentContent,Integer> {

}
