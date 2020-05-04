package Memento;

/**
 * @ClassName Test
 * @Description //TODO
 * @Author Han ChengYi
 * @Date 2020/5/4 21:49
 * @Version 1.0
 **/

public class Test {
    public static void main(String[] args) {
        CareTaker careTaker = new CareTaker();
        Emp emp = new Emp("Han",12,23.56);
        System.out.println("第一次打印:" + emp.toString());
        careTaker.setEmpto(emp.memento());
        emp.setName("KKK");
        emp.setAge(15);
        emp.setSalary(12.55);
        System.out.println("第二次打印:" + emp.toString());
        emp.recovery(careTaker.getEmpto());
        System.out.println("第三次打印:" + emp.toString());
    }
}
