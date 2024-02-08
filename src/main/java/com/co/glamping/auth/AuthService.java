package com.co.glamping.auth;

import com.co.glamping.auth.jwt.JwtService;
import com.co.glamping.service.Imp.model.enums.Rol;
import com.co.glamping.service.Imp.model.Usuario;
import com.co.glamping.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthService {

    private final UsuarioRepository usuarioRepository;
    private final JwtService jwtService;
    public AuthResponse login(LoginRequest request) {
        return null;
    }

    public AuthResponse register(RegisterRequest request) {
        Usuario usuario=Usuario.builder()
                .nombreUsuario(request.username)
                .contrasena(request.password)
                .rol(Rol.USER)
                .fechaCreacion(request.fechaCreacion)
                .build();

        usuarioRepository.save(usuario);

        return AuthResponse.builder()
                .token(jwtService.getToken(usuario))
                .build();
    }
}
