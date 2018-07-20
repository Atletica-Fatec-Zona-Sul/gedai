package br.com.laf.gedai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class GedaiApplication {

	public static void main(String[] args) {
		SpringApplication.run(GedaiApplication.class, args);
	}
}
