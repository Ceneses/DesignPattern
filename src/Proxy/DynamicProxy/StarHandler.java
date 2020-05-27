package Proxy.DynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @ClassName StarHandler
 * @Description //TODO
 * @Author Han ChengYi
 * @Date 2020/5/7 10:58
 * @Version 1.0
 **/

public class StarHandler implements InvocationHandler {
    Star realStar;

    public StarHandler(Star realStar){
        this.realStar = realStar;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("#1洽谈");
        System.out.println("#2洽谈");
        System.out.println("#3洽谈");
        System.out.println("#4洽谈");
        if(method.getName().equals("method5")){
            method.invoke(realStar,args);
        }
        System.out.println("#6洽谈");
        return null;
    }
}
