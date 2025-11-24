package com.kodilla.spring_events.service;

import com.kodilla.spring_events.event.ChangeVariableEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class ChangeVariableManager implements ApplicationListener<ChangeVariableEvent> {
    private static final Logger logger = LoggerFactory.getLogger(ChangeVariableManager.class);

    @Override
    public void onApplicationEvent(ChangeVariableEvent event) {
        logger.info("Variable changed, current value: " + event.getVariable());
    }
}
