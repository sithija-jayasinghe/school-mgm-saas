package com.school.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "fee_categories")
public class FeeCategoriesEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @ManyToOne
    private SchoolEntity school;

    private String name;
}
