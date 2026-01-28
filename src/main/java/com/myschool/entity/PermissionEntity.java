package com.myschool.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.util.Set;

@Data
@Entity
@Table(name = "permissions")
public class PermissionEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer permissionId;

    private String name;
    private String description;

    // Bidirectional Many-to-Many relationship
    @ManyToMany(mappedBy = "permissions")
    private Set<RoleEntity> roles;
}
