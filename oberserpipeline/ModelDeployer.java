package oberserpipeline;

public class ModelDeployer implements Observer {
    @Override
    public void processData() {
        System.out.println("ModelDeployer is deploying model.");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("ModelDeployer has deployed model.");
    }
}
