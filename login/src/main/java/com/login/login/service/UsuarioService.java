package com.login.login.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.login.login.dto.UsuarioDto;
import com.login.login.repository.UsuarioRepository;
import com.login.login.table.Usuario;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;
    
    public UsuarioDto salvar(UsuarioDto usuarioDto) {
            Usuario usuario = new Usuario();
            usuario.setEmail(usuarioDto.email());
            usuario.setPassword(usuarioDto.password());
            usuario.setRole(usuarioDto.role());
            Usuario usuarioSalvo =  usuarioRepository.save(usuario); 
            return new UsuarioDto(usuarioSalvo.getEmail(), usuarioSalvo.getPassword(), usuarioSalvo.getRole());

    }
}