package com.kodilla.bean_lifecycle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class BeanLifecycleApplication {

	public static void main(String[] args) {
//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
//        context.register(AppConfiguration.class);
//        context.refresh();
//
//        LibraryManager manager = context.getBean(LibraryManager.class);
//        System.out.println("Contekst and beans are set up");

        SpringApplication.run(BeanLifecycleApplication.class, args);

//        context.close();
	}

}
