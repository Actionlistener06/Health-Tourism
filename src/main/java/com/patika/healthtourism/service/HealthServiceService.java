package com.patika.healthtourism.service;

import com.patika.healthtourism.database.entity.HealthServiceEntity;
import com.patika.healthtourism.database.repository.HealthServiceEntityRepository;
import com.patika.healthtourism.mapper.HealthServiceMapper;
import com.patika.healthtourism.model.HealthServiceDTO;
import com.patika.healthtourism.model.requestDTO.HealthServiceRequestDTO;
import com.patika.healthtourism.util.BaseService;
import org.springframework.stereotype.Service;

@Service
public class HealthServiceService extends BaseService<HealthServiceEntity, HealthServiceDTO, HealthServiceRequestDTO,
        HealthServiceMapper, HealthServiceEntityRepository> {
    private final HealthServiceMapper healthServiceMapper;
    private final HealthServiceEntityRepository healthServiceEntityRepository;

    public HealthServiceService(HealthServiceMapper healthServiceMapper, HealthServiceEntityRepository healthServiceEntityRepository) {
        this.healthServiceMapper = healthServiceMapper;
        this.healthServiceEntityRepository = healthServiceEntityRepository;
    }

    @Override
    protected HealthServiceMapper getMapper() {
        return healthServiceMapper;
    }

    @Override
    protected HealthServiceEntityRepository getRepository() {
        return healthServiceEntityRepository;
    }
}
