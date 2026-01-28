package com.myschool.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.util.Set;

@Data
@Entity
@Table(name = "parents")
public class ParentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer parentId;

    @OneToOne
    @JoinColumn(name = "user_id")
    private UserEntity user;

    private String name;
    private String occupation;
    private String contactNumber;

    // Many-to-Many relationship with students via junction entity
    @OneToMany(mappedBy = "parent")
    private Set<StudentParentEntity> children;
}