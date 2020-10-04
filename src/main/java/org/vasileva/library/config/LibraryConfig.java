package org.vasileva.library.config;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("org.vasileva.library")
@PropertySource("classpath:application.properties")
public class LibraryConfig {

}
