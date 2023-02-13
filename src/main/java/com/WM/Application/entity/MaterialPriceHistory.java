package com.WM.Application.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.sql.Timestamp;

@Entity
@Table(name = "materials_price_history")
@Getter
@Setter
public class MaterialPriceHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id_price_history")
    private Long materialPriceId;

    @Column (name = "price")
    private BigDecimal price;

    @Column (name = "price_currency")
    private String currency;

    @Column (name = "price_change")
    private Timestamp changeTimestamp;

    @ManyToOne
    @JoinColumn(name = "materials_id_material", referencedColumnName = "id_material", nullable = false)
    private Material material;

}
