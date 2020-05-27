package ChainOfResponsibility;

/**
 * @ClassName Test
 * @Description //TODO
 * @Author Han ChengYi
 * @Date 2020/5/27 20:01
 * @Version 1.0
 **/

public class Test {
    public static void main(String[] args) {
        String msg = "你好:), <script/>, 敏感, 被就业";
        System.out.println(msg);
        MsgProcessor msgProcessor = new MsgProcessor();
        msgProcessor.setMsg(msg);
        msgProcessor.addFilter(new HTMLFilter());
        msgProcessor.addFilter(new SensitiveFilter());
        msgProcessor.addFilter(new FaceFilter());
        msgProcessor.doProcessor();
        msg = msgProcessor.getMsg();
        System.out.println(msg);
    }
}
