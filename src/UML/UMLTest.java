package UML;

class KeyBoard{
    public void hit(){

    }
}

class Mouse{

}

class Computer{
    private KeyBoard keyBoard;
    private Mouse mouse;
    public Computer() {
        keyBoard = new KeyBoard(); // KeyBoard和Computer之间是组合关系
        mouse = null; // mouse和Computer之间是聚合关系
    }
    public void hitKeyBoard(){
        keyBoard.hit(); // 关联关系
    }
    public void clickScreen(Mouse mouse){ // 依赖关系

    }
}


public class UMLTest {
    public static void main(String[] args) {
        Computer computer = new Computer();
    }
}
