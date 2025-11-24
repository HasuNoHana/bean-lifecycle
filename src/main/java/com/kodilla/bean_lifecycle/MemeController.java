package com.kodilla.bean_lifecycle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemeController {

    private static final Logger logger = LoggerFactory.getLogger(MemeController.class);
    private AnnotationConfigApplicationContext context;

    public MemeController(AnnotationConfigApplicationContext context) {
        this.context = context;
        context.registerBean(LibraryManager.class, LibraryManager::new);
        context.refresh();
    }

    @GetMapping("/mywork")
    public String getMyWork() {
        logger.info("It ain't much, but it's honest work");
        LibraryManager manager = context.getBean(LibraryManager.class);
        System.out.println("Context and beans are set up and ready to work");
        return "https://i.kym-cdn.com/entries/icons/original/000/028/021/work.jpg";
    }

}
