package com.co.glamping.service;


import com.co.glamping.dto.request.ServiciosAdicionalesDTORequest;
import com.co.glamping.dto.response.ServiciosAdicionalesDTOResponse;
import com.co.glamping.model.ServiciosAdicionales;

import java.util.List;

import java.util.List;

public interface IServiciosAdicionalesServices {

    ServiciosAdicionalesDTOResponse agregarServicioAdicional(ServiciosAdicionalesDTORequest servicioAdicionalDTORequest);

    List<ServiciosAdicionales> obtenerTodosLosServiciosAdicionales();

    ServiciosAdicionalesDTOResponse obtenerServicioAdicionalPorId(Long id);

    List<ServiciosAdicionales> obtenerServiciosAdicionalesPorNombre(String nombreServicio);

    ServiciosAdicionales guardarServicioAdicional(ServiciosAdicionales servicioAdicional);

    ServiciosAdicionales agregarServicioAdicional(ServiciosAdicionales servicioAdicional);

    ServiciosAdicionales actualizarServicioAdicional(Long id, ServiciosAdicionales servicioAdicional);

    List<ServiciosAdicionalesDTOResponse> obtenerTodosLosServiciosAdicionalesDTO();

    ServiciosAdicionalesDTOResponse obtenerServicioAdicionalDTOporId(Long idServicio);

    ServiciosAdicionalesDTOResponse actualizarServicioAdicional(Long idServicio, ServiciosAdicionalesDTORequest serviciosAdicionalesDTORequest);

    void eliminarServicioAdicional(Long idServicio);

    void eliminarServicioAdicionalPorId(Long idServicio);

    ServiciosAdicionales crearServicioAdicional(ServiciosAdicionalesDTORequest serviciosAdicionalesDTORequest);

}

