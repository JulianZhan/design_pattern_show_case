package singleton;

public class SingletonWithLockBeforeCreation {
    private static SingletonWithLockBeforeCreation instance;

    private SingletonWithLockBeforeCreation() {}

    public static SingletonWithLockBeforeCreation getInstance() {
        if (instance == null) {
            synchronized (SingletonWithLockBeforeCreation.class) {
                if (instance == null) {
                    instance = new SingletonWithLockBeforeCreation();
                }
            }
        }
        return instance;
    }
}
