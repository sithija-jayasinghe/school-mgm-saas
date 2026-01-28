package com.school.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "parents")
public class ParentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @OneToOne
    private UserEntity user;

    private String occupation;
}
