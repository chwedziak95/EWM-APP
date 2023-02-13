package com.WM.Application.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.sql.Timestamp;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "users")
@Data

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id_user")
    private Long userId;


    @Column (name = "username")
    private String userUserName;

    @Column (name = "user_email")
    private String userEmailAddress;

    @Column (name = "password")
    private String userPassword;

    @Column (name = "timestampcreated")
    @CreationTimestamp
    private Timestamp userCrationTimestamp;

    @Column (name = "name")
    private String userName;

    @Column (name = "surname")
    private String userSurname;

    @Column (name = "position")
    private String userPosition;

    @Column (name = "employment_start")
    private Date userEmploymentStartDate;

    @Column (name = "employment_end")
    private Date userEmploymentEndDate;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
    private Set<PersonalEquipment> personalEquipment;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
    private Set<UserRoles> userRoles;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
    private Set<OrderHasOrderStatus> orderHasOrderStatuses;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
    private Set<InternalOrderHasStatus> internalOrderHasStatuses;
}
