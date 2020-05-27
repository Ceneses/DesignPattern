package ChainOfResponsibility.v2;

/**
 * @ClassName SesitiveFilter
 * @Description //TODO
 * @Author Han ChengYi
 * @Date 2020/5/27 22:00
 * @Version 1.0
 **/

public class SesitiveFilter implements Filter {
    @Override
    public void doFilter(Request request, Response response, FilterChain filterChain) {
        request.setRequestStr(request.getRequestStr().replace('<', '[')
                .replace('>', ']') + "---SensitiveFilter()");
        filterChain.doFilter(request, response, filterChain);
        response.setResponseStr(response.getResponseStr() + "---SensitiveFilter()");
    }
}
