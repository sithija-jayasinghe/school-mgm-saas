package com.myschool.dto;

import lombok.Data;
import java.time.LocalDate;
import java.time.LocalTime;

@Data
public class ExamSubjectDto {
    private Integer examSubjectId;
    private Integer examId;
    private Integer subjectId;
    private LocalDate date;
    private LocalTime startTime;
    private LocalTime endTime;
    private Integer durationMinutes;
    private Integer invigilatorId;
}
