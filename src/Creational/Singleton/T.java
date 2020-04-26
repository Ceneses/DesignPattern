package Creational.Singleton;

public class T implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " "+ LazySingleton.getInstance());
    }
}
