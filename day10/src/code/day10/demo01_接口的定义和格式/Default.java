package code.day10.demo01_接口的定义和格式;

/**
 * 从Java8开始，接口运行定义默认方法。
 * 格式:
 * public default 返回值类型 方法名称(){
 *     方法体
 * }
 *
 * @备注
 * 接口当中的默认方法，可以解决接口升级的问题
 *
 * 1.接口的默认方法，可以通过接口实现类对象，直接调用
 * 2.接口的默认方法，也可以通过接口实现类进行覆盖重写
 *
 */
public interface Default {
    //添加了一个抽象方法
    void methodAbs();

    //再添加一个抽象方法
    //void methodAbs2();
    public default void methodAbs2(){
        System.out.println("这是给A更新的");
    }

    default void methodAbs3(){
        System.out.println("这是给B更新的");
    }

}
