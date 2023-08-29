package com.patika.healthtourism.database.entity;

import com.patika.healthtourism.util.dbutil.BaseEntity;
import jakarta.persistence.*;
import lombok.Data;

import javax.print.Doc;
import java.time.Duration;
import java.util.Set;

@Entity
@Data
@Table
public class HealthServiceEntity extends BaseEntity {
    @Column
    private String serviceName;
    @Column
    private String description;
    @Column
    private Double price;
    @Column
    private Duration duration;

    @ManyToOne
    @JoinColumn(name = "hospital_id")
    private HospitalEntity hospital;

    @OneToMany(mappedBy="healthService",fetch = FetchType.LAZY)
    private Set<DoctorEntity> serviceDoctors;

    @OneToMany(mappedBy="healthService",fetch = FetchType.LAZY)
    private Set<AppointmentEntity> appointments;
}
