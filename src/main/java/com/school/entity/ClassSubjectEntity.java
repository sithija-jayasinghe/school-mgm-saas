package com.school.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "class_subjects",
        uniqueConstraints = @UniqueConstraint(columnNames = {"class_id","subject_id"}))
public class ClassSubjectEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @ManyToOne
    private ClassEntity schoolClass;

    @ManyToOne
    private SubjectEntity subject;

    @ManyToOne
    private TeacherEntity teacher;
}
