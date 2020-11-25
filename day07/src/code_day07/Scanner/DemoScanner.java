package code_day07.Scanner;


import java.util.Scanner;

/*
* Scanner类的功能可以实现键盘的输入数据到程序当中
*
* 引用类型的一般步骤为：
*
* 1.导包
* import 包路径.类名称;
* 同一个包，可以省略此步
* 只要java.lang包不用导包
*
* 2.创建
* 类名称 对象名 = new 类名称();
*
* 3.使用
* 对象名.成员方法名
* 获取键盘输入的一个int数字：int num = sc.nextInt();
* 获取键盘输入的一个字符串： String = sc.next();
* */
public class DemoScanner {
    public static void main(String[] args) {
        //备注：(System.in)代表从键盘进行输入
        Scanner sc = new Scanner(System.in);
        //获取数字
        int num = sc.nextInt();
        System.out.println("输入的数字是"+num);
        //获取字符串
        String str = sc.next();
        System.out.println("输入的字符串是："+str);
    }
}
