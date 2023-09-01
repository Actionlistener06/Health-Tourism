package com.patika.healthtourism.service;

import com.patika.healthtourism.database.entity.AppointmentEntity;
import com.patika.healthtourism.database.repository.AppointmentEntityRepository;
import com.patika.healthtourism.mapper.AppointmentMapper;
import com.patika.healthtourism.model.AppointmentDTO;
import com.patika.healthtourism.model.requestDTO.AppointmentCreateRequestDTO;
import com.patika.healthtourism.util.BaseService;
import org.springframework.stereotype.Service;

@Service
public class AppointmentService extends BaseService<AppointmentEntity, AppointmentDTO, AppointmentCreateRequestDTO,
        AppointmentMapper, AppointmentEntityRepository> {
    private final AppointmentMapper appointmentMapper;
    private final AppointmentEntityRepository appointmentEntityRepository;

    public AppointmentService(AppointmentMapper appointmentMapper, AppointmentEntityRepository appointmentEntityRepository) {
        this.appointmentMapper = appointmentMapper;
        this.appointmentEntityRepository = appointmentEntityRepository;
    }

    @Override
    protected AppointmentMapper getMapper() {
        return appointmentMapper;
    }

    @Override
    protected AppointmentEntityRepository getRepository() {
        return appointmentEntityRepository;
    }
}
