package com.myschool.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;
import java.util.Set;

@Data
@Entity
@Table(name = "students")
public class StudentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer studentId;

    @OneToOne
    @JoinColumn(name = "user_id")
    private UserEntity user;

    @ManyToOne
    @JoinColumn(name = "school_id")
    private SchoolEntity school;

    @ManyToOne
    @JoinColumn(name = "current_class_id")
    private ClassEntity currentClass;

    private String admissionNumber;
    private String firstName;
    private String lastName;
    private LocalDate dob;
    private String gender;
    private String address;
    private String status;

    // Small, useful bidirectional collections (typically < 10 items)
    @OneToMany(mappedBy = "student")
    private Set<StudentParentEntity> parents;

    @OneToMany(mappedBy = "student")
    private Set<StudentClubEntity> clubs;

    @OneToMany(mappedBy = "student")
    private Set<StudentHostelEntity> hostelAssignments;

    @OneToMany(mappedBy = "student")
    private Set<StudentTransportEntity> transportAssignments;

    // High-volume collections removed to prevent performance issues
    // Use repository queries: attendanceRepository.findByStudent(student)
    // Use repository queries: feeRepository.findByStudent(student)
    // Use repository queries: markRepository.findByStudent(student)
}