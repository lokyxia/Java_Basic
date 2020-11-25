package code.day11.demo01_final的用法;
/*
final关键字代表最终，不可改变

常见的几种用法：
1.可以用来修饰一个类；
2.可以修饰一方法；
3.可以修饰一个局部变量；
4.可以用来就修饰一个成员变量；
 */
public class demo1_final {
    public static void main(String[] args) {
        int num = 10;
        System.out.println(num);//10
        num = 20;
        System.out.println(num);//20

        final int num2 = 100;
        System.out.println(num2);//100

//        num2 = 20;错误写法，final修饰，不可改变

        //正确，保证有唯一一次的赋值即可
        final int num3;
        num3 = 20;
        System.out.println(num3);//20


    }
}
