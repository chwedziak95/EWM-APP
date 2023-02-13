package com.WM.Application.dao;

import com.WM.Application.entity.InternalOrderStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("http://localhost:4200")
@RepositoryRestResource(collectionResourceRel = "internalOrderStatus", path = "internal-order-status")
public interface InternalOrderStatusRepository extends JpaRepository<InternalOrderStatus, Long> {
}
