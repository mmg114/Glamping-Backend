package com.co.glamping.mappers;

import com.co.glamping.dto.request.ServiciosAdicionalesDTORequest;
import com.co.glamping.dto.response.ServiciosAdicionalesDTOResponse;
import com.co.glamping.model.ServiciosAdicionales;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface ServiciosAdicionalesMapper {

    ServiciosAdicionalesMapper INSTANCE = Mappers.getMapper(ServiciosAdicionalesMapper.class);

    @Mapping(target = "idServicio", source = "idServicio")
    ServiciosAdicionalesDTOResponse toDTO(ServiciosAdicionales servicioAdicional);

    ServiciosAdicionales toEntity(ServiciosAdicionalesDTORequest dto);

    ServiciosAdicionales toEntity(ServiciosAdicionalesDTORequest dto, Long idServicio);

}



