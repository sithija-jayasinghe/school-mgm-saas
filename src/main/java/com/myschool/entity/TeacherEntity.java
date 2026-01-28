package com.myschool.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "teachers")
public class TeacherEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer teacherId;

    @OneToOne
    @JoinColumn(name = "user_id")
    private UserEntity user;

    @ManyToOne
    @JoinColumn(name = "school_id")
    private SchoolEntity school;

    private String qualification;
    private String specialization;
    private LocalDate joiningDate;

    // Small, useful bidirectional collections
    @OneToMany(mappedBy = "classTeacher")
    private Set<ClassEntity> classesAsClassTeacher;

    @OneToMany(mappedBy = "teacherInCharge")
    private Set<ClubEntity> clubsInCharge;

    // High-volume collections removed
    // Use repository queries: classSubjectRepository.findByTeacher(teacher)
    // Use repository queries: teacherAttendanceRepository.findByTeacher(teacher)
    // Use repository queries: examSubjectRepository.findByInvigilator(teacher)
}