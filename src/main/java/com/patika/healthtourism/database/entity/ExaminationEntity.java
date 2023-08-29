package com.patika.healthtourism.database.entity;

import com.patika.healthtourism.util.dbutil.BaseEntity;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Table
@Data
public class ExaminationEntity extends BaseEntity {
    @ManyToOne
    @JoinColumn(name = "doctor_id")
    private DoctorEntity doctor;

    @ManyToOne
    @JoinColumn(name = "patient_id")
    private PatientEntity patient;

    @OneToOne
    @JoinColumn(name = "appointment_id")
    private AppointmentEntity appointment;

    private LocalDateTime examinationDateTime;

    private String notes;
}
