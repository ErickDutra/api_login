package com.login.login.integration.cliente;

import org.springframework.context.annotation.Configuration;

import feign.Feign;
import feign.jackson.JacksonDecoder;
import feign.jackson.JacksonEncoder;
import feign.slf4j.Slf4jLogger;

@Configuration
public class ClienteLoginConfig {
    

    public ClientLogin clientLogin() {
         return Feign.builder()
            .decoder(new JacksonDecoder())
            .encoder(new JacksonEncoder())
            .logger(new Slf4jLogger(ClientLogin.class))
            .logLevel(feign.Logger.Level.FULL)
            .target(ClientLogin.class, "http://localhost:8080");
    }
}
