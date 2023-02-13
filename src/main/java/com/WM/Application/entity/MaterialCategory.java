package com.WM.Application.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Entity
@Table(name = "material_categories")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder


public class MaterialCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id_material_category")
    private int materialCategoryId;

    @Column (name = "name")
    private String nameMaterialCategory;

    @OneToMany(mappedBy = "materialCategory")
    private List<Material> materials;

}

