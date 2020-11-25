package code.day06.Studentcalss;
/*
* 通常情况下，一个类并不能直接使用，需要根据类创建一个对象
*
* 1.导包，指出使用什么类，在什么位置。
* import 包名称.类名称
* 对于和当前类属于同一个包的情况可以省略导包语句
*
* 2.创建，格式“
* 类名称 对象名= new 类名称（）;
*
* 3.使用：
* 对象名.成员变量名
*
* 注意：
* 如果成员变量没有进行赋值，那么将会默认值*/
public class classUse {
    public static void main(String[] args) {
        //1.导包

        //2.创建
        Student stu = new Student();

        //3.使用
        System.out.println(stu.name);//null

        System.out.println(stu.age);//0

        //改变对象当中的成员变量
        stu.name = "loky";
        stu.age = 19;
        System.out.println(stu.name);//null
        System.out.println(stu.age);//0
        stu.eat();
    }

}
