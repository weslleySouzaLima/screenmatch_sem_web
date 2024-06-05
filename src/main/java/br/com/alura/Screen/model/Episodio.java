package br.com.alura.Screen.model;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.zip.DataFormatException;

public class Episodio {
    private Integer temporada;
    private String titulo;
    private Integer numeroEpsodio;
    private Double avaliacao;
    private LocalDate dataLancamento;

    public Episodio(Integer numeroTemporada, DadosEpisodio dadosEpisodio) {
        this.temporada = numeroTemporada;
        this.titulo = dadosEpisodio.titulo();
        this.numeroEpsodio = dadosEpisodio.numeroEpsodio();

        try {
            this.avaliacao = Double.valueOf(dadosEpisodio.avaliacao());
        } catch (NumberFormatException e) {
            this.avaliacao = 0.0;
        }

        try {
            this.dataLancamento = LocalDate.parse(dadosEpisodio.dataLancamento());
        } catch (DateTimeParseException e) {
            this.dataLancamento = null;
        }
    }

    public Integer getTemporada() {
        return temporada;
    }

    public void setTemporada(Integer temporada) {
        this.temporada = temporada;
    }

    public Double getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(Double avaliacao) {
        this.avaliacao = avaliacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getNumeroEpsodio() {
        return numeroEpsodio;
    }

    public void setNumeroEpsodio(Integer numeroEpsodio) {
        this.numeroEpsodio = numeroEpsodio;
    }

    public LocalDate getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(LocalDate dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    @Override
    public String toString() {
        return "temporada=" + temporada +
                ", titulo='" + titulo + '\'' +
                ", numeroEpsodio=" + numeroEpsodio +
                ", avaliacao=" + avaliacao +
                ", dataLancamento=" + dataLancamento;
    }
}
