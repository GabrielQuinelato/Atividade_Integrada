package main.java.senai.infoa.com.Atividade_Integrador.configs;

import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@Configuration
@OpenAPIDefinition(
    info = @Info(
        title = "ExpressWorld API",
        version = "1.0",
        description = "API para venda de produtos eletronicos"
    )
)
public class Swagger {
    
}
