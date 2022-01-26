package edu.eci.ieti.app.webapp.config;

import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2WebMvc;

/**
 * @author Iván Camilo Rincón Saavedra
 * @version 1.0 1/26/2022
 * @project App
 */
@Configuration
@EnableSwagger2WebMvc
public class SwaggerConfig {

    public Docket documentation(){
        return new Docket( DocumentationType.SWAGGER_2 )
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build();
    }
}
