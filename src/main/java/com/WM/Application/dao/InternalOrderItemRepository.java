package com.WM.Application.dao;

import com.WM.Application.entity.InternalOrderItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("http://localhost:4200")
@RepositoryRestResource(collectionResourceRel = "internalOrderItem", path = "internal-order-item")
public interface InternalOrderItemRepository extends JpaRepository<InternalOrderItem, Long> {
}
