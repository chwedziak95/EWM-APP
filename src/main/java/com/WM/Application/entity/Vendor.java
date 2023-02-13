package com.WM.Application.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "vendors")
@Getter
@Setter

public class Vendor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_vendor")
    private Long vendorId;

    @Column(name = "name_vendor")
    private String vendorName;

    @Column(name = "street")
    private String street;

    @Column(name = "house_number")
    private String houseNumber;

    @Column(name = "flat_number")
    private String flatNumber;

    @Column(name = "zipcode")
    private String zipCode;

    @Column(name = "city")
    private String city;

    @Column(name = "country")
    private String country;

    @Column(name = "email")
    private String email;

    @Column(name = "phone")
    private String phone;

    @Column(name = "nip")
    private String nip;

    @Column(name = "regon")
    private String regon;

    @Column(name = "krs")
    private String krs;

    @Column(name = "bank_name")
    private String bankName;

    @Column(name = "bank_number")
    private String bankNumber;

    @Column(name = "description")
    private String description;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "vendor")
    private List<Material> materials;

}
