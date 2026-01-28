package com.myschool.dto;

import lombok.Data;
import java.time.LocalDate;

@Data
public class StudentClubDto {
    private Integer id;
    private Integer studentId;
    private Integer clubId;
    private String role;
    private LocalDate joinedDate;
}
