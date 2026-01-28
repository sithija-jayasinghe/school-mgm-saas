package com.myschool.dto;

import lombok.Data;
import java.time.LocalDate;

@Data
public class NonAcademicStaffDto {
    private Integer staffId;
    private Integer userId;
    private Integer schoolId;
    private String jobTitle;
    private LocalDate joiningDate;
    private String qualification;
}
