package withoutobserver;

public class WithoutObserverPatternDemo {
    public static void main(String[] args) {
        Subject subject = new Subject();

        ConcreteObserver1 observer1 = new ConcreteObserver1();
        ConcreteObserver2 observer2 = new ConcreteObserver2();

        subject.setObserver1(observer1);
        subject.setObserver2(observer2);

        subject.notifyObservers();
    }
}
