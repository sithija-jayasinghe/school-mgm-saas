package com.myschool.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.util.Set;

@Data
@Entity
@Table(name = "transportation")
public class TransportEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer transportId;

    @ManyToOne
    @JoinColumn(name = "school_id")
    private SchoolEntity school;

    private String busNo;
    private String route;
    private String driverName;

    // Many-to-Many relationship with students via junction entity
    @OneToMany(mappedBy = "transport")
    private Set<StudentTransportEntity> students;
}