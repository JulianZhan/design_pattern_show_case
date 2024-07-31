package oberserpipeline;

import java.util.ArrayList;
import java.util.List;

public class DataAnalyzer implements Observer, Subject {

    private final List<Observer> observers = new ArrayList<>();

    @Override
    public void register(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.processData();
        }
    }

    @Override
    public void processData() {
        System.out.println("DataAnalyzer is analyzing data.");
        // Sleep for 1 second to simulate data processing
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        notifyObservers();
    }
}
