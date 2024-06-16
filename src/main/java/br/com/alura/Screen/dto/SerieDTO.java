package br.com.alura.Screen.dto;

import br.com.alura.Screen.model.Categoria;

public record SerieDTO (
        Long id,
        String titulo,
        Integer totalTemporadas,
        Double avaliacao,
        Categoria genero,
        String atores,
        String poster,
        String sinopse) {
}
