package 异常.处理;

import java.util.InputMismatchException;
import java.util.Scanner;

public class try_finally {
    public static void main(String[] args) {

        try {
            divide();
        }catch(ArithmeticException e){
            System.out.println("算数异常");
        }
        catch (InputMismatchException e){

            System.out.println("输入异常");
        }
        catch (Exception e) {
            System.out.println("未知异常");
        }
    }
    public static void divide(){
        try {
            System.out.println("输入被除数：");
            int num1 = new Scanner(System.in).nextInt();
            System.out.println("输入除数：");
            int num2 = new Scanner(System.in).nextInt();
            System.out.println(num1 + "除以" + num2 + "的结果是：" + (num1 / num2));
        } finally {
            System.out.println("释放资源");
        }
        System.out.println("程序运行完了");
    }


}
