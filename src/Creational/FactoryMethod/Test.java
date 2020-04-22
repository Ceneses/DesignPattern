package Creational.FactoryMethod;

/**
 * 工厂方法：
 * 将简单工厂的方法移到了各种工厂的内部
 * 这样扩展起来就更加的简单轻松，可拓展性好
 */
public class Test {
    public static void main(String[] args) {
        VideoFactory videoFactory = new JavaVideoFactory();
        Video video = videoFactory.getVideo();
        video.produce();
    }
}
