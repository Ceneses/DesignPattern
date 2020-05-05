package Command;

/**
 * @ClassName Invoke
 * @Description //TODO
 * @Author Han ChengYi
 * @Date 2020/5/5 21:07
 * @Version 1.0
 **/

//调用者和发起者
public class Invoke {

    private Command command; //也可以通过容器List<Command>容纳很多命令对象，进行批处理。数据库底层的事务管理就是类似的结构

    public Invoke(Command command) {
        this.command = command;
    }

    public void call(){
        command.execute();
    }
}
