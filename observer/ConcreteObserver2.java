package observer;

class ConcreteObserver2 implements Observer {
    @Override
    public void update() {
        System.out.println("ConcreteObserver2 has been notified.");
    }
}
