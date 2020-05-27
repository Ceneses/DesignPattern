package ChainOfResponsibility;

/**
 * @ClassName HTMLFilter
 * @Description //TODO
 * @Author Han ChengYi
 * @Date 2020/5/27 20:46
 * @Version 1.0
 **/

public class HTMLFilter implements Filter {
    @Override
    public String doFilter(String msg) {
        return msg.replace("<","[").replace(">","]");
    }
}
