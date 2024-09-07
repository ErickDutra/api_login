package com.login.login.dto;

import com.login.login.table.UserRole;

public record UsuarioDto(String email, String password, UserRole role) {
}
