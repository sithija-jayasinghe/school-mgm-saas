package com.myschool.dto;

import lombok.Data;

@Data
public class HostelDto {
    private Integer hostelId;
    private Integer schoolId;
    private String type;
    private Integer capacity;
}
