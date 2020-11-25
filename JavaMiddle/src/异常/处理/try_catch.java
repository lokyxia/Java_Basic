package 异常.处理;

import java.util.Scanner;

/**
 * try{
 *     //可能产生异常的代码
 * }
 * catch(){
 *     //捕获处理
 * }
 */
public class try_catch {
    public static void main(String[] args) {

        try {
            System.out.println("输入被除数：");
            int num1 = new Scanner(System.in).nextInt();
            System.out.println("输入除数：");
            int num2 = new Scanner(System.in).nextInt();
            System.out.println(num1 + "除以" + num2 + "的结果是：" + (num1 / num2));
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        System.out.println("程序执行完了");
    }
}
