package com.patika.healthtourism.database.entity;

import com.patika.healthtourism.util.dbutil.BaseEntity;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
@Table
public class AppointmentEntity extends BaseEntity {
    @ManyToOne
    @JoinColumn(name="hospital_id")
    private HospitalEntity hospital;

    @ManyToOne
    @JoinColumn(name="healthService_id")
    private HealthServiceEntity healthService;

    @ManyToOne
    @JoinColumn(name = "doctor_id")
    private DoctorEntity doctor;

    @ManyToOne
    @JoinColumn(name = "patient_id")
    private PatientEntity patient;

    private LocalDateTime appointmentDateTime;

    private Boolean confirmed;

}
