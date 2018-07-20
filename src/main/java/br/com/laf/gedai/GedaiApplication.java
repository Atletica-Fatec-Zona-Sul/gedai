package br.com.laf.gedai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootConfiguration
@EnableAutoConfiguration
@SpringBootApplication
public class GedaiApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(GedaiApplication.class, args);
	}
}
