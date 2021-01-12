package generating.singleton;

import java.util.concurrent.atomic.AtomicReference;

/**
 *  Одиночка (Singleton)
 *  Гарантирует, что у класса есть только один экземпляр, и предоставляет к нему глобальную точку доступа.
 */
public class SingletonCAS {
    private static AtomicReference<SingletonCAS> instance;
    public String value;

    private SingletonCAS(String value) {
        instance = new AtomicReference<>();
        this.value = value;
    }

    public static SingletonCAS getInstance(String value) {
        if (instance == null) {
            SingletonCAS s = new SingletonCAS(value);
            instance.compareAndSet(null, s);
        }
        return instance.get();
    }

    public static void main(String[] args) {
        System.out.println(
                "If you see the same value, then singleton was reused (yay!)\n" +
                "If you see different values, then 2 singletons were created (booo!!)\n\n" +
                "RESULT:\n"
        );
        Thread threadFoo = new Thread(new ThreadFoo());
        Thread threadBar = new Thread(new ThreadBar());
        threadFoo.start();
        threadBar.start();
    }

    public static class ThreadBar implements Runnable {
        @Override
        public void run() {
            SingletonCAS singleton = SingletonCAS.getInstance("BAR");
            System.out.println(singleton.value);
        }
    }

    public static class ThreadFoo implements Runnable {
        @Override
        public void run() {
            SingletonCAS singleton = SingletonCAS.getInstance("FOO");
            System.out.println(singleton.value);
        }
    }

}