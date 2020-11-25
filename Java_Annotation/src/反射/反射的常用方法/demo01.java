package 反射.反射的常用方法;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class demo01 {
    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
//        reflection();
//        System.out.println("============");
//        reflectConstruct();
//        System.out.println("============");
        reflectMethod();


    }
//    1.使用反射获取类的类名，包名，父类，接口
    public static void reflection() throws ClassNotFoundException {
        Class<?> c1 = Class.forName("反射.反射的常用方法.Student");
        System.out.println(c1.getName());//获取类名
        System.out.println(c1.getPackage().getName());//获取包名
        System.out.println(c1.getSuperclass().getName());//获取父类名称
        Class<?>[] c2 = c1.getInterfaces();
        System.out.println(Arrays.toString(c2));
    }
//    2.使用反射获取类的构造方法，创建对象
    public static void reflectConstruct() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
//        //1获取类的类对象
        Class<?> c1 = Class.forName("反射.反射的常用方法.Student");
//        //2获取类的构造方法Constructor
//        Constructor<?>[] con1 = c1.getConstructors();
//        for (Constructor<?> c: con1
//             ) {
//            System.out.println(c.toString());
//        }
        //3获取类中的无参构造方法
        Constructor<?> con_instance = c1.getConstructor();
        Object o1 = con_instance.newInstance();
        Object o2 = con_instance.newInstance();
        System.out.println(o1.toString());
        System.out.println(o2.toString());
        //简洁方法：类对象.newInstance();
        Object o3 = c1.newInstance();//Since JAVA9 deprecated
        System.out.println(o3.toString());
        //4获取类中的有参构造方法
        Constructor<?> con_param = c1.getConstructor(int.class,String.class);
        Student st1 = (Student) con_param.newInstance(20,"loky");
        System.out.println(st1.toString());

    }
//    3,使用反射获取类中的方法
    public static void reflectMethod() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {
        //1创建类的类对象
        Class<?> c1 = Class.forName("反射.反射的常用方法.Student");
        //2获取方法Method类
         //2.1 getMethods()方法获取公开的方法，包括父类继承来的【更多】
         //Method[] m1 = c1.getMethods();
         //2.2 getDeclaredMethods()获取；类中声明的方法【更少】
        Method[] m1 = c1.getDeclaredMethods();
        for (Method m2:m1
             ) {
            System.out.println(m2.toString());
        }
        //3获取单个方法
        Method sleep_m2 = c1.getMethod("sleep");
        Student st2= (Student) c1.newInstance();
        sleep_m2.invoke(st2);//调用
        sleep_m2.invoke(null);//静态方法直接使用类名可以调用，不需要实例对象
        sleep_m2.invoke(c1.newInstance());//简写


    }
}
