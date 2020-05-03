package Creational.Singleton;

/**
 * @ClassName StatiscInnerClass
 * @Description //TODO
 * @Author Han ChengYi
 * @Date 2020/5/3 17:24
 * @Version 1.0
 **/

public class StatiscInnerClass {
    private static class InnerClass{
        //private 表明只能通过类内部访问
        //static 表明只有一份
        //final 说明这个变量是不变的
        private static final StatiscInnerClass instance = new StatiscInnerClass();
    }
    public static StatiscInnerClass getInstance(){
        return InnerClass.instance;
    }
    private StatiscInnerClass(){

    }

    public static void main(String[] args) {
        StatiscInnerClass instance1 = StatiscInnerClass.getInstance();
        StatiscInnerClass instance2 = StatiscInnerClass.getInstance();
        System.out.println(instance1 == instance2);
    }
}
