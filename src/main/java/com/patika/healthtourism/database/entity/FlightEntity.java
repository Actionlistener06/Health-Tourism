package com.patika.healthtourism.database.entity;

import com.patika.healthtourism.util.dbutil.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Table
@Entity
public class FlightEntity extends BaseEntity {
    @Column
    private String airlineName;
    private String flightNumber;
    private String departureAirport;
    private String arrivalAirport;
    private LocalDateTime departureDateTime;
    private LocalDateTime arrivalDateTime;
    private Double price;
}
