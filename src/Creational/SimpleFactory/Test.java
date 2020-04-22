package Creational.SimpleFactory;

/**
 * 简单工厂方法：
 * 采用了两种方式产生类
 * 1.通过字符
 * 2.通过反射创建类
 */
public class Test {
    public static void main(String[] args) {
        VideoFactory videoFactory = new VideoFactory();
        Video video = videoFactory.getVideo("java");
        video.produce();
        Video video1 = videoFactory.getVideo(PythonVideo.class);
        video1.produce();
    }
}
