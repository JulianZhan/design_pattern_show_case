package oberserpipeline;

public interface Subject {
    void notifyObservers();

    void register(Observer o);
}
