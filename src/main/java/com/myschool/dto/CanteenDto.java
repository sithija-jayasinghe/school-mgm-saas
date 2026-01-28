package com.myschool.dto;

import lombok.Data;

@Data
public class CanteenDto {
    private Integer canteenId;
    private Integer schoolId;
    private String type;
    private String openingHours;
}
