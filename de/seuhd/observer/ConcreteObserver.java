package de.seuhd.observer;

public class ConcreteObserver implements Observer {
    String observername;
    Subject subject;

    public ConcreteObserver(Subject subject, String observername) {
        this.subject = subject;
        subject.attach(this);
        this.observername = observername;
    }

    @Override
    public void update(Subject subject) {
        this.subject = subject;
        System.out.println(this.observername +" received update from subject : New value is " + subject.value);
    }

    public void detach() {
        subject.detach(this);
    }
}
