package com.patika.healthtourism.controller;

import com.patika.healthtourism.database.entity.TravelPlanEntity;
import com.patika.healthtourism.database.repository.TravelPlanEntityRepository;
import com.patika.healthtourism.mapper.TravelPlanMapper;
import com.patika.healthtourism.model.TravelPlanDTO;
import com.patika.healthtourism.model.requestDTO.TravelPlanRequestDTO;
import com.patika.healthtourism.service.TravelPlanService;
import com.patika.healthtourism.util.BaseController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/travelplan")
public class TravelPlanController extends BaseController<TravelPlanEntity, TravelPlanDTO, TravelPlanRequestDTO,
        TravelPlanMapper, TravelPlanEntityRepository, TravelPlanService> {
    private final TravelPlanService travelPlanService;

    public TravelPlanController(TravelPlanService travelPlanService) {
        this.travelPlanService = travelPlanService;
    }

    @Override
    protected TravelPlanService getService() {
        return travelPlanService;
    }
}
