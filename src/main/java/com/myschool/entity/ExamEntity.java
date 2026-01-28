package com.myschool.entity;

import com.myschool.util.ExamType;
import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;
import java.util.Set;

@Data
@Entity
@Table(name = "exams")
public class ExamEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer examId;

    private String examName;

    @Enumerated(EnumType.STRING)
    private ExamType examType;

    private LocalDate date;

    @ManyToOne
    @JoinColumn(name = "academic_year_id")
    private AcademicYearEntity academicYear;

    // Keep examSubjects - useful for exam scheduling (small collection)
    @OneToMany(mappedBy = "exam")
    private Set<ExamSubjectEntity> examSubjects;

    // High-volume collection removed
    // Use repository queries: markRepository.findByExam(exam)
}