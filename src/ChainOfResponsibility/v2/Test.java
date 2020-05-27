package ChainOfResponsibility.v2;

/**
 * @ClassName Test
 * @Description //TODO
 * @Author Han ChengYi
 * @Date 2020/5/27 21:56
 * @Version 1.0
 **/

public class Test {
    public static void main(String[] args) {
        String msg = "大家好:)，<script>，敏感，被就业，网络授课没感觉，因为看不见大家伙儿";
        Request request = new Request();
        request.setRequestStr(msg);
        Response response = new Response();
        response.setResponseStr("response");
        FilterChain fc = new FilterChain();
        fc.addFilter(new HTMLFilter())
                .addFilter(new SesitiveFilter());

        fc.doFilter(request, response, fc);
        System.out.println(request.getRequestStr());
        System.out.println(response.getResponseStr());
    }
}
