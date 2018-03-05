package com.springbootdev.examples.designpatterns.impl;

import com.springbootdev.examples.designpatterns.impl.observer.impl.ObserverA;
import com.springbootdev.examples.designpatterns.impl.observer.impl.ObserverB;
import com.springbootdev.examples.designpatterns.impl.subject.Subject;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MainApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }

    @Override
    public void run(String... strings) throws Exception
    {
        System.out.println("==== started the MainApplication");
        Subject subject = new Subject();

        //Subscribing ObserverA
        ObserverA observerA = new ObserverA();
        subject.subscribe(observerA);

        //Subscribing ObserverB
        ObserverB observerB = new ObserverB();
        subject.subscribe(observerB);

        //ObserverC remain as unsubscribed

        subject.setStatus("Started");
        System.out.println("\n");
        subject.setStatus("In-Progress");
        System.out.println("\n");
        subject.setStatus("Completed");

        System.out.println("==== completed the MainApplication");
    }
}
