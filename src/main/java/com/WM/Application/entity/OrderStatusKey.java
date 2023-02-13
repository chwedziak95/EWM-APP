package com.WM.Application.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.io.Serializable;
import java.sql.Timestamp;

@Embeddable
@Getter
@Setter
public class OrderStatusKey implements Serializable {

    @Column(name = "orders_status_id_order_status")
    private Long orderStatusId;

    @Column(name = "orders_id_order")
    private Long orderId;
}
