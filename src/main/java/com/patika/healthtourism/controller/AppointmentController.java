package com.patika.healthtourism.controller;

import com.patika.healthtourism.database.entity.AppointmentEntity;
import com.patika.healthtourism.database.repository.AppointmentEntityRepository;
import com.patika.healthtourism.mapper.AppointmentMapper;
import com.patika.healthtourism.model.AppointmentDTO;
import com.patika.healthtourism.model.requestDTO.AppointmentCreateRequestDTO;
import com.patika.healthtourism.service.AppointmentService;
import com.patika.healthtourism.util.BaseController;
import com.patika.healthtourism.util.BaseService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/appointment")
public class AppointmentController extends BaseController<AppointmentEntity, AppointmentDTO, AppointmentCreateRequestDTO,
        AppointmentMapper, AppointmentEntityRepository, AppointmentService>{

    private final AppointmentService appointmentService;

    public AppointmentController(AppointmentService appointmentService) {
        this.appointmentService = appointmentService;
    }

    @Override
    protected AppointmentService getService() {
        return appointmentService;
    }
}