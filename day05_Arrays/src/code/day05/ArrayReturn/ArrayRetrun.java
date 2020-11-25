package code.day05.ArrayReturn;
/*
* 一个方法可以有多个参数，但只能有 0或1个返回值
* 如果一个方法中产生了多个结果数据进行返回，怎么办?
*解决方法： 使用一个数组作为返回值类型机课
*/
public class ArrayRetrun {
    public static void main(String[] args) {
        int[] array=calculate(1,2,3);
        System.out.println("总和是"+array[0]);
        System.out.println("平均数是"+array[1]);
    }
    public static int[] calculate(int a,int b,int c){
        int sum=a+b+c;//总和
        int avg=sum/3;//平均
        //两个结果都希望返回，需要一个数组
        /*int[] array = new int[2];
        array[0]=sum;
        array[1]=avg;*/
        int[] array = {sum,avg};
        return array;
    }

}
