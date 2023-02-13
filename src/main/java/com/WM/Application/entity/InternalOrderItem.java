package com.WM.Application.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Table(name = "warehouse_orders_items")
@Getter
@Setter

public class InternalOrderItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id_warehouse_order_item")
    private Long internalOrderItemId;

    @ManyToOne
    @JoinColumn(name = "id_warehouse_order", nullable = false)
    private InternalOrder internalOrder;

    @Column (name = "quantity")
    private BigDecimal quantity;

}
