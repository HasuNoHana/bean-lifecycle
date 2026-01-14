package com.kodilla.spring_events.controller;

import com.kodilla.spring_events.domain.ValueDto;
import com.kodilla.spring_events.event.ChangeVariableEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/calculator")
public class CalculatorController implements ApplicationEventPublisherAware {
    private int variable;
    private ApplicationEventPublisher publisher;

    @PostMapping(path = "add")
    public void add(@RequestBody ValueDto valueDto) {
        System.out.println("add " + valueDto.getValue() + " to variable");
        this.variable = this.variable + valueDto.getValue();
        publisher.publishEvent(new ChangeVariableEvent(
                this,
                this.variable
        ));
    }

    @PostMapping(path = "substract")
    public void substract(@RequestBody ValueDto valueDto) {
        System.out.println("substract " + valueDto.getValue() + " from variable");
        this.variable = this.variable - valueDto.getValue();
        publisher.publishEvent(new ChangeVariableEvent(
                this,
                this.variable
        ));
    }

    @PostMapping(path = "multiply")
    public void multiply(@RequestBody ValueDto valueDto) {
        System.out.println("multiply variable by " + valueDto.getValue());
        this.variable = this.variable * valueDto.getValue();
        publisher.publishEvent(new ChangeVariableEvent(
                this,
                this.variable
        ));
    }

    @PostMapping(path = "divide")
    public void divide(@RequestBody ValueDto valueDto) {
        if(valueDto.getValue() == 0){
            throw new RuntimeException("Dividing by 0 is not possible");
        }
        System.out.println("divide variable by " + valueDto.getValue());
        this.variable = this.variable / valueDto.getValue();
        publisher.publishEvent(new ChangeVariableEvent(
                this,
                this.variable
        ));
    }

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.publisher = applicationEventPublisher;
    }
}
