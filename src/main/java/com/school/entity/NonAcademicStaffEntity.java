package com.school.entity;

import jakarta.persistence.*;

import java.time.LocalDate;


@Entity
@Table(name = "non_academic_staff")
public class NonAcademicStaffEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @OneToOne
    private UserEntity user;

    @ManyToOne
    private SchoolEntity school;

    private String jobTitle;
    private String department;
    private LocalDate joiningDate;
}
