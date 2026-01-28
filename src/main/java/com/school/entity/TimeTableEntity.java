package com.school.entity;


import com.school.util.DayOfWeekEnum;
import jakarta.persistence.*;

@Entity
@Table(name = "timetables")
public class TimeTableEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @ManyToOne
    private ClassEntity schoolClass;

    @Enumerated(EnumType.STRING)
    private DayOfWeekEnum dayOfWeek;

    @ManyToOne
    private TimeSlotEntity timeSlot;

    @ManyToOne
    private ClassSubjectEntity classSubject;
}
