package com.login.login.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

import com.login.login.table.Usuario;


public interface UsuarioRepository extends JpaRepository<Usuario, String>  {
    UserDetails findByEmail(String email);
}
