package org.lsf.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//@Configuration
@EnableWebMvc
public abstract class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {

        registry.addMapping("/**")
                .allowedOrigins("0.0.0.0")
                .allowedMethods("GET", "POST")
                .allowedHeaders()
                .allowCredentials(true).maxAge(3600);
        // Add more mappings...
    }
}