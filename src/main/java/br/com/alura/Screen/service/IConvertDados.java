package br.com.alura.Screen.service;

public interface IConvertDados {
    <T> T obterDados(String json, Class<T> classe);
}
