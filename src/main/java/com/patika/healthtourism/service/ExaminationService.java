package com.patika.healthtourism.service;

import com.patika.healthtourism.database.entity.ExaminationEntity;
import com.patika.healthtourism.database.repository.ExaminationEntityRepository;
import com.patika.healthtourism.mapper.ExaminationMapper;
import com.patika.healthtourism.model.ExaminationDTO;
import com.patika.healthtourism.model.requestDTO.ExaminationCreateRequestDTO;
import com.patika.healthtourism.util.BaseService;
import org.springframework.stereotype.Service;

@Service
public class ExaminationService extends BaseService<ExaminationEntity, ExaminationDTO, ExaminationCreateRequestDTO,
        ExaminationMapper, ExaminationEntityRepository> {
    private final ExaminationMapper examinationMapper;
    private final ExaminationEntityRepository examinationEntityRepository;

    public ExaminationService(ExaminationMapper examinationMapper, ExaminationEntityRepository examinationEntityRepository) {
        this.examinationMapper = examinationMapper;
        this.examinationEntityRepository = examinationEntityRepository;
    }

    @Override
    protected ExaminationMapper getMapper() {
        return examinationMapper;
    }

    @Override
    protected ExaminationEntityRepository getRepository() {
        return examinationEntityRepository;
    }
}
