package com.WM.Application.dao;

import com.WM.Application.entity.InternalOrderHasStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("http://localhost:4200")
@RepositoryRestResource(collectionResourceRel = "internalOrderHasStatus", path = "internal-order-has-status")
public interface InternalOrderHasStatusRepository extends JpaRepository<InternalOrderHasStatus, Long>{
}
