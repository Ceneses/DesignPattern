package Proxy.DynamicProxy;

import java.lang.reflect.Proxy;

/**
 * @ClassName Test
 * @Description //TODO
 * @Author Han ChengYi
 * @Date 2020/5/7 11:34
 * @Version 1.0
 **/

public class Test {
    public static void main(String[] args) {
        Star realStar = new RealStar();
        StarHandler handler= new StarHandler(realStar);
        Star proxy = (Star) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(),new Class[]{Star.class},handler);
        proxy.method5();
        System.out.println("==============================");
        proxy.method4();
    }
}
