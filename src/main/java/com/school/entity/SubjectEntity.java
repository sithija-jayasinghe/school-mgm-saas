package com.school.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "subjects")
public class SubjectEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @ManyToOne
    private SchoolEntity school;

    private String subjectName;
    private String subjectCode;
}
