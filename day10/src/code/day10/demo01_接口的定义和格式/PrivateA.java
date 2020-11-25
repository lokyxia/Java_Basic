package code.day10.demo01_接口的定义和格式;

/**
 * 问题描述：
 * 需要抽取一个共有方法，来解决多个默认方法直接重复代码的问题
 * 但是这个共有方法不应该让实现类来使用，应该是私有化的。
 *
 * 解决方案：
 * 从Java9开始，接口当中允许定义多个私有方法。
 * 1.普通私有方法，解决多个默认方法之间重复代码的问题
 * 格式：
 * private 返回值类型 方法名称(){
 *     方法体
 * }
 *
 * 2.静态私有方法，解决多个静态方法之间重复代码的问题
 * 格式：
 * private static 返回值类型 方法名称(){
 *     方法体
 * }
 */
public interface PrivateA {

    public default void methodDefault1(){
        System.out.println("默认方法1");
        Common();
    }

    public default void methodDefault2(){
        System.out.println("默认方法2");
        Common();
    }

    private void Common(){
        System.out.println("AAA");
        System.out.println("BBB");
        System.out.println("CCC");
    }

}
