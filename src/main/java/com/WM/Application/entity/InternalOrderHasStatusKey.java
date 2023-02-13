package com.WM.Application.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Embeddable
@Getter
@Setter
public class InternalOrderHasStatusKey implements Serializable {

    @Column(name = "warehouse_orders_status_id_warehouse_order_status")
    private Long internalOrderStatusId;

    @Column(name = "warehouse_orders_id_warehouse_order")
    private Long internalOrderId;
}
