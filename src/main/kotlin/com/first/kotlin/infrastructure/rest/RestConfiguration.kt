package com.first.kotlin.infrastructure.rest

import com.first.kotlin.model.CoffeeShop
import org.springframework.context.annotation.Configuration
import org.springframework.data.rest.core.config.RepositoryRestConfiguration
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer
import org.springframework.web.servlet.config.annotation.CorsRegistry

@Configuration
class RestConfiguration : RepositoryRestConfigurer {
    override fun configureRepositoryRestConfiguration(config: RepositoryRestConfiguration?, cors : CorsRegistry) {
        config?.exposeIdsFor(CoffeeShop::class.java)
    }
}
