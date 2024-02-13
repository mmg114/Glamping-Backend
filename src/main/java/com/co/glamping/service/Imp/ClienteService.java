package com.co.glamping.service.Imp;

import com.co.glamping.dto.ClienteDTO;
import com.co.glamping.exception.BussinesException;
import com.co.glamping.mappers.ClienteMapper;
import com.co.glamping.model.Cliente;
import com.co.glamping.repository.ClienteRepository;
import com.co.glamping.service.IClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Scope("singleton")
@Service
public class ClienteService implements IClienteService {

    @Autowired
    ClienteRepository clienteRepository;
    @Autowired
    ClienteMapper clienteMapper;
    @Override
    public ClienteDTO getCliente(Long clienteId) {
        Cliente cliente = clienteRepository.findById(clienteId).orElse(null);

        if (cliente != null){
            return clienteMapper.toDto(cliente);
        } else {
          throw new BussinesException("No existe Cliente con el ID: " + clienteId);
        }
    }

    @Override
    public ClienteDTO create(ClienteDTO clienteDTO) {
        Cliente clienteTmp = clienteMapper.toEntity(clienteDTO);
        Cliente cliente = clienteRepository.save(clienteTmp);
        ClienteDTO nuevoClienteDTO = clienteMapper.toDto(cliente);
        return nuevoClienteDTO;
    }

    @Override
    public ClienteDTO update(Long clienteId, ClienteDTO clienteDTO) {
        Cliente cliente = clienteRepository.findById(clienteId).orElse(null);
        if (cliente == null){
            throw new BussinesException("Cliente con ID: " + clienteId + "No existe" );
        }

        cliente.setNombre(clienteDTO.getNombre());
        cliente.setApellido(clienteDTO.getApellido());
        cliente.setDocumento(clienteDTO.getDocumento());
        cliente.setTipoDocumento(clienteDTO.getTipoDocumento());
        cliente.setFechaNacimiento(clienteDTO.getFechaNacimiento());
        cliente.setCorreoElectronico(clienteDTO.getCorreoElectronico());

        Cliente clienteUpdate = clienteRepository.save(cliente);

        return clienteMapper.toDto(clienteUpdate);
    }

    @Override
    public void delete(Long clienteId) {
        Cliente cliente = clienteRepository.findById(clienteId).orElse(null);
        if (cliente == null){
            throw new BussinesException("Cliente con ID: " + clienteId + "No existe" );
        }

        clienteRepository.delete(cliente);
    }


}
