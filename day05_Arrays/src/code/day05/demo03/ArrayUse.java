package code.day05.demo03;

public class ArrayUse {
    public static void main(String[] args) {
        //静态初始化的省略格式
        int[] array = {10,20,30};
        System.out.println(array);//直接打印数组名称，得到的是数组相对应的：内存地址哈希值

        System.out.println(array[0]);//10
        int num =array[1];
        System.out.println(num);//20

        //动态初始化一个数组
        int[] array1 = new int[3];
        System.out.println(array1);//内存地址值
        System.out.println(array1[0]);//0
        System.out.println(array1[1]);//0
        System.out.println(array1[2]);//0
        array1[1]=123;
        System.out.println(array1[0]);//0
        System.out.println(array1[1]);//123
        System.out.println(array1[2]);//0

    }
}
