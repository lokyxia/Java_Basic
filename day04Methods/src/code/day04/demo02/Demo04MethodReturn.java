package code.day04.demo02;
/*定义一个方法，求两数之和*/
public class Demo04MethodReturn {
//  mian方法，调用getsum
    public static void main(String[] args) {
        int num= getsum(10,20);
        System.out.println("返回结果是"+num);
        printsum(20,10);
    }
    /*方法负责执行，行为语句，有返回值int,谁调用，就把计算结果返回谁*/
    public static int getsum(int a,int b){
        int result=a+b;
        return result;
    }
//    无返回，打印输出在方法体
    public static void printsum(int a,int b){
        int result=a+b;
        System.out.println(result);

    }
}
