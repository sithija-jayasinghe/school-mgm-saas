package com.myschool.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;
import java.time.LocalTime;

@Data
@Entity
@Table(name = "exam_subjects")
public class ExamSubjectEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer examSubjectId;

    @ManyToOne
    @JoinColumn(name = "exam_id")
    private ExamEntity exam;

    @ManyToOne
    @JoinColumn(name = "subject_id")
    private SubjectEntity subject;

    private LocalDate date;
    private LocalTime startTime;
    private LocalTime endTime;
    private Integer durationMinutes;

    @ManyToOne
    @JoinColumn(name = "invigilator_id")
    private TeacherEntity invigilator;
}
