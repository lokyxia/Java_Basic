package code.day04.demo04;
/*方法重载
* 多个方法的名称一样，但参数列表不同，执行功能不同
* 1.参数个数不同
* 2.参数类型不同
* 3.参数的多类型不同*/
public class Demo01MethodOverlord {
    public static void main(String[] args) {

        System.out.println(sum(10,20));//两个参数
        System.out.println(sum(10,20,30));//san个参数
        System.out.println(sum(10,20,30,40));//四个参数
    }
    public static int sum(int a,int b){
        System.out.println("有两个参数被执行！");
        return a + b;
    }
    public static int sum(int a,int b,int c){
        System.out.println("有三个参数被执行！");
        return a + b +c;
    }
    public static int sum(int a,int b,int c,int d){
        System.out.println("有四个参数被执行！");
        return a + b + c + d;
    }

}
