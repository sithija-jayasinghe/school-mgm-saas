package com.school.entity;

import jakarta.persistence.*;

import java.time.LocalDate;



@Entity
@Table(name = "terms")
public class TermEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @ManyToOne
    private AcademicYearEntity academicYear;

    private String name;
    private LocalDate startDate;
    private LocalDate endDate;
}
