package com.co.MauricioMunoz.PruebaTecnica.service.Imp;

import com.co.MauricioMunoz.PruebaTecnica.dto.request.UsuarioDTORequest;
import com.co.MauricioMunoz.PruebaTecnica.model.Usuario;
import com.co.MauricioMunoz.PruebaTecnica.repository.UsuarioRepository;
import com.co.MauricioMunoz.PruebaTecnica.service.IUsuarioService;
import com.co.MauricioMunoz.PruebaTecnica.utilities.EnviarCorreo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Scope("singleton")
@Service
public class UsuarioService implements IUsuarioService {

    @Autowired
    UsuarioRepository usuarioRepository;

    @Autowired
    EnviarCorreo enviarCorreo;

    @Override
    public void recuperarContrasena(UsuarioDTORequest usuarioDTORequest) {

      Optional<Usuario> usuarioTmp= usuarioRepository.findByNombreUsuario(usuarioDTORequest.getNombreUsuario());

      if (!usuarioTmp.isEmpty()){
               enviarCorreo.sendEmail("","","");
      }
    }
}
