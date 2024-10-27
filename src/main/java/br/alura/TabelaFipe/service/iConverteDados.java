package br.alura.TabelaFipe.service;

import java.util.List;

public interface iConverteDados {
    <T> T obterDados(String json, Class<T> classe); // Generics, usa-se quando nao sabe ainda oque sera devolvido

    <T> List <T> obterLista(String json, Class<T> classe);
}

