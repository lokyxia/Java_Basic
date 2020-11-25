package 泛型;

import 泛型.泛型接口.MyInterfaceImpl;
import 泛型.泛型接口.MyInterfaceImpl2;
import 泛型.泛型方法.method;

//注意：泛型只能使用引用类型
//     不同泛型直接不能相互赋值
public class UseGeneric {
    public static void main(String[] args) {
//        泛型类
        Generic<Integer> mygeneric = new Generic<Integer>();
        mygeneric.t = 1;
        mygeneric.show(3);
        Integer in = mygeneric.getT();
        System.out.println(in);

        Generic<String> mygeneric2 = new Generic<>();
        mygeneric2.t ="loky";
        mygeneric2.show("hi");
        String str = mygeneric2.getT();
        System.out.println(str);
        System.out.println("=================");

//          泛型接口
        MyInterfaceImpl mt =new MyInterfaceImpl();
        mt.server("hi");

        MyInterfaceImpl2<String> mt2 = new MyInterfaceImpl2<>();
        mt2.server("hi again");
        System.out.println("=================");

//        泛型.泛型方法
        method method = new method();
        method.show("是字符串！");
        System.out.println(method.show(20));



    }
}
