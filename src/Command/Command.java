package Command;

/**
 * @ClassName Command
 * @Description 使用接口可以增加系统的灵活性
 * @Author Han ChengYi
 * @Date 2020/5/5 21:00
 * @Version 1.0
 **/

public interface Command {
    void execute();
}

class ConcreteCommand implements Command {
    private Receiver receiver; //命令的真正的执行者

    public ConcreteCommand(Receiver receiver){
        super();
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.action();
    }
}