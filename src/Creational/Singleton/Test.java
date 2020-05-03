package Creational.Singleton;

/**
 * 单例模式
 * 单例-优点
 * 在内存里只有一个实例，减少了内存开销
 * 可以避免对资源的多重占用
 * 设置全局访问点，严格控制访问
 * 单例-缺点
 * 没有接口-扩展困难
 * 单例-重点
 * 私有构造器
 * 线程安全
 * 延迟加载
 * 序列化和反序列化的安全
 * 反射攻击
 */
public class Test {
    public static void main(String[] args) {
//        Thread t1 = new Thread(new T());
//        Thread t2 = new Thread(new T());
//        t1.start();
//        t2.start();
//        System.out.println("程序结束！");
        System.out.println(EnumClass.INSTANCE == EnumClass.INSTANCE);
    }
}
