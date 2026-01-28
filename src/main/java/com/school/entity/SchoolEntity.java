package com.school.entity;

import com.school.util.Status;
import jakarta.persistence.*;

@Entity
@Table(name = "schools")
public class SchoolEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String name;

    @Column(unique = true)
    private String code;

    private String address;
    private String contactEmail;
    private String contactPhone;
    private String logoUrl;

    @Enumerated(EnumType.STRING)
    private Status status;
}
