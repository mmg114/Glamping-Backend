package com.co.glamping.service;

import com.co.glamping.dto.ClienteDTO;

public interface IClienteService {

    ClienteDTO getCliente(Long clienteId);

    ClienteDTO create(ClienteDTO clienteDTO);

    ClienteDTO update(Long clienteId, ClienteDTO clienteDTO);

    void delete(Long clienteId);

}
