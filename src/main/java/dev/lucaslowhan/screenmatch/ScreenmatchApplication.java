package dev.lucaslowhan.screenmatch;

import dev.lucaslowhan.screenmatch.model.DadosEpisodio;
import dev.lucaslowhan.screenmatch.model.DadosSerie;
import dev.lucaslowhan.screenmatch.model.DadosTemporada;
import dev.lucaslowhan.screenmatch.principal.Principal;
import dev.lucaslowhan.screenmatch.service.ConsumoApi;
import dev.lucaslowhan.screenmatch.service.ConverteDados;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class ScreenmatchApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ScreenmatchApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Principal principal = new Principal();
		principal.exibeMenu();


	}


















}
