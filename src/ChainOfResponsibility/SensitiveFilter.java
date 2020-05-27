package ChainOfResponsibility;

/**
 * @ClassName SensitiveFilter
 * @Description //TODO
 * @Author Han ChengYi
 * @Date 2020/5/27 20:48
 * @Version 1.0
 **/

public class SensitiveFilter implements Filter {
    @Override
    public String doFilter(String msg) {
        return msg.replace("敏感","").replace("被就业","就业");
    }
}
