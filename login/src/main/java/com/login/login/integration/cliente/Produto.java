package com.login.login.integration.cliente;

import org.springframework.cloud.openfeign.FeignClient;

import com.login.login.integration.dto.ProdutoDto;

import feign.Headers;
import feign.RequestLine;

@FeignClient(name = "login", url = "http://localhost:9090")
public interface Produto {
    @RequestLine("GET /get")
    @Headers("Content-Type : application/json")
    ProdutoDto getProducts(ProdutoDto ProdutoDto);

    @RequestLine("POST /save")
    @Headers("Content-Type : application/json")
    ProdutoDto postProducts(ProdutoDto ProdutoDto);

    @RequestLine("PUT /update")
    @Headers("Content-Type : application/json")
    ProdutoDto putProducts(ProdutoDto ProdutoDto);

    @RequestLine("DELETE /delete")
    @Headers("Content-Type : application/json")
    ProdutoDto deleteProducts(ProdutoDto ProdutoDto);
    
}
