package ChainOfResponsibility;

/**
 * @ClassName FaceFilter
 * @Description //TODO
 * @Author Han ChengYi
 * @Date 2020/5/27 20:50
 * @Version 1.0
 **/

public class FaceFilter implements Filter {
    @Override
    public String doFilter(String msg) {
        return msg.replace(":)","^V^");
    }
}
