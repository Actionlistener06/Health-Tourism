package com.patika.healthtourism.util;

import com.patika.healthtourism.model.PageDTO;
import com.patika.healthtourism.util.dbutil.BaseEntity;
import jakarta.persistence.MappedSuperclass;
import org.mapstruct.MappingTarget;
import org.springframework.data.domain.Page;

import java.util.List;

@MappedSuperclass
public interface IBaseMapper<Entity extends BaseEntity,
        DTO extends BaseDTO, RequestDTO extends BaseRequestDTO> {

    Entity dtoToEntity(DTO dto);

    DTO entityToDto(Entity entity);

    Entity requestDtoToEntity(RequestDTO requestDTO);

    RequestDTO entityToRequestDto(Entity entity);

    List<Entity> requestDtoListToEntityList(List<RequestDTO> dtoList);

    List<RequestDTO> entityListToRequestDtoList(List<Entity> entityList);

    List<Entity> dtoListToEntityList(List<DTO> dtoList);

    List<DTO> entityListToDtoList(List<Entity> entityList);

    Entity requestDtoToExistEntity(RequestDTO requestDTO, @MappingTarget Entity entity);

    PageDTO<DTO> pageEntityToPageDTO(Page<Entity> entityPage);

}
