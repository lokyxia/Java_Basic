package code.day09.demo07继承中的构造方法;

/**@继承关系中，父子类构造方法访问特点：
 * 1,子类构造方法中有一个默认隐含的“super()"调用，所以先父类后子类
 *2,可以用super关键字在子类构造调用父类重载构造
 * 3,super的父类构造调用,必须是子类构造方法的第一个语句,不能一个子类构造调用多次super构造
 * 总结：
 * 子类必须调用父类的构造方法，不些默认super(),写了则用指定的super调用,super只能有一个，且第一个声明语句
 */
public class demo01_Constructor {
    public static void main(String[] args) {
        Zi z = new Zi();

    }
}
