package com.b2b.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class }, scanBasePackages={"com.b2b.example.controller"})
@EnableConfigurationProperties
@ComponentScan(basePackages = {"com.b2b.example.services", "com.b2b.example.controller"})
public class ExampleApplication {

    static Logger logger = (Logger) LoggerFactory.getLogger(Logger.class);

    public static void main(String[] args) {
        logger.debug("DebugMessage");
        SpringApplication.run(ExampleApplication.class, args);
    }

}
