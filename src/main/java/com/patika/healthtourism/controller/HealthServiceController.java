package com.patika.healthtourism.controller;

import com.patika.healthtourism.database.entity.HealthServiceEntity;
import com.patika.healthtourism.database.repository.HealthServiceEntityRepository;
import com.patika.healthtourism.mapper.HealthServiceMapper;
import com.patika.healthtourism.model.HealthServiceDTO;
import com.patika.healthtourism.model.requestDTO.HealthServiceRequestDTO;
import com.patika.healthtourism.service.HealthServiceService;
import com.patika.healthtourism.util.BaseController;
import com.patika.healthtourism.util.BaseService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/healthservice")
public class HealthServiceController extends BaseController<HealthServiceEntity, HealthServiceDTO, HealthServiceRequestDTO,
        HealthServiceMapper, HealthServiceEntityRepository, HealthServiceService> {
    private final HealthServiceService healthServiceService;

    public HealthServiceController(HealthServiceService healthServiceService) {
        this.healthServiceService = healthServiceService;
    }

    @Override
    protected HealthServiceService getService() {
        return healthServiceService;
    }
}
