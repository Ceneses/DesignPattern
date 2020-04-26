package Creational.Singleton;

public class HungraySingleton {
    private static HungraySingleton instance = new HungraySingleton();
    private HungraySingleton(){};
    public static HungraySingleton getInstance(){
        return instance;
    }
}
