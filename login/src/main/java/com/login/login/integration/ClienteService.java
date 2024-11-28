package com.login.login.integration;

import org.springframework.stereotype.Service;

import com.login.login.integration.cliente.ClientLogin;
import com.login.login.integration.dto.ClienteDto;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ClienteService {
    
    private final ClientLogin Client;

    public void login() {
        //loginClient.login(email, password);
    }

    public void RegisterInformation(ClienteDto clienteDto) {
        Client.postInformation(clienteDto);
    }
}
