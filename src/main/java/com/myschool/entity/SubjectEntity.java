package com.myschool.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "subjects")
public class SubjectEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer subjectId;

    @ManyToOne
    @JoinColumn(name = "school_id")
    private SchoolEntity school;

    private String subjectName;
    private String subjectCode;

    // Bidirectional collections removed - subjects are used in many places
    // Use repository queries: classSubjectRepository.findBySubject(subject)
    // Use repository queries: examSubjectRepository.findBySubject(subject)
    // Use repository queries: markRepository.findBySubject(subject)
}