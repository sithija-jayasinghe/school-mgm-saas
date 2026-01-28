package com.school.entity;


import com.school.util.Gender;
import com.school.util.Status;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "students")
public class StudentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @OneToOne
    private UserEntity user;

    @ManyToOne
    private SchoolEntity school;

    @Column(unique = true)
    private String admissionNumber;

    private LocalDate admissionDate;
    private LocalDate dateOfBirth;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    @ManyToOne
    private ClassEntity currentClass;

    @Enumerated(EnumType.STRING)
    private Status status;
}
