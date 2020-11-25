package code.day10.demo01_接口的定义和格式;

/**
 * @接口就是多个类的公共规范
 * @接口是一种引用数据类型，最重要的内容就是其中的抽象方法
 *
 * @如何定义一个接口：
 * public interface 接口名称{
 *     //接口内容
 * }
 * @备注：
 * .java-->.class 换成了关键字interface之后，编译生成的字节码文件仍然是
 *
 * @接口的使用：
 * 1。接口不能直接使用，必须有一个实现类来实现接口
 * 格式：
 * public class 实现类名称 implements 接口名称{
 *     //
 * }
 * 2.接口的实现必须覆盖重写接口中所有的抽象方法。
 * 实现：去掉abstract，加上方法体大括号
 * 3.穿建实现类的对象，使用
 *
 * @注意：
 * 如果实现类没有覆盖重写接口中所有的抽象方法，那么这个实现类自己就必须是抽象类
 */
public class Demo01_Abstract {
    public static void main(String[] args) {
        MIA_Impl inter  = new MIA_Impl();
        inter.methodAbs1();
    }
}
