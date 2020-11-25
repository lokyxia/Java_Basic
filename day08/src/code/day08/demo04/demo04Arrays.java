package code.day08.demo04;

import java.util.Arrays;

/*
* java.util.Arrays是一个数组相关的工具类，里面提供了大量的静态方法，用来实现数组常见的操作
*
* public static Sting toString(数组)，将参数数组变成字符串
* pubilc static void sort(数组)，按照默认升序，对数组元素排序
* */
public class demo04Arrays {
    public static void main(String[] args) {
        int[] intArray = {10,20,30};
        //将int[]数组按照默认格式变成字符串
        String intStr = Arrays.toString(intArray);
        System.out.println(intStr);

        int[] array1 = {2,4,1,2,7};
        Arrays.sort(array1);
        System.out.println(Arrays.toString(array1));
        }
}

