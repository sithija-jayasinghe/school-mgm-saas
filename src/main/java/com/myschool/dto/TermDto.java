package com.myschool.dto;

import lombok.Data;
import java.time.LocalDate;

@Data
public class TermDto {
    private Integer termId;
    private String termName;
    private LocalDate startDate;
    private LocalDate endDate;
    private Integer academicYearId;
}
