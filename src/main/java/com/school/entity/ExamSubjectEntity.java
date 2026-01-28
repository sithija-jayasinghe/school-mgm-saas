package com.school.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "exam_subjects",
        uniqueConstraints = @UniqueConstraint(columnNames = {"exam_id","subject_id"}))
public class ExamSubjectEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @ManyToOne
    @JoinColumn(name = "exam_id", nullable = false)
    private ExamEntity exam;

    @ManyToOne
    @JoinColumn(name = "subject_id", nullable = false)
    private SubjectEntity subject;

    private Double maxMarks;
    private Double minPassMarks;
}
