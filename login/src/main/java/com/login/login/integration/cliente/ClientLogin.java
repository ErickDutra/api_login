package com.login.login.integration.cliente;

import org.springframework.cloud.openfeign.FeignClient;

import com.login.login.integration.dto.ClienteDto;

import feign.Headers;
import feign.RequestLine;

@FeignClient(name = "login", url = "http://localhost:8080")
public interface ClientLogin {

    @RequestLine("GET /cliente")
    @Headers("Content-Type : application/json")
    ClienteDto getInformation(ClienteDto clienteDto);

    @RequestLine("POST /cliente")
    @Headers("Content-Type : application/json")
    ClienteDto postInformation(ClienteDto clienteDto);

    @RequestLine("PUT /cliente")
    @Headers("Content-Type : application/json")
    ClienteDto putInformation(ClienteDto clienteDto);

    @RequestLine("DELETE /cliente")
    @Headers("Content-Type : application/json")
    ClienteDto deleteInformation(ClienteDto clienteDto);
}
