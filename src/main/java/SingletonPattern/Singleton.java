package SingletonPattern;

public class Singleton {

    private Singleton () {}

    public static Singleton getInstance() {
        return SingletonHolder.SINGLETON;
    }

    private static class SingletonHolder {
        private static final Singleton SINGLETON = new Singleton();
    }
}
