package ChainOfResponsibility;

import java.util.ArrayList;

/**
 * @ClassName MsgProcessor
 * @Description //TODO
 * @Author Han ChengYi
 * @Date 2020/5/27 20:04
 * @Version 1.0
 **/

public class MsgProcessor {
    private String msg;

    ArrayList<Filter> filters = new ArrayList<>();

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void addFilter(Filter filter) {
        this.filters.add(filter);
    }

    public void removeFilter(int index){
        this.filters.remove(index);
    }

    public void doProcessor(){
        for (Filter filter :
                filters) {
            this.msg = filter.doFilter(this.msg);
        }
    }
}
