package code.day08.demo04;
/*
* java.util.Math类 是数学相关的工具类， 里面提供大量静态方法，完成与数学
*
* public static double abs(double num);//取绝对值
* public static double ceil(double num);//向上取整
* public static double floor(double num);//向下取整
* public static long round(double num);四舍五入
* */
public class demo03Math {
    public static void main(String[] args) {
        //获取绝对值
        System.out.println(Math.abs(-77));//77

        //向上取整
        System.out.println(Math.ceil(3.14));//4.0

        //向下取整
        System.out.println(Math.floor(89.3));//89

        //四舍五入
        System.out.println(Math.round(4.49999));//4
        System.out.println(Math.round(Math.PI));


    }
}
