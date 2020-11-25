package code.day05.Arrayreverse;

public class Reverse {
    public static void main(String[] args) {
        int[] array={1,2,3,4};
        //遍历本来的顺序
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("============");
        for (int min = 0,max = array.length-1; min < max; min++,max--) {
            int temp = array[min];
            array[min] = array[max];
            array[max] = temp;
        }
        System.out.println("交换顺序后数组：");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }


    }
}
