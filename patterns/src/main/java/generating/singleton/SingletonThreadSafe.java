package generating.singleton;

/**
 *  Одиночка (Singleton)
 *  Гарантирует, что у класса есть только один экземпляр, и предоставляет к нему глобальную точку доступа.
 */
public final class SingletonThreadSafe {
    // Поле обязательно должно быть объявлено volatile, чтобы двойная проверка
    // блокировки сработала как надо.
    private static volatile SingletonThreadSafe instance;

    public String value;

    private SingletonThreadSafe(String value) {
        this.value = value;
    }

    public static SingletonThreadSafe getInstance(String value) {
        // Техника, которую мы здесь применяем называется «блокировка с двойной
        // проверкой» (Double-Checked Locking). Она применяется, чтобы
        // предотвратить создание нескольких объектов-одиночек, если метод будет
        // вызван из нескольких потоков одновременно.
        // Хотя переменная `result` вполне оправданно кажется здесь лишней, она
        // помогает избежать подводных камней реализации DCL в Java.
        // Больше об этой проблеме можно почитать здесь:
        // https://refactoring.guru/ru/java-dcl-issue
        SingletonThreadSafe result = instance;
        if (result != null) {
            return result;
        }
        synchronized(SingletonThreadSafe.class) {
            if (instance == null) {
                instance = new SingletonThreadSafe(value);
            }
            return instance;
        }
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
            SingletonThreadSafe singleton = SingletonThreadSafe.getInstance("BAR");
            System.out.println(singleton.value);
        }
    }

    public static class ThreadFoo implements Runnable {
        @Override
        public void run() {
            SingletonThreadSafe singleton = SingletonThreadSafe.getInstance("FOO");
            System.out.println(singleton.value);
        }
    }

}