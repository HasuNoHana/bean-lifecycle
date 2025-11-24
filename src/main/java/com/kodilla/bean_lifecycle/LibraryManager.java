package com.kodilla.bean_lifecycle;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
public class LibraryManager implements BeanNameAware, BeanClassLoaderAware, BeanFactoryAware, InitializingBean, DisposableBean {

    private String beanName;

    @Override
    public void setBeanName(String name) {
        beanName = name;
        System.out.println("Name of the brean: " + name);
    }

    @Override
    public void setBeanClassLoader(ClassLoader classLoader) {
        System.out.println("class loader");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("beanFactory");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("properties are set");
    }

    @PostConstruct
    public void exampleConstructMethod() {
        System.out.println("PostConstruct");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("destroy");
    }

    @PreDestroy
    public void exampleDestroyMethod() {
        System.out.println("PreDestroy");
    }

}
