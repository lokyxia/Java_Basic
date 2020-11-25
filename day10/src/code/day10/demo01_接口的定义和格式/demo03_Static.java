package code.day10.demo01_接口的定义和格式;

/**
 * @注意，不能通过接口实现类来调用接口中的静态方法
 *
 * 正确使用：通过接口名称，直接调用其中的静态方法。
 *
 * 格式：
 * 接口名称.静态方法名();
 */
public class demo03_Static {
    public static void main(String[] args) {
        //StaticA s = new StaticA();
        Static.methodStatic();
    }
}
