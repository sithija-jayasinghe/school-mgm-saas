package com.school.entity;

import jakarta.persistence.*;

import java.time.LocalDate;


@Entity
@Table(name = "teachers")
public class TeacherEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @OneToOne
    private UserEntity user;

    @ManyToOne
    private SchoolEntity school;

    private String qualification;
    private String specialization;
    private LocalDate joiningDate;
}
