package com.WM.Application.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.sql.Timestamp;

@Entity
@Getter
@Setter
public class InternalOrderHasStatus {
    @EmbeddedId
    private InternalOrderHasStatusKey internalOrderHasStatusId;

    @ManyToOne
    @MapsId("internalOrderId")
    @JoinColumn(name = "warehouse_orders_id_warehouse_order")
    private InternalOrder internalOrder;

    @ManyToOne
    @MapsId("internalOrderStatusId")
    @JoinColumn(name = "warehouse_orders_status_id_warehouse_order_status")
    private InternalOrderStatus internalOrderStatus;

    @ManyToOne
    @JoinColumn(name = "id_user")
    private User user;

    @Column(name = "creation_timestamp")
    @CreationTimestamp
    private Timestamp creationTimestamp;

}
