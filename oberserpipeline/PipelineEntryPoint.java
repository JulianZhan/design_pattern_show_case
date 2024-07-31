package oberserpipeline;

import java.util.ArrayList;
import java.util.List;

public class PipelineEntryPoint {

    private final List<Observer> observers = new ArrayList<>();

    public void register(Observer observer) {
        observers.add(observer);
    }

    public void startPipeline() {
        System.out.println("Pipeline Starts");
        DataProcessor dataProcessor = new DataProcessor();
        DataAnalyzer dataAnalyzer = new DataAnalyzer();
        ModelTrainer modelTrainer = new ModelTrainer();
        ModelEvaluator modelEvaluator = new ModelEvaluator();
        ModelDeployer modelDeployer = new ModelDeployer();
        register(dataProcessor);
        dataProcessor.register(dataAnalyzer);
        dataAnalyzer.register(modelTrainer);
        modelTrainer.register(modelEvaluator);
        modelEvaluator.register(modelDeployer);
        notifyObservers();
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.processData();
        }
    }

    public void startPipelineDirect() {
        System.out.println("Pipeline Starts");
        processData(new DataProcessor());
        processData(new DataAnalyzer());
        processData(new ModelTrainer());
        processData(new ModelEvaluator());
        processData(new ModelDeployer());
    }

    private void processData(Observer observer) {
        observer.processData();
    }
}
