package com.WM.Application.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "orders")
@Getter
@Setter

public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id_order")
    private Long orderId;

    @Column (name = "internal_ref_number")
    private String internalRefNumber;

    @Column (name = "expected_delivery_date")
    private Date expectedDeliveryDate;

    @Column (name = "comment")
    private String comment;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "order")
    private Set<OrderItem> orderItems;


}
