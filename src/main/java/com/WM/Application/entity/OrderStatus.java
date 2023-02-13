package com.WM.Application.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;


@Entity
@Table(name = "orders_status")
@Getter
@Setter
public class OrderStatus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id_order_status")
    private Long orderStatusId;

    @Column (name = "name")
    private String nameOrderStatus;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "status")
    private Set<OrderHasOrderStatus> OrderHasOrderStatuses;
}
