package com.WM.Application.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter

public class UserRoles {
    @EmbeddedId
    UserRolesKey id;

    @ManyToOne
    @MapsId("userId")
    @JoinColumn(name = "users_id_user")
    private User user;

    @ManyToOne
    @MapsId("roleId")
    @JoinColumn(name = "roles_id_role")
    private Roles role;
}
