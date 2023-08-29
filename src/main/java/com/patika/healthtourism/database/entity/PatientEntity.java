package com.patika.healthtourism.database.entity;

import com.patika.healthtourism.util.dbutil.BaseEntity;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDate;
import java.util.Set;


@Entity
@Data
@Table
public class PatientEntity extends BaseEntity {
    @Column
    private String firstName;
    @Column
    private String lastName;
    @Column
    private LocalDate birthDate;
    @Column
    private String phoneNumber;
    @Column
    private String email;

    @OneToMany(mappedBy = "patient",fetch = FetchType.LAZY)
    private Set<ExaminationEntity> examinations;

    @OneToMany(mappedBy = "patient",fetch = FetchType.LAZY)
    private Set<AppointmentEntity> appointments;

    @OneToMany(mappedBy = "patient",fetch = FetchType.LAZY)
    private Set<TravelPlanEntity> travelPlans;
}
