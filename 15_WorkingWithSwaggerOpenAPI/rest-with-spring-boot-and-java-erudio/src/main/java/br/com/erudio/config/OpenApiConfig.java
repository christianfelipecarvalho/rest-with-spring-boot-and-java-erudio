package br.com.erudio.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@Configuration
public class OpenApiConfig {

	@Bean
	public OpenAPI customOpenAPI() {
		return new OpenAPI()
				.info(new Info()
					.title("RESTful API With Java 18 and Spring boot")
					.version("v1")
					.description("Some description about your API")
					.termsOfService("www.google.com")
					.license(new License().name("apache 2.0")
					.url("www.google.com")));
	}
}
