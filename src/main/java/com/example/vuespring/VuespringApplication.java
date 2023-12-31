package com.example.vuespring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class VuespringApplication implements WebMvcConfigurer {

	public static void main(String[] args) {
		SpringApplication.run(VuespringApplication.class, args);
	}
}
