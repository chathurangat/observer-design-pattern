package com.springbootdev.examples.designpatterns.impl.observer.impl;

import com.springbootdev.examples.designpatterns.impl.observer.Observer;
import com.springbootdev.examples.designpatterns.impl.subject.Subject;

public class ObserverC implements Observer
{
    @Override
    public void receiveUpdate(Subject subject)
    {
        System.out.println("update received by [" + this.getClass().getSimpleName() + "]");
    }
}
