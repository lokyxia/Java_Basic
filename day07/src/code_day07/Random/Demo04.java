package code_day07.Random;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

/*
* 用代码模拟猜数小游戏
*
* 思路：
* 1.首先产生一个随机数字，并且一旦产生不再变化用Random的nextInt方法
* 2.需要键盘输入，用Scanner
* 3.判断用if
*       猜大了，提示，并且重试
*       猜小了，提示，并且重试
*       猜中了，结束
* 4.重试就是循环，次数不确定，用while(true)*/
public class Demo04 {
    public static void main(String[] args) {
        Random r= new Random();
        int randomNum= r.nextInt(100)+1;
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("请输入你猜测的数字");
            int guessNum = sc.nextInt();

            if (guessNum > randomNum) {
                System.out.println("猜大了，请重试.");
            } else if (guessNum < randomNum) {
                System.out.println("猜小了，请重试.");
            } else {
                System.out.println("恭喜你，猜中了");
                break;
            }
        }
        System.out.println("游戏结束！");
    }
}
