package Creational.Builder.v2;

public class Test {
    public static void main(String[] args) {
        Course course = new Course.CourseBuilder().buildCourseName("Java设计模式精讲").buildCoursePPT("Java模式PPT").buildCourseVideo("Java视频...").build();
        System.out.println(course);
    }
}
