package com.WM.Application.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Entity
@Table(name = "warehouse_orders")
@Data

public class InternalOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id_warehouse_order")
    private Long internalOrderId;

    @Column (name = "pickup_location")
    private String internalOrderPickupLocation;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "internalOrder")
    private Set<InternalOrderItem> internalOrderItems;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "internalOrder")
    private Set<InternalOrderHasStatus> internalOrderHasStatus;

}
