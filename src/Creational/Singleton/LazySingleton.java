package Creational.Singleton;

public class LazySingleton {
    private volatile static LazySingleton instance = null; // 防止指令重排序
    private LazySingleton(){

    }
    public static LazySingleton getInstance(){
        if(instance == null){ // 如果instance已经被赋值，那么就直接赋值
            synchronized (LazySingleton.class){
                if(instance == null){ // 当2条线程同时进行到这个地方的时候，还是需要进行null判断
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }
}
