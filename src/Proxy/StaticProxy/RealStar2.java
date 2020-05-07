package Proxy.StaticProxy;

/**
 * @ClassName RealStar2
 * @Description //TODO
 * @Author Han ChengYi
 * @Date 2020/5/7 10:42
 * @Version 1.0
 **/

public class RealStar2 implements Star {
    private Star star;

    public RealStar2(Star star) {
        this.star = star;
    }

    @Override
    public void method1() {
        System.out.println("ProxyStar method1...");
    }

    @Override
    public void method2() {
        System.out.println("ProxyStar method2...");
    }

    @Override
    public void method3() {
        System.out.println("ProxyStar method3...");
    }

    @Override
    public void method4() {
        System.out.println("ProxyStar method4...");
    }

    @Override
    public void method5() {
        star.method5();
    }

    @Override
    public void method6() {
        System.out.println("ProxyStar method6...");
    }
}
