package code.day10.demo02_注意事项;

/**
 *注意事项：
 * @1.接口没有构造方法或者静态代码块
 *2.一个类的直接父类是唯一的，但是一个类可以同时实现多个接口
 * 格式：
 * public class MyInterfaceImpl implements MyInterfaceA, MyInterfaceB{
 *     //覆盖重写所有的抽象 方法
 * }
 * 3.如果实现类实现的多个接口当中，存在重复的抽象方法，只需覆盖重写一次
 * 4.如果实现类没有覆盖重写接口中所有的抽象方法，那么这个实现类必须是一个抽象类
 * 5.如果实现类锁实现的多个接口当中，存在重复的默认方法，那么实现类一定要对冲突的默认方法进行覆盖默认重写
 * 6.一个类如果直接父类当中的方法和接口的默认方法出现冲突，优先用父类方法
 */
public class demo01_Interface implements MyInterfaceA,MyInterfaceB {

    @Override
    public void methodA() {
        System.out.println("覆盖重写A");
    }

    @Override
    public void AbsA() {
        System.out.println("覆盖重写了AB");
    }

    @Override
    public void methodB() {
        System.out.println("覆盖重写B");
    }

    @Override
    public void methodDef() {
        System.out.println("对接口当中多个重复冲突的默认方法进行覆盖重写AB的默认方法");
    }
}
