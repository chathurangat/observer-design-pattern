package com.springbootdev.examples.designpatterns.impl.subject;

import com.springbootdev.examples.designpatterns.impl.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {

    private String status;
    private List<Observer> observers = new ArrayList<Observer>();

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        System.out.println("changing the status to [" + status + "] ");
        this.status = status;
        this.notifyObservers();
    }

    public void subscribe(Observer observer) {
        observers.add(observer);
    }

    public void unsubscribe(Observer observer) {
        observers.remove(observer);
    }

    private void notifyObservers() {
        System.out.println("notifying observers");
        observers.stream().forEach((observer) -> {
            observer.receiveUpdate(this);
        });
    }
}
