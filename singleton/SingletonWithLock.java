package singleton;

public class SingletonWithLock {
    private static SingletonWithLock instance;

    private SingletonWithLock() {
        System.out.println("Creating instance");
    }

    public static synchronized SingletonWithLock getInstance() {
        if (instance == null) {
            instance = new SingletonWithLock();
        }
        return instance;
    }
}
