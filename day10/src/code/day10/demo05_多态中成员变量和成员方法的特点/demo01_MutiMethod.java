package code.day10.demo05_多态中成员变量和成员方法的特点;

/**
 * 在多态中，成员方法的访问规则是：
 *    看new是谁，就优先用谁，没有则向上找
 *
 * @编译看左边，运行看右边
 *
 * 对比：
 * 成员变量：编译看左边，运行还看左边
 * 成员方法：编译看左边，运行看右边
 */
public class demo01_MutiMethod {
    public static void main(String[] args) {
        Fu obj = new Zi();

        obj.method();//用子类
        obj.methodFu();//用父类

        //编译看左边，左边没有methodZi方法，所以报错
        // obj.methodZi
    }
}
