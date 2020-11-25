package code.day04.demo02;
/*
方法的三种调用
1.单独调用:方法名称（参数）;
2.打印调用：System.out.println(方法名称（参数）);
3.赋值调用：数据类型 变量名称 = 方法名称（参数）;

注意：返回值为void，只能单独调用，不能打印调用或者赋值调用

*/
public class Demo02MethodDefine {
    public static void main(String[] args) {
//        单独调用
        sum(10,30);

//        打印调用
        System.out.println(sum(10,30));

//        赋值调用
        int num =sum(10,30);
        System.out.println(num);
    }
    public static int sum(int a,int b){
        int result=a+b;
        return result;
    }
}
