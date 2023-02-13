package com.WM.Application.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.minidev.json.annotate.JsonIgnore;
import org.springframework.data.annotation.CreatedDate;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "materials")
@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor


public class Material {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id_material")
    private Long idMaterial;
    @ManyToOne(
            cascade =  CascadeType.ALL,
            fetch = FetchType.EAGER
    )
    @JsonIgnore
    @JoinColumn(
            name = "material_categories_id_material_category",
            referencedColumnName = "id_material_category",
            nullable = false
    )
    private MaterialCategory materialCategory;

    @ManyToOne
    @JoinColumn(name = "vendors_id_vendor", nullable = false)
    private Vendor vendor;

    @Column (name = "number")
    private String numberMaterial;

    @Column (name = "name")
    private String nameMaterial;

    @Column (name = "stock_quantity")
    private int stockQuantityMaterial;

    @Column (name = "unit_of_measure")
    private String unitOfMeasureMaterial;

    @Column (name = "price")
    private BigDecimal priceMaterial;

    @Column (name = "ean")
    private String eanMaterial;

    @Column (name = "creation_date")
    @CreatedDate
    private Date creationDateMaterial;

    @Column (name = "safe_stock")
    private int safeStockMaterial;

    @Column (name = "description")
    private String descriptionMaterial;

    /*
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "material")
    private Set<MaterialPriceHistory> materialPriceHistories;

     */

}
