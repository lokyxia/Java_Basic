package code.day04.demo02;
/*
有参数:
无参数：
*/
public class Demo03MethodParam {
    public static void main(String[] args) {
        method1(12,34);
        System.out.println("=================");
        method2();
    }

//俩数字相乘，必须指定俩数字是多少，否则无法计算
    public static void method1(int a,int b ){
        int result=a*b;
        System.out.println("结果是"+result);
    }
//    不需要参数的操作
    public static void method2(){
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello,World"+i);
            
        }
            
    }
}
