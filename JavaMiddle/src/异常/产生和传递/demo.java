package 异常.产生和传递;

import java.util.Scanner;

public class demo {
    public static void main(String[] args) {

            opreation();

    }
    public static void divide(){
        System.out.println("输入被除数：");
        int num1 = new Scanner(System.in).nextInt();
        System.out.println("输入除数：");
        int num2 = new Scanner(System.in).nextInt();
        System.out.println(num1 + "除以" + num2 + "的结果是：" + (num1 / num2));
        System.out.println("程序执行完了");
    }

    public static void opreation(){
        divide();
    }
}
