package br.com.alura.Screen.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

//      Desserializando: @JsonAlias somente le o json, @JsonProperty le e escreve json

@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosSerie(@JsonAlias ("Title") String titulo,
                         @JsonAlias ("totalSeasons") Integer totalTemporadas,
                         @JsonAlias ("imdbRating") String avaliacao){
}
