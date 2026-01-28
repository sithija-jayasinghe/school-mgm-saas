package com.school.entity;


import com.school.util.AttendanceStatus;
import jakarta.persistence.*;

import java.time.LocalDate;


@Entity
@Table(name = "student_attendance",
        uniqueConstraints = @UniqueConstraint(columnNames = {"student_id","date"}))
public class StudentAttendanceEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @ManyToOne
    private StudentEntity student;

    @ManyToOne
    private ClassEntity schoolClass;

    private LocalDate date;

    @Enumerated(EnumType.STRING)
    private AttendanceStatus status;

    private String remarks;
}
