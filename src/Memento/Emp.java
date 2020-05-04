package Memento;

/**
 * @ClassName Emp
 * @Description //TODO
 * @Author Han ChengYi
 * @Date 2020/5/4 21:29
 * @Version 1.0
 **/

public class Emp {
    private String name;
    private int age;
    private double salary;

    public Emp(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public EmpMemento memento(){
        return new EmpMemento(this);
    }

    public void recovery(EmpMemento empto){
        this.age = empto.getAge();
        this.name = empto.getName();
        this.salary = empto.getSalary();
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
