package State;

/**
 * @ClassName FreeState
 * @Description //TODO
 * @Author Han ChengYi
 * @Date 2020/5/6 11:13
 * @Version 1.0
 **/

public class FreeState implements State {
    @Override
    public void handle() {
        System.out.println("房间是处于空闲状态~~~");
    }
}
