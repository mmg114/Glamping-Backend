package com.co.MauricioMunoz.PruebaTecnica.service;

import com.co.MauricioMunoz.PruebaTecnica.dto.request.ServiciosAdicionalesDTORequest;
import com.co.MauricioMunoz.PruebaTecnica.dto.response.ServiciosAdicionalesDTOResponse;
import com.co.MauricioMunoz.PruebaTecnica.model.ServiciosAdicionales;

import java.util.List;

public interface IServiciosAdicionalesServices {

    List<ServiciosAdicionales> obtenerTodosLosServiciosAdicionales();

    ServiciosAdicionalesDTOResponse obtenerServicioAdicionalPorId(Long id);

    List<ServiciosAdicionales> obtenerServiciosAdicionalesPorNombre(String nombreServicio);

    ServiciosAdicionales guardarServicioAdicional(ServiciosAdicionales servicioAdicional);

    ServiciosAdicionales agregarServicioAdicional(ServiciosAdicionales servicioAdicional);

    ServiciosAdicionales actualizarServicioAdicional(Long id, ServiciosAdicionales servicioAdicional);

    List<ServiciosAdicionalesDTOResponse> obtenerTodosLosServiciosAdicionalesDTO();

    ServiciosAdicionalesDTOResponse obtenerServicioAdicionalDTOporId(Long idServicio);

    ServiciosAdicionalesDTOResponse agregarServicioAdicional(ServiciosAdicionalesDTORequest servicioAdicionalDTORequest);

    ServiciosAdicionalesDTOResponse actualizarServicioAdicional(Long idServicio, ServiciosAdicionalesDTORequest serviciosAdicionalesDTORequest);

    void eliminarServicioAdicional(Long idServicio);

    void eliminarServicioAdicionalPorId(Long idServicio);
}
