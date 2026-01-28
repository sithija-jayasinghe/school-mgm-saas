package com.school.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "marks",
        uniqueConstraints = @UniqueConstraint(columnNames = {"exam_subject_id","student_id"}))
public class MarksEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @ManyToOne
    private ExamSubjectEntity examSubject;

    @ManyToOne
    private StudentEntity student;

    private Double marksObtained;
    private String teacherRemarks;
}
