package com.myschool.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.util.Set;

@Data
@Entity
@Table(name = "classes")
public class ClassEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer classId;

    @ManyToOne
    @JoinColumn(name = "school_id")
    private SchoolEntity school;

    @ManyToOne
    @JoinColumn(name = "academic_year_id")
    private AcademicYearEntity academicYear;

    private String className;
    private String section;

    @ManyToOne
    @JoinColumn(name = "class_teacher_id")
    private TeacherEntity classTeacher;

    // Keep only subjects - useful for timetable/curriculum management
    @OneToMany(mappedBy = "currentClass")
    private Set<ClassSubjectEntity> subjects;

    // High-volume collections removed
    // Use repository queries: studentRepository.findByCurrentClass(class)
    // Use repository queries: timetableRepository.findByCurrentClass(class)
    // Use repository queries: feeStructureRepository.findByCurrentClass(class)
}