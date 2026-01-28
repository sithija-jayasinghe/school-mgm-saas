package com.myschool.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.util.Set;

@Data
@Entity
@Table(name = "clubs")
public class ClubEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer clubId;

    private String name;

    @ManyToOne
    @JoinColumn(name = "teacher_in_charge_id")
    private TeacherEntity teacherInCharge;

    // Many-to-Many relationship with students via junction entity
    @OneToMany(mappedBy = "club")
    private Set<StudentClubEntity> members;
}