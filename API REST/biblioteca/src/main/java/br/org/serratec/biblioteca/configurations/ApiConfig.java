package br.org.serratec.biblioteca.configurations;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ApiConfig {

	@Bean
	ModelMapper modelMapperBean() {
		return new ModelMapper();
	}

	@Bean
	RestTemplate restTemplateBean() {
		return new RestTemplate();
	}
}