package com.co.glamping.service.Imp;


import com.co.glamping.dto.request.ServiciosAdicionalesDTORequest;
import com.co.glamping.dto.response.ServiciosAdicionalesDTOResponse;
import com.co.glamping.exception.ServiciosAdicionalesException;
import com.co.glamping.mappers.ServiciosAdicionalesMapper;
import com.co.glamping.model.ServiciosAdicionales;
import com.co.glamping.repository.ServiciosAdicionalesRepository;
import com.co.glamping.service.IServiciosAdicionalesServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ServiciosAdicionalesServices implements IServiciosAdicionalesServices {

    @Autowired
    private ServiciosAdicionalesRepository serviciosAdicionalesRepository;

    @Autowired
    private ServiciosAdicionalesMapper serviciosAdicionalesMapper;

    @Override
    public List<ServiciosAdicionalesDTOResponse> obtenerTodosLosServiciosAdicionalesDTO() {
        List<ServiciosAdicionales> serviciosAdicionales = serviciosAdicionalesRepository.findAll();
        return serviciosAdicionales.stream()
                .map(serviciosAdicionalesMapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public ServiciosAdicionalesDTOResponse obtenerServicioAdicionalDTOporId(Long idServicio) {
        ServiciosAdicionales servicioAdicional = serviciosAdicionalesRepository.findById(idServicio)
                .orElseThrow(() -> new ServiciosAdicionalesException(idServicio));
        return serviciosAdicionalesMapper.toDTO(servicioAdicional);
    }

    @Override
    public ServiciosAdicionalesDTOResponse agregarServicioAdicional(ServiciosAdicionalesDTORequest servicioAdicionalDTORequest) {
        ServiciosAdicionales servicioAdicional = serviciosAdicionalesMapper.toEntity(servicioAdicionalDTORequest);
        ServiciosAdicionales servicioGuardado = serviciosAdicionalesRepository.save(servicioAdicional);
        return serviciosAdicionalesMapper.toDTO(servicioGuardado);
    }

    @Override
    public ServiciosAdicionalesDTOResponse actualizarServicioAdicional(Long idServicio, ServiciosAdicionalesDTORequest serviciosAdicionalesDTORequest) {
        ServiciosAdicionales servicioAdicionalExistente = serviciosAdicionalesRepository.findById(idServicio)
                .orElseThrow(() -> new ServiciosAdicionalesException(idServicio));
        ServiciosAdicionales servicioActualizado = serviciosAdicionalesMapper.toEntity(serviciosAdicionalesDTORequest);
        servicioAdicionalExistente.setNombreServicio(servicioActualizado.getNombreServicio());
        servicioAdicionalExistente.setCategoria(servicioActualizado.getCategoria());
        servicioAdicionalExistente.setDescripcion(servicioActualizado.getDescripcion());
        servicioAdicionalExistente.setCosto(servicioActualizado.getCosto());
        return serviciosAdicionalesMapper.toDTO(serviciosAdicionalesRepository.save(servicioAdicionalExistente));
    }

    @Override
    public List<ServiciosAdicionales> obtenerTodosLosServiciosAdicionales() {
        return serviciosAdicionalesRepository.findAll();
    }

    @Override
    public ServiciosAdicionales obtenerServicioAdicionalPorId(Long idServicio) {
        return serviciosAdicionalesRepository.findById(idServicio)
                .orElseThrow(() -> new ServiciosAdicionalesException(idServicio));
    }

    @Override
    public List<ServiciosAdicionales> obtenerServiciosAdicionalesPorNombre(String nombreServicio) {
        return serviciosAdicionalesRepository.findByNombreServicio(nombreServicio);
    }

    @Override
    public ServiciosAdicionales guardarServicioAdicional(ServiciosAdicionales servicioAdicional) {
        return serviciosAdicionalesRepository.save(servicioAdicional);
    }

    @Override
    public ServiciosAdicionales agregarServicioAdicional(ServiciosAdicionales servicioAdicional) {
        return serviciosAdicionalesRepository.save(servicioAdicional);
    }

    @Override
    public ServiciosAdicionales actualizarServicioAdicional(Long id, ServiciosAdicionales servicioAdicional) {
        ServiciosAdicionales servicioExistente = serviciosAdicionalesRepository.findById(id)
                .orElseThrow(() -> new ServiciosAdicionalesException(id));
        servicioExistente.setNombreServicio(servicioAdicional.getNombreServicio());
        servicioExistente.setCategoria(servicioAdicional.getCategoria());
        servicioExistente.setDescripcion(servicioAdicional.getDescripcion());
        servicioExistente.setCosto(servicioAdicional.getCosto());
        return serviciosAdicionalesRepository.save(servicioExistente);
    }

    @Override
    public void eliminarServicioAdicional(Long idServicio) {
        if (!serviciosAdicionalesRepository.existsById(idServicio)) {
            throw new ServiciosAdicionalesException(idServicio);
        }
        serviciosAdicionalesRepository.deleteById(idServicio);
    }

    @Override
    public void eliminarServicioAdicionalPorId(Long idServicio) {
        if (!serviciosAdicionalesRepository.existsById(idServicio)) {
            throw new ServiciosAdicionalesException(idServicio);
        }
        serviciosAdicionalesRepository.deleteById(idServicio);
    }

    @Override
    public ServiciosAdicionales crearServicioAdicional(ServiciosAdicionalesDTORequest serviciosAdicionalesDTORequest) {
        return serviciosAdicionalesMapper.toEntity(serviciosAdicionalesDTORequest);
    }
}
