package code.day11.demo04_匿名内部类;
/*
如果接口的实现类（或者是父类的子类）只需要使用唯一一次；
那么这种情况可以省略该类的定义，而改为使用【匿名内部类】

匿名内部类的定义格式：
接口名称 对象名 = new 接口名称(){
    //覆盖重写所有抽象方法
};

可以不用单独创建新的实现类，直接New 接口，加大括号覆盖重新所有抽象方法

对于格式”new 接口名称{……}“解析：
1.new代表创建对象的动作；
2.接口名称就是匿名内部类需要实现的那个接口；
3.{……}中的内容才是匿名内部类的内容

另外需要注意几点问题：
1.匿名内部类在【创建对象】的时候，只能使用唯一一次；
如果希望多次创建对象，而且类的内容一样的话，那么就必须使用单独定义的实现类了。
2.匿名对象，在【调用方法】的时候，只能调用一次；
如果希望同一个对象，调用多次方法，那么必须给对象起名；
3.匿名内部类是省略了【实现类/子类名称】，但是匿名对象是省略了【对象名称】
强调：匿名内部类和匿名对象不是一回事！！！

 */
public class Main01 {
    public static void main(String[] args) {
        new MyInterfaceImpl().method();

        //使用 匿名内部类
        MyInterface in = new MyInterface() {
            @Override
            public void method() {
                System.out.println("覆盖重写匿名内部类");
            }
        };
        in.method();

        MyInterface in2 = new MyInterface() {
            @Override
            public void method() {
                System.out.println("覆盖重写");
            }
        };
    }



}
