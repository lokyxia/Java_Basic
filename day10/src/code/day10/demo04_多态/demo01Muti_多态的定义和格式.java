package code.day10.demo04_多态;

/**
 * 代码中体现多态，其实就是一句话: 父类引用指向子类对象
 *
 * 格式：
 * 父类名称 对象名 = new 子类名称();
 * 或者
 * 接口名称 对象名 = new 实现类名称();
 *
 *
 */
public class demo01Muti_多态的定义和格式 {
    public static void main(String[] args) {
        Fu obj = new Zi();

        obj.method();
        obj.methodFu();
    }
}
