package com.myschool.dto;

import lombok.Data;

@Data
public class TransportDto {
    private Integer transportId;
    private Integer schoolId;
    private String busNo;
    private String route;
    private String driverName;
}
