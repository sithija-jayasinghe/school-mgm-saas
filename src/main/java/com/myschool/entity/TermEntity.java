package com.myschool.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "terms")
public class TermEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer termId;

    private String termName;
    private LocalDate startDate;
    private LocalDate endDate;

    @ManyToOne
    @JoinColumn(name = "academic_year_id")
    private AcademicYearEntity academicYear;
}
