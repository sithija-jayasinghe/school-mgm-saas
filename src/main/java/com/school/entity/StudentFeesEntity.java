package com.school.entity;


import com.school.util.FeeStatus;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "student_fees")
public class StudentFeesEntity {

    @Id
    @GeneratedValue(strategy =GenerationType.UUID)
    private String id;

    @ManyToOne
    private StudentEntity student;


    private LocalDate dueDate;

    @Enumerated(EnumType.STRING)
    private FeeStatus status;
}
