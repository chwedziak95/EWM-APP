package com.WM.Application.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "orders_item")
@Getter
@Setter

public class OrderItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id_order_item")
    private Long orderItemId;

    @Column (name = "quantity")
    private int quantity;

    @ManyToOne
    @JoinColumn(name = "orders_id_order")
    private Order order;

}
