package observer;

class ConcreteObserver1 implements Observer {
    @Override
    public void update() {
        System.out.println("ConcreteObserver1 has been notified.");
    }
}
