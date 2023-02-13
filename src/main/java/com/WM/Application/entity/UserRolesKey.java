package com.WM.Application.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
@Getter
@Setter
@Embeddable
public class UserRolesKey implements Serializable {
    @Column(name = "users_id_user")
    private Long userId;

    @Column(name = "roles_id_role")
    private Long roleId;
}
