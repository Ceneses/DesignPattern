package Proxy.StaticProxy;

/**
 * @ClassName Client
 * @Description //TODO
 * @Author Han ChengYi
 * @Date 2020/5/7 10:45
 * @Version 1.0
 **/

public class Client {
    public static void main(String[] args) {
        Star star = new RealStar1();
        RealStar2 star2 = new RealStar2(star);
        star2.method1();
        star2.method2();
        star2.method3();
        star2.method4();
        star2.method5();
        star2.method6();
    }
}
