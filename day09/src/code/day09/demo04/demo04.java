package code.day09.demo04;
/*
* 在父子类的继承关系中，创建子类对象，访问成员方法的规则：
*       创建对象是谁，就优先用谁，没有则向上找。
*
* 注意：无论成员方法还是成员变量，如果没有都是向上找父类，绝对不会向下找子类
*
*
* 重写(Override)
* 概念：在继承关系中，方法的名称一样，参数列表也一样（注意重载不一样
*
* 覆盖重写特点：
* 创建的是子类对象，则优先用子类方法
* */
public class demo04 {
    public static void main(String[] args) {
        Zi zi = new Zi();
        zi.methodfu();
        zi.methodzi();


        //创建的new了子类对象，所以优先用子类方法
        zi.method();
    }
}
