package code.day08.demo03;
/*
* 静态代码块的格式:
*
* public class 类名{
*   static {
*       //静态代码块
*    }
* }*
特点：当第一次使用到本类时，静态代码块执行唯一的一次
/
 */
public class Person {
    static {
        System.out.println("静态代码块执行！");
    }
    public Person(){
        System.out.println("构造方法执行！");
    }
}
