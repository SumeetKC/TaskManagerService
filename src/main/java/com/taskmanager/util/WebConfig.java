/**
 * 
 */
package com.taskmanager.util;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author SumeetK
 *
 */

@Configuration
@EnableWebMvc
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {

        registry.addMapping("/v1/**")
            .allowedOrigins("*")
            .allowedMethods("POST", "GET", "PUT", "DELETE")
            .allowedHeaders("*")
            .exposedHeaders("*")
            .allowCredentials(true).maxAge(3600);

    }
}
