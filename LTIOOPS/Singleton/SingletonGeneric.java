package LTIOOPS.Singleton;

public class SingletonGeneric<T> {
    private T value;
    private static SingletonGeneric instance;

    private SingletonGeneric(T value) {
        this.value = value;
    }

    public static <T> SingletonGeneric<T> getInstance(T val) {
        if (instance == null) {
            instance = new SingletonGeneric<>(val);
        }
        return instance;
    }

    public T getValue() {
        return value;
    }
}
