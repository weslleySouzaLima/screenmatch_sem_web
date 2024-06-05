package br.com.alura.Screen;

import br.com.alura.Screen.principal.Principal;
import br.com.alura.Screen.repository.SerieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class ScreenApplication implements CommandLineRunner {
	@Autowired
    private SerieRepository repositorio;

	public static void main(String[] args) {
		SpringApplication.run(ScreenApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Principal principal = new Principal(repositorio);
		principal.exibeMenu();
	}

}
