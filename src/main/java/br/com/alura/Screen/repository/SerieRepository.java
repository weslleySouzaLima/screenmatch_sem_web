package br.com.alura.Screen.repository;

import br.com.alura.Screen.model.Serie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SerieRepository extends JpaRepository<Serie, Long> {
}
