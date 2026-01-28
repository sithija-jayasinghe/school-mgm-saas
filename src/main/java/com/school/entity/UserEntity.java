package com.school.entity;

import com.school.util.Status;
import jakarta.persistence.*;


import java.time.LocalDateTime;


@Entity
@Table(name = "users")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @ManyToOne
    private SchoolEntity school;

    @ManyToOne
    private RoleEntity role;

    @Column(unique = true)
    private String username;

    private String passwordHash;
    private String email;
    private String phone;

    @Enumerated(EnumType.STRING)
    private Status status;

    private LocalDateTime lastLogin;
    private LocalDateTime createdAt;

}
