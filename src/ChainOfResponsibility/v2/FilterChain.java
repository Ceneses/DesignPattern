package ChainOfResponsibility.v2;

import java.util.ArrayList;

/**
 * @ClassName FilterChain
 * @Description //TODO
 * @Author Han ChengYi
 * @Date 2020/5/27 21:49
 * @Version 1.0
 **/

public class FilterChain implements Filter {
    private ArrayList<Filter> filters = new ArrayList<Filter>();
    int index = 0;

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }


    public FilterChain addFilter(Filter filter) {
        filters.add(filter);
        return this;
    }

    @Override
    public void doFilter(Request request, Response response, FilterChain filterChain) {
        if(index == filters.size()) {
            return;
        }
        Filter f = filters.get(index);
        index++;
        f.doFilter(request, response, filterChain);
    }
}
