package code.day10.demo02_注意事项;

public interface MyInterfaceB {

    //不能有静态代码块static {}

    //不能有构造方法public MyInterface(){}

    void methodB();

    void AbsA();

    default void methodDef(){
        System.out.println("B的默认方法");
    }
}
