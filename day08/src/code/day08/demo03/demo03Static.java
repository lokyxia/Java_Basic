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
*
* 静态内容总是优先于非静态，所以静态代码块比构造方法先执行
*
* 静态代码块的典型用途
* 用来一次性对静态成员赋值
/
 */
public class demo03Static {
    public static void main(String[] args) {
        Person one = new Person();
        Person two = new Person();//不会再执行静态代码块
    }
}

