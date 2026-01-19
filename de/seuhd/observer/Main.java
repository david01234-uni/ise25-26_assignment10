package de.seuhd.observer;

public class Main {
    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();
        ConcreteObserver observer1 = new ConcreteObserver(subject, "Observer1");
        ConcreteObserver observer2 = new ConcreteObserver(subject, "Observer2");

        subject.setValue(5);
        observer1.detach();
        subject.setValue(1);
        observer2.detach();
        subject.setValue(3);
    }
}
