package com.myschool.dto;

import lombok.Data;
import java.util.Set;

@Data
public class RoleDto {
    private Integer roleId;
    private String roleName;
    private Set<Integer> permissionIds;
}