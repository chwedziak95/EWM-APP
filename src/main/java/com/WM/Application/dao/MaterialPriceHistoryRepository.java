package com.WM.Application.dao;

import com.WM.Application.entity.MaterialPriceHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("http://localhost:4200")
@RepositoryRestResource(collectionResourceRel = "materialPriceHistory", path = "material-price-history")
public interface MaterialPriceHistoryRepository extends JpaRepository<MaterialPriceHistory, Long> {
}
