package com.WM.Application.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "order_status")
@Getter
@Setter
public class InternalOrderStatus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_order_status")
    private Long orderStatusId;

    @Column(name = "name")
    private String orderStatusName;

}
