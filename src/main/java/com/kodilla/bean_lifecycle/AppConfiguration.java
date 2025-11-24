package com.kodilla.bean_lifecycle;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguration {

    @Bean
    public LibraryManager libraryManager() {
        return new LibraryManager();
    }

    @Bean
    public BeanMonitor beanMonitor() {
        return new BeanMonitor();
    }

    @Bean
    public MemeController memeController() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        return  new MemeController(context);
    }
}
