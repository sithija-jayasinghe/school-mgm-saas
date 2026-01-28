package com.myschool.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.util.Set;

@Data
@Entity
@Table(name = "hostels")
public class HostelEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer hostelId;

    @ManyToOne
    @JoinColumn(name = "school_id")
    private SchoolEntity school;

    private String type;
    private Integer capacity;

    // Many-to-Many relationship with students via junction entity
    @OneToMany(mappedBy = "hostel")
    private Set<StudentHostelEntity> students;
}