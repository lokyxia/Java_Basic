package code.day06.PrintArray;

import java.util.Arrays;

public class PrintArray {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        //使用面向对象
        //jkd提供好的Arrays类，其中有一个toString方法
        System.out.println(Arrays.toString(array));
    }
}
