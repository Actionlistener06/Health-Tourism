package com.patika.healthtourism.service;

import com.patika.healthtourism.database.entity.FlightEntity;
import com.patika.healthtourism.database.repository.FlightEntityRepository;
import com.patika.healthtourism.mapper.FlightMapper;
import com.patika.healthtourism.model.FlightDTO;
import com.patika.healthtourism.model.requestDTO.FlightRequestDTO;
import com.patika.healthtourism.util.BaseService;
import org.springframework.stereotype.Service;

@Service
public class FlightService extends BaseService<FlightEntity, FlightDTO, FlightRequestDTO, FlightMapper, FlightEntityRepository> {
    private final FlightEntityRepository flightEntityRepository;
    private final FlightMapper flightMapper;

    public FlightService(FlightEntityRepository flightEntityRepository, FlightMapper flightMapper) {
        this.flightEntityRepository = flightEntityRepository;
        this.flightMapper = flightMapper;
    }

    @Override
    protected FlightMapper getMapper() {
        return flightMapper;
    }

    @Override
    protected FlightEntityRepository getRepository() {
        return flightEntityRepository;
    }
}
