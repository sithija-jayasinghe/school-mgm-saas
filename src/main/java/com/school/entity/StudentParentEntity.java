package com.school.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "student_parents")
public class StudentParentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private StudentEntity student;

    @ManyToOne
    @JoinColumn(name = "parent_id")
    private ParentEntity parent;

    private String relationship;
    private boolean emergencyContact;
}
