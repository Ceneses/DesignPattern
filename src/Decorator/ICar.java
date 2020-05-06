package Decorator;

public interface ICar {
    void move();
}

// 具体构建对象
class Car implements ICar{
    @Override
    public void move() {
        System.out.println("陆地上跑!");
    }
}

// 装饰器
class SuperCar implements ICar{
    protected ICar car;

    public SuperCar(ICar car) {
        this.car = car;
    }

    @Override
    public void move() {
        car.move();
    }
}

class FlyCar extends SuperCar{
    public FlyCar(ICar car) {
        super(car);
    }

    public void fly(){
        System.out.println("天上飞!");
    }

    @Override
    public void move() {
        super.move();
        fly();
    }
}

class AutoCar extends SuperCar{
    public AutoCar(ICar car) {
        super(car);
    }

    public void autoMove(){
        System.out.println("自动跑!");
    }

    @Override
    public void move() {
        super.move();
        autoMove();
    }
}