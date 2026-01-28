package com.school.entity;


import com.school.util.ExamType;
import jakarta.persistence.*;

@Entity
@Table(name = "exams")
public class ExamEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @ManyToOne
    private AcademicYearEntity academicYear;

    @ManyToOne
    private TermEntity term;

    private String examName;

    @Enumerated(EnumType.STRING)
    private ExamType examType;
}
