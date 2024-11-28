package com.login.login.integration;

import org.springframework.stereotype.Service;

import com.login.login.integration.cliente.Produto;
import com.login.login.integration.dto.ProdutoDto;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProdutoService {
    
    private final Produto produto;


    public void RegisterProduct(ProdutoDto produtoDto) {
        produto.postProducts(produtoDto);
    }

    public void UpdateProduct(ProdutoDto produtoDto) {
        produto.putProducts(produtoDto);
    }

    public void DeleteProduct(ProdutoDto produtoDto) {
        produto.deleteProducts(produtoDto);
    }

    public void GetProduct(ProdutoDto produtoDto) {
        produto.getProducts(produtoDto);
    }
}