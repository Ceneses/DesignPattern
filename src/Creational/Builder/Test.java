package Creational.Builder;

/**
 * 建造者
 * 定义：将一个复杂对象的构建与它表示分离，使得同样的构建过程可以创建不同的表示
 * 用户只需指定需要建造的类型就可以得到它们，建造过程及细节不需要知道
 * 类型：创建类型
 * 封装性好，创建和使用分离
 * 扩展性好、建造类之间独立、一定程度上解耦
 * 缺点
 * 产生多余的Builder对象
 * 产品内部发生变化，建造者都要修改，成本比较大
 * 一个系统 = 组成部分1 + 组成部分2
 */
public class Test {
    public static void main(String[] args) {
        Coach coach = new Coach();
        CourseBuilder courseBuilder = new CourseActualBuilder();
        coach.setCourseBuilder(courseBuilder);
        Course course = coach.makeCourse("数学","数学教学PPT","数学教学视频",
        "数学笔记","数学问答");
        System.out.println(course);
    }
}
