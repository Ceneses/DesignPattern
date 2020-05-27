package ChainOfResponsibility.v2;

/**
 * @ClassName HTMLFilter
 * @Description //TODO
 * @Author Han ChengYi
 * @Date 2020/5/27 21:59
 * @Version 1.0
 **/

public class HTMLFilter implements Filter {
    @Override
    public void doFilter(Request request, Response response, FilterChain filterChain) {
        request.setRequestStr(request.getRequestStr().replace("<","[").replace(">","]")+"----HTMLFilter");
        filterChain.doFilter(request, response, filterChain);
        response.setResponseStr(response.getResponseStr() + "---HTMLFilter");
    }
}
