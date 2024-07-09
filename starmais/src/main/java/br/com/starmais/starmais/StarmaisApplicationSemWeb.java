package br.com.starmais.starmais;

import br.com.starmais.main.Main;
import br.com.starmais.repository.SerieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


//@SpringBootApplication
//@EntityScan(basePackages = "br.com.starmais.model")
//@ComponentScan(basePackages = "br.com.starmais")
//@EnableJpaRepositories(basePackages = "br.com.starmais.repository")
//public class StarmaisApplicationSemWeb implements CommandLineRunner {
//	@Autowired
//	private SerieRepository repository;
//	public static void main(String[] args) {
//		SpringApplication.run(StarmaisApplicationSemWeb.class, args);
//	}
//
//	@Override
//	public void run(String... args) throws Exception {
//		Main main = new Main(repository);
//		main.exibeMenu();
//	}
//}



