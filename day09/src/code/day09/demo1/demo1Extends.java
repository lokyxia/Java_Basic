package code.day09.demo1;
/*
*在继承关系中，“子类就是一个父类”，也就是说子类可以被当成一个父类看待。
* 例如父类是员工，那么子类可以是教师，保安。。。
*
* 定义父类的格式就是普通类的定义方法
*
* 定义子类:
* public class 子类名称 extends 父类名称{
*
* }
*
* */
public class demo1Extends {
    public static void main(String[] args) {
        //创建一个子类
        Teacher t = new Teacher();
        t.method();//方法执行！
    }
}
