package com.myschool.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;
import java.util.Set;

@Data
@Entity
@Table(name = "academic_years")
public class AcademicYearEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer academicYearId;

    @ManyToOne
    @JoinColumn(name = "school_id")
    private SchoolEntity school;

    private String yearName;
    private LocalDate startDate;
    private LocalDate endDate;
    private Boolean isActive;

    // Keep only terms - small collection (typically 2-4 per year)
    @OneToMany(mappedBy = "academicYear")
    private Set<TermEntity> terms;

    // High-volume collections removed
    // Use repository queries: classRepository.findByAcademicYear(academicYear)
    // Use repository queries: examRepository.findByAcademicYear(academicYear)
}