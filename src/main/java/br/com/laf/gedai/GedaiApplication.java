package br.com.laf.gedai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("packages")
public class GedaiApplication {

	public static void main(String[] args) {
		SpringApplication.run(GedaiApplication.class, args);
	}
}
