package com.co.MauricioMunoz.PruebaTecnica.mapper;

import com.co.MauricioMunoz.PruebaTecnica.dto.request.ServiciosAdicionalesDTORequest;
import com.co.MauricioMunoz.PruebaTecnica.dto.response.ServiciosAdicionalesDTOResponse;
import com.co.MauricioMunoz.PruebaTecnica.model.ServiciosAdicionales;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ServiciosAdicionalesMapper {

    ServiciosAdicionalesMapper INSTANCE = Mappers.getMapper(ServiciosAdicionalesMapper.class);

    @Mapping(target = "idServicio", source = "idServicio")
    ServiciosAdicionalesDTOResponse toDTO(ServiciosAdicionales servicioAdicional);

    ServiciosAdicionales toEntity(ServiciosAdicionalesDTORequest dto);

    ServiciosAdicionales toEntity(ServiciosAdicionalesDTORequest dto, Long idServicio);
}


