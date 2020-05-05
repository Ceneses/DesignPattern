package Command;

/**
 * @ClassName Client
 * @Description //TODO
 * @Author Han ChengYi
 * @Date 2020/5/5 21:15
 * @Version 1.0
 **/

public class Client {
    public static void main(String[] args) {
        Command c = new ConcreteCommand(new Receiver());
        Invoke invoke = new Invoke(c);
        invoke.call();
        // 整个模式的设计思想就是通过Invoke调用Command，Command调用Receiver
    }
}
