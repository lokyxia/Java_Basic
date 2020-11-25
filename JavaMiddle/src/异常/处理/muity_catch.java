package 异常.处理;

import java.util.InputMismatchException;
import java.util.Scanner;

//多个catch的使用
public class muity_catch {
    public static void main(String[] args) {

        try {
            System.out.println("输入被除数：");
            int num1 = new Scanner(System.in).nextInt();
            System.out.println("输入除数：");
            int num2 = new Scanner(System.in).nextInt();
            System.out.println(num1 + "除以" + num2 + "的结果是：" + (num1 / num2));
        }
        catch (ArithmeticException e){
            System.out.println("算数异常");
        }
        catch (InputMismatchException e){

            System.out.println("输入异常");
        }
        catch (Exception e) {
            System.out.println("未知异常");
        }
        System.out.println("程序执行完了");
    }
}
