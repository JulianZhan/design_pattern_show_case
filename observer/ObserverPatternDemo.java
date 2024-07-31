package observer;

public class ObserverPatternDemo {
    public static void main(String[] args) {
        Subject subject = new Subject();

        ConcreteObserver1 observer1 = new ConcreteObserver1();
        ConcreteObserver2 observer2 = new ConcreteObserver2();

        subject.register(observer1);
        subject.register(observer2);

        subject.notifyObservers();
    }
}
