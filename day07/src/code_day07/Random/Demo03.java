package code_day07.Random;

import java.util.Random;

/*
* 题目要求：
* 根据int变量n值,来获取随机数字，范围是[1,n]*/
public class Demo03 {
    public static void main(String[] args) {
        int n = 5;
        Random r= new Random();
        for (int i = 0; i < 50; i++) {
            int result = r.nextInt(n)+1;//范围是1~5
            System.out.println("随机数是："+result);
        }

    }
}
