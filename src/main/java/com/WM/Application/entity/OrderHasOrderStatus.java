package com.WM.Application.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.sql.Timestamp;

@Entity
@Table(name = "warehouse_orders_has_warehouse_orders_status")
@Getter
@Setter

public class OrderHasOrderStatus {

    @EmbeddedId
    private OrderStatusKey orderHasOrderStatusKeyId;

    @ManyToOne
    @MapsId("OrderStatusId")
    @JoinColumn(name = "orders_status_id_order_status")
    private OrderStatus status;

    @ManyToOne
    @MapsId("OrderId")
    @JoinColumn(name = "orders_id_order")
    private Order order;

    @ManyToOne
    @JoinColumn(name = "users_id_user")
    private User user;

    @Column (name = "creation_timestamp")
    @CreationTimestamp
    private Timestamp creationTimestamp;
}
