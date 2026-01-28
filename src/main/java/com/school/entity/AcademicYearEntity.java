package com.school.entity;

import jakarta.persistence.*;

import java.time.LocalDate;


@Entity
@Table(name = "academic_years",
        uniqueConstraints = @UniqueConstraint(columnNames = {"school_id","yearName"}))
public class AcademicYearEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @ManyToOne
    private SchoolEntity school;

    private String yearName;
    private LocalDate startDate;
    private LocalDate endDate;
    private boolean active;
}
