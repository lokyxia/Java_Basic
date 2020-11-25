package code.day10.demo01_接口的定义和格式;

/**
 * 定义抽象方法
 * @注意事项
 * 1.接口当中的抽象方法，修饰符必须是两个固定的关键字： public abstract
 * 2.方法的三要素可以随意定义
 */
public interface Abstract {

    //这是一个抽象方法
    public abstract void methodAbs1();

    //这也行
    public void method2();

    //也可以省略不写
    void method3();
}
