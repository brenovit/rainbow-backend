package io.github.brenovit.rainbow.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class SwaggerConfig {

	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("io.github.brenovit.rainbow.controller"))
				.paths(PathSelectors.any()).build().apiInfo(getAPIInfo());
	}

	private ApiInfo getAPIInfo() {
		return new ApiInfoBuilder().title("Rainbow").description("\"REST API of Rainbow\"").build();
	}
}
