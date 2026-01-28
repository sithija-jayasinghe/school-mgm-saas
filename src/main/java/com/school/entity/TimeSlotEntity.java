package com.school.entity;

import jakarta.persistence.*;
import java.time.LocalTime;


@Entity
@Table(name = "time_slots")
public class TimeSlotEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @ManyToOne
    private SchoolEntity school;

    private LocalTime startTime;
    private LocalTime endTime;
}
