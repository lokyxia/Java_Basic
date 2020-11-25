package code.day10.demo01_接口的定义和格式;

public class demo02_Default {
    public static void main(String[] args) {
        //创建了实现对象
        DefaultA d1 = new DefaultA();
        d1.methodAbs();//调用抽象方法，实际运行的是右侧实现类

        d1.methodAbs2();//调用默认方法，如果实现类当中没有，会向上找接口
        System.out.println("==========");

        DefaultB d2 = new DefaultB();
        d2.methodAbs();
        d2.methodAbs3();
        d2.methodAbs2();//可以覆盖重写接口中的默认方法
        d1.methodAbs2();//A不受影响
    }
}
