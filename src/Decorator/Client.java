package Decorator;

/**
 * @ClassName Client
 * @Description //TODO
 * @Author Han ChengYi
 * @Date 2020/5/6 14:58
 * @Version 1.0
 **/

public class Client {
    public static void main(String[] args) {
        Car car = new Car();
        car.move();
        System.out.println("增加新的功能......");
        FlyCar flyCar = new FlyCar(car);
        flyCar.move();
        System.out.println("又增加新的功能....");
        AutoCar autoCar = new AutoCar(flyCar);
        autoCar.move();
    }
}
