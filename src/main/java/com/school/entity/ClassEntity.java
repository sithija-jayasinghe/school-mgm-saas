package com.school.entity;

import jakarta.persistence.*;


@Entity
@Table(name = "classes",
        uniqueConstraints = @UniqueConstraint(
                columnNames = {"school_id","academic_year_id","className","section"}))
public class ClassEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @ManyToOne
    private SchoolEntity school;

    @ManyToOne
    private AcademicYearEntity academicYear;

    private String className;
    private String section;

    @ManyToOne
    private TeacherEntity classTeacher;
}
