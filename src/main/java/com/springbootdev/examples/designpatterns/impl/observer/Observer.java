package com.springbootdev.examples.designpatterns.impl.observer;

import com.springbootdev.examples.designpatterns.impl.subject.Subject;

public interface Observer
{
     void receiveUpdate(Subject subject);
}
