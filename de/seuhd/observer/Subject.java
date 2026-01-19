package de.seuhd.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
    List<Observer> observers = new ArrayList<>();
    int value;

    void setValue(int i){
        value = i;
        System.out.println("Value of subject updated to " + i);
        notifyObservers();
    }

    void attach(Observer observer) {
        observers.add(observer);
    }

    void detach(Observer observer) {
        observers.remove(observer);
    }

    protected void notifyObservers() {
        System.out.println("Sending update to observers ...");
        for (Observer observer : observers) {
            observer.update(this);
        }
    }
}
