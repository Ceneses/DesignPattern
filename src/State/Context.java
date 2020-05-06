package State;

/**
 * @ClassName Context
 * @Description //TODO
 * @Author Han ChengYi
 * @Date 2020/5/6 11:16
 * @Version 1.0
 **/

public class Context {
    private State state;

    public void setState(State s){
        System.out.println("修改状态!");
        state = s;
        state.handle();
    }
}
