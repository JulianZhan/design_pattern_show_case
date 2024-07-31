package withoutobserver;

class Subject {
    private ConcreteObserver1 observer1;
    private ConcreteObserver2 observer2;

    public void setObserver1(ConcreteObserver1 observer1) {
        this.observer1 = observer1;
    }

    public void setObserver2(ConcreteObserver2 observer2) {
        this.observer2 = observer2;
    }

    public void notifyObservers() {
        if (observer1 != null) {
            observer1.update();
        }
        if (observer2 != null) {
            observer2.update();
        }
    }
}
