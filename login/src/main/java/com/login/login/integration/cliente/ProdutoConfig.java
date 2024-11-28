package com.login.login.integration.cliente;

import org.springframework.context.annotation.Configuration;

import feign.Feign;
import feign.jackson.JacksonDecoder;
import feign.jackson.JacksonEncoder;
import feign.slf4j.Slf4jLogger;

@Configuration
public class ProdutoConfig {

    public Produto produto() {
    return Feign.builder()
            .decoder(new JacksonDecoder())
            .encoder(new JacksonEncoder())
            .logger(new Slf4jLogger(Produto.class))
            .logLevel(feign.Logger.Level.FULL)
            .target(Produto.class, "http://localhost:9090");
        }
}
