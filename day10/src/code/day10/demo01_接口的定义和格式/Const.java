package code.day10.demo01_接口的定义和格式;

/**
 * 接口当中也可以定义的“成员变量”，但必须使用public static final修饰
 * 效果上看，就是接口的【常量】
 * 格式：
 * public static final 数据类型 常量名称 = 数据值；
 *
 * 注意：一旦使用final关键字，说明不可改变。
 * 接口当中的常量，必须赋值；
 * 接口常量中的名称，使用完全大写的字母，下划线分隔
 */
public interface Const {

    public static final
    //其实就是一个常量，一旦赋值，不可改变
    int NUM = 10;

}
