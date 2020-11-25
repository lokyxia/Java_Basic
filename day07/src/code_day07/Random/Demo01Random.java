package code_day07.Random;

import java.util.Random;

/*
* Random用来生产随机数字
*
* 1.导包
*
* 2.创建
* Random r = new Random();//小括号留空
*
* 3.使用
* 获取一个随机的int（范围是int所有范围，有正负）
* ：int num = r.nextInt();
*
* 获取一个随机的int数字(参数代表了范围，左闭右开)：int num = r.nextInt(3)
* 实际取值范围在[0,3),也就是0~2*/
public class Demo01Random {
    public static void main(String[] args) {
        Random r = new Random();
        int num =r.nextInt();
        System.out.println("随机数是："+num);
    }
}
