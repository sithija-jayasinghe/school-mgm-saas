package com.myschool.dto;

import lombok.Data;
import java.time.LocalDate;

@Data
public class StudentHostelDto {
    private Integer id;
    private Integer studentId;
    private Integer hostelId;
    private LocalDate assignedDate;
    private Boolean isActive;
}
