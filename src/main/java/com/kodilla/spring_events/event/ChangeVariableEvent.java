package com.kodilla.spring_events.event;

import org.springframework.context.ApplicationEvent;

public class ChangeVariableEvent extends ApplicationEvent {
    private int variable;

    public ChangeVariableEvent(Object source, int variable) {
        super(source);
        this.variable = variable;
    }

    public int getVariable() {
        return this.variable;
    }
}
