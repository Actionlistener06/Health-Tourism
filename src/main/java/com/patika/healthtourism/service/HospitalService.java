package com.patika.healthtourism.service;
import com.patika.healthtourism.database.entity.HospitalEntity;
import com.patika.healthtourism.database.repository.HospitalEntityRepository;
import com.patika.healthtourism.mapper.HospitalMapper;
import com.patika.healthtourism.model.HospitalDTO;
import com.patika.healthtourism.model.requestDTO.HospitalRequestDTO;
import com.patika.healthtourism.util.BaseService;
import org.springframework.stereotype.Service;

@Service
public class HospitalService extends BaseService<HospitalEntity, HospitalDTO,
        HospitalRequestDTO, HospitalMapper, HospitalEntityRepository> {

    private final HospitalEntityRepository hospitalRepository;

    private final HospitalMapper hospitalMapper;

    public HospitalService(HospitalEntityRepository hospitalRepository, HospitalMapper hospitalMapper) {
        this.hospitalRepository = hospitalRepository;
        this.hospitalMapper = hospitalMapper;
    }

    @Override
    protected HospitalMapper getMapper() {
        return hospitalMapper;
    }

    @Override
    protected HospitalEntityRepository getRepository() {
        return hospitalRepository;
    }


}
