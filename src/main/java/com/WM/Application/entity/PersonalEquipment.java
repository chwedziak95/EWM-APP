package com.WM.Application.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "personal_equipments")
@Getter
@Setter

public class PersonalEquipment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id_personal_equipment")
    private Long personalEquipmentId;

    @ManyToOne
    @JoinColumn(name = "users_id_user", nullable = false)
    private User user;

    @Column (name = "name")
    private String name;

    @Column (name = "internal_number")
    private String internalNumber;

    @Column (name = "manufacturer")
    private String manufacturer;

    @Column (name = "model")
    private String model;

    @Column (name = "serial_number")
    private String serialNumber;

    @Column (name = "purchase_date")
    private Date purchaseDate;

    @Column (name = "purchase_price")
    private BigDecimal purchasePrice;

    @Column (name = "purchase_currency")
    private String purchaseCurrency;

    @Column (name = "warranty_date")
    private Date warrantyDate;

    @Column (name = "invoice_file")
    private String invoiceFile;

}
