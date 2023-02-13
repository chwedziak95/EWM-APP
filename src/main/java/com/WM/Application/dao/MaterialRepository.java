package com.WM.Application.dao;

import com.WM.Application.entity.Material;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@CrossOrigin("http://localhost:4200")
@RepositoryRestResource(collectionResourceRel = "materials", path = "materials")
@Repository
public interface MaterialRepository extends JpaRepository<Material, Long> {

    @Query("SELECT m FROM Material m JOIN FETCH m.materialCategory")
    List<Material> findAllWIthMaterialCategory();



}
