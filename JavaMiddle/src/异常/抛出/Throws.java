package 异常.抛出;

import java.util.Scanner;

public class Throws {
    public static void main(String[] args) {
        try {
            divide();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void divide() throws Exception{
        System.out.println("输入被除数：");
        int num1 = new Scanner(System.in).nextInt();
        System.out.println("输入除数：");
        int num2 = new Scanner(System.in).nextInt();
        System.out.println(num1 + "除以" + num2 + "的结果是：" + (num1 / num2));
    }
}
