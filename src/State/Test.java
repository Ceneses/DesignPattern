package State;

/**
 * @ClassName Test
 * @Description //TODO
 * @Author Han ChengYi
 * @Date 2020/5/6 11:20
 * @Version 1.0
 **/

public class Test {
    public static void main(String[] args) {
        Context ctx = new Context();
        ctx.setState(new BookState());
        ctx.setState(new FreeState());
        ctx.setState(new CheckInState());
    }
}
