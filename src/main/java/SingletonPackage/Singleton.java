package SingletonPackage;

public class Singleton {

    private Singleton () {}

    public Singleton getInstance() {
        return SingletonHolder.SINGLETON;
    }

    private static class SingletonHolder {
        private static final Singleton SINGLETON = new Singleton();
    }
}
