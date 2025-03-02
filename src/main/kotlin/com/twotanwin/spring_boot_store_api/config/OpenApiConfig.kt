package com.twotanwin.spring_boot_store_api.config

import io.swagger.v3.oas.models.OpenAPI
import io.swagger.v3.oas.models.info.Info
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import io.swagger.v3.oas.models.tags.Tag

@Configuration
class OpenApiConfig {

    @Bean
    fun customOpenAPI(): OpenAPI {
        return OpenAPI().info(
            Info()
                .title("Store API with Spring Boot and PostgreSQL")
                .version("1.0")
                .description("This is Store API using Spring Boot and PostgreSQL")
        )
            .tags(
                listOf(
                    Tag().name("Authenticate").description("Authenticate APIs"),
                    Tag().name("Categories").description("Category management APIs"),
                    Tag().name("Products").description("Product management APIs")
                )
            )

    }
}