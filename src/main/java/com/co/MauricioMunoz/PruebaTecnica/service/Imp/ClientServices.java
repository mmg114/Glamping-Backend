package com.co.MauricioMunoz.PruebaTecnica.service.Imp;

import com.co.MauricioMunoz.PruebaTecnica.dto.request.ClientDTORequest;
import com.co.MauricioMunoz.PruebaTecnica.dto.response.ClientDTOResponse;
import com.co.MauricioMunoz.PruebaTecnica.exception.BussinesException;
import com.co.MauricioMunoz.PruebaTecnica.mapper.ClientMapper;
import com.co.MauricioMunoz.PruebaTecnica.model.Client;
import com.co.MauricioMunoz.PruebaTecnica.repository.ClientRepository;
import com.co.MauricioMunoz.PruebaTecnica.service.IClientServices;
import com.co.MauricioMunoz.PruebaTecnica.utilities.EmailValidator;
import com.co.MauricioMunoz.PruebaTecnica.utilities.JwtToken;
import com.co.MauricioMunoz.PruebaTecnica.utilities.PasswordValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.UUID;

@Scope("singleton")
@Service
public class ClientServices implements IClientServices {

    private final Boolean ACTIVE=true;
    private final Boolean INACTIVE=false;

    private final ClientRepository clientRepository;
    private final ClientMapper clientMapper;
    private  final PasswordValidator passwordValidator;

    private final JwtToken jwtTokenService;

    @Autowired
    public ClientServices(ClientRepository clientRepository, ClientMapper clientMapper, PasswordValidator passwordValidator, JwtToken jwtTokenService) {
        this.clientRepository = clientRepository;
        this.clientMapper = clientMapper;
        this.passwordValidator = passwordValidator;
        this.jwtTokenService = jwtTokenService;
    }


    @Override
    public ClientDTOResponse create(ClientDTORequest clientDTORequest) {
        Client clientTmp = clientMapper.convertToEntity(clientDTORequest);
        Client tieneCorre =clientRepository.findByEmail(clientTmp.getEmail());
        if (tieneCorre!= null){
            throw new BussinesException("Ya existe un Cliente con ese correo");
        }

        if (EmailValidator.isValidEmail(clientDTORequest.getEmail())==false){
            throw new BussinesException("El correo no cumple con el formato  aaaaaaa@dominio.cl");
        }
        if (passwordValidator.isValidPassword(clientTmp.getPassword()) == false) {
            throw new BussinesException("Contraseña no cumple el criterio minimo de seguridad ");
        }
        clientTmp.setToken(jwtTokenService.generateToken(clientTmp.getEmail()));


        clientTmp.setCreationDate(new Date());
        clientTmp.setLastLogin(new Date());
        clientTmp.setActive(true);
        return createResponse(clientRepository.save(clientTmp));
    }

    @Override
    public void deleteClient(UUID clientId) {
       Client client= clientRepository.findByIdAndActive(clientId,ACTIVE);
       client.setModificationDate(new Date());
       client.setActive(false);
       clientRepository.delete(client);
    }

    @Override
    public ClientDTOResponse updateClient(UUID clientId, ClientDTORequest clientDTORequest) {
        getClient(clientId);
        Client clientTmp = clientMapper.convertToEntity(clientDTORequest);
        clientTmp.setModificationDate(new Date());
        ClientDTOResponse clientDTOResponse=createResponse(clientRepository.save(clientTmp));

        return clientDTOResponse ;
    }

    @Override
    public ClientDTOResponse getClient(UUID clientId) {
       Client client=clientRepository.findByIdAndActive(clientId,ACTIVE);
        if (client != null) {
            return  createResponse(client);
        }else{
            throw new BussinesException("No existe el usuario con id: "+clientId);
        }

    }

    private ClientDTOResponse createResponse(Client cliente) {
        return
                ClientDTOResponse
                        .builder()
                        .id(cliente.getId())
                        .created(cliente.getCreationDate())
                        .lastLogin(cliente.getLastLogin())
                        .modified(cliente.getModificationDate())
                        .isActive(true)
                        .token(UUID.randomUUID()).build();
    }
}