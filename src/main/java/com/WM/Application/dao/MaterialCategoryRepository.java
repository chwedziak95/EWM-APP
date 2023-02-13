package com.WM.Application.dao;

import com.WM.Application.entity.MaterialCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("http://localhost:4200")
@RepositoryRestResource(collectionResourceRel = "materialCategory", path = "material-category")
@Repository
public interface MaterialCategoryRepository extends JpaRepository<MaterialCategory, Long> {

}
