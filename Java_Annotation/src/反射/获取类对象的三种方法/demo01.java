package 反射.获取类对象的三种方法;

import javax.print.DocFlavor;

public class demo01 {
    public static void main(String[] args) throws ClassNotFoundException {
        Student st1 = new Student();
        getclazzz();

    }
    public static void getclazzz() throws ClassNotFoundException {

//        1.使用对象获取类对象
        Student xiaomin = new Student();
        Class<?> c1 = xiaomin.getClass();
        System.out.println(c1.toString());
        System.out.println(c1.hashCode());
//        2.使用类名.class属性
        Class<?> c2 = Student.class;
        System.out.println(c2.toString()+
                c2.hashCode());
//        3.使用Class类的静态方法
        Class<?> c3 = Class.forName("反射.获取类对象的三种方法.Student");
        System.out.println(c3.toString());
        System.out.println(c3.hashCode());
    }

}
