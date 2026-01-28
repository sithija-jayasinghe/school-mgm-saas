package com.myschool.dto;

import lombok.Data;
import java.time.LocalDate;

@Data
public class StudentTransportDto {
    private Integer id;
    private Integer studentId;
    private Integer transportId;
    private LocalDate assignedDate;
    private Boolean isActive;
}
