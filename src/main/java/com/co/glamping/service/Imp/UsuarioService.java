package com.co.glamping.service.Imp;

import com.co.glamping.dto.request.UsuarioDTORequest;
import com.co.glamping.model.Usuario;
import com.co.glamping.repository.UsuarioRepository;
import com.co.glamping.service.IUsuarioService;
import com.co.glamping.utilities.EnviarCorreo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Scope("singleton")
@Service
public class UsuarioService implements IUsuarioService {

    @Autowired
    UsuarioRepository usuarioRepository;

   //Autowired
  //EnviarCorreo enviarCorreo;

    @Override
    public void recuperarContrasena(UsuarioDTORequest usuarioDTORequest) {

    //  Optional<Usuario> usuarioTmp= usuarioRepository.findByNombreUsuario(usuarioDTORequest.getNombreUsuario());

      // (!usuarioTmp.isEmpty()){
              // enviarCorreo.sendEmail("","","");
     //
    }
}
