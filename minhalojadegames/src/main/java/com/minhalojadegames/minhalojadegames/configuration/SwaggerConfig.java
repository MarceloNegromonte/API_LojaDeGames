package com.minhalojadegames.minhalojadegames.configuration;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.builders.ResponseBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.Response;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class SwaggerConfig {
	
	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors
				.basePackage("br.org.generation.api_lojagames.controller"))
				.paths(PathSelectors.any())
				.build()
				.apiInfo(metadata())
				.useDefaultResponseMessages(false)
				.globalResponses(HttpMethod.GET, responseMessage())
				.globalResponses(HttpMethod.POST, responseMessage())
				.globalResponses(HttpMethod.PUT, responseMessage())
				.globalResponses(HttpMethod.DELETE, responseMessage());
				
	}
	public static ApiInfo metadata() {
		
		return new ApiInfoBuilder()
				.title("api_lojagames")
				.description("Projeto api spring - lojagames")
				.version("1.0.0")
				.license("apache license version 2.0")
				.licenseUrl("https://github.com/Camibaza/API_LojaDeGames.git")
				.contact(contact())
				.build();
	}
	private static Contact contact() {
		return new Contact("Camila Bazante", 
				"https://github.com/Camibaza",
				"bazante_mila@hotmail.com");
	}
	private static List<Response> responseMessage(){
		return new ArrayList<Response>() {
			
			private static final long serialVersionUID = 1L;{
			
			add(new ResponseBuilder().code("200")
					.description("Sucesso!").build());
					add(new ResponseBuilder().code("201")
					.description("Criado!").build());
					add(new ResponseBuilder().code("400")
					.description("Erro na requisição!").build());
					add(new ResponseBuilder().code("401")
					.description("Não Autorizado!").build());
					add(new ResponseBuilder().code("403")
					.description("Proibido!").build());
					add(new ResponseBuilder().code("404")
					.description("Não Encontrado!").build());
					add(new ResponseBuilder().code("500")
					.description("Erro!").build());
		}
		};
	}

}
