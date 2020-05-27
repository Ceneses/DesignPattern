package Proxy.DynamicProxy;

/**
 * @ClassName RealStar
 * @Description //TODO
 * @Author Han ChengYi
 * @Date 2020/5/7 10:57
 * @Version 1.0
 **/

public class RealStar implements Star {
    @Override
    public void method1() {
        System.out.println("Real Star method1");
    }

    @Override
    public void method2() {
        System.out.println("Real Star method2");
    }

    @Override
    public void method3() {
        System.out.println("Real Star method3");
    }

    @Override
    public void method4() {
        System.out.println("Real Star method4");
    }

    @Override
    public void method5() {
        System.out.println("Real Star method5");
    }

    @Override
    public void method6() {
        System.out.println("Real Star method6");
    }
}
