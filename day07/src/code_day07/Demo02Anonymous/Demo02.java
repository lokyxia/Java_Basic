package code_day07.Demo02Anonymous;

import java.util.Scanner;

public class Demo02 {
    public static void main(String[] args) {

        /*//Scnner 的普通使用方式
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        //匿名对象方式
        int num1 = new Scanner(System.in).nextInt();*/

        //使用一般方法传入参数
        Scanner sc = new Scanner(System.in);
        methodParam(sc);

        //使用匿名对象来传递参数
        methodParam(new Scanner(System.in));

        Scanner sca = methodReturn();
        int num = sca.nextInt();
        System.out.println("输入的数是："+num);

    }
    public static void methodParam(Scanner sc){
        int num = sc.nextInt();
        System.out.println("输入的数是："+num);
    }

    public static Scanner methodReturn() {
        return new Scanner(System.in);

    }
}
