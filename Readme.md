### DesignPattern
#### 目录
- 创建型模式
  - 1.简单工厂
  - 2.工厂方法
  - 3.抽象工厂
  - 4.建造者
  - 5.单例模式
  
 #### 附录
- 类图相关知识
```text
泛化关系:一般是实线空心箭头{
    Class Animal{
        property1
        property2
        method1();
        method2();
    }
    class Dog extends Animal{
         property1
         property2
         method1();
         method2();   
    }
}
实现关系:一般是虚线空心箭头{
    interface Flyable{
        method1();
        method2();
    }
    class Bird implements Flyable{
         method1();
         method2();   
    }
}
依赖关系:对于两个相对独立的对象，当一个对象负责构造另一个对象的实例，或者依赖另一个对象的服务时，这两个对象之间主要体现为依赖关系。
依赖表现:在局部变量，方法的参数，以及对静态方法的调用
UML图例:虚线箭头
代码表现
public class Person{   
    /** 拧螺丝 */  
    public void screw(Screwdriver screwdriver){   表现为方法参数
         screwdriver.screw();   
     }   
}  
关联关系:对于两个相对独立的对象，当一个对象的实例与另一个对象的一些特定实例存在固定的对应关系时，这两个对象之间为关联关系。
关联表现:关联关系是使用实例变量来实现
UML图例:实线箭头
代码表现:
public class Company{   
    private Employee employee;   
    public Employee getEmployee(){   
        return employee;   
     }   
    public void setEmployee(Employee employee){   
        this.employee=employee;   
     }   
    //公司运作   
    public void run(){   
         employee.startWorking();   
     }   
}  
```