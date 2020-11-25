package code.day10.demo02_注意事项;

public interface MyInterfaceA {

    //不能有静态代码块static {}

    //不能有构造方法public MyInterface(){}

    void methodA();

    void AbsA();

    default void methodDef(){
        System.out.println("A的默认方法");
    }
}
