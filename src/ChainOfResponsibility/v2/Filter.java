package ChainOfResponsibility.v2;

public interface Filter {
    void doFilter(Request request, Response response, FilterChain filterChain);
}
